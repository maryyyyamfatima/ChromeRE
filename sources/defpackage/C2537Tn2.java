package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tn2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2537Tn2 extends AbstractC0107Av1 {
    public final PointF i;
    public final float[] j;
    public final PathMeasure k;
    public C2407Sn2 l;

    public C2537Tn2(List list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        C2407Sn2 c2407Sn2 = (C2407Sn2) c12282zv1;
        Path path = c2407Sn2.q;
        if (path == null) {
            return (PointF) c12282zv1.b;
        }
        TJ1 tj1 = this.e;
        if (tj1 != null) {
            c2407Sn2.h.floatValue();
            PointF pointF = (PointF) c2407Sn2.b;
            PointF pointF2 = (PointF) c2407Sn2.c;
            e();
            PointF pointF3 = (PointF) tj1.b(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        C2407Sn2 c2407Sn22 = this.l;
        PathMeasure pathMeasure = this.k;
        if (c2407Sn22 != c2407Sn2) {
            pathMeasure.setPath(path, false);
            this.l = c2407Sn2;
        }
        float length = pathMeasure.getLength() * f;
        float[] fArr = this.j;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF4 = this.i;
        pointF4.set(fArr[0], fArr[1]);
        return pointF4;
    }
}
