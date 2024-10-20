package defpackage;

import android.os.Bundle;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3530aS {
    public FutureTask b;
    public YR c;
    public final Object a = new Object();
    public final C10667vD d = new C10667vD();

    public final Cipher a(int i) {
        YR b = b(true);
        if (b != null) {
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(i, b.a, new IvParameterSpec(b.b));
                return cipher;
            } catch (GeneralSecurityException unused) {
            }
        }
        AbstractC4851eH1.a("CipherFactory", "Error in creating cipher instance.", new Object[0]);
        return null;
    }

    public final YR b(boolean z) {
        if (this.c == null && z) {
            d();
            try {
                YR yr = (YR) this.b.get();
                synchronized (this.a) {
                    if (this.c == null) {
                        this.c = yr;
                        PostTask.c(AbstractC5103f04.a, new WR(this));
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            }
        }
        return this.c;
    }

    public final void d() {
        if (this.c != null) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                FutureTask futureTask = new FutureTask(new XR(this));
                this.b = futureTask;
                AbstractC0185Bl.e.execute(futureTask);
            }
        }
    }

    public final boolean c(Bundle bundle) {
        SecretKeySpec secretKeySpec;
        if (bundle == null) {
            AbstractC4851eH1.d("CipherFactory", "#restoreFromBundle, no savedInstanceState.", new Object[0]);
            return false;
        }
        byte[] byteArray = bundle.getByteArray("org.chromium.content.browser.crypto.CipherFactory.KEY");
        byte[] byteArray2 = bundle.getByteArray("org.chromium.content.browser.crypto.CipherFactory.IV");
        if (byteArray == null || byteArray2 == null) {
            AbstractC4851eH1.d("CipherFactory", "#restoreFromBundle, no wrapped key or no iv.", new Object[0]);
            return false;
        }
        try {
            secretKeySpec = new SecretKeySpec(byteArray, "AES");
        } catch (IllegalArgumentException unused) {
            AbstractC4851eH1.a("CipherFactory", "Error in restoring the key from the bundle.", new Object[0]);
        }
        synchronized (this.a) {
            YR yr = this.c;
            if (yr == null) {
                AbstractC4851eH1.d("CipherFactory", "#restoreFromBundle, creating new CipherData.", new Object[0]);
                this.c = new YR(secretKeySpec, byteArray2);
                return true;
            }
            if (yr.a.equals(secretKeySpec) && Arrays.equals(this.c.b, byteArray2)) {
                AbstractC4851eH1.d("CipherFactory", "#restoreFromBundle, using existing CipherData.", new Object[0]);
                return true;
            }
            AbstractC4851eH1.a("CipherFactory", "Attempted to restore different cipher data.", new Object[0]);
            return false;
        }
    }
}
