package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5812h41 extends AbstractC0107Av1 {
    public final C5124f41 i;

    public C5812h41(List list) {
        super(list);
        C5124f41 c5124f41 = (C5124f41) ((C12282zv1) list.get(0)).b;
        int length = c5124f41 != null ? c5124f41.b.length : 0;
        this.i = new C5124f41(new float[length], new int[length]);
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        C5124f41 c5124f41 = (C5124f41) c12282zv1.b;
        C5124f41 c5124f412 = (C5124f41) c12282zv1.c;
        C5124f41 c5124f413 = this.i;
        c5124f413.getClass();
        int[] iArr = c5124f41.b;
        int length = iArr.length;
        int[] iArr2 = c5124f412.b;
        if (length != iArr2.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + iArr.length + " vs " + iArr2.length + ")");
        }
        for (int i = 0; i < iArr.length; i++) {
            float f2 = c5124f41.a[i];
            float f3 = c5124f412.a[i];
            PointF pointF = CX1.a;
            c5124f413.a[i] = AbstractC2277Rn2.a(f3, f2, f, f2);
            c5124f413.b[i] = AbstractC9739sX0.c(f, iArr[i], iArr2[i]);
        }
        return c5124f413;
    }
}
