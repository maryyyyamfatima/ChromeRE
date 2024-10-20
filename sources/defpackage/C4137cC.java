package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cC */
/* loaded from: classes2.dex */
public final class C4137cC extends AbstractC4472dA0 implements InterfaceC0186Bl0 {
    public int A;
    public final InterfaceC7697ma2 a;
    public final C3450aC g;
    public final YB h;
    public final ZB i;
    public final XB j;
    public final C4496dF k;
    public final InterfaceC0408Dd2 l;
    public C3794bC m;
    public final JC n;
    public final m q;
    public final C6166i6 r;
    public final InterfaceC0079Ap3 s;
    public final InterfaceC0079Ap3 t;
    public final C1948Oz3 u;
    public final InterfaceC0079Ap3 w;
    public Tab x;
    public boolean y;
    public int z;
    public int o = -1;
    public int p = -1;
    public int v = -1;

    public C4137cC(m mVar, C6166i6 c6166i6, CC cc, InterfaceC7697ma2 interfaceC7697ma2, GQ2 gq2, C1948Oz3 c1948Oz3, C8385oa2 c8385oa2, BQ2 bq2, InterfaceC0408Dd2 interfaceC0408Dd2) {
        this.q = mVar;
        this.r = c6166i6;
        this.n = cc;
        this.s = interfaceC7697ma2;
        this.t = gq2;
        this.u = c1948Oz3;
        this.a = c8385oa2;
        this.w = bq2;
        this.l = interfaceC0408Dd2;
        C4496dF c4496dF = new C4496dF();
        this.k = c4496dF;
        interfaceC0408Dd2.j(c4496dF.b(new Callback() { // from class: VB
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC7408lj3 interfaceC7408lj3 = (InterfaceC7408lj3) obj;
                C4137cC c4137cC = C4137cC.this;
                c4137cC.getClass();
                C3794bC c3794bC = new C3794bC(c4137cC, interfaceC7408lj3);
                c4137cC.m = c3794bC;
                ((C10154tj3) interfaceC7408lj3).c.l.a(c3794bC);
            }
        }));
        mVar.a(this);
        mVar.q = C10021tL.f();
        this.j = new XB(this, mVar);
        c6166i6.m(new Callback() { // from class: WB
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4137cC.this.k((Tab) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
        k((Tab) c6166i6.g);
        YB yb = new YB(mVar);
        this.h = yb;
        VrModuleProvider.f(yb);
        ZB zb = new ZB(this, mVar);
        this.i = zb;
        cc.d(zb);
        C3450aC c3450aC = new C3450aC(mVar);
        this.g = c3450aC;
        c8385oa2.m(c3450aC);
    }

    public final void k(Tab tab) {
        Tab tab2;
        InterfaceC0408Dd2 interfaceC0408Dd2 = this.l;
        l(tab, interfaceC0408Dd2.get() == null ? null : Integer.valueOf(((C10154tj3) ((InterfaceC7408lj3) interfaceC0408Dd2.get())).c.w));
        if (tab == null || (tab2 = this.x) == tab) {
            return;
        }
        XB xb = this.j;
        if (tab2 != null) {
            tab2.w(xb);
        }
        this.x = tab;
        tab.v(xb);
        this.q.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:            if (r6.intValue() != 3) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002d, code lost:            if (r5 == null) goto L136;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(org.chromium.chrome.browser.tab.Tab r5, java.lang.Integer r6) {
        /*
            r4 = this;
            Dd2 r0 = r4.l
            java.lang.Object r0 = r0.get()
            lj3 r0 = (defpackage.InterfaceC7408lj3) r0
            r1 = 0
            r2 = 1
            if (r5 != 0) goto Lf
            if (r0 != 0) goto Lf
            goto L31
        Lf:
            if (r6 == 0) goto L2d
            int r0 = r6.intValue()
            r3 = 6
            if (r0 == r3) goto L30
            int r0 = r6.intValue()
            if (r0 != r2) goto L1f
            goto L30
        L1f:
            int r0 = r6.intValue()
            if (r0 == 0) goto L2d
            int r6 = r6.intValue()
            r0 = 3
            if (r6 == r0) goto L2d
            goto L31
        L2d:
            if (r5 != 0) goto L30
            goto L31
        L30:
            r2 = r1
        L31:
            org.chromium.components.browser_ui.bottomsheet.m r5 = r4.q
            if (r2 == 0) goto L41
            int r6 = r4.A
            if (r6 != 0) goto L4a
            r6 = 5
            int r5 = r5.s(r6)
            r4.A = r5
            goto L4a
        L41:
            int r6 = r4.A
            mO3 r5 = r5.p
            r5.c(r6)
            r4.A = r1
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4137cC.l(org.chromium.chrome.browser.tab.Tab, java.lang.Integer):void");
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void j() {
        WebContents b;
        C3799bD c3799bD = ((CC) this.n).g;
        if (c3799bD != null) {
            this.z = c3799bD.v();
        }
        Tab tab = (Tab) this.r.g;
        if (tab != null && (b = tab.b()) != null) {
            SelectionPopupControllerImpl.k(b).e();
        }
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.w;
        if (interfaceC0079Ap3.i() && ((C0678Ff2) interfaceC0079Ap3.get()).c != null) {
            ((C0678Ff2) interfaceC0079Ap3.get()).c.j0(0, true);
        }
        PB h = this.q.h();
        if (h != null && h.d()) {
            this.y = true;
            return;
        }
        this.v = this.u.a.a();
        InterfaceC0079Ap3 interfaceC0079Ap32 = this.s;
        if (interfaceC0079Ap32.get() != null) {
            this.o = ((ZX1) interfaceC0079Ap32.get()).n(1);
            this.p = ((ZX1) interfaceC0079Ap32.get()).n(0);
        }
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        C3799bD c3799bD = ((CC) this.n).g;
        if (c3799bD != null) {
            c3799bD.u(this.z);
        }
        this.q.h();
        if (this.y) {
            this.y = false;
            return;
        }
        this.u.a.c(this.v);
        this.v = -1;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.s;
        if (interfaceC0079Ap3.get() != null && (this.o != -1 || this.p != -1)) {
            ((ZX1) interfaceC0079Ap3.get()).i(1, this.o);
            ((ZX1) interfaceC0079Ap3.get()).i(0, this.p);
        }
        this.o = -1;
        this.p = -1;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void a(float f) {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.t;
        if (interfaceC0079Ap3.get() == null) {
            return;
        }
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = (ViewOnClickListenerC1069If3) interfaceC0079Ap3.get();
        C0289Cf3 c0289Cf3 = viewOnClickListenerC1069If3.i;
        if (c0289Cf3.a.isEmpty() && c0289Cf3.b.isEmpty()) {
            return;
        }
        while (true) {
            if (!(c0289Cf3.a.isEmpty() && c0289Cf3.b.isEmpty())) {
                c0289Cf3.b(false);
            } else {
                viewOnClickListenerC1069If3.d();
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.k.a();
        Tab tab = this.x;
        if (tab != null) {
            tab.w(this.j);
        }
        this.q.o(this);
        ((CC) this.n).g(this.i);
        ((C8385oa2) this.a).n(this.g);
        VrModuleProvider.g(this.h);
        InterfaceC0408Dd2 interfaceC0408Dd2 = this.l;
        if (interfaceC0408Dd2.get() != null) {
            InterfaceC7408lj3 interfaceC7408lj3 = (InterfaceC7408lj3) interfaceC0408Dd2.get();
            ((C10154tj3) interfaceC7408lj3).c.l.d(this.m);
        }
    }
}
