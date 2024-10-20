package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uM1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10371uM1 extends Animation {
    public final /* synthetic */ C11400xM1 a;
    public final /* synthetic */ C11743yM1 g;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C11743yM1 c11743yM1 = this.g;
        boolean z = c11743yM1.n;
        C11400xM1 c11400xM1 = this.a;
        if (z) {
            C11743yM1.b(f, c11400xM1);
            float floor = (float) (Math.floor(c11400xM1.n / 0.8f) + 1.0d);
            float radians = (float) Math.toRadians(c11400xM1.h / (c11400xM1.r * 6.283185307179586d));
            float f2 = c11400xM1.l;
            c11400xM1.e = (((c11400xM1.m - radians) - f2) * f) + f2;
            c11400xM1.a();
            c11400xM1.f = c11400xM1.m;
            c11400xM1.a();
            float f3 = c11400xM1.n;
            c11400xM1.g = AbstractC2277Rn2.a(floor, f3, f, f3);
            c11400xM1.a();
            return;
        }
        float radians2 = (float) Math.toRadians(c11400xM1.h / (c11400xM1.r * 6.283185307179586d));
        float f4 = c11400xM1.m;
        float f5 = c11400xM1.l;
        float f6 = c11400xM1.n;
        C11743yM1.b(f, c11400xM1);
        if (f <= 0.5f) {
            c11400xM1.e = (C11743yM1.p.getInterpolation(f / 0.5f) * (0.8f - radians2)) + f5;
            c11400xM1.a();
        }
        if (f > 0.5f) {
            c11400xM1.f = (C11743yM1.p.getInterpolation((f - 0.5f) / 0.5f) * (0.8f - radians2)) + f4;
            c11400xM1.a();
        }
        c11400xM1.g = (0.25f * f) + f6;
        c11400xM1.a();
        c11743yM1.h = ((c11743yM1.k / 5.0f) * 1080.0f) + (f * 216.0f);
        c11743yM1.invalidateSelf();
    }

    public C10371uM1(C11743yM1 c11743yM1, C11400xM1 c11400xM1) {
        this.g = c11743yM1;
        this.a = c11400xM1;
    }
}
