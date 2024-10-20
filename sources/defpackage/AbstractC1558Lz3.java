package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lz3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1558Lz3 {
    public static int d(InterfaceC1548Lx3 interfaceC1548Lx3, int i) {
        int count = interfaceC1548Lx3.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            if (interfaceC1548Lx3.getTabAt(i2).getId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public static Tab c(InterfaceC1548Lx3 interfaceC1548Lx3, int i) {
        int d = d(interfaceC1548Lx3, i);
        if (d == -1) {
            return null;
        }
        return interfaceC1548Lx3.getTabAt(d);
    }

    public static Tab a(InterfaceC1548Lx3 interfaceC1548Lx3) {
        int index = interfaceC1548Lx3.index();
        if (index == -1) {
            return null;
        }
        return interfaceC1548Lx3.getTabAt(index);
    }

    public static Tab b(InterfaceC1548Lx3 interfaceC1548Lx3, int i) {
        Tab tab = null;
        long j = 0;
        for (int i2 = 0; i2 < interfaceC1548Lx3.getCount(); i2++) {
            Tab tabAt = interfaceC1548Lx3.getTabAt(i2);
            if (tabAt.getId() != i && !tabAt.p()) {
                long j2 = C1695Nb0.m(tabAt).s;
                if (j2 != -1 && j < j2) {
                    tab = tabAt;
                    j = j2;
                }
            }
        }
        return tab;
    }
}
