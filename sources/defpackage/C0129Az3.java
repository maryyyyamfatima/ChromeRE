package defpackage;

import J.N;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.ntp.RecentlyClosedBridge;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Az3 */
/* loaded from: classes.dex */
public final class C0129Az3 extends AbstractC11276wz3 {
    public final AtomicBoolean m;
    public final boolean n;
    public final int o;
    public final C10247tz3 p;
    public final C10505ul q;
    public final InterfaceC3751b42 r;
    public TabContentManager s;
    public RecentlyClosedBridge t;
    public Tab u;
    public final InterfaceC0079Ap3 v;

    public C0129Az3(C3260Zc0 c3260Zc0, InterfaceC10912vv3 interfaceC10912vv3, C9360rQ c9360rQ, InterfaceC3751b42 interfaceC3751b42, C10505ul c10505ul, boolean z, int i) {
        super(interfaceC10912vv3, c9360rQ);
        this.m = new AtomicBoolean(true);
        this.v = c3260Zc0;
        this.n = z;
        this.p = new C10247tz3(this);
        this.r = interfaceC3751b42;
        this.q = c10505ul;
        this.o = i;
    }

    @Override // defpackage.AbstractC11276wz3
    public final void t(boolean z) {
        TabModel g = g();
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            this.j = z;
        } else {
            int l = l(z);
            if (l != this.e) {
                TabModel tabModel = (TabModel) arrayList.get(l);
                TabModel tabModel2 = (TabModel) arrayList.get(this.e);
                tabModel2.r(false);
                tabModel.r(true);
                this.e = l;
                if (this.h != null && tabModel.isIncognito()) {
                    this.h.d();
                }
                Iterator it = this.f.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((InterfaceC0259Bz3) c11814ya2.next()).c(tabModel, tabModel2);
                    }
                }
            }
        }
        TabModel g2 = g();
        if (g != g2) {
            g2.q(g2.index(), 3, false);
            new Handler().post(new RunnableC12305zz3(this, g2));
        }
    }

    @Override // defpackage.AbstractC11276wz3
    public final void f() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((TabModel) arrayList.get(i)).l();
            i++;
        }
    }

    public final void u(int i, Tab tab) {
        Tab tab2;
        boolean z = tab != null && tab.getLaunchType() == 1;
        if (this.u != tab && tab != null && !tab.isNativePage()) {
            AbstractC8604pB3.a = SystemClock.uptimeMillis();
            AbstractC8604pB3.b = i;
            AbstractC8604pB3.c = false;
            AbstractC8604pB3.d = false;
        }
        Tab tab3 = this.u;
        if (tab3 != null && tab3 != tab && !tab3.g()) {
            boolean z2 = (this.u.b() == null || this.u.b().Q0() == null) ? false : true;
            if (this.u.isInitialized() && z2) {
                if (!this.u.p() && ((!z || i != 2) && (tab2 = this.u) != null)) {
                    this.s.a(tab2);
                }
                this.u.hide(0);
                Tab tab4 = this.u;
                Iterator it = this.f.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((InterfaceC0259Bz3) c11814ya2.next()).g(tab4);
                    }
                }
            }
            this.u = null;
        }
        if (tab == null) {
            q();
            return;
        }
        Tab tab5 = this.u;
        if (tab5 == tab && !tab5.isHidden()) {
            tab.C();
            return;
        }
        this.u = tab;
        if (i != 1) {
            tab.show(i);
            tab.getId();
            tab.t();
        }
    }

    @Override // defpackage.AbstractC11276wz3
    public final void p() {
        C8190nz3 c8190nz3;
        if (!this.i) {
            this.i = true;
            Iterator it = this.f.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((InterfaceC0259Bz3) c11814ya2.next()).a();
                }
            }
        }
        if (!this.m.getAndSet(false) || (c8190nz3 = (C8190nz3) j(false)) == null) {
            return;
        }
        N.MY_BqaOA(c8190nz3.h, c8190nz3);
        if (c8190nz3.A() && c8190nz3.s == -1) {
            if (c8190nz3.t) {
                c8190nz3.q(0, 3, false);
            } else {
                c8190nz3.s = 0;
            }
        }
        Iterator it2 = c8190nz3.o.iterator();
        while (true) {
            C11814ya2 c11814ya22 = (C11814ya2) it2;
            if (!c11814ya22.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya22.next()).L();
            }
        }
    }
}
