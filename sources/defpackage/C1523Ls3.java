package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ls3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1523Ls3 extends Animation {
    public final /* synthetic */ C2303Rs3 a;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C2303Rs3 c2303Rs3 = this.a;
        float abs = !c2303Rs3.C ? c2303Rs3.x - Math.abs(c2303Rs3.s) : c2303Rs3.x;
        c2303Rs3.i((c2303Rs3.q + ((int) ((((int) abs) - r1) * f))) - c2303Rs3.o.getTop());
        float f2 = 1.0f - f;
        C11400xM1 c11400xM1 = c2303Rs3.t.g;
        if (f2 != c11400xM1.q) {
            c11400xM1.q = f2;
            c11400xM1.a();
        }
    }

    public C1523Ls3(C2303Rs3 c2303Rs3) {
        this.a = c2303Rs3;
    }
}
