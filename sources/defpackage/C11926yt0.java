package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yt0 */
/* loaded from: classes2.dex */
public final class C11926yt0 extends AbstractC1002Hs1 {
    public d c;
    public final /* synthetic */ AbstractC12269zt0 d;

    @Override // defpackage.AbstractC1002Hs1
    public final void j(d dVar) {
    }

    public C11926yt0(AbstractC12269zt0 abstractC12269zt0) {
        this.d = abstractC12269zt0;
    }

    @Override // defpackage.AbstractC1002Hs1
    public final int c(RecyclerView recyclerView, d dVar) {
        d dVar2 = this.c;
        return ((dVar2 == dVar || dVar2 == null) && this.d.O(dVar)) ? 196611 : 0;
    }

    @Override // defpackage.AbstractC1002Hs1
    public final void i(d dVar, int i) {
        if (i != 2 || this.c == dVar) {
            return;
        }
        this.c = dVar;
        int g = dVar.g();
        AbstractC12269zt0 abstractC12269zt0 = this.d;
        abstractC12269zt0.p = g;
        AbstractC12269zt0.M(abstractC12269zt0, true);
        k(dVar, true);
    }

    @Override // defpackage.AbstractC1002Hs1
    public final void b(RecyclerView recyclerView, d dVar) {
        super.b(recyclerView, dVar);
        int g = dVar.g();
        AbstractC12269zt0 abstractC12269zt0 = this.d;
        if (g != abstractC12269zt0.p && recyclerView.isAttachedToWindow()) {
            recyclerView.post(new Runnable() { // from class: xt0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC12269zt0 abstractC12269zt02 = C11926yt0.this.d;
                    abstractC12269zt02.Q(abstractC12269zt02.k);
                }
            });
        }
        this.c = null;
        AbstractC12269zt0.M(abstractC12269zt0, false);
        k(dVar, false);
    }

    @Override // defpackage.AbstractC1002Hs1
    public final boolean f() {
        return this.d.o.a();
    }

    @Override // defpackage.AbstractC1002Hs1
    public final boolean a(d dVar, d dVar2) {
        AbstractC12269zt0 abstractC12269zt0 = this.d;
        return abstractC12269zt0.P(dVar) && abstractC12269zt0.P(dVar2);
    }

    public final void k(final d dVar, final boolean z) {
        C6349ie4 a = Ec4.a(dVar.a);
        float f = z ? this.d.n : 0.0f;
        WeakReference weakReference = a.a;
        View view = (View) weakReference.get();
        if (view != null) {
            view.animate().translationZ(f);
        }
        Runnable runnable = new Runnable() { // from class: wt0
            @Override // java.lang.Runnable
            public final void run() {
                C11926yt0 c11926yt0 = C11926yt0.this;
                c11926yt0.getClass();
                dVar.a.setBackgroundColor(z ? c11926yt0.d.m : 0);
            }
        };
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().withEndAction(runnable);
        }
        a.c(100L);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().start();
        }
    }

    @Override // defpackage.AbstractC1002Hs1
    public final boolean h(RecyclerView recyclerView, d dVar, d dVar2) {
        int g = dVar.g();
        int g2 = dVar2.g();
        if (g == g2) {
            return false;
        }
        AbstractC12269zt0 abstractC12269zt0 = this.d;
        Collections.swap(abstractC12269zt0.k, g, g2);
        abstractC12269zt0.w(g, g2);
        return true;
    }
}
