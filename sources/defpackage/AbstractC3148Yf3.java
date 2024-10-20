package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yf3 */
/* loaded from: classes.dex */
public abstract class AbstractC3148Yf3 {
    public static AbstractC2368Sf3 b(int i, int i2, int i3) {
        if (i == -1) {
            return new C6034hj3(i3);
        }
        switch (i) {
            case 2147483645:
                return new C0921Hc0(i2);
            case 2147483646:
                return new WB1();
            case Integer.MAX_VALUE:
                return new C4652di2();
            default:
                return null;
        }
    }

    public static VB1 a(Context context, int i, int i2) {
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            return new C2315Rv0(AbstractC6353if3.a(i2), i, context);
        }
        if (i2 == 5) {
            return new C10349uI(context, i);
        }
        return new VB1(context);
    }
}
