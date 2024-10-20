package defpackage;

import J.N;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.EventForwarder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qf2 */
/* loaded from: classes.dex */
public abstract class AbstractC9101qf2 extends AbstractC10472uf2 implements InterfaceC11179wj, InterfaceC10551us3, InterfaceC9401rY0, InterfaceC3897bW2 {
    public final C9897sy1 U;
    public final C8071nf2 V;
    public final InterfaceC0079Ap3 W;
    public final C0678Ff2 X;
    public Activity Y;
    public float Z;
    public float a0;
    public boolean b0;
    public final C0158Bf2 c0;
    public final AbstractC9101qf2 d0;
    public OverlayPanelContent e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public float i0;
    public float j0;

    @Override // defpackage.InterfaceC3897bW2
    public final void F(ArrayList arrayList) {
    }

    public abstract float I0();

    public abstract void P0(int i);

    @Override // defpackage.InterfaceC9401rY0
    public final void g0(float f, float f2) {
    }

    @Override // defpackage.AbstractC10472uf2, defpackage.Q70
    public abstract void j0(int i, boolean z);

    @Override // defpackage.InterfaceC9401rY0
    public final void n0() {
    }

    public abstract boolean onBackPressed();

    public AbstractC9101qf2(Activity activity, C9897sy1 c9897sy1, C0678Ff2 c0678Ff2, float f, InterfaceC0079Ap3 interfaceC0079Ap3) {
        super(activity, c9897sy1, f);
        this.U = c9897sy1;
        this.d0 = this;
        this.W = interfaceC0079Ap3;
        this.X = c0678Ff2;
        C9537rv0 c9537rv0 = c0678Ff2.e;
        if (c9537rv0 != null) {
            this.P = c9537rv0;
        }
        ViewGroup viewGroup = c0678Ff2.f;
        if (viewGroup != null) {
            this.O = viewGroup;
        }
        c0678Ff2.a.add(this);
        this.c0 = new C0158Bf2(this.n, this);
        C8071nf2 c8071nf2 = new C8071nf2(this);
        this.V = c8071nf2;
        c9897sy1.q.a(c8071nf2);
    }

    public final void destroy() {
        j0(0, false);
        this.U.q.d(this.V);
        ApplicationStatus.h(this);
    }

    public final boolean t() {
        return x0(2);
    }

    public final void f0(String str) {
        J0().c(str);
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.z;
    }

    public final boolean I() {
        OverlayPanelContent overlayPanelContent = this.e0;
        return overlayPanelContent != null && overlayPanelContent.m;
    }

    public final void Q0(boolean z) {
        WebContents b;
        if (this.Y == null) {
            return;
        }
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.W;
        if (interfaceC0079Ap3.i() && (b = ((Tab) interfaceC0079Ap3.get()).b()) != null) {
            if (x() && this.f0 && !z) {
                return;
            }
            if (x() || this.f0 || !z) {
                this.f0 = !z;
                SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(b);
                if (!z) {
                    k.K = true;
                }
                View containerView = b.C() != null ? b.C().getContainerView() : null;
                if (containerView != null) {
                    if (z) {
                        containerView.requestFocus();
                    } else {
                        containerView.clearFocus();
                    }
                }
                k.C(z);
            }
        }
    }

