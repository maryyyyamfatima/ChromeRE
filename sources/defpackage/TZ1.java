package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TZ1 extends AbstractC0909Gz3 {
    public final /* synthetic */ InterfaceC10590uz3 h;
    public final /* synthetic */ UZ1 i;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        UZ1.x(this.i.w, this.h);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        UZ1 uz1 = this.i;
        Tab tab2 = uz1.y;
        if (tab2 == tab) {
            return;
        }
        SZ1 sz1 = uz1.z;
        if (tab2 != null) {
            tab2.w(sz1);
        }
        uz1.y = tab;
        tab.v(sz1);
        int i3 = uz1.w;
        Tab tab3 = uz1.y;
        Q83 q83 = O83.a;
        q83.p(AbstractC6265iP.g.b(String.valueOf(i3)), tab3.isIncognito());
        Tab a = uz1.y.isIncognito() ? AbstractC1558Lz3.a(((AbstractC11276wz3) this.h).j(false)) : uz1.y;
        if (a == null) {
            q83.t(AbstractC6265iP.k.b(String.valueOf(uz1.w)), "");
            q83.t(AbstractC6265iP.i.b(String.valueOf(uz1.w)), "");
        } else {
            q83.t(AbstractC6265iP.k.b(String.valueOf(uz1.w)), a.z().i());
            q83.t(AbstractC6265iP.i.b(String.valueOf(uz1.w)), a.getTitle());
        }
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        UZ1.x(this.i.w, this.h);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        UZ1.x(this.i.w, this.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TZ1(UZ1 uz1, AbstractC11276wz3 abstractC11276wz3, AbstractC11276wz3 abstractC11276wz32) {
        super(abstractC11276wz3);
        this.i = uz1;
        this.h = abstractC11276wz32;
    }
}
