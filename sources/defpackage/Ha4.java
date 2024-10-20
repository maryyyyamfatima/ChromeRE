package defpackage;

import j$.util.function.Consumer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ha4 implements Ga4 {
    public final C9758sa4 a;
    public final boolean b;

    public Ha4(C10101ta4 c10101ta4, C2317Rv2 c2317Rv2, Consumer consumer) {
        C6442iu3 c6442iu3 = (C6442iu3) c10101ta4.a.get();
        C10101ta4.a(1, c6442iu3);
        C10101ta4.a(2, c2317Rv2);
        this.a = new C9758sa4(c6442iu3, c2317Rv2, consumer);
        this.b = c2317Rv2.j == 1;
    }

    public final void a(int i) {
        if (i != 0) {
            int i2 = i - 1;
            C9758sa4 c9758sa4 = this.a;
            if (i2 == 0) {
                if (c9758sa4.i) {
                    return;
                }
                c9758sa4.c(null, null, null, false);
                c9758sa4.i = true;
                c9758sa4.d(3);
                return;
            }
            if (i2 != 1) {
                return;
            }
            if (!this.b) {
                Kb4 kb4 = c9758sa4.k;
                if (kb4 != null) {
                    int i3 = ((Lb4) kb4.g).j;
                    if (!((i3 & 4) != 0)) {
                        if (!((i3 & 16) != 0)) {
                            return;
                        }
                    }
                    c9758sa4.c((Lb4) kb4.j(), null, null, true);
                    c9758sa4.i = false;
                    return;
                }
                return;
            }
            Kb4 kb42 = c9758sa4.k;
            if (kb42 != null) {
                if ((((Lb4) kb42.g).j & 64) != 0) {
                    c9758sa4.c((Lb4) kb42.j(), null, null, true);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }
}
