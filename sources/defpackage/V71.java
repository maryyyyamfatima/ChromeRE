package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.tab_restore.HistoricalTabSaverImpl;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V71 implements InterfaceC8876pz3 {
    public final TabModel a;
    public final W71 g;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void D(Tab tab, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void I(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void O(List list, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void R(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void X(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Y(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Z(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void a0(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void o(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void y(Tab tab) {
    }

    public V71(TabModel tabModel) {
        HistoricalTabSaverImpl historicalTabSaverImpl = new HistoricalTabSaverImpl(tabModel);
        this.a = tabModel;
        this.g = historicalTabSaverImpl;
        tabModel.g(this);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void A(List list) {
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("BulkTabRestore");
        W71 w71 = this.g;
        if (!M09VlOh_) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Tab tab = (Tab) it.next();
                ((HistoricalTabSaverImpl) w71).getClass();
                if (HistoricalTabSaverImpl.a(tab)) {
                    EI2.h(0, 3, "Tabs.RecentlyClosed.HistoricalSaverCloseType");
                    N.MusxVN12(tab);
                }
            }
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            Tab tab2 = (Tab) list.get(0);
            ((HistoricalTabSaverImpl) w71).getClass();
            if (HistoricalTabSaverImpl.a(tab2)) {
                EI2.h(0, 3, "Tabs.RecentlyClosed.HistoricalSaverCloseType");
                N.MusxVN12(tab2);
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Tab tab3 = (Tab) it2.next();
            int i = C1695Nb0.m(tab3).r;
            if (hashMap.containsKey(Integer.valueOf(i))) {
                ((U71) hashMap.get(Integer.valueOf(i))).c.add(tab3);
            } else {
                String a = AbstractC1414Kw3.a(i);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(tab3);
                U71 u71 = new U71(i, a, arrayList2);
                arrayList.add(u71);
                hashMap.put(Integer.valueOf(i), u71);
            }
        }
        HistoricalTabSaverImpl historicalTabSaverImpl = (HistoricalTabSaverImpl) w71;
        historicalTabSaverImpl.getClass();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            U71 u712 = (U71) it3.next();
            List<Tab> list2 = u712.c;
            ArrayList arrayList4 = new ArrayList();
            for (Tab tab4 : list2) {
                if (HistoricalTabSaverImpl.a(tab4)) {
                    arrayList4.add(tab4);
                }
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() == 1) {
                    arrayList3.add(new U71((Tab) arrayList4.get(0)));
                } else {
                    arrayList3.add(new U71(u712.a, u712.b, arrayList4));
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            U71 u713 = (U71) it4.next();
            boolean a2 = u713.a();
            List list3 = u713.c;
            if (a2) {
                arrayList5.add((Tab) list3.get(0));
                arrayList6.add(-1);
            } else {
                int i2 = u713.a;
                arrayList7.add(Integer.valueOf(i2));
                String str = u713.b;
                if (str == null) {
                    str = "";
                }
                arrayList8.add(str);
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList5.add((Tab) it5.next());
                    arrayList6.add(Integer.valueOf(i2));
                }
            }
        }
        if (arrayList3.size() == 1 && ((U71) arrayList3.get(0)).a()) {
            Tab tab5 = (Tab) arrayList5.get(0);
            EI2.h(0, 3, "Tabs.RecentlyClosed.HistoricalSaverCloseType");
            N.MusxVN12(tab5);
            return;
        }
        int size = arrayList3.size();
        TabModel tabModel = historicalTabSaverImpl.a;
        if (size != 1 || ((U71) arrayList3.get(0)).a()) {
            EI2.h(2, 3, "Tabs.RecentlyClosed.HistoricalSaverCloseType");
            N.MeHKJ1cw(tabModel, AbstractC9048qW.b(arrayList7), (String[]) arrayList8.toArray(new String[0]), AbstractC9048qW.b(arrayList6), (Tab[]) arrayList5.toArray(new Tab[0]));
        } else {
            EI2.h(1, 3, "Tabs.RecentlyClosed.HistoricalSaverCloseType");
            N.MTL0tV25(tabModel, (String) arrayList8.get(0), (Tab[]) arrayList5.toArray(new Tab[0]));
        }
    }
}
