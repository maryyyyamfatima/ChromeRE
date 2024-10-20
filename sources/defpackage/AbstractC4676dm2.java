package defpackage;

import J.N;
import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dm2 */
/* loaded from: classes.dex */
public abstract class AbstractC4676dm2 {
    public static int b() {
        int i = 221800000;
        if (!AbstractC8293oI0.a()) {
            return 221800000;
        }
        C7928nE c7928nE = UN.a;
        int M37SqSAy = N.M37SqSAy("UnifiedPasswordManagerAndroid", "stage", 0);
        if (M37SqSAy != 0 && M37SqSAy != 1) {
            if (M37SqSAy != 2) {
                AbstractC4851eH1.f("PasswordManager", AbstractC9307rF1.a("No minimum GMS version defined for the password manager variation '", M37SqSAy, "'. Defaulting to 221800000"), new Object[0]);
            } else {
                i = 221500000;
            }
        }
        return N.M37SqSAy("UnifiedPasswordManagerAndroid", "min_gms_core_version_no_dots", i);
    }

    public static boolean a() {
        Context context = V60.a;
        return context != null && C8543p11.d.c(context, b()) == 0;
    }
}
