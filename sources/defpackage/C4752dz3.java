package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dz3 */
/* loaded from: classes.dex */
public final class C4752dz3 implements V02, InterfaceC0186Bl0, XX1, InterfaceC7458ls {
    public Activity g;
    public final I5 h;
    public final ZX1 i;
    public final InterfaceC0079Ap3 j;
    public final InterfaceC0079Ap3 k;
    public final InterfaceC0079Ap3 l;
    public final InterfaceC0079Ap3 m;
    public final InterfaceC0079Ap3 n;
    public final InterfaceC0079Ap3 o;
    public final InterfaceC0079Ap3 p;
    public final C9861ss r;
    public C9018qQ s;
    public C4409cz3 t;
    public Tab u;
    public int v;
    public final C4065bz3 a = new C4065bz3(this);
    public final C8385oa2 q = new C8385oa2();

    @Override // defpackage.XX1
    public final /* synthetic */ void b() {
    }

    public C4752dz3(Activity activity, I5 i5, ZX1 zx1, OQ oq, ZQ zq, C6961kR c6961kR, C8385oa2 c8385oa2, C0649Ez3 c0649Ez3, C10051tR c10051tR, C10394uR c10394uR, C9861ss c9861ss) {
        this.g = activity;
        this.h = i5;
        i5.b(this);
        this.i = zx1;
        this.j = oq;
        this.k = zq;
        this.v = -1;
        this.l = c6961kR;
        this.p = c10394uR;
        this.o = c10051tR;
        new C8675pQ();
        this.m = c8385oa2;
        this.n = c0649Ez3;
        this.r = c9861ss;
        if (C9861ss.b()) {
            zx1.a(this);
            c9861ss.a(this, 9);
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        this.s.d(5);
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.q;
    }

    @Override // defpackage.V02
    public final void U() {
        InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) this.n.get();
        this.s = new C9018qQ(this.g, this.k, this.l, this.m, (ZU0) this.p.get(), (JC) this.o.get(), interfaceC10590uz3);
        G10 g10 = (G10) this.j.get();
        C8675pQ c8675pQ = this.s.t;
        g10.i.add(c8675pQ);
        c8675pQ.m(g10.j);
        this.i.a.put(0, this.s);
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        a(abstractC11276wz3.h());
        this.t = new C4409cz3(this, abstractC11276wz3);
    }

    @Override // defpackage.XX1
    public final void d(PropertyModel propertyModel) {
        C9018qQ c9018qQ = this.s;
        this.q.p(Boolean.valueOf((c9018qQ == null || c9018qQ.g == null) ? false : true));
    }

    @Override // defpackage.XX1
    public final void n() {
        C9018qQ c9018qQ = this.s;
        this.q.p(Boolean.valueOf((c9018qQ == null || c9018qQ.g == null) ? false : true));
    }

    public final void a(Tab tab) {
        if (tab != this.u) {
            this.i.d(6);
            Tab tab2 = this.u;
            C4065bz3 c4065bz3 = this.a;
            if (tab2 != null) {
                tab2.w(c4065bz3);
            }
            this.u = tab;
            if (tab != null) {
                tab.v(c4065bz3);
                o();
            }
        }
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        C4409cz3 c4409cz3 = this.t;
        if (c4409cz3 != null) {
            c4409cz3.a();
        }
        C9018qQ c9018qQ = this.s;
        if (c9018qQ != null) {
            ((CC) c9018qQ.s).g(c9018qQ);
        }
        Tab tab = this.u;
        if (tab != null) {
            tab.w(this.a);
            this.u = null;
        }
        if (C9861ss.b()) {
            this.i.h(this);
            this.r.d(9);
        }
        this.h.c(this);
        this.g = null;
    }

    public final void o() {
        boolean isUserInteractable = this.u.isUserInteractable();
        ZX1 zx1 = this.i;
        if (isUserInteractable) {
            zx1.i(0, this.v);
            this.v = -1;
        } else if (this.v == -1) {
            this.v = zx1.n(0);
        }
    }
}
