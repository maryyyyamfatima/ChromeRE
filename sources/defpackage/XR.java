package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import javax.crypto.KeyGenerator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XR implements Callable {
    public final /* synthetic */ C3530aS a;

    public XR(C3530aS c3530aS) {
        this.a = c3530aS;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        FileInputStream fileInputStream;
        try {
            this.a.d.getClass();
            try {
                fileInputStream = new FileInputStream("/dev/urandom");
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[16];
                if (16 != fileInputStream.read(bArr)) {
                    throw new GeneralSecurityException("Not enough random data available");
                }
                fileInputStream.close();
                try {
                    SecureRandom secureRandom = new SecureRandom();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                    keyGenerator.init(128, secureRandom);
                    return new YR(keyGenerator.generateKey(), bArr);
                } catch (GeneralSecurityException unused) {
                    AbstractC4851eH1.a("CipherFactory", "Couldn't get generator instances.", new Object[0]);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
            AbstractC4851eH1.a("CipherFactory", "Couldn't get generator data.", new Object[0]);
            return null;
        } catch (GeneralSecurityException unused3) {
            AbstractC4851eH1.a("CipherFactory", "Couldn't get generator data.", new Object[0]);
            return null;
        }
    }
}
