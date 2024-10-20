package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: my3 */
/* loaded from: classes.dex */
public final class C7841my3 implements InterfaceC0904Gy3 {
    public final /* synthetic */ C1553Ly3 a;

    @Override // defpackage.InterfaceC0904Gy3
    public final void a(int i) {
        C1553Ly3 c1553Ly3 = this.a;
        if (c1553Ly3.e.G(i) == -1) {
            return;
        }
        c1553Ly3.t = i;
        boolean z = c1553Ly3.q;
        InterfaceC10590uz3 interfaceC10590uz3 = c1553Ly3.g;
        if (!z || AbstractC5177fD3.a()) {
            Tab h = ((AbstractC11276wz3) interfaceC10590uz3).h();
            Tab c = AbstractC1558Lz3.c(((AbstractC11276wz3) interfaceC10590uz3).g(), i);
            int s = ((AbstractC11276wz3) interfaceC10590uz3).c.d().s(h);
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
            int s2 = abstractC11276wz3.c.d().s(c);
            StringBuilder sb = new StringBuilder("MobileTabSwitched.");
            String str = c1553Ly3.m;
            sb.append(str);
            FI2.a(sb.toString());
            if (AbstractC5177fD3.a()) {
                EI2.m(s - s2, AbstractC4809e90.a("Tabs.TabOffsetOfSwitch.", str));
            } else if (s == s2) {
                EI2.m(AbstractC1558Lz3.d(abstractC11276wz3.g(), h.getId()) - AbstractC1558Lz3.d(abstractC11276wz3.g(), c.getId()), AbstractC4809e90.a("Tabs.TabOffsetOfSwitch.", str));
            }
        }
        InterfaceC11271wy3 interfaceC11271wy3 = c1553Ly3.k;
        if (interfaceC11271wy3 != null) {
            ((ZC3) interfaceC11271wy3).c(i, true);
        } else {
            ((AbstractC11276wz3) interfaceC10590uz3).g().q(AbstractC1558Lz3.d(((AbstractC11276wz3) interfaceC10590uz3).g(), i), 3, false);
        }
    }

    public C7841my3(C1553Ly3 c1553Ly3) {
        this.a = c1553Ly3;
    }
}
