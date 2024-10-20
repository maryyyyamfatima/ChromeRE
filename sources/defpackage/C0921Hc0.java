package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hc0 */
/* loaded from: classes.dex */
public final class C0921Hc0 extends WB1 {
    public static int f = Integer.MAX_VALUE;

    public C0921Hc0(int i) {
        f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.WB1, defpackage.AbstractC2368Sf3
    public final int g(AbstractC12077zK2 abstractC12077zK2, int i, int i2) {
        int C;
        View f2;
        int J2;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(abstractC12077zK2 instanceof KK2) || (C = abstractC12077zK2.C()) == 0 || (f2 = f(abstractC12077zK2)) == null || (J2 = AbstractC12077zK2.J(f2)) == -1 || (a = ((KK2) abstractC12077zK2).a(C - 1)) == null) {
            return -1;
        }
        if (abstractC12077zK2.e()) {
            i4 = i(abstractC12077zK2, new C0673Fe2(abstractC12077zK2), i, 0);
            int i6 = f;
            if (i4 > i6) {
                i4 = i6;
            }
            int i7 = -i6;
            if (i4 < i7) {
                i4 = i7;
            }
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (abstractC12077zK2.f()) {
            i5 = i(abstractC12077zK2, new C0803Ge2(abstractC12077zK2), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (abstractC12077zK2.f()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i8 = J2 + i4;
        int i9 = i8 >= 0 ? i8 : 0;
        return i9 >= C ? i3 : i9;
    }

    private int i(AbstractC12077zK2 abstractC12077zK2, AbstractC0933He2 abstractC0933He2, int i, int i2) {
        int[] c = c(i, i2);
        int x = abstractC12077zK2.x();
        float f2 = 1.0f;
        if (x != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < x; i5++) {
                View w = abstractC12077zK2.w(i5);
                int J2 = AbstractC12077zK2.J(w);
                if (J2 != -1) {
                    if (J2 < i4) {
                        view = w;
                        i4 = J2;
                    }
                    if (J2 > i3) {
                        view2 = w;
                        i3 = J2;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(abstractC0933He2.b(view), abstractC0933He2.b(view2)) - Math.min(abstractC0933He2.e(view), abstractC0933He2.e(view2));
                if (max != 0) {
                    f2 = (max * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(c[0]) > Math.abs(c[1]) ? c[0] : c[1]) / f2);
    }
}
