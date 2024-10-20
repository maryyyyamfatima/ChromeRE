package defpackage;

import android.os.Bundle;
import androidx.fragment.app.h;
import org.chromium.chrome.browser.password_manager.settings.PasswordReauthenticationFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class YH2 {
    public static Long a;
    public static int b;

    public static void b(int i, int i2, h hVar, int i3) {
        PasswordReauthenticationFragment passwordReauthenticationFragment = new PasswordReauthenticationFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("description", i);
        bundle.putInt("scope", i3);
        passwordReauthenticationFragment.E0(bundle);
        hVar.getClass();
        C10547us c10547us = new C10547us(hVar);
        if (i2 != -1) {
            c10547us.j(i2, passwordReauthenticationFragment, "reauthentication-manager-fragment");
        } else {
            c10547us.g(0, passwordReauthenticationFragment, "reauthentication-manager-fragment", 1);
        }
        c10547us.c();
        c10547us.e(false);
    }

    public static boolean a(int i) {
        int i2 = b;
        return a != null && (i == i2 || i2 == 1) && System.currentTimeMillis() - a.longValue() < 60000;
    }
}
