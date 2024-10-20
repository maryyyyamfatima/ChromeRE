package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2270Rm0 {
    public static int b(int i, Bundle bundle) {
        if (bundle.getInt("digitalgoods.version") != 0) {
            if (i >= 0 && i <= 6) {
                return i;
            }
            AbstractC4851eH1.f("DigitalGoods", AbstractC9076qb1.a("Unexpected response code: ", i), new Object[0]);
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 7) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        AbstractC4851eH1.f("DigitalGoods", AbstractC9076qb1.a("Unexpected response code: ", i), new Object[0]);
        return 1;
    }

    public static boolean a(Bundle bundle, String str, Class cls) {
        if (bundle.containsKey(str) && cls.isAssignableFrom(bundle.get(str).getClass())) {
            return true;
        }
        AbstractC4851eH1.f("DigitalGoods", "Missing field " + str + " of type " + cls.getName() + ".", new Object[0]);
        return false;
    }
}
