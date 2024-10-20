package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DN3 extends SV3 {
    public final int d;
    public final C10670vD2 e;
    public final Interpolator f;

    public DN3(int i, C10670vD2 c10670vD2, Interpolator interpolator) {
        this.d = i;
        this.e = c10670vD2;
        this.f = interpolator;
    }

    @Override // defpackage.AbstractC6096hu
    public final void a(ArrayList arrayList) {
        arrayList.add(this.e);
    }

    @Override // defpackage.SV3
    public final void f(GO2 go2) {
        BN3 bn3 = new BN3(this.d);
        C10670vD2 c10670vD2 = this.e;
        C6304iW3 c6304iW3 = (C6304iW3) go2;
        C9245r40 c9245r40 = new C9245r40(c6304iW3.a(c10670vD2.a));
        C9245r40 c9245r402 = new C9245r40(c10670vD2.b);
        RL1 rl1 = new RL1();
        C11647y41 c11647y41 = this.c;
        Interpolator interpolator = this.f;
        if (interpolator != null) {
            C7798mr1 c7798mr1 = new C7798mr1(interpolator);
            c11647y41.a(bn3, c7798mr1, "default_input");
            c11647y41.a(c7798mr1, rl1, "default_input");
        } else {
            c11647y41.a(bn3, rl1, "default_input");
        }
        c11647y41.a(c9245r40, rl1, "initial");
        c11647y41.a(c9245r402, rl1, "end");
        C11356xD2 c11356xD2 = c10670vD2.a;
        c11647y41.a(rl1, ((C5272fW3) ((C4241cW3) c6304iW3.a.b.a(c11356xD2.a)).a.get(c11356xD2.b)).a, "default_input");
    }
}
