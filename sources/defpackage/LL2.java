package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LL2 {
    public final C9402rY1 a;
    public final OA0 b;
    public final TO2 c;
    public final XO2 d;
    public final C9105qg0 e;
    public final UU3 f;
    public final C1077Ih1 g;
    public final C9745sY1 h = new C9745sY1();
    public final EE1 i = new EE1();
    public final C8974qH0 j;

    public LL2() {
        C8974qH0 c8974qH0 = new C8974qH0(new C9893sx2(20), new C7944nH0(), new C8288oH0());
        this.j = c8974qH0;
        this.a = new C9402rY1(c8974qH0);
        this.b = new OA0();
        this.c = new TO2();
        this.d = new XO2();
        this.e = new C9105qg0();
        this.f = new UU3();
        this.g = new C1077Ih1();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        TO2 to2 = this.c;
        synchronized (to2) {
            ArrayList arrayList2 = new ArrayList(to2.a);
            to2.a.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                to2.a.add((String) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!arrayList.contains(str)) {
                    to2.a.add(str);
                }
            }
        }
    }

    public final void a(RO2 ro2, Class cls, Class cls2, String str) {
        TO2 to2 = this.c;
        synchronized (to2) {
            to2.a(str).add(new SO2(cls, cls2, ro2));
        }
    }

    public final void b(Class cls, VO2 vo2) {
        XO2 xo2 = this.d;
        synchronized (xo2) {
            xo2.a.add(new WO2(cls, vo2));
        }
    }

    public final void g(InterfaceC7731mg0 interfaceC7731mg0) {
        C9105qg0 c9105qg0 = this.e;
        synchronized (c9105qg0) {
            c9105qg0.a.put(interfaceC7731mg0.a(), interfaceC7731mg0);
        }
    }

    public final void h(Class cls, Class cls2, InterfaceC11073wP2 interfaceC11073wP2) {
        UU3 uu3 = this.f;
        synchronized (uu3) {
            uu3.a.add(new TU3(cls, cls2, interfaceC11073wP2));
        }
    }

    public final void c(Class cls, Class cls2, InterfaceC8374oY1 interfaceC8374oY1) {
        C9402rY1 c9402rY1 = this.a;
        synchronized (c9402rY1) {
            C3727b02 c3727b02 = c9402rY1.a;
            synchronized (c3727b02) {
                ZZ1 zz1 = new ZZ1(cls, cls2, interfaceC8374oY1);
                ArrayList arrayList = c3727b02.a;
                arrayList.add(arrayList.size(), zz1);
            }
            c9402rY1.b.a.clear();
        }
    }

    public final InterfaceC8075ng0 f(Object obj) {
        InterfaceC8075ng0 b;
        C9105qg0 c9105qg0 = this.e;
        synchronized (c9105qg0) {
            AbstractC6464iy2.b(obj);
            InterfaceC7731mg0 interfaceC7731mg0 = (InterfaceC7731mg0) c9105qg0.a.get(obj.getClass());
            if (interfaceC7731mg0 == null) {
                Iterator it = c9105qg0.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC7731mg0 interfaceC7731mg02 = (InterfaceC7731mg0) it.next();
                    if (interfaceC7731mg02.a().isAssignableFrom(obj.getClass())) {
                        interfaceC7731mg0 = interfaceC7731mg02;
                        break;
                    }
                }
            }
            if (interfaceC7731mg0 == null) {
                interfaceC7731mg0 = C9105qg0.b;
            }
            b = interfaceC7731mg0.b(obj);
        }
        return b;
    }

    public final List e(Object obj) {
        List list;
        C9402rY1 c9402rY1 = this.a;
        c9402rY1.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c9402rY1) {
            C8717pY1 c8717pY1 = (C8717pY1) c9402rY1.b.a.get(cls);
            list = c8717pY1 == null ? null : c8717pY1.a;
            if (list == null) {
                list = Collections.unmodifiableList(c9402rY1.a.c(cls));
                if (((C8717pY1) c9402rY1.b.a.put(cls, new C8717pY1(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(cls)));
                }
            }
        }
        if (list.isEmpty()) {
            throw new IL2(obj);
        }
        int size = list.size();
        List emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC8030nY1 interfaceC8030nY1 = (InterfaceC8030nY1) list.get(i);
            if (interfaceC8030nY1.a(obj)) {
                if (z) {
                    emptyList = new ArrayList(size - i);
                    z = false;
                }
                emptyList.add(interfaceC8030nY1);
            }
        }
        if (emptyList.isEmpty()) {
            throw new IL2(obj, list);
        }
        return emptyList;
    }

    public final ArrayList d() {
        ArrayList arrayList;
        C1077Ih1 c1077Ih1 = this.g;
        synchronized (c1077Ih1) {
            arrayList = c1077Ih1.a;
        }
        if (arrayList.isEmpty()) {
            throw new HL2();
        }
        return arrayList;
    }
}
