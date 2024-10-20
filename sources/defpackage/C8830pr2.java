package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8830pr2 {
    public final TabModel a;
    public final InterfaceC6814jz3 b;
    public final C7846mz3 c;
    public final LinkedList d = new LinkedList();
    public final C8143nr2 e = new C8143nr2(this);

    public final void c() {
        C8143nr2 c8143nr2 = this.e;
        ArrayList arrayList = c8143nr2.a;
        arrayList.clear();
        C8830pr2 c8830pr2 = c8143nr2.g;
        if (!c8830pr2.a.v()) {
            return;
        }
        int i = 0;
        while (true) {
            TabModel tabModel = c8830pr2.a;
            if (i >= tabModel.getCount()) {
                return;
            }
            arrayList.add(tabModel.getTabAt(i));
            i++;
        }
    }

    public C8830pr2(TabModel tabModel, InterfaceC6814jz3 interfaceC6814jz3, C7846mz3 c7846mz3) {
        this.a = tabModel;
        this.b = interfaceC6814jz3;
        this.c = c7846mz3;
    }

    public final void b(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.e.a.remove((Tab) it.next());
        }
        C7846mz3 c7846mz3 = this.c;
        c7846mz3.a.B(linkedList);
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            c7846mz3.a.y((Tab) it2.next(), true);
        }
    }

    public final void a(Tab tab) {
        tab.I(false);
        C8143nr2 c8143nr2 = this.e;
        int s = c8143nr2.s(tab);
        int i = -1;
        for (int i2 = 0; i2 < s; i2++) {
            Tab tabAt = c8143nr2.getTabAt(i2);
            TabModel tabModel = this.a;
            if (i == tabModel.getCount() - 1) {
                break;
            }
            int i3 = i + 1;
            if (tabAt == tabModel.getTabAt(i3)) {
                i = i3;
            }
        }
        int i4 = i + 1;
        C8190nz3 c8190nz3 = this.c.a;
        int i5 = c8190nz3.s;
        if (i5 >= i4) {
            c8190nz3.s = i5 + 1;
        }
        c8190nz3.i.add(i4, tab);
        WebContents b = tab.b();
        if (b != null) {
            b.V(false);
        }
        boolean z = c8190nz3.t;
        if (c8190nz3.s == -1) {
            if (z) {
                c8190nz3.q(i4, 5, false);
            } else {
                c8190nz3.s = i4;
            }
        }
        Iterator it = c8190nz3.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).o(tab);
            }
        }
    }
}
