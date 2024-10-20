package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EM1 {
    public static AbstractC11676y90 a(int i) {
        if (i == 0) {
            return new C6620jR2();
        }
        if (i == 1) {
            return new C9441rf0();
        }
        return new C6620jR2();
    }

    public static void b(View view, DM1 dm1) {
        C2720Uy0 c2720Uy0 = dm1.a.b;
        if (c2720Uy0 != null && c2720Uy0.a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = Ec4.a;
                f += ((View) parent).getElevation();
            }
            CM1 cm1 = dm1.a;
            if (cm1.m != f) {
                cm1.m = f;
                dm1.n();
            }
        }
    }
}
