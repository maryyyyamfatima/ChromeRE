package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: di2 */
/* loaded from: classes.dex */
public class C4652di2 extends AbstractC2368Sf3 {
    public C0803Ge2 d;
    public C0673Fe2 e;

    @Override // defpackage.AbstractC2368Sf3
    public final int[] b(AbstractC12077zK2 abstractC12077zK2, View view) {
        int[] iArr = new int[2];
        if (abstractC12077zK2.e()) {
            iArr[0] = i(view, k(abstractC12077zK2));
        } else {
            iArr[0] = 0;
        }
        if (abstractC12077zK2.f()) {
            iArr[1] = i(view, l(abstractC12077zK2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.AbstractC2368Sf3
    public View f(AbstractC12077zK2 abstractC12077zK2) {
        if (abstractC12077zK2.f()) {
            return j(abstractC12077zK2, l(abstractC12077zK2));
        }
        if (abstractC12077zK2.e()) {
            return j(abstractC12077zK2, k(abstractC12077zK2));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC2368Sf3
    public final int g(AbstractC12077zK2 abstractC12077zK2, int i, int i2) {
        AbstractC0933He2 k;
        PointF a;
        int C = abstractC12077zK2.C();
        if (C == 0) {
            return -1;
        }
        View view = null;
        if (abstractC12077zK2.f()) {
            k = l(abstractC12077zK2);
        } else {
            k = abstractC12077zK2.e() ? k(abstractC12077zK2) : null;
        }
        if (k == null) {
            return -1;
        }
        int x = abstractC12077zK2.x();
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < x; i5++) {
            View w = abstractC12077zK2.w(i5);
            if (w != null) {
                int i6 = i(w, k);
                if (i6 <= 0 && i6 > i4) {
                    view2 = w;
                    i4 = i6;
                }
                if (i6 >= 0 && i6 < i3) {
                    view = w;
                    i3 = i6;
                }
            }
        }
        boolean z2 = !abstractC12077zK2.e() ? i2 <= 0 : i <= 0;
        if (z2 && view != null) {
            return AbstractC12077zK2.J(view);
        }
        if (!z2 && view2 != null) {
            return AbstractC12077zK2.J(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int J2 = AbstractC12077zK2.J(view);
        int C2 = abstractC12077zK2.C();
        if ((abstractC12077zK2 instanceof KK2) && (a = ((KK2) abstractC12077zK2).a(C2 - 1)) != null && (a.x < 0.0f || a.y < 0.0f)) {
            z = true;
        }
        int i7 = J2 + (z == z2 ? -1 : 1);
        if (i7 < 0 || i7 >= C) {
            return -1;
        }
        return i7;
    }

    @Override // defpackage.AbstractC2368Sf3
    public final VB1 d(AbstractC12077zK2 abstractC12077zK2) {
        if (abstractC12077zK2 instanceof KK2) {
            return new C4308ci2(this, this.a.getContext());
        }
        return null;
    }

    public final int i(View view, AbstractC0933He2 abstractC0933He2) {
        return ((abstractC0933He2.c(view) / 2) + abstractC0933He2.e(view)) - ((abstractC0933He2.l() / 2) + abstractC0933He2.k());
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
