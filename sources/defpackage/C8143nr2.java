package defpackage;

import java.util.ArrayList;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8143nr2 implements InterfaceC1548Lx3 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ C8830pr2 g;

    @Override // defpackage.InterfaceC1548Lx3
    public final int index() {
        C8830pr2 c8830pr2 = this.g;
        int index = c8830pr2.a.index();
        ArrayList arrayList = this.a;
        if (index != -1) {
            return arrayList.indexOf(AbstractC1558Lz3.a(c8830pr2.a));
        }
        return !arrayList.isEmpty() ? 0 : -1;
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final boolean isIncognito() {
        return this.g.a.isIncognito();
    }

    public final Tab o(int i) {
        C8830pr2 c8830pr2 = this.g;
        if (c8830pr2.a.v() && AbstractC1558Lz3.c(c8830pr2.a, i) == null) {
            return AbstractC1558Lz3.c(this, i);
        }
        return null;
    }

    public C8143nr2(C8830pr2 c8830pr2) {
        this.g = c8830pr2;
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int getCount() {
        return this.a.size();
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final Tab getTabAt(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            return null;
        }
        return (Tab) arrayList.get(i);
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int s(Tab tab) {
        return this.a.indexOf(tab);
    }
}
