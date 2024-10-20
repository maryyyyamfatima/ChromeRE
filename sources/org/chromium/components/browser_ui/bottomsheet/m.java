package org.chromium.components.browser_ui.bottomsheet;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.AbstractC4851eH1;
import defpackage.C11939yv1;
import defpackage.C7638mO3;
import defpackage.C8385oa2;
import defpackage.H1;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC4481dC;
import defpackage.PB;
import defpackage.QB;
import defpackage.RB;
import defpackage.TB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class m implements QB, TB {
    public BottomSheet a;
    public ViewGroup g;
    public PriorityQueue h;
    public boolean i;
    public boolean j;
    public h k;
    public int m;
    public PB n;
    public final InterfaceC0079Ap3 o;
    public H1 q;
    public RB t;
    public final C8385oa2 r = new C8385oa2();
    public final ArrayList l = new ArrayList();
    public final C7638mO3 p = new C7638mO3(new Runnable() { // from class: org.chromium.components.browser_ui.bottomsheet.g
        @Override // java.lang.Runnable
        public final void run() {
            BottomSheet bottomSheet;
            int i;
            m mVar = m.this;
            if (!mVar.p.b() && (bottomSheet = mVar.a) != null) {
                if (bottomSheet.u != null) {
                    if (mVar.n == mVar.h()) {
                        i = mVar.m;
                    } else {
                        BottomSheet bottomSheet2 = mVar.a;
                        if (bottomSheet2.u == null) {
                            i = 0;
                        } else if (bottomSheet2.p()) {
                            i = 1;
                        } else {
                            i = bottomSheet2.o() ? 2 : 3;
                        }
                    }
                    mVar.a.t(i, 0, true);
                } else {
                    mVar.r(true);
                }
                mVar.n = null;
                mVar.m = -1;
            }
            mVar.u();
        }
    });
    public final k s = new k(this);

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public m(InterfaceC0079Ap3 interfaceC0079Ap3, Callback callback, Window window, C11939yv1 c11939yv1, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC0079Ap3 interfaceC0079Ap33) {
        this.o = interfaceC0079Ap3;
        this.k = new h(this, callback, window, c11939yv1, interfaceC0079Ap32, interfaceC0079Ap33);
    }

    public final void q(float f) {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet != null) {
            bottomSheet.B = f;
            if (bottomSheet.r != 0 && bottomSheet.q <= bottomSheet.l(1)) {
                bottomSheet.s(bottomSheet.q, 1, true);
            }
        }
    }

    public final void d() {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet != null) {
            StringBuilder sb = new StringBuilder("Sheet destroyed: state: ");
            sb.append(bottomSheet.r);
            sb.append(", content null: ");
            sb.append(bottomSheet.u == null);
            AbstractC4851eH1.d("BottomSheet", sb.toString(), new Object[0]);
            bottomSheet.A = true;
            bottomSheet.y = false;
            bottomSheet.g.clear();
            ValueAnimator valueAnimator = bottomSheet.m;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            bottomSheet.m = null;
        }
    }

    public final boolean k() {
        if (this.a == null || this.p.b()) {
            return false;
        }
        if (h() != null && h().h()) {
            return true;
        }
        BottomSheet bottomSheet = this.a;
        if (!bottomSheet.z) {
            return false;
        }
        this.a.t(bottomSheet.i(), 2, true);
        return true;
    }

    public final PB h() {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null) {
            return null;
        }
        return bottomSheet.u;
    }

    public final int i() {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null) {
            return 0;
        }
        return bottomSheet.r;
    }

    public final int j() {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null) {
            return -1;
        }
        return bottomSheet.s;
    }

    public final boolean n() {
        BottomSheet bottomSheet = this.a;
        return bottomSheet != null && bottomSheet.z;
    }

    public final boolean m() {
        BottomSheet bottomSheet = this.a;
        return (bottomSheet == null || bottomSheet.m == null || bottomSheet.s != 0) ? false : true;
    }

    public final int g() {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null) {
            return 0;
        }
        return (int) bottomSheet.q;
    }

    public final int f() {
        if (this.a != null) {
            return r0.o;
        }
        return 0;
    }

    public final void a(InterfaceC4481dC interfaceC4481dC) {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null) {
            this.l.add(interfaceC4481dC);
        } else {
            bottomSheet.g.a(interfaceC4481dC);
        }
    }

    public final void o(InterfaceC4481dC interfaceC4481dC) {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null) {
            this.l.remove(interfaceC4481dC);
        } else {
            bottomSheet.g.d(interfaceC4481dC);
        }
    }

    public final int s(int i) {
        C7638mO3 c7638mO3 = this.p;
        boolean b = c7638mO3.b();
        int a = c7638mO3.a();
        if (!b && this.a != null) {
            int j = j();
            this.m = j;
            if (j == -1) {
                this.m = i();
            }
            this.n = h();
            this.a.t(0, i, false);
        }
        return a;
    }

    public final boolean p(PB pb, boolean z) {
        if (pb == null) {
            throw new RuntimeException("Attempting to show null content in the sheet!");
        }
        if (this.a == null) {
            this.k.run();
        }
        if (pb == this.a.u || this.h.contains(pb)) {
            return pb == this.a.u;
        }
        boolean z2 = this.a.u != null && pb.a() < this.a.u.a() && (this.a.z ^ true);
        this.h.add(pb);
        PB pb2 = this.a.u;
        C7638mO3 c7638mO3 = this.p;
        if (pb2 == null && !c7638mO3.b()) {
            r(z);
            return true;
        }
        if (z2) {
            this.j = true;
            this.h.add(this.a.u);
            if (!c7638mO3.b()) {
                this.a.t(0, 0, z);
                return true;
            }
            this.a.v(null);
        }
        return false;
    }

    public final void l(PB pb, boolean z, int i) {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null) {
            return;
        }
        PB pb2 = bottomSheet.u;
        if (pb != pb2) {
            this.h.remove(pb);
            return;
        }
        if (this.i) {
            return;
        }
        if (bottomSheet.r == 0) {
            if (pb2 != null) {
                pb2.destroy();
            }
            r(z);
        } else {
            this.i = true;
            bottomSheet.t(0, i, z);
        }
    }

    public final void e() {
        if (this.a == null || this.p.b()) {
            return;
        }
        BottomSheet bottomSheet = this.a;
        if ((bottomSheet.m != null && bottomSheet.s == 0) || bottomSheet.u == null) {
            return;
        }
        bottomSheet.t(2, 0, true);
    }

    public final boolean c() {
        if (this.a != null && !this.p.b()) {
            BottomSheet bottomSheet = this.a;
            if (!(bottomSheet.m != null && bottomSheet.s == 0) && bottomSheet.z && bottomSheet.p()) {
                this.a.t(1, 0, true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [RB] */
    public final void r(boolean z) {
        int i;
        if (this.a.r != 0) {
            throw new RuntimeException("Showing next content before sheet is hidden!");
        }
        this.g.setVisibility(0);
        if (this.h.isEmpty()) {
            this.a.v(null);
            return;
        }
        PB pb = (PB) this.h.poll();
        PB pb2 = this.a.u;
        if (pb2 != null) {
            pb2.o().n(this.t);
        }
        if (pb != null) {
            this.t = new Callback() { // from class: RB
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    m.this.u();
                }
            };
            pb.o().m(this.t);
        }
        this.a.v(pb);
        BottomSheet bottomSheet = this.a;
        if (bottomSheet.u == null) {
            i = 0;
        } else if (bottomSheet.p()) {
            i = 1;
        } else {
            i = bottomSheet.o() ? 2 : 3;
        }
        bottomSheet.t(i, 0, z);
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((PB) it.next()).n();
            it.remove();
        }
        PB pb = this.a.u;
        if (pb != null) {
            pb.n();
        }
        l(pb, true, 0);
        this.n = null;
        this.m = -1;
    }

    public final void u() {
        PB pb;
        this.r.p(Boolean.valueOf((this.a == null || this.p.b() || (pb = this.a.u) == null || (!Boolean.TRUE.equals(pb.o().g) && !this.a.z)) ? false : true));
    }
}
