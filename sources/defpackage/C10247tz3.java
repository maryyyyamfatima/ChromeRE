package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tz3 */
/* loaded from: classes.dex */
public final class C10247tz3 implements InterfaceC9904sz3 {
    public final InterfaceC10590uz3 a;

    public C10247tz3(InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = interfaceC10590uz3;
    }

    public final int a(int i, int i2, Tab tab) {
        if (i == 9 || i == 17) {
            return -1;
        }
        boolean z = i == 0 || i == 4 || i == 5 || i == 14 || i == 16;
        InterfaceC10590uz3 interfaceC10590uz3 = this.a;
        if (z) {
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
            TabModel g = abstractC11276wz3.g();
            if (g.isIncognito() == tab.isIncognito()) {
                Tab a = AbstractC1558Lz3.a(g);
                if (a == null) {
                    i2 = 0;
                } else {
                    int id = a.getId();
                    int d = AbstractC1558Lz3.d(g, id);
                    if (b(i, tab.isIncognito())) {
                        Tab c = AbstractC1558Lz3.c(g, C1695Nb0.m(tab).q);
                        if (c != null && a != c) {
                            i2 = AbstractC1558Lz3.d(g, c.getId()) + 1;
                        }
                        i2 = d + 1;
                    } else {
                        TabModel g2 = abstractC11276wz3.g();
                        int count = g2.getCount() - 1;
                        while (true) {
                            if (count < d) {
                                count = -1;
                                break;
                            }
                            Tab tabAt = g2.getTabAt(count);
                            if (C1695Nb0.m(tabAt).q == id) {
                                C2313Ru3 a2 = C2313Ru3.a(tabAt);
                                Object obj = Boolean.TRUE;
                                if (a2.a.containsKey("isTabGroupedWithParent")) {
                                    obj = a2.b("isTabGroupedWithParent");
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    break;
                                }
                            }
                            count--;
                        }
                        if (count != -1) {
                            i2 = count + 1;
                        }
                        i2 = d + 1;
                    }
                }
            } else {
                i2 = abstractC11276wz3.j(tab.isIncognito()).getCount();
            }
        }
        if (b(i, tab.isIncognito())) {
            TabModel g3 = ((AbstractC11276wz3) interfaceC10590uz3).g();
            int count2 = g3.getCount();
            for (int i3 = 0; i3 < count2; i3++) {
                C2313Ru3.a(g3.getTabAt(i3)).c(Boolean.FALSE, "isTabGroupedWithParent");
            }
        }
        return i2;
    }

    public final boolean b(int i, boolean z) {
        if (i == 3 || i == 9) {
            return false;
        }
        return !(i == 5 || i == 14 || i == 17) || (!((AbstractC11276wz3) this.a).o() && z);
    }
}
