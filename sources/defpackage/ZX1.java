package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZX1 {
    public final SparseArray a;
    public final HashSet b;
    public final YX1 c;
    public YX1 d;
    public int e;
    public int f;
    public boolean g;
    public final C12157za2 h;
    public final HashMap i;
    public final C3675ar2 j;

    public final void f() {
        boolean z;
        Iterator it = this.j.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((List) ((Map.Entry) it.next()).getValue()).isEmpty()) {
                z = false;
                break;
            }
        }
        if (!z) {
            return;
        }
        Iterator it2 = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((XX1) c11814ya2.next()).b();
            }
        }
    }

    public ZX1(YX1 yx1) {
        SparseArray sparseArray = new SparseArray();
        this.a = sparseArray;
        this.b = new HashSet();
        this.h = new C12157za2();
        HashMap hashMap = new HashMap();
        this.i = hashMap;
        this.j = new C3675ar2();
        this.c = yx1;
        sparseArray.put(1, yx1);
        hashMap.put(1, new C7638mO3(new Runnable() { // from class: VX1
            @Override // java.lang.Runnable
            public final void run() {
                ZX1.this.j(1);
            }
        }));
        hashMap.put(0, new C7638mO3(new Runnable() { // from class: WX1
            @Override // java.lang.Runnable
            public final void run() {
                ZX1.this.j(0);
            }
        }));
    }

    public final void a(XX1 xx1) {
        this.h.a(xx1);
    }

    public final void h(XX1 xx1) {
        this.h.d(xx1);
    }

    public final boolean g() {
        return this.d != null;
    }

    public final void l(PropertyModel propertyModel, int i, boolean z) {
        int i2 = 1;
        if (i != 0 && i == 1) {
            i2 = 2;
        }
        k(i, i2, propertyModel, z);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [UX1] */
    public final void k(int i, int i2, final PropertyModel propertyModel, boolean z) {
        if (AX.e().g("enable-screenshot-ui-mode")) {
            return;
        }
        boolean contains = this.b.contains(Integer.valueOf(i));
        C3675ar2 c3675ar2 = this.j;
        if (contains || (g() && this.f >= i2)) {
            c3675ar2.a(i, i2, propertyModel, z);
            return;
        }
        if (g()) {
            YX1 yx1 = this.d;
            PropertyModel propertyModel2 = yx1.g;
            YX1.a(yx1, null, null);
            this.d = null;
            c3675ar2.a(this.e, this.f, propertyModel2, true);
        }
        this.e = i;
        this.f = i2;
        YX1 yx12 = (YX1) this.a.get(i, this.c);
        this.d = yx12;
        YX1.a(yx12, propertyModel, new Callback() { // from class: UX1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ZX1 zx1 = ZX1.this;
                zx1.getClass();
                zx1.c(((Integer) obj).intValue(), propertyModel);
            }
        });
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((XX1) c11814ya2.next()).d(propertyModel);
            }
        }
    }

    public final void c(int i, PropertyModel propertyModel) {
        if (propertyModel == null) {
            return;
        }
        YX1 yx1 = this.d;
        JD2 jd2 = AbstractC4249cY1.a;
        boolean z = true;
        C12157za2 c12157za2 = this.h;
        if (yx1 == null || propertyModel != yx1.g) {
            HashMap hashMap = this.j.a;
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                List list = (List) entry.getValue();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (list.get(i2) == propertyModel) {
                        list.remove(i2);
                        if (list.isEmpty()) {
                            hashMap.remove(entry.getKey());
                        }
                    }
                }
            }
            if (!z) {
                return;
            }
            ((InterfaceC3906bY1) propertyModel.i(jd2)).a(i);
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it2;
                if (c11814ya2.hasNext()) {
                    ((XX1) c11814ya2.next()).n();
                } else {
                    f();
                    return;
                }
            }
        } else {
            if (!g() || this.g) {
                return;
            }
            this.g = true;
            ((InterfaceC3906bY1) propertyModel.i(jd2)).a(i);
            YX1.a(this.d, null, null);
            Iterator it3 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it3;
                if (!c11814ya22.hasNext()) {
                    this.d = null;
                    this.g = false;
                    f();
                    m();
                    return;
                }
                ((XX1) c11814ya22.next()).n();
            }
        }
    }

    public final void b() {
        for (int i = 0; i <= 1; i++) {
            e(i, 8);
        }
        if (g()) {
            c(8, this.d.g);
        }
        this.h.clear();
    }

    public final void d(int i) {
        e(0, i);
        if (g() && this.e == 0) {
            c(i, this.d.g);
        }
    }

    public final void e(int i, int i2) {
        int i3 = 1;
        while (true) {
            C3675ar2 c3675ar2 = this.j;
            if (i3 <= 3) {
                c3675ar2.getClass();
                Integer valueOf = Integer.valueOf((i * 10) + i3);
                HashMap hashMap = c3675ar2.a;
                List list = (List) hashMap.get(valueOf);
                if (list != null) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((InterfaceC3906bY1) ((PropertyModel) list.get(i4)).i(AbstractC4249cY1.a)).a(i2);
                        Iterator it = this.h.iterator();
                        while (true) {
                            C11814ya2 c11814ya2 = (C11814ya2) it;
                            if (c11814ya2.hasNext()) {
                                ((XX1) c11814ya2.next()).n();
                            }
                        }
                        f();
                    }
                    hashMap.remove(valueOf);
                }
                i3++;
            } else {
                c3675ar2.getClass();
                return;
            }
        }
    }

    public final int n(int i) {
        this.b.add(Integer.valueOf(i));
        if (g() && i == this.e) {
            YX1 yx1 = this.d;
            PropertyModel propertyModel = yx1.g;
            YX1.a(yx1, null, null);
            this.d = null;
            this.j.a(this.e, this.f, propertyModel, true);
            m();
        }
        return ((C7638mO3) this.i.get(Integer.valueOf(i))).a();
    }

    public final void i(int i, int i2) {
        ((C7638mO3) this.i.get(Integer.valueOf(i))).c(i2);
    }

    public final void j(int i) {
        if (((C7638mO3) this.i.get(Integer.valueOf(i))).b()) {
            return;
        }
        this.b.remove(Integer.valueOf(i));
        if (g()) {
            return;
        }
        m();
    }

    public final void m() {
        C3332Zq2 c3332Zq2;
        HashSet hashSet = this.b;
        C3675ar2 c3675ar2 = this.j;
        c3675ar2.getClass();
        int i = 3;
        while (true) {
            if (i < 1) {
                c3332Zq2 = null;
                break;
            }
            for (int i2 = 1; i2 >= 0; i2--) {
                if (!hashSet.contains(Integer.valueOf(i2))) {
                    Integer valueOf = Integer.valueOf((i2 * 10) + i);
                    HashMap hashMap = c3675ar2.a;
                    List list = (List) hashMap.get(valueOf);
                    if (list != null && !list.isEmpty()) {
                        PropertyModel propertyModel = (PropertyModel) list.get(0);
                        list.remove(0);
                        if (list.isEmpty()) {
                            hashMap.remove(valueOf);
                        }
                        c3332Zq2 = new C3332Zq2(propertyModel, i2, i);
                    }
                }
            }
            i--;
        }
        if (c3332Zq2 == null) {
            return;
        }
        k(c3332Zq2.b, c3332Zq2.c, c3332Zq2.a, false);
    }
}
