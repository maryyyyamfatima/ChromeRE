package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gy1 */
/* loaded from: classes.dex */
public abstract class AbstractC5777gy1 extends C9897sy1 implements G1 {
    public C1587Mf2 Q;
    public C3529aR3 R;
    public AbstractC2976Wx1 S;
    public final C5433fy1 T;
    public boolean U;
    public boolean V;
    public C5089ey1 W;
    public InterfaceC7697ma2 X;
    public boolean Y;

    public AbstractC5777gy1(CompositorViewHolder compositorViewHolder, ViewGroup viewGroup, C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, C8385oa2 c8385oa2, InterfaceC0079Ap3 interfaceC0079Ap3, C6434it1 c6434it1, ViewGroup viewGroup2, OX2 ox2) {
        super(compositorViewHolder, viewGroup, c8385oa2, interfaceC0079Ap3);
        this.U = true;
        this.T = new C5433fy1(this);
        this.X = c8385oa2;
        c8385oa2.m(new C4745dy1(this, c8385oa2));
        compositorViewHolder.getContext();
        c0538Ed22.getClass();
        if (AbstractC12248zp3.a(c0538Ed22)) {
            g0(null, (InterfaceC10318uB3) c0538Ed22.get(), c6434it1, ox2, viewGroup2);
            return;
        }
        c0538Ed2.getClass();
        if (AbstractC12248zp3.a(c0538Ed2)) {
            g0((InterfaceC7408lj3) c0538Ed2.get(), null, c6434it1, ox2, viewGroup2);
        }
    }

