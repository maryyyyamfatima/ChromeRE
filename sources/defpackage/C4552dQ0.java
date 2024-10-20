package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4552dQ0 extends AbstractC0107Av1 {
    public C4552dQ0(List list) {
        super(list);
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        return Float.valueOf(m(c12282zv1, f));
    }

    public final float m(C12282zv1 c12282zv1, float f) {
        Object obj = c12282zv1.b;
        if (obj == null || c12282zv1.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        TJ1 tj1 = this.e;
        if (tj1 != null) {
            c12282zv1.h.floatValue();
            Float f2 = (Float) c12282zv1.c;
            e();
            Float f3 = (Float) tj1.b((Float) obj, f2);
            if (f3 != null) {
                return f3.floatValue();
            }
        }
        if (c12282zv1.i == -3987645.8f) {
            c12282zv1.i = ((Float) obj).floatValue();
        }
        float f4 = c12282zv1.i;
        if (c12282zv1.j == -3987645.8f) {
            c12282zv1.j = ((Float) c12282zv1.c).floatValue();
        }
        float f5 = c12282zv1.j;
        PointF pointF = CX1.a;
        return AbstractC2277Rn2.a(f5, f4, f, f4);
    }

    public final float l() {
        return m(b(), d());
    }
}
