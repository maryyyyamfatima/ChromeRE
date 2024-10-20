package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bi0 */
/* loaded from: classes.dex */
public final class C0171Bi0 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public BZ0 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public C5852hB0 h;
    public C0543Ee2 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public InterfaceC6098hu1 n;
    public EnumC7567mA2 o;
    public AbstractC6410ip0 p;
    public boolean q;
    public boolean r;

    public final List d() {
        List list;
        ArrayList d;
        LL2 a = this.c.a();
        Class<?> cls = this.d.getClass();
        Class cls2 = this.g;
        Class cls3 = this.k;
        C9745sY1 c9745sY1 = a.h;
        CZ1 cz1 = (CZ1) c9745sY1.a.getAndSet(null);
        if (cz1 == null) {
            cz1 = new CZ1(cls, cls2, cls3);
        } else {
            cz1.a = cls;
            cz1.b = cls2;
            cz1.c = cls3;
        }
        synchronized (c9745sY1.b) {
            list = (List) c9745sY1.b.get(cz1);
        }
        c9745sY1.a.set(cz1);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            C9402rY1 c9402rY1 = a.a;
            synchronized (c9402rY1) {
                d = c9402rY1.a.d(cls);
            }
            Iterator it = d.iterator();
            while (it.hasNext()) {
                Iterator it2 = a.c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            C9745sY1 c9745sY12 = a.h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (c9745sY12.b) {
                c9745sY12.b.put(new CZ1(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    public final DE1 c(Class cls) {
        DE1 de1;
        ArrayList arrayList;
        InterfaceC11073wP2 interfaceC11073wP2;
        LL2 a = this.c.a();
        Class cls2 = this.g;
        Class cls3 = this.k;
        EE1 ee1 = a.i;
        CZ1 cz1 = (CZ1) ee1.b.getAndSet(null);
        if (cz1 == null) {
            cz1 = new CZ1();
        }
        cz1.a = cls;
        cz1.b = cls2;
        cz1.c = cls3;
        synchronized (ee1.a) {
            de1 = (DE1) ee1.a.get(cz1);
        }
        ee1.b.set(cz1);
        a.i.getClass();
        if (EE1.c.equals(de1)) {
            return null;
        }
        if (de1 != null) {
            return de1;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a.c.b(cls, cls2).iterator();
        while (it.hasNext()) {
            Class<?> cls4 = (Class) it.next();
            Iterator it2 = a.f.a(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                TO2 to2 = a.c;
                synchronized (to2) {
                    arrayList = new ArrayList();
                    Iterator it3 = to2.a.iterator();
                    while (it3.hasNext()) {
                        List<SO2> list = (List) to2.b.get((String) it3.next());
                        if (list != null) {
                            for (SO2 so2 : list) {
                                if (so2.a.isAssignableFrom(cls) && cls4.isAssignableFrom(so2.b)) {
                                    arrayList.add(so2.c);
                                }
                            }
                        }
                    }
                }
                UU3 uu3 = a.f;
                synchronized (uu3) {
                    if (cls5.isAssignableFrom(cls4)) {
                        interfaceC11073wP2 = C10946w14.a;
                    } else {
                        Iterator it4 = uu3.a.iterator();
                        while (it4.hasNext()) {
                            TU3 tu3 = (TU3) it4.next();
                            if (tu3.a.isAssignableFrom(cls4) && cls5.isAssignableFrom(tu3.b)) {
                                interfaceC11073wP2 = tu3.c;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + String.valueOf(cls4) + " to " + String.valueOf(cls5));
                    }
                }
                arrayList2.add(new C1211Ji0(cls, cls4, cls5, arrayList, interfaceC11073wP2, a.j));
            }
        }
        DE1 de12 = arrayList2.isEmpty() ? null : new DE1(cls, cls2, cls3, arrayList2, a.j);
        EE1 ee12 = a.i;
        synchronized (ee12.a) {
            ee12.a.put(new CZ1(cls, cls2, cls3), de12 != null ? de12 : EE1.c);
        }
        return de12;
    }

    public final InterfaceC9389rV3 f(Class cls) {
        InterfaceC9389rV3 interfaceC9389rV3 = (InterfaceC9389rV3) this.j.get(cls);
        if (interfaceC9389rV3 == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC9389rV3 = (InterfaceC9389rV3) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC9389rV3 != null) {
            return interfaceC9389rV3;
        }
        if (!this.j.isEmpty() || !this.q) {
            return C11289x14.b;
        }
        throw new IllegalArgumentException(AbstractC4199cO1.a("Missing transformation for ", String.valueOf(cls), ". If you wish to ignore unknown resource types, use the optional transformation methods."));
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List e = this.c.a().e(this.d);
            int size = e.size();
            for (int i = 0; i < size; i++) {
                C7686mY1 b = ((InterfaceC8030nY1) e.get(i)).b(this.d, this.e, this.f, this.i);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C7686mY1 c7686mY1 = (C7686mY1) b.get(i);
                if (!arrayList.contains(c7686mY1.a)) {
                    arrayList.add(c7686mY1.a);
                }
                int i2 = 0;
                while (true) {
                    List list = c7686mY1.b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add((InterfaceC6098hu1) list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:            r1 = r3.b;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.LA0 e(java.lang.Object r6) {
        /*
            r5 = this;
            BZ0 r0 = r5.c
            LL2 r0 = r0.a()
            OA0 r0 = r0.b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.a     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            NA0 r3 = (defpackage.NA0) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r4 = r3.a     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L13
            LA0 r1 = r3.b     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            goto L2d
        L2b:
            monitor-exit(r0)
            r1 = 0
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            KL2 r0 = new KL2
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0171Bi0.e(java.lang.Object):LA0");
    }
}