    public final boolean O0(float f, float f2) {
        float f3 = this.w;
        if (f2 >= f3 && f2 <= f3 + this.x) {
            float f4 = this.v;
            if (f >= f4 && f <= f4 + this.t) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.h0;
    }

    public final boolean a0() {
        OverlayPanelContent overlayPanelContent = this.e0;
        return overlayPanelContent != null && overlayPanelContent.n;
    }

    public final WebContents b() {
        OverlayPanelContent overlayPanelContent = this.e0;
        if (overlayPanelContent != null) {
            return overlayPanelContent.e;
        }
        return null;
    }

    public final ViewGroup d() {
        OverlayPanelContent overlayPanelContent = this.e0;
        if (overlayPanelContent != null) {
            return overlayPanelContent.f;
        }
        return null;
    }

    public final void f() {
        OverlayPanelContent overlayPanelContent = this.e0;
        if (overlayPanelContent != null) {
            overlayPanelContent.l = true;
        }
    }

    public final OverlayPanelContent J0() {
        if (this.e0 == null) {
            N70 n70 = (N70) this.d0;
            ContextualSearchManager contextualSearchManager = (ContextualSearchManager) n70.s0;
            contextualSearchManager.getClass();
            OverlayPanelContent overlayPanelContent = new OverlayPanelContent(new G70(contextualSearchManager), new C8758pf2(n70), n70.Y, n70.R0(), n70.l0, n70.m0, n70.p0);
            float f = this.t;
            float f2 = this.a;
            int round = Math.round(f / f2);
            int round2 = Math.round(this.u / f2);
            boolean D0 = D0();
            overlayPanelContent.s = round;
            overlayPanelContent.t = round2;
            overlayPanelContent.u = D0;
            this.e0 = overlayPanelContent;
        }
        return this.e0;
    }

    public final void o0(boolean z) {
        C3093Xu3.c(3, (Tab) this.W.get(), z);
    }

    public final void L() {
        OverlayPanelContent overlayPanelContent = this.e0;
        if (overlayPanelContent == null) {
            return;
        }
        N.Msf6mgl3(overlayPanelContent.g, overlayPanelContent, D0());
    }

    public final void g(long j, String str) {
        OverlayPanelContent overlayPanelContent = this.e0;
        if (overlayPanelContent == null) {
            return;
        }
        N.Me5Orzs5(overlayPanelContent.g, overlayPanelContent, str, j);
    }

    public final void N0(float f) {
        WebContents webContents;
        OverlayPanelContent overlayPanelContent = this.e0;
        if (overlayPanelContent != null && f > 0.0f && this.o == 4 && (webContents = overlayPanelContent.e) != null) {
            EventForwarder r0 = webContents.r0();
            long j = r0.b;
            if (j != 0) {
                N.M6lTZ5w8(j, r0, 0.0f, 0.0f);
            }
        }
        F0(this.Z - f);
        E0();
    }

    public final void M0() {
        if (this.b0) {
            return;
        }
        this.b0 = true;
        w0(Integer.valueOf(y0(this.x)), 13, JM1.d(Math.round(Math.abs(((C0(Integer.valueOf(r0)) - this.x) * 2000.0f) / 1750.0f)), 116L, 350L));
    }

    public final void L0(float f) {
        this.b0 = true;
        N70 n70 = (N70) this;
        int y0 = n70.y0(n70.x - ((218.0f * f) / 2000.0f));
        if (n70.T0().u && y0 == 4 && n70.o == 2) {
            y0 = 3;
        }
        w0(Integer.valueOf((n70.o == 4 && y0 == 3) ? 2 : y0), 14, JM1.d(Math.round(Math.abs(((C0(Integer.valueOf(r4)) - this.x) * 2000.0f) / f)), 116L, 350L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fc, code lost:            if (r7 <= ((r8.B0() + r8.S0()) + r3)) goto L372;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(float r7, float r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9101qf2.K0(float, float):void");
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void Z(int i, float f, float f2, boolean z) {
        this.a0 = f2;
        C4424d20 c4424d20 = this.S;
        if (c4424d20 != null) {
            c4424d20.cancel();
        }
        this.b0 = false;
        this.Z = this.x;
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void h0(float f, float f2, float f3, float f4, float f5) {
        N0(f2 - this.a0);
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void u() {
        M0();
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void l0(float f, float f2) {
        L0(f2);
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void W(int i, float f, float f2, boolean z) {
        K0(f, f2);
    }

    @Override // defpackage.InterfaceC10551us3
    public final void s0(int i) {
        if (!((N70) this).W0()) {
            C4424d20 c4424d20 = this.S;
            if (c4424d20 != null) {
                c4424d20.cancel();
            }
            this.b0 = false;
            this.Z = this.x;
            return;
        }
        this.g0 = true;
    }

    @Override // defpackage.InterfaceC10551us3
    public final void O(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        if (this.g0) {
            return;
        }
        N0(f2 * this.a);
    }

    @Override // defpackage.InterfaceC10551us3
    public final void V() {
        if (this.g0) {
            this.g0 = false;
        } else {
            M0();
        }
    }

    @Override // defpackage.InterfaceC10551us3
    public final void J(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        if (this.g0) {
            return;
        }
        L0(f4 * this.a);
    }

    @Override // defpackage.InterfaceC10551us3
    public final boolean X(int i) {
        return i == 3 && a();
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p0() {
        return a();
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC5518gD0 l() {
        return this.c0;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final void c0(float f, float f2, float f3, int i) {
        ZL2 zl2;
        ZL2 zl22;
        if (f2 == this.j0 && f == this.i0) {
            return;
        }
        this.i0 = f;
        this.j0 = f2;
        float f4 = this.q;
        if (f != f4 || f2 != this.r || f3 != this.s) {
            this.q = f;
            this.r = f2;
            this.s = f3;
            this.t = D0() ? this.q : 600.0f;
            this.u = C0(4);
            if (a()) {
                boolean z = f4 <= 680.0f;
                boolean D0 = D0();
                if ((D0 && z) || !(D0 || z || f != f4)) {
                    Integer num = this.Q;
                    if (num == null || num.intValue() != 0) {
                        v0(this.R, this.Q);
                    } else {
                        N70 n70 = (N70) this;
                        if (n70.T0().u) {
                            n70.T0().e(true);
                        }
                        if (n70.U0().l && (zl22 = n70.U0().h) != null) {
                            zl22.e(true);
                        }
                        if (n70.V0().l && (zl2 = n70.V0().h) != null) {
                            zl2.e(true);
                        }
                        n70.z0 = 0.0f;
                        n70.H0();
                        int i2 = n70.o;
                        C4424d20 c4424d20 = n70.S;
                        if (c4424d20 != null) {
                            c4424d20.cancel();
                        }
                        n70.G0(n70.C0(Integer.valueOf(i2)));
                        n70.X0(i2, 0);
                        n70.E0();
                    }
                } else {
                    this.O.getHandler().post(new RunnableC9786sf2(this));
                }
            }
        }
        if (a()) {
            OverlayPanelContent J0 = J0();
            float f5 = this.t;
            float f6 = this.a;
            int round = Math.round(f5 / f6);
            int round2 = Math.round(this.u / f6);
            boolean D02 = D0();
            J0.s = round;
            J0.t = round2;
            J0.u = D02;
            J0.d();
        }
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean K() {
        if (!x()) {
            return false;
        }
        o0(false);
        return true;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean s() {
        return x();
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p(long j) {
        if (!x()) {
            return true;
        }
        Q0(false);
        return true;
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        onBackPressed();
    }
}
