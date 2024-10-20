package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DW extends AbstractC0107Av1 {
    public DW(List list) {
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
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) c12282zv1.c).intValue();
        TJ1 tj1 = this.e;
        if (tj1 != null) {
            c12282zv1.h.floatValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer valueOf2 = Integer.valueOf(intValue2);
            e();
            Integer num = (Integer) tj1.b(valueOf, valueOf2);
            if (num != null) {
                return num.intValue();
            }
        }
        return AbstractC9739sX0.c(CX1.b(f, 0.0f, 1.0f), intValue, intValue2);
    }
}
