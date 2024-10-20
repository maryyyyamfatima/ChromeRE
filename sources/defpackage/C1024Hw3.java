package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024Hw3 extends AbstractC7158kz3 {
    public static SharedPreferences t;
    public final C12157za2 k;
    public final HashMap l;
    public final HashMap m;
    public int n;
    public int o;
    public Tab p;
    public boolean q;
    public boolean r;
    public final boolean s;

    @Override // defpackage.AbstractC7158kz3, defpackage.InterfaceC8876pz3
    public final void Y(int i, int i2, Tab tab) {
        int i3;
        TabModel tabModel;
        boolean z;
        boolean z2 = false;
        if (this.h || this.i) {
            HashMap hashMap = this.m;
            boolean z3 = !hashMap.containsKey(Integer.valueOf(C1695Nb0.m(tab).r)) ? false : !((C0894Gw3) hashMap.get(Integer.valueOf(C1695Nb0.m(tab).r))).a.contains(Integer.valueOf(tab.getId()));
            boolean z4 = !hashMap.containsKey(Integer.valueOf(C1695Nb0.m(tab).r));
            if (z3 || z4) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    Integer num = (Integer) it.next();
                    if (((C0894Gw3) hashMap.get(num)).a.contains(Integer.valueOf(tab.getId()))) {
                        i3 = num.intValue();
                        break;
                    }
                }
            } else {
                i3 = C1695Nb0.m(tab).r;
            }
            C0894Gw3 c0894Gw3 = (C0894Gw3) hashMap.get(Integer.valueOf(i3));
            C12157za2 c12157za2 = this.k;
            if (!z4) {
                if (!z3) {
                    M();
                    int min = Math.min(i2, i);
                    int max = Math.max(i2, i);
                    while (true) {
                        tabModel = this.a;
                        if (min > max) {
                            z = true;
                            break;
                        } else {
                            if (U(tabModel.getTabAt(min)) != C1695Nb0.m(tab).r) {
                                z = false;
                                break;
                            }
                            min++;
                        }
                    }
                    if (!z) {
                        int c = (i - ((C0894Gw3) hashMap.get(Integer.valueOf(C1695Nb0.m(tab).r))).c()) + 1;
                        if (c >= 0) {
                            int i4 = i;
                            while (true) {
                                if (i4 < c) {
                                    z2 = true;
                                    break;
                                } else if (U(tabModel.getTabAt(i4)) != C1695Nb0.m(tab).r) {
                                    break;
                                } else {
                                    i4--;
                                }
                            }
                        }
                        if (!z2) {
                            return;
                        }
                        Iterator it2 = c12157za2.iterator();
                        while (true) {
                            C11814ya2 c11814ya2 = (C11814ya2) it2;
                            if (!c11814ya2.hasNext()) {
                                break;
                            } else {
                                ((AbstractC11339xA0) c11814ya2.next()).c(i2, i, tab);
                            }
                        }
                    } else {
                        Iterator it3 = c12157za2.iterator();
                        while (true) {
                            C11814ya2 c11814ya22 = (C11814ya2) it3;
                            if (!c11814ya22.hasNext()) {
                                break;
                            } else {
                                ((AbstractC11339xA0) c11814ya22.next()).e(i2, i, tab);
                            }
                        }
                    }
                } else {
                    h0();
                    if (c0894Gw3 != null && c0894Gw3.c() != 1) {
                        return;
                    }
                    C0894Gw3 c0894Gw32 = (C0894Gw3) hashMap.get(Integer.valueOf(C1695Nb0.m(tab).r));
                    Iterator it4 = c12157za2.iterator();
                    while (true) {
                        C11814ya2 c11814ya23 = (C11814ya2) it4;
                        if (!c11814ya23.hasNext()) {
                            break;
                        }
                        AbstractC11339xA0 abstractC11339xA0 = (AbstractC11339xA0) c11814ya23.next();
                        int i5 = c0894Gw32.b;
                        abstractC11339xA0.b(tab);
                    }
                }
            } else {
                h0();
                int intValue = ((Integer) this.l.get(Integer.valueOf(i3))).intValue();
                Iterator it5 = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya24 = (C11814ya2) it5;
                    if (!c11814ya24.hasNext()) {
                        break;
                    } else {
                        ((AbstractC11339xA0) c11814ya24.next()).d(intValue, tab);
                    }
                }
            }
            super.Y(i, i2, tab);
        }
    }

    public C1024Hw3(TabModel tabModel, boolean z) {
        super(tabModel);
        this.k = new C12157za2();
        this.l = new HashMap();
        this.m = new HashMap();
        this.n = -1;
        this.q = true;
        this.s = z;
    }

    public final void Q(AbstractC11339xA0 abstractC11339xA0) {
        this.k.a(abstractC11339xA0);
    }

    public final void f0(AbstractC11339xA0 abstractC11339xA0) {
        this.k.d(abstractC11339xA0);
    }

    public final void c0(int i, int i2) {
        TabModel tabModel = this.a;
        AbstractC1558Lz3.c(tabModel, i);
        Tab c = AbstractC1558Lz3.c(tabModel, i2);
        int U = U(c);
        List G = G(i);
        if (!(AbstractC1558Lz3.d(tabModel, ((Tab) G.get(0)).getId()) != W(c))) {
            C12157za2 c12157za2 = this.k;
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((AbstractC11339xA0) c11814ya2.next()).f(U, (Tab) G.get(G.size() - 1));
                }
            }
            for (int i3 = 0; i3 < G.size(); i3++) {
                j0(U, (Tab) G.get(i3));
            }
            h0();
            C0894Gw3 c0894Gw3 = (C0894Gw3) this.m.get(Integer.valueOf(U((Tab) G.get(G.size() - 1))));
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    return;
                }
                AbstractC11339xA0 abstractC11339xA0 = (AbstractC11339xA0) c11814ya22.next();
                Tab tab = (Tab) G.get(G.size() - 1);
                int i4 = c0894Gw3.b;
                abstractC11339xA0.b(tab);
            }
        } else {
            b0(G, c, true, false);
        }
    }

    public final void d0(int i, boolean z) {
        int s;
        TabModel tabModel = this.a;
        Tab c = AbstractC1558Lz3.c(tabModel, i);
        int s2 = tabModel.s(c);
        C0894Gw3 c0894Gw3 = (C0894Gw3) this.m.get(Integer.valueOf(U(c)));
        if (z) {
            s = tabModel.s(AbstractC1558Lz3.c(tabModel, ((Integer) c0894Gw3.b().get(c0894Gw3.b().size() - 1)).intValue()));
        } else {
            s = tabModel.s(AbstractC1558Lz3.c(tabModel, ((Integer) c0894Gw3.b().get(0)).intValue()));
        }
        int intValue = ((Integer) this.l.get(Integer.valueOf(C1695Nb0.m(c).r))).intValue();
        int c2 = c0894Gw3.c();
        C12157za2 c12157za2 = this.k;
        if (c2 == 1) {
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    return;
                } else {
                    ((AbstractC11339xA0) c11814ya2.next()).d(intValue, c);
                }
            }
        } else {
            int i2 = C1695Nb0.m(c).r;
            if (c.getId() == C1695Nb0.m(c).r) {
                if (s2 != 0) {
                    int i3 = s2 - 1;
                    if (U(tabModel.getTabAt(i3)) == C1695Nb0.m(c).r) {
                        i2 = tabModel.getTabAt(i3).getId();
                    }
                }
                if (s2 != tabModel.getCount() - 1) {
                    int i4 = s2 + 1;
                    if (U(tabModel.getTabAt(i4)) == C1695Nb0.m(c).r) {
                        i2 = tabModel.getTabAt(i4).getId();
                    }
                }
            }
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    break;
                } else {
                    ((AbstractC11339xA0) c11814ya22.next()).g(i2, c);
                }
            }
            if (c.getId() == C1695Nb0.m(c).r) {
                Iterator it3 = c0894Gw3.b().iterator();
                while (it3.hasNext()) {
                    j0(i2, AbstractC1558Lz3.c(tabModel, ((Integer) it3.next()).intValue()));
                }
                h0();
            }
            j0(c.getId(), c);
            if (s2 != s) {
                int id = c.getId();
                if (z) {
                    s++;
                }
                tabModel.t(id, s);
                return;
            }
            h0();
            Iterator it4 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya23 = (C11814ya2) it4;
                if (!c11814ya23.hasNext()) {
                    return;
                } else {
                    ((AbstractC11339xA0) c11814ya23.next()).d(intValue, c);
                }
            }
        }
    }

    public final int W(Tab tab) {
        return AbstractC1558Lz3.d(this.a, ((Integer) ((C0894Gw3) this.m.get(Integer.valueOf(C1695Nb0.m(tab).r))).b().get(r2.size() - 1)).intValue()) + 1;
    }

    @Override // defpackage.AbstractC7158kz3
    public final List G(int i) {
        Tab c = AbstractC1558Lz3.c(this.a, i);
        if (c == null) {
            return super.G(i);
        }
        C0894Gw3 c0894Gw3 = (C0894Gw3) this.m.get(Integer.valueOf(C1695Nb0.m(c).r));
        if (c0894Gw3 == null) {
            return super.G(-1);
        }
        return S(c0894Gw3.b());
    }

    public final List T(int i) {
        if (i == -1) {
            return super.G(i);
        }
        C0894Gw3 c0894Gw3 = (C0894Gw3) this.m.get(Integer.valueOf(i));
        if (c0894Gw3 == null) {
            return super.G(-1);
        }
        return S(c0894Gw3.b());
    }

    public final List S(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1558Lz3.c(this.a, ((Integer) it.next()).intValue()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.AbstractC7158kz3
    public final void E(Tab tab) {
        if (tab.isIncognito() == isIncognito()) {
            boolean z = this.h || this.i;
            boolean z2 = this.s;
            if (z && !this.r && (z2 || tab.getLaunchType() == 13 || tab.getLaunchType() == 14 || tab.getLaunchType() == 12)) {
                Tab c = AbstractC1558Lz3.c(this.a, C1695Nb0.m(tab).q);
                if (c != null) {
                    j0(C1695Nb0.m(c).r, tab);
                }
            }
            int i = C1695Nb0.m(tab).r;
            HashMap hashMap = this.m;
            if (hashMap.containsKey(Integer.valueOf(i))) {
                if (((C0894Gw3) hashMap.get(Integer.valueOf(i))).c() == 1) {
                    this.o++;
                    if (this.q && ((z2 && tab.getLaunchType() == 5) || (!z2 && tab.getLaunchType() == 14))) {
                        FI2.a("TabGroup.Created.OpenInNewTab");
                    }
                }
                ((C0894Gw3) hashMap.get(Integer.valueOf(i))).a(tab.getId());
            } else {
                C0894Gw3 c0894Gw3 = new C0894Gw3(this, C1695Nb0.m(tab).r);
                c0894Gw3.a(tab.getId());
                hashMap.put(Integer.valueOf(i), c0894Gw3);
                HashMap hashMap2 = this.l;
                hashMap2.put(Integer.valueOf(i), Integer.valueOf(hashMap2.size()));
            }
            Tab tab2 = this.p;
            if (tab2 != null) {
                this.p = null;
                N(tab2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to open tab in the wrong model");
    }

    @Override // defpackage.AbstractC7158kz3
    public final void M() {
        g0(-1);
        TabModel tabModel = this.a;
        if (tabModel.index() == -1) {
            this.n = -1;
        } else {
            N(tabModel.getTabAt(tabModel.index()));
        }
    }

    public final void g0(int i) {
        int i2 = 0;
        boolean z = i == -1;
        HashMap hashMap = this.l;
        if (z) {
            hashMap.clear();
        }
        while (true) {
            TabModel tabModel = this.a;
            if (i2 >= tabModel.getCount()) {
                return;
            }
            Tab tabAt = tabModel.getTabAt(i2);
            if (z) {
                i = U(tabAt);
                if (!hashMap.containsKey(Integer.valueOf(i))) {
                    hashMap.put(Integer.valueOf(i), Integer.valueOf(hashMap.size()));
                }
            }
            C0894Gw3 c0894Gw3 = (C0894Gw3) this.m.get(Integer.valueOf(i));
            int id = tabAt.getId();
            LinkedHashSet linkedHashSet = c0894Gw3.a;
            if (linkedHashSet.contains(Integer.valueOf(id))) {
                linkedHashSet.remove(Integer.valueOf(id));
                linkedHashSet.add(Integer.valueOf(id));
            }
            i2++;
        }
    }

    public final void i0() {
        this.l.clear();
        this.m.clear();
        this.o = 0;
    }

    @Override // defpackage.AbstractC7158kz3
    public final void n(Tab tab) {
        F(tab);
    }

    public final void h0() {
        TabModel tabModel;
        this.q = false;
        this.r = true;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.m;
        Iterator it = hashMap2.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(Integer.valueOf(intValue), Integer.valueOf(((C0894Gw3) hashMap2.get(Integer.valueOf(intValue))).b));
        }
        i0();
        int i = 0;
        while (true) {
            tabModel = this.a;
            if (i >= tabModel.getCount()) {
                break;
            }
            E(tabModel.getTabAt(i));
            i++;
        }
        Iterator it2 = hashMap2.keySet().iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Integer) it2.next()).intValue();
            if (hashMap.containsKey(Integer.valueOf(intValue2))) {
                int intValue3 = ((Integer) hashMap.get(Integer.valueOf(intValue2))).intValue();
                if (((C0894Gw3) hashMap2.get(Integer.valueOf(intValue2))).a.contains(Integer.valueOf(intValue3))) {
                    ((C0894Gw3) hashMap2.get(Integer.valueOf(intValue2))).b = intValue3;
                }
            }
        }
        if (tabModel.index() == -1) {
            this.n = -1;
        } else {
            N(tabModel.getTabAt(tabModel.index()));
        }
        this.q = true;
        this.r = false;
    }

    @Override // defpackage.AbstractC7158kz3
    public final boolean P() {
        return this.p == null;
    }

    public static void j0(int i, Tab tab) {
        C1695Nb0.m(tab).o(i);
    }

    public static int U(Tab tab) {
        return C1695Nb0.m(tab).r;
    }

    @Override // defpackage.AbstractC7158kz3
    public final void F(Tab tab) {
        int i;
        final int i2 = C1695Nb0.m(tab).r;
        if (tab.isIncognito() == isIncognito()) {
            HashMap hashMap = this.m;
            if (hashMap.get(Integer.valueOf(i2)) != null) {
                if (((C0894Gw3) hashMap.get(Integer.valueOf(i2))).a.contains(Integer.valueOf(tab.getId()))) {
                    C0894Gw3 c0894Gw3 = (C0894Gw3) hashMap.get(Integer.valueOf(i2));
                    int id = tab.getId();
                    int i3 = c0894Gw3.b;
                    LinkedHashSet linkedHashSet = c0894Gw3.a;
                    if (i3 == id) {
                        if (linkedHashSet.size() == 1 || !linkedHashSet.contains(Integer.valueOf(id))) {
                            i = -1;
                        } else {
                            List b = c0894Gw3.b();
                            int indexOf = b.indexOf(Integer.valueOf(id));
                            if (indexOf == 0) {
                                i = ((Integer) b.get(indexOf + 1)).intValue();
                            } else {
                                i = ((Integer) b.get(indexOf - 1)).intValue();
                            }
                        }
                        if (i != -1) {
                            c0894Gw3.b = i;
                        }
                    }
                    linkedHashSet.remove(Integer.valueOf(id));
                    if (c0894Gw3.c() == 1) {
                        this.o--;
                    }
                    if (c0894Gw3.c() == 0) {
                        HashMap hashMap2 = this.l;
                        int intValue = ((Integer) hashMap2.get(Integer.valueOf(i2))).intValue();
                        for (Integer num : hashMap2.keySet()) {
                            int intValue2 = ((Integer) hashMap2.get(num)).intValue();
                            if (intValue2 > intValue) {
                                hashMap2.put(num, Integer.valueOf(intValue2 - 1));
                            }
                        }
                        hashMap2.remove(Integer.valueOf(i2));
                        hashMap.remove(Integer.valueOf(i2));
                        AbstractC0185Bl.e.execute(new Runnable() { // from class: Ew3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1024Hw3.this.getClass();
                                Object obj = ThreadUtils.a;
                                if (C1024Hw3.t == null) {
                                    C1024Hw3.t = V60.a.getSharedPreferences("tab_group_pref", 0);
                                }
                                SharedPreferences sharedPreferences = C1024Hw3.t;
                                String str = "SessionsCountForGroup-" + Integer.toString(i2);
                                if (sharedPreferences.contains(str)) {
                                    sharedPreferences.edit().remove(str).apply();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
            }
        }
        throw new IllegalStateException("Attempting to close tab in the wrong model");
    }

    @Override // defpackage.AbstractC7158kz3
    public final boolean K(Tab tab) {
        C0894Gw3 c0894Gw3 = (C0894Gw3) this.m.get(Integer.valueOf(C1695Nb0.m(tab).r));
        return c0894Gw3 != null && c0894Gw3.c() > 1;
    }

    @Override // defpackage.AbstractC7158kz3
    public final void N(Tab tab) {
        int i = C1695Nb0.m(tab).r;
        HashMap hashMap = this.m;
        if (hashMap.get(Integer.valueOf(i)) == null) {
            this.p = tab;
            return;
        }
        ((C0894Gw3) hashMap.get(Integer.valueOf(i))).b = tab.getId();
        this.n = ((Integer) this.l.get(Integer.valueOf(i))).intValue();
    }

    public final void b0(List list, Tab tab, boolean z, boolean z2) {
        C12157za2 c12157za2;
        int i = C1695Nb0.m(tab).r;
        int W = W(tab);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = list.size();
            c12157za2 = this.k;
            if (i2 >= size) {
                break;
            }
            Tab tab2 = (Tab) list.get(i2);
            if (!z || i2 == list.size() - 1) {
                Iterator it = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((AbstractC11339xA0) c11814ya2.next()).f(i, tab2);
                    }
                }
            }
            int id = tab2.getId();
            TabModel tabModel = this.a;
            int d = AbstractC1558Lz3.d(tabModel, id);
            arrayList.add(Integer.valueOf(d));
            if (tab2.getId() != tab.getId()) {
                boolean z3 = d < W;
                j0(i, tab2);
                int id2 = tab2.getId();
                int i3 = z3 ? W : W + 1;
                tabModel.t(id2, W);
                W = i3;
            }
            i2++;
        }
        if (!z2) {
            return;
        }
        Iterator it2 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya22 = (C11814ya2) it2;
            if (!c11814ya22.hasNext()) {
                return;
            } else {
                ((AbstractC11339xA0) c11814ya22.next()).a(list, arrayList, z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:            if (((defpackage.C0894Gw3) r0.get(java.lang.Integer.valueOf(r3))).c() > 1) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(org.chromium.chrome.browser.tab.Tab r3) {
        /*
            r2 = this;
            Nb0 r3 = defpackage.C1695Nb0.m(r3)
            int r3 = r3.r
            java.util.HashMap r0 = r2.m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            Gw3 r0 = (defpackage.C0894Gw3) r0
            int r0 = r0.c()
            r1 = 1
            if (r0 <= r1) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 != 0) goto L28
            return
        L28:
            xl r0 = defpackage.AbstractC0185Bl.e
            Fw3 r1 = new Fw3
            r1.<init>()
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1024Hw3.e0(org.chromium.chrome.browser.tab.Tab):void");
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final boolean isIncognito() {
        return this.a.isIncognito();
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int index() {
        return this.n;
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int getCount() {
        return this.m.size();
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final Tab getTabAt(int i) {
        int i2;
        if (i < 0 || i >= getCount()) {
            return null;
        }
        HashMap hashMap = this.l;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Integer num = (Integer) it.next();
            if (((Integer) hashMap.get(num)).intValue() == i) {
                i2 = num.intValue();
                break;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return AbstractC1558Lz3.c(this.a, ((C0894Gw3) this.m.get(Integer.valueOf(i2))).b);
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int s(Tab tab) {
        if (tab == null || tab.isIncognito() != isIncognito() || this.a.s(tab) == -1) {
            return -1;
        }
        int i = C1695Nb0.m(tab).r;
        HashMap hashMap = this.l;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return ((Integer) hashMap.get(Integer.valueOf(i))).intValue();
        }
        return -1;
    }
}
