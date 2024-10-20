package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uw2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2712Uw2 extends AbstractC0107Av1 {
    public final PointF i;

    public C2712Uw2(List list) {
        super(list);
        this.i = new PointF();
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        return h(c12282zv1, f, f, f);
    }

    @Override // defpackage.AbstractC11251wv
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PointF h(C12282zv1 c12282zv1, float f, float f2, float f3) {
        Object obj;
        Object obj2 = c12282zv1.b;
        if (obj2 == null || (obj = c12282zv1.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        TJ1 tj1 = this.e;
        if (tj1 != null) {
            c12282zv1.h.floatValue();
            e();
            PointF pointF3 = (PointF) tj1.b(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.i;
        float f4 = pointF.x;
        float a = AbstractC2277Rn2.a(pointF2.x, f4, f2, f4);
        float f5 = pointF.y;
        pointF4.set(a, ((pointF2.y - f5) * f3) + f5);
        return pointF4;
    }
}
