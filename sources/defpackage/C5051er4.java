package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: er4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5051er4 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean equals;
        if (Build.VERSION.SDK_INT >= 26) {
            equals = "android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) || "android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) || ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false));
        } else {
            equals = "android.security.STORAGE_CHANGED".equals(intent.getAction());
        }
        if (equals) {
            try {
                AbstractC5395fr4.a();
            } catch (KeyStoreException e) {
                AbstractC4851eH1.a("X509Util", "Unable to reload the default TrustManager", e);
            } catch (NoSuchAlgorithmException e2) {
                AbstractC4851eH1.a("X509Util", "Unable to reload the default TrustManager", e2);
            } catch (CertificateException e3) {
                AbstractC4851eH1.a("X509Util", "Unable to reload the default TrustManager", e3);
            }
        }
    }
}
