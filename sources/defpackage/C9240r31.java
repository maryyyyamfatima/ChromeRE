package defpackage;

import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9240r31 {
    public final InterfaceC10851vl2 a;

    public static String b(int i) {
        if (i == 0) {
            return "chrome_settings";
        }
        if (i == 1) {
            return "chrome_safety_check";
        }
        if (i == 2) {
            return "chrome_leak_warning";
        }
        if (i != 3) {
            return null;
        }
        return "chrome_phished_warning";
    }

    public C9240r31(C0448Dl2 c0448Dl2) {
        this.a = c0448Dl2;
    }

    public static CredentialManagerAccount a(AbstractC9095qe2 abstractC9095qe2) {
        if (!abstractC9095qe2.c()) {
            return new CredentialManagerAccount("pwm.constant.LocalAccount");
        }
        return new CredentialManagerAccount((String) abstractC9095qe2.b());
    }
}
