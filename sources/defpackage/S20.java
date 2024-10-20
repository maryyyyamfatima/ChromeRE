package defpackage;

import android.os.Environment;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class S20 {
    public static final /* synthetic */ int a = 0;

    public static File a(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 61);
            sb.append(valueOf);
            sb.append(" already exists as a file, but is expected to be a directory.");
            throw new IllegalStateException(sb.toString());
        }
        return new File(file, str);
    }

    public static AbstractC8015nV1 b(Class cls, String str, int i, boolean z) {
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(a(str)));
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = null;
            }
            try {
                AbstractC8015nV1 c = c(cls, bufferedInputStream, i);
                try {
                    bufferedInputStream.close();
                } catch (IOException unused) {
                }
                return c;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    throw th;
                } catch (FileNotFoundException e) {
                    if (z) {
                        new StringBuilder(String.valueOf(e).length() + 39);
                    }
                    return null;
                }
            }
        } catch (IllegalStateException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("Error reading parameters: ");
            sb.append(valueOf);
            Log.w("S20", sb.toString());
            return null;
        }
    }

    public static AbstractC8015nV1 c(Class cls, BufferedInputStream bufferedInputStream, int i) {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            if (bufferedInputStream.read(allocate.array(), 0, allocate.array().length) == -1) {
                Log.e("S20", "Error parsing param record: end of stream.");
                return null;
            }
            int i2 = allocate.getInt();
            int i3 = allocate.getInt();
            if (i2 != i) {
                Log.e("S20", "Error parsing param record: incorrect sentinel.");
                return null;
            }
            byte[] bArr = new byte[i3];
            if (bufferedInputStream.read(bArr, 0, i3) == -1) {
                Log.e("S20", "Error parsing param record: end of stream.");
                return null;
            }
            return AbstractC8015nV1.mergeFrom((AbstractC8015nV1) cls.newInstance(), bArr);
        } catch (C1257Jr1 e) {
            String valueOf = String.valueOf(e.toString());
            Log.w("S20", valueOf.length() != 0 ? "Error parsing protocol buffer: ".concat(valueOf) : new String("Error parsing protocol buffer: "));
            return null;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2.toString());
            Log.w("S20", valueOf2.length() != 0 ? "Error reading parameters: ".concat(valueOf2) : new String("Error reading parameters: "));
            return null;
        } catch (IllegalAccessException e3) {
            String valueOf3 = String.valueOf(e3.toString());
            Log.w("S20", valueOf3.length() != 0 ? "Error accessing parameter type: ".concat(valueOf3) : new String("Error accessing parameter type: "));
            return null;
        } catch (InstantiationException e4) {
            String valueOf4 = String.valueOf(e4.toString());
            Log.w("S20", valueOf4.length() != 0 ? "Error creating parameters: ".concat(valueOf4) : new String("Error creating parameters: "));
            return null;
        }
    }

    public static boolean d(AbstractC8015nV1 abstractC8015nV1, BufferedOutputStream bufferedOutputStream) {
        try {
            byte[] byteArray = AbstractC8015nV1.toByteArray(abstractC8015nV1);
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(894990891);
            allocate.putInt(byteArray.length);
            bufferedOutputStream.write(allocate.array());
            bufferedOutputStream.write(byteArray);
            return true;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.toString());
            Log.w("S20", valueOf.length() != 0 ? "Error writing parameters: ".concat(valueOf) : new String("Error writing parameters: "));
            return false;
        }
    }
}
