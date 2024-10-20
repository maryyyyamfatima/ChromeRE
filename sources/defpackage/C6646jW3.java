package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jW3 */
/* loaded from: classes.dex */
public final class C6646jW3 {
    public final DW3 i;
    public AbstractC6096hu j;
    public final HashMap a = new HashMap();
    public final ZV3 b = new ZV3();
    public final C1593Mg3 c = new C1593Mg3();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final C5960hW3 f = new C5960hW3(this);
    public final C5616gW3 g = new C5616gW3(this);
    public final C6304iW3 h = new C6304iW3(this);
    public final LinkedHashMap l = new LinkedHashMap();
    public final String k = null;

    public C6646jW3(DW3 dw3) {
        this.i = dw3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:            if ((r7 != null) != false) goto L284;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:            r1.g = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:            if ((r3 != null) == false) goto L289;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.LV3 r11, defpackage.YV3 r12, java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6646jW3.c(LV3, YV3, java.util.ArrayList):void");
    }

    public final void d() {
        Iterator it = new ArrayList(this.b.d.values()).iterator();
        while (it.hasNext()) {
            C4241cW3 c4241cW3 = (C4241cW3) it.next();
            if (c4241cW3.g) {
                c4241cW3.g = false;
                Iterator it2 = new ArrayList(c4241cW3.a.values()).iterator();
                while (it2.hasNext()) {
                    AbstractC6096hu abstractC6096hu = ((C5272fW3) it2.next()).b;
                    if (abstractC6096hu != null) {
                        abstractC6096hu.e();
                        this.f.f(abstractC6096hu);
                    }
                }
            }
        }
    }

    public final void g(YV3 yv3, C3603af2 c3603af2) {
        C4241cW3 c4241cW3 = (C4241cW3) this.b.a(yv3);
        if (c4241cW3 != null) {
            h(yv3, c4241cW3, c3603af2);
        }
    }

    public final void e(YV3 yv3, C3603af2 c3603af2, C3603af2 c3603af22) {
        ZV3 zv3 = this.b;
        C4241cW3 c4241cW3 = (C4241cW3) zv3.a(yv3);
        if (c4241cW3 == null) {
            c4241cW3 = new C4241cW3();
            if (zv3.d.put(yv3, c4241cW3) == null) {
                int i = yv3.a;
                String str = yv3.b;
                if (i == 1) {
                    zv3.a.put(str, yv3);
                } else if (i == 2) {
                    LinkedHashMap linkedHashMap = zv3.b;
                    String str2 = yv3.c;
                    Map map = (Map) linkedHashMap.get(str2);
                    if (map == null) {
                        map = new LinkedHashMap();
                        linkedHashMap.put(str2, map);
                    }
                    map.put(str, yv3);
                } else if (i == 3) {
                    zv3.c.put(str, yv3);
                } else {
                    throw new RuntimeException("Unknown TransitionId type " + yv3.a);
                }
            }
        }
        if (c3603af2 == null && c3603af22 == null) {
            throw new RuntimeException("Both current and next LayoutOutput groups were null!");
        }
        if (c3603af2 == null && c3603af22 != null) {
            c4241cW3.c = 0;
        } else if (c3603af2 != null && c3603af22 != null) {
            c4241cW3.c = 1;
        } else {
            int i2 = c4241cW3.c;
            if ((i2 == 0 || i2 == 1) && !c4241cW3.h) {
                c4241cW3.g = true;
            }
            c4241cW3.c = 2;
        }
        c4241cW3.d = c3603af2;
        c4241cW3.e = c3603af22;
        C10926vy1 c10926vy1 = c3603af22 != null ? (C10926vy1) c3603af22.c() : null;
        HashMap hashMap = c4241cW3.a;
        for (InterfaceC1045Ib interfaceC1045Ib : hashMap.keySet()) {
            C5272fW3 c5272fW3 = (C5272fW3) hashMap.get(interfaceC1045Ib);
            if (c10926vy1 == null) {
                c5272fW3.d = null;
            } else {
                c5272fW3.d = Float.valueOf(interfaceC1045Ib.c(c10926vy1));
            }
        }
        c4241cW3.f = true;
        if (this.k != null) {
            String.valueOf(yv3);
            a(c4241cW3.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:            if (r4 != 5) goto L395;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6096hu b(defpackage.PV3 r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6646jW3.b(PV3):hu");
    }

    public final void h(YV3 yv3, C4241cW3 c4241cW3, C3603af2 c3603af2) {
        C3603af2 c3603af22 = c4241cW3.b;
        if (c3603af22 == null && c3603af2 == null) {
            return;
        }
        if (c3603af22 == null || !c3603af22.equals(c3603af2)) {
            if (this.k != null) {
                String.valueOf(yv3);
                String.valueOf(c3603af2);
            }
            HashMap hashMap = c4241cW3.a;
            if (c4241cW3.b != null) {
                for (InterfaceC1045Ib interfaceC1045Ib : hashMap.keySet()) {
                    C3603af2 c3603af23 = c4241cW3.b;
                    short s = c3603af23.b;
                    for (int i = 0; i < s; i++) {
                        interfaceC1045Ib.a(c3603af23.b(i));
                    }
                }
                Object obj = c4241cW3.b.a[3];
                if (obj instanceof View) {
                    f((View) obj, true);
                }
            }
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                C1175Jb c1175Jb = ((C5272fW3) it.next()).a;
                c1175Jb.e(c3603af2);
                c1175Jb.f(c1175Jb.c);
            }
            if (c3603af2 != null) {
                Object obj2 = c3603af2.a[3];
                if (obj2 instanceof View) {
                    f((View) obj2, false);
                }
            }
            c4241cW3.b = c3603af2;
        }
    }

    public final void f(View view, boolean z) {
        if ((view instanceof J91) && !(view instanceof InterfaceC10392uQ2)) {
            LinkedHashMap linkedHashMap = this.l;
            if (z) {
                if (linkedHashMap.containsKey(view)) {
                    ((J91) view).setClipChildren(((Boolean) linkedHashMap.remove(view)).booleanValue());
                }
            } else {
                J91 j91 = (J91) view;
                linkedHashMap.put(j91, Boolean.valueOf(j91.getClipChildren()));
                j91.setClipChildren(false);
            }
        }
        Object parent = view.getParent();
        if (!(parent instanceof J91) || (parent instanceof InterfaceC10392uQ2)) {
            return;
        }
        f((View) parent, z);
    }

    public static void a(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2) {
            throw new RuntimeException(AbstractC9076qb1.a("Unknown changeType: ", i));
        }
    }
}
