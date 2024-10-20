package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jz3 */
/* loaded from: classes.dex */
public final class C1299Jz3 extends AbstractC0909Gz3 {
    public final /* synthetic */ AbstractC1429Kz3 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        this.h.h.put(tab.getId(), tab);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        this.h.h.remove(tab.getId());
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        AbstractC1429Kz3 abstractC1429Kz3 = this.h;
        if (abstractC1429Kz3.h.get(tab.getId()) != null) {
            abstractC1429Kz3.h.remove(tab.getId());
            abstractC1429Kz3.X0(tab);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299Jz3(AbstractC1429Kz3 abstractC1429Kz3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = abstractC1429Kz3;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        AbstractC1429Kz3 abstractC1429Kz3 = this.h;
        tab.v(abstractC1429Kz3);
        C1695Nb0.m(tab).y.a(abstractC1429Kz3);
        abstractC1429Kz3.W0(tab);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void J(final Tab tab) {
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Iz3
            @Override // java.lang.Runnable
            public final void run() {
                C1299Jz3 c1299Jz3 = C1299Jz3.this;
                c1299Jz3.getClass();
                Tab tab2 = tab;
                if (tab2.isDestroyed()) {
                    return;
                }
                AbstractC1429Kz3 abstractC1429Kz3 = c1299Jz3.h;
                tab2.w(abstractC1429Kz3);
                C1695Nb0.m(tab2).y.d(abstractC1429Kz3);
            }
        });
        this.h.X0(tab);
    }

    @Override // defpackage.AbstractC0909Gz3
    public final void b() {
        final ArrayList arrayList = new ArrayList();
        AbstractC1429Kz3 abstractC1429Kz3 = this.h;
        ArrayList arrayList2 = ((AbstractC11276wz3) abstractC1429Kz3.a).a;
        for (int i = 0; i < arrayList2.size(); i++) {
            InterfaceC1548Lx3 h = ((TabModel) arrayList2.get(i)).h();
            for (int i2 = 0; i2 < h.getCount(); i2++) {
                Tab tabAt = h.getTabAt(i2);
                tabAt.v(abstractC1429Kz3);
                C1695Nb0.m(tabAt).y.a(abstractC1429Kz3);
                arrayList.add(tabAt);
            }
        }
        ThreadUtils.b().postAtFrontOfQueue(new Runnable() { // from class: Hz3
            @Override // java.lang.Runnable
            public final void run() {
                C1299Jz3 c1299Jz3 = C1299Jz3.this;
                c1299Jz3.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c1299Jz3.h.W0((Tab) it.next());
                }
            }
        });
    }
}