    public final void g0(InterfaceC7408lj3 interfaceC7408lj3, InterfaceC10318uB3 interfaceC10318uB3, InterfaceC6092ht1 interfaceC6092ht1, OX2 ox2, ViewGroup viewGroup) {
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        boolean e = AbstractC5241fQ2.e(interfaceC7839my1.getContext());
        if (e) {
            AbstractC3722az3.a().getClass();
            this.S = new IC3(interfaceC7839my1.getContext(), this, (CompositorViewHolder) interfaceC7839my1, interfaceC10318uB3, interfaceC6092ht1, viewGroup, ox2);
        } else {
            this.S = new RB3(interfaceC7839my1.getContext(), this, (CompositorViewHolder) interfaceC7839my1, interfaceC7408lj3, interfaceC6092ht1, viewGroup, ox2);
        }
        if (AbstractC5177fD3.h(interfaceC7839my1.getContext())) {
            C5089ey1 c5089ey1 = new C5089ey1(e, interfaceC10318uB3, interfaceC7408lj3);
            this.W = c5089ey1;
            e(c5089ey1);
        }
        C8385oa2 c8385oa2 = (C8385oa2) this.X;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2)) {
            this.S.G((TabContentManager) ((C8385oa2) this.X).g);
        }
        InterfaceC10590uz3 interfaceC10590uz3 = this.l;
        if (interfaceC10590uz3 != null) {
            this.S.H(interfaceC10590uz3, (TabContentManager) ((C8385oa2) this.X).g);
        }
        if (this.Y) {
            this.S.u();
        }
    }

    @Override // defpackage.C9897sy1
    public final void F(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.M;
            if (i >= arrayList2.size()) {
                return;
            }
            if (((InterfaceC3897bW2) arrayList2.get(i)).p0()) {
                ((InterfaceC3897bW2) arrayList2.get(i)).F(arrayList);
            }
            i++;
        }
    }

    @Override // defpackage.C9897sy1
    public final InterfaceC10551us3 y() {
        return this.T;
    }

    @Override // defpackage.C9897sy1
    public void B(InterfaceC10590uz3 interfaceC10590uz3, ChromeActivity chromeActivity, B80 b80, C9537rv0 c9537rv0, QS3 qs3) {
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        Context context = interfaceC7839my1.getContext();
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) interfaceC7839my1;
        CC cc = compositorViewHolder.t;
        this.Q = new C1587Mf2(context, this, compositorViewHolder, cc);
        this.R = new C3529aR3(context, this, compositorViewHolder, cc, this, qs3);
        super.B(interfaceC10590uz3, chromeActivity, b80, c9537rv0, qs3);
        TabContentManager tabContentManager = (TabContentManager) ((C8385oa2) this.X).g;
        this.R.H(interfaceC10590uz3, tabContentManager);
        this.Q.H(interfaceC10590uz3, tabContentManager);
        AbstractC2976Wx1 abstractC2976Wx1 = this.S;
        if (abstractC2976Wx1 != null) {
            abstractC2976Wx1.H(interfaceC10590uz3, tabContentManager);
            this.S.u();
        }
        this.Y = true;
    }

    @Override // defpackage.C9897sy1
    public final void R(InterfaceC10590uz3 interfaceC10590uz3) {
        super.R(interfaceC10590uz3);
        AbstractC2976Wx1 abstractC2976Wx1 = this.S;
        if (abstractC2976Wx1 != null) {
            abstractC2976Wx1.H(interfaceC10590uz3, null);
        }
    }

    @Override // defpackage.C9897sy1
    public void i() {
        super.i();
        if (this.X != null) {
            this.X = null;
        }
        C5089ey1 c5089ey1 = this.W;
        if (c5089ey1 != null) {
            L(c5089ey1);
            this.W = null;
        }
        AbstractC2976Wx1 abstractC2976Wx1 = this.S;
        if (abstractC2976Wx1 != null) {
            abstractC2976Wx1.d();
            this.S = null;
        }
        C1587Mf2 c1587Mf2 = this.Q;
        if (c1587Mf2 != null) {
            c1587Mf2.d();
        }
    }

    @Override // defpackage.C9897sy1
    public AbstractC2976Wx1 u(int i) {
        if (i == 4) {
            return this.R;
        }
        if (i != 2) {
            return super.u(i);
        }
        boolean a = C1096Il0.a(this.g.getContext());
        boolean z = a && this.r == this.Q;
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        AbstractC2976Wx1 abstractC2976Wx12 = this.S;
        return (z || a) && !(abstractC2976Wx1 == abstractC2976Wx12 && abstractC2976Wx12 != null) ? this.Q : abstractC2976Wx12;
    }

    @Override // defpackage.C9897sy1
    public final void Y(AbstractC2976Wx1 abstractC2976Wx1, boolean z) {
        this.V = false;
        super.Y(abstractC2976Wx1, z);
    }

    @Override // defpackage.C9897sy1
    public final boolean U(AbstractC2976Wx1 abstractC2976Wx1) {
        return this.U && abstractC2976Wx1 == this.S && this.V && !AbstractC5177fD3.b(this.g.getContext());
    }

    @Override // defpackage.C9897sy1
    public final boolean W(boolean z) {
        return z && (!this.U || ((AbstractC11276wz3) this.l).g().getCount() <= 0);
    }

    @Override // defpackage.C9897sy1
    public final boolean V(AbstractC2976Wx1 abstractC2976Wx1, int i) {
        C1551Ly1 l;
        return (this.U && abstractC2976Wx1 == this.S && (l = abstractC2976Wx1.l(i)) != null && l.j(C1551Ly1.C)) ? false : true;
    }

    @Override // defpackage.G1
    public final void D(boolean z) {
        this.U = C1096Il0.b();
    }

    @Override // defpackage.C9897sy1
    public final void Z(int i, Tab tab) {
        if (i == -1) {
            super.Z(i, tab);
            return;
        }
        C3529aR3 c3529aR3 = this.R;
        int id = tab.getId();
        c3529aR3.M = true;
        c3529aR3.N = id;
        c3529aR3.O = i;
        d0(4, false);
    }

    @Override // defpackage.C9897sy1
    public void b0(int i, int i2, int i3, boolean z, boolean z2, float f, float f2) {
        Tab c = AbstractC1558Lz3.c(((AbstractC11276wz3) this.l).j(z), i);
        this.V = c != null && c.isNativePage();
        super.b0(i, i2, i3, z, z2, f, f2);
    }

    @Override // defpackage.C9897sy1, defpackage.InterfaceC2201Qy1
    public final void b() {
        Object obj = this.s;
        if (obj == null) {
            obj = this.j;
        }
        if (obj == this.j) {
            InterfaceC10590uz3 interfaceC10590uz3 = this.l;
            Tab h = interfaceC10590uz3 != null ? ((AbstractC11276wz3) interfaceC10590uz3).h() : null;
            n(h != null ? h.getId() : -1);
        }
        super.b();
    }

    @Override // defpackage.C9897sy1
    public void H(boolean z) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null && (abstractC2976Wx1 == this.S || abstractC2976Wx1 == this.Q)) {
            super.H(z);
        }
    }
}
