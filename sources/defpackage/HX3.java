package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HX3 {
    public final C2468Sz3 a;
    public final C4620dd0 b;
    public final C0801Ge0 c;
    public final C6981kV d;
    public boolean e;
    public final boolean f;
    public final boolean g;
    public int h = 3;
    public final GX3 i = new GX3(this);

    public final void b() {
        int i;
        Tab tab = this.b.b;
        if (tab == null || AbstractC6832k23.a(tab.b()) != 5) {
            i = ((this.e && this.f) || a(tab)) ? 3 : 2;
        } else {
            i = 1;
        }
        if (this.h == i) {
            return;
        }
        this.h = i;
        C0801Ge0 c0801Ge0 = this.c;
        C8744pd0 c8744pd0 = c0801Ge0.i;
        if (i != c8744pd0.j) {
            c8744pd0.j = i;
            c8744pd0.s();
        }
        InterfaceC3241Yy1 interfaceC3241Yy1 = c0801Ge0.f;
        if (i == 2) {
            JC jc = (JC) interfaceC3241Yy1.get();
            int i2 = c0801Ge0.l;
            C7638mO3 c7638mO3 = ((CC) jc).i;
            int a = c7638mO3.a();
            c7638mO3.c(i2);
            c0801Ge0.l = a;
        } else {
            ((CC) ((JC) interfaceC3241Yy1.get())).i.c(c0801Ge0.l);
        }
        if (this.h == 3) {
            ((CC) ((JC) interfaceC3241Yy1.get())).g.y();
        }
    }

    public final void c() {
        boolean z = a(this.b.b) || this.h == 2;
        C6981kV c6981kV = this.d;
        if (c6981kV.c == z) {
            return;
        }
        c6981kV.c = z;
        C9707sQ3 c9707sQ3 = c6981kV.b;
        if (c9707sQ3 == null) {
            return;
        }
        c9707sQ3.k.a.H(z ? c6981kV.a : null);
    }

    public HX3(C2468Sz3 c2468Sz3, C4620dd0 c4620dd0, C0801Ge0 c0801Ge0, C6981kV c6981kV, PC pc) {
        this.a = c2468Sz3;
        this.b = c4620dd0;
        this.c = c0801Ge0;
        this.d = c6981kV;
        In4 F = pc.F();
        this.g = F != null;
        this.f = F != null && F.g == 2;
    }

    public final boolean a(Tab tab) {
        if (this.e) {
            return (tab != null && C1695Nb0.m(tab).q != -1) && this.g;
        }
        return true;
    }
}
