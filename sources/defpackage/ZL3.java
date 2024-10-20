package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZL3 implements WY1 {
    public final InterfaceC10876vp3 a;
    public final I60 b;
    public final VL3 c;
    public final C5285fZ1 d;
    public final C11745yM3 e;
    public final ArrayList f = new ArrayList();
    public final WL3 g;
    public SparseArray h;
    public ArrayList i;
    public GURL j;
    public GURL k;
    public boolean l;
    public boolean m;
    public final UL3 n;

    public ZL3(C11745yM3 c11745yM3, InterfaceC10876vp3 interfaceC10876vp3, I60 i60, C3848bM3 c3848bM3, C5285fZ1 c5285fZ1, OfflinePageBridge offlinePageBridge) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(1, new ArrayList());
        this.h = sparseArray;
        this.n = new UL3(this);
        this.a = interfaceC10876vp3;
        this.b = i60;
        this.c = c3848bM3;
        this.d = c5285fZ1;
        this.e = c11745yM3;
        WL3 wl3 = new WL3(this, offlinePageBridge);
        this.g = wl3;
        ((AbstractC11219wp3) interfaceC10876vp3).a.add(wl3);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [XY1, java.lang.Runnable] */
    public final void c() {
        boolean z = !this.l;
        this.l = true;
        List list = (List) this.h.get(1);
        int size = list == null ? 0 : list.size();
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(1, new ArrayList());
        boolean z2 = z;
        int i = 0;
        while (true) {
            PL3 pl3 = null;
            if (i >= this.i.size()) {
                break;
            }
            C7722me3 c7722me3 = (C7722me3) this.i.get(i);
            PL3 a = a(c7722me3);
            if (a == null) {
                a = new PL3(c7722me3, i);
                z2 = true;
            }
            int i2 = c7722me3.e;
            List list2 = (List) sparseArray.get(i2);
            if (list2 == null) {
                list2 = new ArrayList();
                sparseArray.append(i2, list2);
            }
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PL3 pl32 = (PL3) it.next();
                if (pl32.a.b.equals(c7722me3.b)) {
                    pl3 = pl32;
                    break;
                }
            }
            if (pl3 == null) {
                list2.add(a);
            }
            i++;
        }
        this.h = sparseArray;
        this.i = null;
        List list3 = (List) sparseArray.get(1);
        boolean z3 = z || (list3 == null ? 0 : list3.size()) != size;
        if (z2 || z3) {
            this.g.b();
            C5285fZ1 c5285fZ1 = this.d;
            if (z3) {
                Runnable runnable = c5285fZ1.p;
                if (runnable != null) {
                    runnable.run();
                }
                c5285fZ1.d();
            }
            if (b()) {
                this.f.add(2);
            }
            if (c5285fZ1.s.h.size() >= 1) {
                c5285fZ1.r.c((List) c5285fZ1.s.h.get(1), c5285fZ1.h, c5285fZ1.s.n);
                ZL3 zl3 = c5285fZ1.s;
                if (zl3.b()) {
                    zl3.d(2);
                }
                c5285fZ1.e();
                Runnable runnable2 = c5285fZ1.o;
                if (runnable2 != null) {
                    runnable2.run();
                }
                Object obj = C3911bZ1.c;
                final C3911bZ1 c3911bZ1 = AbstractC3567aZ1.a;
                final List list4 = (List) c5285fZ1.s.h.get(1);
                c3911bZ1.getClass();
                ?? r5 = new Runnable() { // from class: XY1
                    /* JADX WARN: Type inference failed for: r1v0, types: [YY1] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        final C3911bZ1 c3911bZ12 = C3911bZ1.this;
                        c3911bZ12.getClass();
                        new ZY1(list4, new Runnable() { // from class: YY1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3911bZ1 c3911bZ13 = C3911bZ1.this;
                                XY1 xy1 = c3911bZ13.b;
                                c3911bZ13.a = xy1;
                                c3911bZ13.b = null;
                                if (xy1 != null) {
                                    AbstractC4851eH1.d("TopSites", "Start a new task.", new Object[0]);
                                    c3911bZ13.a.run();
                                }
                            }
                        }).c(AbstractC0185Bl.e);
                    }
                };
                if (c3911bZ1.a != null) {
                    c3911bZ1.b = r5;
                    list4.size();
                } else {
                    c3911bZ1.a = r5;
                    c3911bZ1.b = null;
                    AbstractC4851eH1.d("TopSites", "Start a new task.", new Object[0]);
                    c3911bZ1.a.run();
                }
            }
            if (z) {
                d(1);
            }
        }
    }

    public final PL3 a(C7722me3 c7722me3) {
        if (this.h.get(c7722me3.e) == null) {
            return null;
        }
        for (PL3 pl3 : (List) this.h.get(c7722me3.e)) {
            if (pl3.a.equals(c7722me3)) {
                return pl3;
            }
        }
        return null;
    }

    public final void d(int i) {
        ArrayList arrayList = this.f;
        arrayList.remove(Integer.valueOf(i));
        if (arrayList.isEmpty()) {
            this.c.b((List) this.h.get(1));
        }
    }

    public final boolean b() {
        ArrayList arrayList = this.f;
        return arrayList.contains(1) || arrayList.contains(2);
    }
}
