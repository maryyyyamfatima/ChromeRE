package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sf3 */
/* loaded from: classes.dex */
public abstract class AbstractC2368Sf3 {
    public RecyclerView a;
    public Scroller b;
    public final C2108Qf3 c = new C2108Qf3(this);

    public abstract int[] b(AbstractC12077zK2 abstractC12077zK2, View view);

    public abstract View f(AbstractC12077zK2 abstractC12077zK2);

    public abstract int g(AbstractC12077zK2 abstractC12077zK2, int i, int i2);

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C2108Qf3 c2108Qf3 = this.c;
        if (recyclerView2 != null) {
            recyclerView2.h0(c2108Qf3);
            this.a.e0 = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.e0 != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.i(c2108Qf3);
            this.a.e0 = this;
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] c(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    public final void h() {
        AbstractC12077zK2 abstractC12077zK2;
        View f;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (abstractC12077zK2 = recyclerView.s) == null || (f = f(abstractC12077zK2)) == null) {
            return;
        }
        int[] b = b(abstractC12077zK2, f);
        int i = b[0];
        if (i == 0 && b[1] == 0) {
            return;
        }
        this.a.t0(i, b[1], false);
    }

    public VB1 d(AbstractC12077zK2 abstractC12077zK2) {
        return e(abstractC12077zK2);
    }

    public VB1 e(AbstractC12077zK2 abstractC12077zK2) {
        if (abstractC12077zK2 instanceof KK2) {
            return new C2238Rf3(this, this.a.getContext());
        }
        return null;
    }
}
