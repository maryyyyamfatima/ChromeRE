package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sn2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2407Sn2 extends C12282zv1 {
    public Path q;
    public final C12282zv1 r;

    public C2407Sn2(C8985qJ1 c8985qJ1, C12282zv1 c12282zv1) {
        super(c8985qJ1, (PointF) c12282zv1.b, (PointF) c12282zv1.c, c12282zv1.d, c12282zv1.e, c12282zv1.f, c12282zv1.g, c12282zv1.h);
        this.r = c12282zv1;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C12282zv1 c12282zv1 = this.r;
        PointF pointF3 = c12282zv1.o;
        PointF pointF4 = c12282zv1.p;
        C11325x74 c11325x74 = C74.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        this.q = path;
    }
}
