package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hj3 */
/* loaded from: classes.dex */
public final class C6034hj3 extends AbstractC2368Sf3 {
    public C0803Ge2 d;
    public C0673Fe2 e;
    public AbstractC12077zK2 f;
    public AbstractC12077zK2 g;
    public RecyclerView h;
    public final int i;

    public C6034hj3(int i) {
        this.i = i;
    }

    @Override // defpackage.AbstractC2368Sf3
    public final int[] b(AbstractC12077zK2 abstractC12077zK2, View view) {
        int[] iArr = new int[2];
        if (abstractC12077zK2.e()) {
            AbstractC0933He2 j = j(abstractC12077zK2);
            iArr[0] = j.e(view) - j.k();
        } else {
            iArr[0] = 0;
        }
        if (abstractC12077zK2.f()) {
            AbstractC0933He2 k = k(abstractC12077zK2);
            iArr[1] = k.e(view) - k.k();
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.AbstractC2368Sf3
    public final void a(RecyclerView recyclerView) {
        this.h = recyclerView;
        super.a(recyclerView);
    }

    @Override // defpackage.AbstractC2368Sf3
    public final View f(AbstractC12077zK2 abstractC12077zK2) {
        if (abstractC12077zK2.f()) {
            return i(abstractC12077zK2, k(abstractC12077zK2));
        }
        if (abstractC12077zK2.e()) {
            return i(abstractC12077zK2, j(abstractC12077zK2));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC2368Sf3
    public final int g(AbstractC12077zK2 abstractC12077zK2, int i, int i2) {
        int J2;
        PointF a;
        int C = abstractC12077zK2.C();
        if (C == 0) {
            return -1;
        }
        boolean e = abstractC12077zK2.e();
        AbstractC0933He2 j = e ? j(abstractC12077zK2) : k(abstractC12077zK2);
        int x = abstractC12077zK2.x();
        View view = null;
        if (x != 0) {
            int k = j.k();
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < x; i4++) {
                View w = abstractC12077zK2.w(i4);
                int e2 = j.e(w);
                int abs = Math.abs(e2 - k);
                if (e2 < k && abs < i3) {
                    view = w;
                    i3 = abs;
                }
            }
        }
        if (view == null || (J2 = AbstractC12077zK2.J(view)) == -1) {
            return -1;
        }
        boolean z = true;
        boolean z2 = !e ? i2 <= 0 : i <= 0;
        if (!(abstractC12077zK2 instanceof KK2) || (a = ((KK2) abstractC12077zK2).a(C - 1)) == null || (a.x >= 0.0f && a.y >= 0.0f)) {
            z = false;
        }
        if (z2) {
            int i5 = this.i;
            J2 = z ? J2 - i5 : J2 + i5;
        }
        int i6 = J2 >= 0 ? J2 : 0;
        return i6 >= C ? C - 1 : i6;
    }

    @Override // defpackage.AbstractC2368Sf3
    public final VB1 e(AbstractC12077zK2 abstractC12077zK2) {
        if (abstractC12077zK2 instanceof KK2) {
            return new C5690gj3(this, this.h.getContext());
        }
        return null;
    }

    public static View i(AbstractC12077zK2 abstractC12077zK2, AbstractC0933He2 abstractC0933He2) {
        int x = abstractC12077zK2.x();
        View view = null;
        if (x == 0) {
            return null;
        }
        int k = abstractC0933He2.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < x; i2++) {
            View w = abstractC12077zK2.w(i2);
            int abs = Math.abs(abstractC0933He2.e(w) - k);
            if (abs < i) {
                view = w;
                i = abs;
            }
        }
        return view;
    }

    public final AbstractC0933He2 k(AbstractC12077zK2 abstractC12077zK2) {
        if (this.d == null || this.f != abstractC12077zK2) {
            this.d = new C0803Ge2(abstractC12077zK2);
            this.f = abstractC12077zK2;
        }
        return this.d;
    }

    public final AbstractC0933He2 j(AbstractC12077zK2 abstractC12077zK2) {
        if (this.e == null || this.g != abstractC12077zK2) {
            this.e = new C0673Fe2(abstractC12077zK2);
            this.g = abstractC12077zK2;
        }
        return this.e;
    }
}
