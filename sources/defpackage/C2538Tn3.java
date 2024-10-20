package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tn3 */
/* loaded from: classes.dex */
public final class C2538Tn3 extends AbstractC0909Gz3 {
    public final /* synthetic */ C3188Yn3 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        C3188Yn3 c3188Yn3 = this.h;
        if (c3188Yn3.C.i()) {
            ((LayerTitleCache) c3188Yn3.C.get()).c(tab.getId());
        }
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void u(boolean z) {
        C3188Yn3 c3188Yn3 = this.h;
        if (c3188Yn3.C.i()) {
            ((LayerTitleCache) c3188Yn3.C.get()).a(-1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2538Tn3(C3188Yn3 c3188Yn3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = c3188Yn3;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        boolean isIncognito = tab.isIncognito();
        C3188Yn3 c3188Yn3 = this.h;
        C1758Nn3 d = c3188Yn3.d(isIncognito);
        SystemClock.uptimeMillis();
        d.x(tab.getId());
        c3188Yn3.t();
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void Y(int i, int i2, Tab tab) {
        C1758Nn3 d = this.h.d(tab.isIncognito());
        SystemClock.uptimeMillis();
        int id = tab.getId();
        if (i > i2) {
            i++;
        }
        d.q(id, i2, i, false);
        d.I();
        ((C9897sy1) d.a).N(null);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        boolean isIncognito = tab.isIncognito();
        C3188Yn3 c3188Yn3 = this.h;
        C1758Nn3 d = c3188Yn3.d(isIncognito);
        long uptimeMillis = SystemClock.uptimeMillis();
        int id = tab.getId();
        Tab a = AbstractC1558Lz3.a(d.c);
        d.y(uptimeMillis, id, -1, (a == null ? -1 : a.getId()) == id, true);
        c3188Yn3.t();
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void I(Tab tab) {
        boolean isIncognito = tab.isIncognito();
        C3188Yn3 c3188Yn3 = this.h;
        C1758Nn3 d = c3188Yn3.d(isIncognito);
        SystemClock.uptimeMillis();
        d.x(tab.getId());
        c3188Yn3.t();
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        boolean isIncognito = tab.isIncognito();
        C3188Yn3 c3188Yn3 = this.h;
        C1758Nn3 d = c3188Yn3.d(isIncognito);
        SystemClock.uptimeMillis();
        d.x(tab.getId());
        c3188Yn3.t();
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void V(boolean z) {
        C3188Yn3 c3188Yn3 = this.h;
        C1758Nn3 d = c3188Yn3.d(z);
        d.d(true);
        ((C9897sy1) d.a).N(null);
        c3188Yn3.t();
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        if (tab.getId() == i2) {
            return;
        }
        this.h.d(tab.isIncognito()).A(SystemClock.uptimeMillis(), tab.getId(), i2, false);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        C3188Yn3 c3188Yn3 = this.h;
        c3188Yn3.d(tab.isIncognito()).y(SystemClock.uptimeMillis(), tab.getId(), ((AbstractC11276wz3) c3188Yn3.g).i(), i != 5 || (((AbstractC11276wz3) c3188Yn3.g).o() && tab.isIncognito()), false);
    }
}
