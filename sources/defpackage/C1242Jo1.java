package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242Jo1 extends AbstractC0107Av1 {
    public C1242Jo1(List list) {
        super(list);
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        return Integer.valueOf(l(c12282zv1, f));
    }

    public final int l(C12282zv1 c12282zv1, float f) {
        Object obj = c12282zv1.b;
        if (obj == null || c12282zv1.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        TJ1 tj1 = this.e;
        if (tj1 != null) {
            c12282zv1.h.floatValue();
            Integer num = (Integer) c12282zv1.c;
            e();
            Integer num2 = (Integer) tj1.b((Integer) obj, num);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        if (c12282zv1.k == 784923401) {
            c12282zv1.k = ((Integer) obj).intValue();
        }
        int i = c12282zv1.k;
        if (c12282zv1.l == 784923401) {
            c12282zv1.l = ((Integer) c12282zv1.c).intValue();
        }
        int i2 = c12282zv1.l;
        PointF pointF = CX1.a;
        return (int) ((f * (i2 - i)) + i);
    }
}
