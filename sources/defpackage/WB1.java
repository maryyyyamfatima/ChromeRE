package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class WB1 extends AbstractC2368Sf3 {
    public C0803Ge2 d;
    public C0673Fe2 e;

    @Override // defpackage.AbstractC2368Sf3
    public final int[] b(AbstractC12077zK2 abstractC12077zK2, View view) {
        int[] iArr = new int[2];
        if (abstractC12077zK2.e()) {
            AbstractC0933He2 k = k(abstractC12077zK2);
            iArr[0] = ((k.c(view) / 2) + k.e(view)) - ((k.l() / 2) + k.k());
        } else {
            iArr[0] = 0;
        }
        if (abstractC12077zK2.f()) {
            AbstractC0933He2 l = l(abstractC12077zK2);
            iArr[1] = ((l.c(view) / 2) + l.e(view)) - ((l.l() / 2) + l.k());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC2368Sf3
    public int g(AbstractC12077zK2 abstractC12077zK2, int i, int i2) {
        int C;
        View f;
        int J2;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(abstractC12077zK2 instanceof KK2) || (C = abstractC12077zK2.C()) == 0 || (f = f(abstractC12077zK2)) == null || (J2 = AbstractC12077zK2.J(f)) == -1 || (a = ((KK2) abstractC12077zK2).a(C - 1)) == null) {
            return -1;
        }
        if (abstractC12077zK2.e()) {
            i4 = i(abstractC12077zK2, k(abstractC12077zK2), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (abstractC12077zK2.f()) {
            i5 = i(abstractC12077zK2, l(abstractC12077zK2), 0, i2);
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
        int i6 = J2 + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= C ? i3 : i7;
    }

    @Override // defpackage.AbstractC2368Sf3
    public final View f(AbstractC12077zK2 abstractC12077zK2) {
        if (abstractC12077zK2.f()) {
            return j(abstractC12077zK2, l(abstractC12077zK2));
        }
        if (abstractC12077zK2.e()) {
            return j(abstractC12077zK2, k(abstractC12077zK2));
        }
        return null;
    }

    public final int i(AbstractC12077zK2 abstractC12077zK2, AbstractC0933He2 abstractC0933He2, int i, int i2) {
        int[] c = c(i, i2);
        int x = abstractC12077zK2.x();
        float f = 1.0f;
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
                    f = (max * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(c[0]) > Math.abs(c[1]) ? c[0] : c[1]) / f);
    }

    public final View j(AbstractC12077zK2 abstractC12077zK2, AbstractC0933He2 abstractC0933He2) {
        int x = abstractC12077zK2.x();
        View view = null;
        if (x == 0) {
            return null;
        }
        int l = (abstractC0933He2.l() / 2) + abstractC0933He2.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < x; i2++) {
            View w = abstractC12077zK2.w(i2);
            int abs = Math.abs(((abstractC0933He2.c(w) / 2) + abstractC0933He2.e(w)) - l);
            if (abs < i) {
                view = w;
                i = abs;
            }
        }
        return view;
    }

    public final AbstractC0933He2 l(AbstractC12077zK2 abstractC12077zK2) {
        C0803Ge2 c0803Ge2 = this.d;
        if (c0803Ge2 == null || c0803Ge2.a != abstractC12077zK2) {
            this.d = new C0803Ge2(abstractC12077zK2);
        }
        return this.d;
    }

    public final AbstractC0933He2 k(AbstractC12077zK2 abstractC12077zK2) {
        C0673Fe2 c0673Fe2 = this.e;
        if (c0673Fe2 == null || c0673Fe2.a != abstractC12077zK2) {
            this.e = new C0673Fe2(abstractC12077zK2);
        }
        return this.e;
    }
}
