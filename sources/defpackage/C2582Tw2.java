package defpackage;

import android.graphics.PointF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tw2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2582Tw2 implements N74 {
    public static final C2582Tw2 a = new C2582Tw2();

    @Override // defpackage.N74
    public final Object a(AbstractC3086Xt1 abstractC3086Xt1, float f) {
        int u = abstractC3086Xt1.u();
        if (u == 1) {
            return AbstractC4036bu1.b(abstractC3086Xt1, f);
        }
        if (u == 3) {
            return AbstractC4036bu1.b(abstractC3086Xt1, f);
        }
        if (u == 7) {
            PointF pointF = new PointF(((float) abstractC3086Xt1.k()) * f, ((float) abstractC3086Xt1.k()) * f);
            while (abstractC3086Xt1.i()) {
                abstractC3086Xt1.I();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(AbstractC2956Wt1.a(u)));
    }
}
