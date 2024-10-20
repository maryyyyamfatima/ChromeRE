package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ps3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2043Ps3 extends Animation {
    public final /* synthetic */ C2303Rs3 a;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C2303Rs3 c2303Rs3 = this.a;
        float f2 = c2303Rs3.r;
        c2303Rs3.g(((-f2) * f) + f2);
        c2303Rs3.i((c2303Rs3.q + ((int) ((c2303Rs3.s - r0) * f))) - c2303Rs3.o.getTop());
    }

    public C2043Ps3(C2303Rs3 c2303Rs3) {
        this.a = c2303Rs3;
    }
}
