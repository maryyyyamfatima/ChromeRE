package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qm3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2143Qm3 implements LA0 {
    public final C3492aK1 a;

    @Override // defpackage.LA0
    public final boolean a(Object obj, File file, C0543Ee2 c0543Ee2) {
        InputStream inputStream = (InputStream) obj;
        C3492aK1 c3492aK1 = this.a;
        byte[] bArr = (byte[]) c3492aK1.c(byte[].class, 65536);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    c3492aK1.g(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    c3492aK1.g(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            c3492aK1.g(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C2143Qm3(C3492aK1 c3492aK1) {
        this.a = c3492aK1;
    }
}
