package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FW3 extends AbstractC10779vZ1 implements G14 {
    public static final FW3 a = new FW3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0228 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.C3471aG0 r19, defpackage.GW3 r20) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FW3.c(aG0, GW3):void");
    }

    public static void d(C3471aG0 c3471aG0, GW3 gw3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        HashMap hashMap2;
        EW3 ew3 = (EW3) c3471aG0.b;
        JK3.a();
        if (ew3.g) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        C0772Fy1 c0772Fy1 = (C0772Fy1) gw3;
        ArrayList arrayList4 = c0772Fy1.R;
        if (arrayList4 != null) {
            arrayList3.addAll(arrayList4);
        }
        ComponentTree componentTree = c0772Fy1.c.l;
        if (componentTree == null) {
            arrayList = null;
        } else {
            ArrayList arrayList5 = c0772Fy1.L;
            ArrayList arrayList6 = c0772Fy1.M;
            if (arrayList5 != null && !arrayList5.isEmpty() && componentTree.Y != null && arrayList5.size() > 0) {
                WZ wz = (WZ) arrayList5.get(0);
                wz.getClass();
                throw new RuntimeException("Trying to apply previous render data to component that doesn't support it");
            }
            if (c0772Fy1.L != null) {
                arrayList = new ArrayList();
                int size = c0772Fy1.L.size();
                for (int i = 0; i < size; i++) {
                    WZ wz2 = (WZ) c0772Fy1.L.get(i);
                    A10.c(wz2);
                    wz2.getClass();
                }
            } else {
                arrayList = null;
            }
            synchronized (componentTree) {
                C7070kk3 c7070kk3 = componentTree.X;
                if (c7070kk3 != null) {
                    synchronized (c7070kk3) {
                        hashMap = c7070kk3.c;
                    }
                    if (hashMap != null) {
                        C7070kk3 c7070kk32 = componentTree.X;
                        synchronized (c7070kk32) {
                            hashMap2 = c7070kk32.c;
                        }
                        arrayList2 = new ArrayList();
                        Iterator it = hashMap2.values().iterator();
                        while (it.hasNext()) {
                            arrayList2.addAll((List) it.next());
                        }
                    }
                }
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(arrayList2);
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC9737sW3.a((PV3) it2.next(), arrayList3, c0772Fy1.t);
            }
        }
        FV3 fv3 = new FV3();
        FV3 fv32 = new FV3();
        YV3 yv3 = c0772Fy1.s;
        if (yv3 != null) {
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                PV3 pv3 = (PV3) arrayList3.get(i2);
                if (pv3 == null) {
                    throw new IllegalStateException(IR0.a("NULL_TRANSITION when collecting root bounds anim. Root: ", c0772Fy1.t, ", root TransitionId: ", String.valueOf(yv3)));
                }
                AbstractC9737sW3.c(yv3, pv3, AbstractC0915Hb.c, fv3);
                AbstractC9737sW3.c(yv3, pv3, AbstractC0915Hb.d, fv32);
            }
        }
        if (!fv3.a) {
            fv3 = null;
        }
        if (!fv32.a) {
            fv32 = null;
        }
        ComponentTree componentTree2 = c0772Fy1.c.l;
        if (componentTree2 != null) {
            componentTree2.L = fv3;
            componentTree2.M = fv32;
        }
        ew3.h = arrayList3.isEmpty() ? null : arrayList3.size() == 1 ? (PV3) arrayList3.get(0) : new C1862Oi2(arrayList3);
        ew3.g = true;
    }

    public static void e(C3471aG0 c3471aG0, GW3 gw3, PV3 pv3) {
        EW3 ew3 = (EW3) c3471aG0.b;
        if (ew3.e == null) {
            ew3.e = new C6646jW3(new DW3(c3471aG0));
        }
        GW3 gw32 = ew3.i;
        LinkedHashMap linkedHashMap = gw32 == null ? null : ((C0772Fy1) gw32).P;
        C6646jW3 c6646jW3 = ew3.e;
        LinkedHashMap linkedHashMap2 = ((C0772Fy1) gw3).P;
        ZV3 zv3 = c6646jW3.b;
        Iterator it = zv3.d.values().iterator();
        while (it.hasNext()) {
            ((C4241cW3) it.next()).f = false;
        }
        if (linkedHashMap == null) {
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                c6646jW3.e((YV3) entry.getKey(), null, (C3603af2) entry.getValue());
            }
        } else {
            HashSet hashSet = new HashSet();
            for (YV3 yv3 : linkedHashMap2.keySet()) {
                boolean z = yv3.a == 3;
                C3603af2 c3603af2 = (C3603af2) linkedHashMap2.get(yv3);
                C3603af2 c3603af22 = (C3603af2) linkedHashMap.get(yv3);
                if (c3603af2 != null) {
                    hashSet.add(yv3);
                } else if (z) {
                }
                c6646jW3.e(yv3, c3603af22, c3603af2);
            }
            for (YV3 yv32 : linkedHashMap.keySet()) {
                if (!hashSet.contains(yv32)) {
                    c6646jW3.e(yv32, (C3603af2) linkedHashMap.get(yv32), null);
                }
            }
        }
        c6646jW3.j = c6646jW3.b(pv3);
        HashSet hashSet2 = new HashSet();
        for (YV3 yv33 : zv3.d.keySet()) {
            C4241cW3 c4241cW3 = (C4241cW3) zv3.a(yv33);
            if (c4241cW3.a.isEmpty()) {
                c6646jW3.h(yv33, c4241cW3, null);
                if (c4241cW3.d != null) {
                    c4241cW3.d = null;
                }
                if (c4241cW3.e != null) {
                    c4241cW3.e = null;
                }
                hashSet2.add(yv33);
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            zv3.b((YV3) it2.next());
        }
        for (YV3 yv34 : linkedHashMap2.keySet()) {
            if (ew3.e.b.d.containsKey(yv34)) {
                ew3.f.add(yv34);
            }
        }
    }

    public static void f(C3471aG0 c3471aG0, C3603af2 c3603af2) {
        EW3 ew3 = (EW3) c3471aG0.b;
        YV3 yv3 = ((C10926vy1) ew3.b.get(((C11122wZ1) c3603af2.c()).d.b)).p;
        C6646jW3 c6646jW3 = ew3.e;
        if (c6646jW3 != null && yv3 != null) {
            c6646jW3.g(yv3, null);
        }
        short s = c3603af2.b;
        for (int i = 0; i < s; i++) {
            p(c3471aG0, (C11122wZ1) c3603af2.b(i), true);
        }
    }

    public static void k(C3471aG0 c3471aG0, GW3 gw3) {
        EW3 ew3 = (EW3) c3471aG0.b;
        C0772Fy1 c0772Fy1 = (C0772Fy1) gw3;
        LinkedHashMap linkedHashMap = c0772Fy1.P;
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (ew3.f.contains(entry.getKey())) {
                    C3603af2 c3603af2 = (C3603af2) entry.getValue();
                    short s = c3603af2.b;
                    for (int i = 0; i < s; i++) {
                        q(c3471aG0, gw3, c0772Fy1.l(((C10926vy1) c3603af2.b(i)).s), true);
                    }
                }
            }
        }
    }

    public static void l(C3471aG0 c3471aG0) {
        EW3 ew3 = (EW3) c3471aG0.b;
        if (ew3.e == null) {
            return;
        }
        LinkedHashMap linkedHashMap = ew3.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            f(c3471aG0, (C3603af2) it.next());
        }
        c3471aG0.d();
        linkedHashMap.clear();
        ew3.b.clear();
        ew3.f.clear();
        C6646jW3 c6646jW3 = ew3.e;
        ZV3 zv3 = c6646jW3.b;
        for (YV3 yv3 : zv3.d.keySet()) {
            C4241cW3 c4241cW3 = (C4241cW3) zv3.a(yv3);
            c6646jW3.h(yv3, c4241cW3, null);
            if (c4241cW3.d != null) {
                c4241cW3.d = null;
            }
            if (c4241cW3.e != null) {
                c4241cW3.e = null;
            }
        }
        zv3.a.clear();
        zv3.b.clear();
        zv3.c.clear();
        zv3.d.clear();
        C1593Mg3 c1593Mg3 = c6646jW3.c;
        int i = c1593Mg3.i;
        Object[] objArr = c1593Mg3.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c1593Mg3.i = 0;
        c1593Mg3.a = false;
        c6646jW3.a.clear();
        ArrayList arrayList = c6646jW3.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AbstractC6096hu) arrayList.get(size)).e();
            } else {
                arrayList.clear();
                c6646jW3.j = null;
                c6646jW3.l.clear();
                return;
            }
        }
    }

    public static void p(C3471aG0 c3471aG0, C11122wZ1 c11122wZ1, boolean z) {
        EW3 ew3 = (EW3) c3471aG0.b;
        Object obj = c11122wZ1.a;
        if ((obj instanceof J91) && !(obj instanceof InterfaceC10392uQ2)) {
            J91 j91 = (J91) obj;
            for (int e = j91.e() - 1; e >= 0; e--) {
                p(c3471aG0, j91.d(e), false);
            }
            if (j91.e() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a Host, left some items behind, this should never happen.");
            }
        }
        ViewParent viewParent = c11122wZ1.b;
        if (viewParent == null) {
            throw new IllegalStateException("Disappearing mountItem has no host, can not be unmounted.");
        }
        if (z) {
            ComponentHost componentHost = (ComponentHost) ((InterfaceC0981Ho0) viewParent);
            if (componentHost.l == null) {
                componentHost.l = new ArrayList();
            }
            if (!componentHost.l.remove(c11122wZ1)) {
                throw new RuntimeException("Tried to remove non-existent disappearing item, transitionId: ".concat(String.valueOf(c11122wZ1.d.b.j.p)));
            }
            Object obj2 = c11122wZ1.a;
            if (obj2 instanceof Drawable) {
                Drawable drawable = (Drawable) obj2;
                LK3.a();
                drawable.setCallback(null);
                componentHost.invalidate(drawable.getBounds());
                componentHost.o();
            } else if (obj2 instanceof View) {
                componentHost.r((View) obj2);
                componentHost.q = true;
            }
            componentHost.s(c11122wZ1.d.b.j);
        } else {
            ComponentHost componentHost2 = (ComponentHost) viewParent;
            componentHost2.g();
            C1593Mg3 c1593Mg3 = componentHost2.a;
            componentHost2.q(c1593Mg3.f(c1593Mg3.e(c11122wZ1)), c11122wZ1);
        }
        c3471aG0.a.c.c(c11122wZ1);
        ew3.b.remove(c11122wZ1.d.b);
    }

    public final void h(C3471aG0 c3471aG0, C9645sE1 c9645sE1, Object obj) {
        YV3 yv3;
        C4241cW3 c4241cW3;
        C3603af2 c3603af2;
        EW3 ew3 = (EW3) c3471aG0.b;
        C3603af2 c3603af22 = null;
        if (obj instanceof J91) {
            J91 j91 = (J91) obj;
            int e = j91.e();
            for (int i = 0; i < e; i++) {
                C10926vy1 c10926vy1 = (C10926vy1) ew3.b.get(j91.d(i).d.b);
                if (c10926vy1 != null) {
                    ew3.e.g(c10926vy1.p, null);
                }
            }
        }
        C10926vy1 c10926vy12 = ew3.c != null ? c9645sE1.j : null;
        if (c10926vy12 == null || (yv3 = c10926vy12.p) == null) {
            return;
        }
        int c = c10926vy12.c();
        C6646jW3 c6646jW3 = ew3.e;
        if (c6646jW3 == null || (c4241cW3 = (C4241cW3) c6646jW3.b.a(yv3)) == null || (c3603af2 = c4241cW3.b) == null || c3603af2.a[c] == null) {
            return;
        }
        if (c3603af2.b > 1) {
            C3603af2 c3603af23 = new C3603af2(c3603af2);
            c3603af23.d(c, null);
            c3603af22 = c3603af23;
        }
        c6646jW3.h(yv3, c4241cW3, c3603af22);
    }

    public final boolean n(C3471aG0 c3471aG0, C11122wZ1 c11122wZ1) {
        return ((EW3) c3471aG0.b).b.containsKey(c11122wZ1.d.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(C3471aG0 c3471aG0, C11122wZ1 c11122wZ1, J91 j91) {
        EW3 ew3 = (EW3) c3471aG0.b;
        C10926vy1 c10926vy1 = (C10926vy1) ew3.b.get(c11122wZ1.d.b);
        C3603af2 c3603af2 = (C3603af2) ew3.a.get(c10926vy1.p);
        if (c3603af2 != null) {
            if (c3603af2.a[c10926vy1.c()] != null) {
                ComponentHost componentHost = (ComponentHost) ((InterfaceC0981Ho0) j91);
                C1593Mg3 c1593Mg3 = componentHost.a;
                int f = c1593Mg3.f(c1593Mg3.e(c11122wZ1));
                Object obj = c11122wZ1.a;
                if (obj instanceof Drawable) {
                    if (componentHost.j == null) {
                        componentHost.j = new C1593Mg3();
                    }
                    AbstractC10250u00.d(f, componentHost.j, componentHost.k);
                } else if (obj instanceof View) {
                    if (componentHost.h == null) {
                        componentHost.h = new C1593Mg3();
                    }
                    AbstractC10250u00.d(f, componentHost.h, componentHost.i);
                    componentHost.q = true;
                    componentHost.k(f, c11122wZ1);
                }
                componentHost.g();
                AbstractC10250u00.d(f, componentHost.a, componentHost.g);
                componentHost.o();
                if (componentHost.l == null) {
                    componentHost.l = new ArrayList();
                }
                componentHost.l.add(c11122wZ1);
            }
        }
    }

    @Override // defpackage.AbstractC10779vZ1
    public final Object a() {
        return new EW3(null);
    }

    @Override // defpackage.AbstractC10779vZ1
    public final void b(C3471aG0 c3471aG0, C9645sE1 c9645sE1, Object obj) {
        if (c3471aG0.c(c9645sE1.j.s)) {
            if (((C0772Fy1) ((EW3) c3471aG0.b).c).n.contains(Long.valueOf(c9645sE1.j.s))) {
                j((View) obj);
            }
        }
    }

    public final void i(C3471aG0 c3471aG0) {
        c3471aG0.d();
        ((EW3) c3471aG0.b).d = -1;
    }

    public static boolean m(EW3 ew3, GW3 gw3) {
        return ew3.d == ((C0772Fy1) gw3).E || ((C0772Fy1) ew3.c).c.l.K;
    }

    public static void q(C3471aG0 c3471aG0, GW3 gw3, int i, boolean z) {
        int g = g(gw3, i);
        for (int i2 = i; i2 <= g; i2++) {
            long j = ((C0772Fy1) gw3).j(i2).b.j.s;
            if (z) {
                if (!c3471aG0.c(j)) {
                    c3471aG0.a(j, false);
                }
            } else if (c3471aG0.c(j)) {
                c3471aG0.e(j, false);
            }
        }
        C9006qN2 c9006qN2 = ((C0772Fy1) gw3).j(i).a;
        while (c9006qN2 != null) {
            C9006qN2 c9006qN22 = c9006qN2.a;
            if (c9006qN22 == null) {
                return;
            }
            long j2 = c9006qN2.b.j.s;
            if (z) {
                if (!c3471aG0.c(j2)) {
                    c3471aG0.a(j2, false);
                }
                if (!c3471aG0.c(j2)) {
                    c3471aG0.a(j2, false);
                }
            } else if (c3471aG0.c(j2)) {
                c3471aG0.e(j2, false);
            }
            c9006qN2 = c9006qN22;
        }
    }

    public static int g(GW3 gw3, int i) {
        C0772Fy1 c0772Fy1 = (C0772Fy1) gw3;
        C9006qN2 j = c0772Fy1.j(i);
        int k = c0772Fy1.k();
        for (int i2 = i + 1; i2 < k; i2++) {
            C9006qN2 c9006qN2 = c0772Fy1.j(i2).a;
            while (c9006qN2 != j) {
                if (c9006qN2 == null || (c9006qN2 = c9006qN2.a) == null) {
                    return i2 - 1;
                }
            }
        }
        return c0772Fy1.k() - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(View view) {
        JK3.a();
        if (view instanceof InterfaceC1305Kb) {
            ((C11703yE1) ((InterfaceC1305Kb) view)).y(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                j(viewGroup.getChildAt(i));
            }
        }
    }
}
