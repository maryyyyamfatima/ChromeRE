package defpackage;

import java.util.Iterator;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tp4 */
/* loaded from: classes2.dex */
public final class C10191tp4 implements InterfaceC1765Np0, J44 {
    public final C12157za2 a = new C12157za2();
    public WindowAndroid g;
    public final Tc4 h;
    public boolean i;
    public int j;
    public float k;

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public static C10191tp4 e(WebContents webContents) {
        return (C10191tp4) ((WebContentsImpl) webContents).v(C10191tp4.class, AbstractC9848sp4.a);
    }

    public C10191tp4(WebContentsImpl webContentsImpl) {
        this.h = Tc4.c(webContentsImpl);
        WindowAndroid Q0 = webContentsImpl.Q0();
        if (Q0 != null) {
            a(Q0);
        }
        b(webContentsImpl);
    }

    public final void b(InterfaceC9163qp4 interfaceC9163qp4) {
        this.a.a(interfaceC9163qp4);
        if (this.i) {
            interfaceC9163qp4.onAttachedToWindow();
        }
    }

    public final void a(WindowAndroid windowAndroid) {
        WindowAndroid windowAndroid2;
        WindowAndroid windowAndroid3 = this.g;
        if (windowAndroid == windowAndroid3) {
            return;
        }
        if (windowAndroid3 != null) {
            windowAndroid3.i.a.remove(this);
        }
        if (this.i && (windowAndroid2 = this.g) != null) {
            windowAndroid2.w.d(this.h);
        }
        this.g = windowAndroid;
        d();
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9163qp4) c11814ya2.next()).a(windowAndroid);
            }
        }
    }

    public final void d() {
        WindowAndroid windowAndroid;
        WindowAndroid windowAndroid2;
        if (this.i && (windowAndroid2 = this.g) != null) {
            AbstractC1895Op0 abstractC1895Op0 = windowAndroid2.i;
            abstractC1895Op0.a.put(this, null);
            m(abstractC1895Op0.g);
            l(abstractC1895Op0.d);
        }
        if (!this.i || (windowAndroid = this.g) == null) {
            return;
        }
        C12157za2 c12157za2 = windowAndroid.w;
        Tc4 tc4 = this.h;
        c12157za2.a(tc4);
        if (this.g.q() == 3) {
            tc4.a();
        }
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void m(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9163qp4) c11814ya2.next()).m(i);
            }
        }
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void l(float f) {
        if (this.k == f) {
            return;
        }
        this.k = f;
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9163qp4) c11814ya2.next()).l(f);
            }
        }
    }
}
