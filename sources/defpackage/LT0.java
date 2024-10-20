package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LT0 extends AbstractC8305oK2 {
    public final AA1 i;
    public final h j;
    public final C3487aJ1 k;
    public final C3487aJ1 l;
    public final C3487aJ1 m;
    public KT0 n;
    public final GT0 o;
    public boolean p;
    public boolean q;

    public abstract c O(int i);

    @Override // defpackage.AbstractC8305oK2
    public final long r(int i) {
        return i;
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        Bundle bundle;
        C6977kU0 c6977kU0 = (C6977kU0) dVar;
        long j = c6977kU0.j;
        FrameLayout frameLayout = (FrameLayout) c6977kU0.a;
        int id = frameLayout.getId();
        Long Q = Q(id);
        C3487aJ1 c3487aJ1 = this.m;
        if (Q != null && Q.longValue() != j) {
            S(Q.longValue());
            c3487aJ1.j(Q.longValue());
        }
        c3487aJ1.i(j, Integer.valueOf(id));
        long j2 = i;
        C3487aJ1 c3487aJ12 = this.k;
        if (!(c3487aJ12.f(j2) >= 0)) {
            c O = O(i);
            Fragment$SavedState fragment$SavedState = (Fragment$SavedState) this.l.d(j2);
            if (O.x != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (fragment$SavedState == null || (bundle = fragment$SavedState.a) == null) {
                bundle = null;
            }
            O.g = bundle;
            c3487aJ12.i(j2, O);
        }
        WeakHashMap weakHashMap = Ec4.a;
        if (frameLayout.isAttachedToWindow()) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new BT0(this, frameLayout, c6977kU0));
        }
        P();
    }

    @Override // defpackage.AbstractC8305oK2
    public final /* bridge */ /* synthetic */ boolean G(d dVar) {
        return true;
    }

    @Override // defpackage.AbstractC8305oK2
    public final void H(d dVar) {
        R((C6977kU0) dVar);
        P();
    }

    @Override // defpackage.AbstractC8305oK2
    public final void I(d dVar) {
        Long Q = Q(((FrameLayout) ((C6977kU0) dVar).a).getId());
        if (Q != null) {
            S(Q.longValue());
            this.m.j(Q.longValue());
        }
    }

    public LT0(VS0 vs0) {
        h h0 = vs0.h0();
        LA1 Z = vs0.Z();
        this.k = new C3487aJ1();
        this.l = new C3487aJ1();
        this.m = new C3487aJ1();
        this.o = new GT0();
        this.p = false;
        this.q = false;
        this.j = h0;
        this.i = Z;
        K(true);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void A(RecyclerView recyclerView) {
        KT0 kt0 = new KT0(this);
        this.n = kt0;
        ViewPager2 a = KT0.a(recyclerView);
        kt0.d = a;
        HT0 ht0 = new HT0(kt0);
        kt0.a = ht0;
        a.h.a.add(ht0);
        IT0 it0 = new IT0(kt0);
        kt0.b = it0;
        J(it0);
        JT0 jt0 = new JT0(kt0);
        kt0.c = jt0;
        this.i.a(jt0);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void F(RecyclerView recyclerView) {
        KT0 kt0 = this.n;
        kt0.getClass();
        ViewPager2 a = KT0.a(recyclerView);
        a.h.a.remove(kt0.a);
        IT0 it0 = kt0.b;
        LT0 lt0 = kt0.f;
        lt0.L(it0);
        lt0.i.b(kt0.c);
        kt0.d = null;
        this.n = null;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        int i2 = C6977kU0.z;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = Ec4.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new C6977kU0(frameLayout);
    }

    public final void P() {
        C3487aJ1 c3487aJ1;
        C3487aJ1 c3487aJ12;
        c cVar;
        View view;
        if (!this.q || this.j.J()) {
            return;
        }
        C5348fk c5348fk = new C5348fk(0);
        int i = 0;
        while (true) {
            c3487aJ1 = this.k;
            int k = c3487aJ1.k();
            c3487aJ12 = this.m;
            if (i >= k) {
                break;
            }
            long h = c3487aJ1.h(i);
            if (!N(h)) {
                c5348fk.add(Long.valueOf(h));
                c3487aJ12.j(h);
            }
            i++;
        }
        if (!this.p) {
            this.q = false;
            for (int i2 = 0; i2 < c3487aJ1.k(); i2++) {
                long h2 = c3487aJ1.h(i2);
                boolean z = true;
                if (!(c3487aJ12.f(h2) >= 0) && ((cVar = (c) c3487aJ1.d(h2)) == null || (view = cVar.L) == null || view.getParent() == null)) {
                    z = false;
                }
                if (!z) {
                    c5348fk.add(Long.valueOf(h2));
                }
            }
        }
        C5004ek c5004ek = new C5004ek(c5348fk);
        while (c5004ek.hasNext()) {
            S(((Long) c5004ek.next()).longValue());
        }
    }

    public final Long Q(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            C3487aJ1 c3487aJ1 = this.m;
            if (i2 >= c3487aJ1.k()) {
                return l;
            }
            if (((Integer) c3487aJ1.l(i2)).intValue() == i) {
                if (l != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l = Long.valueOf(c3487aJ1.h(i2));
            }
            i2++;
        }
    }

    public static void M(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void S(long j) {
        ViewParent parent;
        C3487aJ1 c3487aJ1 = this.k;
        c cVar = (c) c3487aJ1.d(j);
        if (cVar == null) {
            return;
        }
        View view = cVar.L;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean N = N(j);
        C3487aJ1 c3487aJ12 = this.l;
        if (!N) {
            c3487aJ12.j(j);
        }
        if (!cVar.W()) {
            c3487aJ1.j(j);
            return;
        }
        h hVar = this.j;
        if (hVar.J()) {
            this.q = true;
            return;
        }
        boolean W = cVar.W();
        GT0 gt0 = this.o;
        if (W && N(j)) {
            gt0.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = gt0.a.iterator();
            if (!it.hasNext()) {
                hVar.getClass();
                k kVar = (k) hVar.c.b.get(cVar.k);
                if (kVar != null) {
                    c cVar2 = kVar.c;
                    if (cVar2.equals(cVar)) {
                        Fragment$SavedState fragment$SavedState = cVar2.a > -1 ? new Fragment$SavedState(kVar.o()) : null;
                        GT0.b(arrayList);
                        c3487aJ12.i(j, fragment$SavedState);
                    }
                }
                hVar.a0(new IllegalStateException(KS0.a("Fragment ", cVar, " is not currently in the FragmentManager")));
                throw null;
            }
            X5.a(it.next());
            throw null;
        }
        gt0.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = gt0.a.iterator();
        if (!it2.hasNext()) {
            try {
                hVar.getClass();
                C10547us c10547us = new C10547us(hVar);
                c10547us.i(cVar);
                c10547us.f();
                c3487aJ1.j(j);
                return;
            } finally {
                GT0.b(arrayList2);
            }
        }
        X5.a(it2.next());
        throw null;
    }

    public final boolean N(long j) {
        return j >= 0 && j < ((long) q());
    }

    public final void R(C6977kU0 c6977kU0) {
        c cVar = (c) this.k.d(c6977kU0.j);
        if (cVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) c6977kU0.a;
        View view = cVar.L;
        if (!cVar.W() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean W = cVar.W();
        h hVar = this.j;
        if (W && view == null) {
            hVar.m.a.add(new C5254fT0(new DT0(this, cVar, frameLayout)));
            return;
        }
        if (cVar.W() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                M(view, frameLayout);
                return;
            }
            return;
        }
        if (cVar.W()) {
            M(view, frameLayout);
            return;
        }
        if (hVar.J()) {
            if (hVar.H) {
                return;
            }
            this.i.a(new CT0(this, c6977kU0));
            return;
        }
        hVar.m.a.add(new C5254fT0(new DT0(this, cVar, frameLayout)));
        GT0 gt0 = this.o;
        gt0.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = gt0.a.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
        try {
            cVar.G0(false);
            hVar.getClass();
            C10547us c10547us = new C10547us(hVar);
            c10547us.g(0, cVar, "f" + c6977kU0.j, 1);
            c10547us.k(cVar, EnumC11683yA1.STARTED);
            c10547us.f();
            this.n.b(false);
        } finally {
            GT0.b(arrayList);
        }
    }
}
