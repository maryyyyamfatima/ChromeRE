package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3911bZ1 {
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static File e;
    public Runnable a;
    public XY1 b;

    public static ArrayList e() {
        try {
            File file = new File(d(), "top_sites");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            AbstractC4851eH1.d("TopSites", "Finished fetching top sites list.", new Object[0]);
            AbstractC2663Um3.a(fileInputStream);
            return c(bArr);
        } catch (IOException e2) {
            d().delete();
            throw e2;
        }
    }

    public static byte[] a(List list) {
        int size = list.size();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(((PL3) list.get(i)).b);
            C7722me3 c7722me3 = ((PL3) list.get(i)).a;
            dataOutputStream.writeUTF(c7722me3.a);
            dataOutputStream.writeUTF(c7722me3.b.m());
            dataOutputStream.writeUTF("");
            dataOutputStream.writeInt(c7722me3.c);
            dataOutputStream.writeInt(c7722me3.d);
            dataOutputStream.writeInt(c7722me3.e);
        }
        dataOutputStream.close();
        AbstractC4851eH1.d("TopSites", "Serializing top sites lists finished; count: " + size, new Object[0]);
        return byteArrayOutputStream.toByteArray();
    }

    public static ArrayList c(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int readInt = dataInputStream.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readInt; i++) {
            if (dataInputStream.readInt() > 1) {
                throw new IOException("Cache version not supported.");
            }
            int readInt2 = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            GURL a = GURL.a(dataInputStream.readUTF());
            if (a.k()) {
                throw new IOException("GURL deserialization failed.");
            }
            dataInputStream.readUTF();
            arrayList.add(new PL3(new C7722me3(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt(), readUTF, a), readInt2));
        }
        AbstractC4851eH1.d("TopSites", "Deserializing top sites lists finished", new Object[0]);
        return arrayList;
    }

    public static void b(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        synchronized (d) {
            File file2 = new File(file, "top_sites");
            C0575El c0575El = new C0575El(file2);
            try {
                fileOutputStream = c0575El.f();
                try {
                    fileOutputStream.write(bArr, 0, bArr.length);
                    c0575El.b(fileOutputStream);
                    AbstractC4851eH1.d("TopSites", "Finished saving top sites list to file:" + file2.getAbsolutePath(), new Object[0]);
                } catch (IOException unused) {
                    if (fileOutputStream != null) {
                        c0575El.a(fileOutputStream);
                    }
                    AbstractC4851eH1.a("TopSites", "Fail to write file: " + file2.getAbsolutePath(), new Object[0]);
                }
            } catch (IOException unused2) {
                fileOutputStream = null;
            }
        }
    }

    public static File d() {
        C7432ln3 e2 = C7432ln3.e();
        try {
            synchronized (c) {
                if (e == null) {
                    e = V60.a.getDir("top_sites", 0);
                }
            }
            File file = e;
            e2.close();
            return file;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
