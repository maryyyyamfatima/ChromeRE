package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ty3 */
/* loaded from: classes.dex */
public final class C10242ty3 {
    public final InterfaceC10590uz3 a;
    public final C1154Iw3 b;
    public final C1284Jw3 c;
    public final /* synthetic */ C1553Ly3 d;

    public static void a(int i) {
        V60.a.getSharedPreferences("tab_group_titles", 0).edit().remove(String.valueOf(i)).apply();
    }

    public final void b(Tab tab, String str) {
        C1553Ly3 c1553Ly3 = this.d;
        if (c1553Ly3.q) {
            int G = c1553Ly3.e.G(AbstractC7492lx3.a(c1553Ly3.g, tab).getId());
            if (G == -1) {
                return;
            }
            ((C7272lK1) c1553Ly3.e.get(G)).b.o(AbstractC9627sA3.h, str);
            c1553Ly3.n(IE2.a(tab), ((C7272lK1) c1553Ly3.e.get(G)).b);
            if (AbstractC5177fD3.c()) {
                c1553Ly3.m(IE2.a(tab), ((C7272lK1) c1553Ly3.e.get(G)).b);
            }
        }
    }

    public C10242ty3(C1553Ly3 c1553Ly3, InterfaceC10590uz3 interfaceC10590uz3) {
        this.d = c1553Ly3;
        this.a = interfaceC10590uz3;
        C1154Iw3 c1154Iw3 = new C1154Iw3(this);
        this.b = c1154Iw3;
        C1284Jw3 c1284Jw3 = new C1284Jw3(this);
        this.c = c1284Jw3;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.c.b(c1154Iw3);
        C7502lz3 c7502lz3 = abstractC11276wz3.c;
        ((C1024Hw3) c7502lz3.e(false)).Q(c1284Jw3);
        ((C1024Hw3) c7502lz3.e(true)).Q(c1284Jw3);
    }
}
