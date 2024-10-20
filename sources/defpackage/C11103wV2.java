package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wV2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11103wV2 extends AbstractC0107Av1 {
    public final C11446xV2 i;

    public C11103wV2(List list) {
        super(list);
        this.i = new C11446xV2();
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        Object obj;
        Object obj2 = c12282zv1.b;
        if (obj2 == null || (obj = c12282zv1.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C11446xV2 c11446xV2 = (C11446xV2) obj2;
        C11446xV2 c11446xV22 = (C11446xV2) obj;
        TJ1 tj1 = this.e;
        if (tj1 != null) {
            c12282zv1.h.floatValue();
            e();
            C11446xV2 c11446xV23 = (C11446xV2) tj1.b(c11446xV2, c11446xV22);
            if (c11446xV23 != null) {
                return c11446xV23;
            }
        }
        float f2 = c11446xV2.a;
        float f3 = c11446xV22.a;
        PointF pointF = CX1.a;
        float a = AbstractC2277Rn2.a(f3, f2, f, f2);
        float f4 = c11446xV2.b;
        float a2 = AbstractC2277Rn2.a(c11446xV22.b, f4, f, f4);
        C11446xV2 c11446xV24 = this.i;
        c11446xV24.a = a;
        c11446xV24.b = a2;
        return c11446xV24;
    }
}
