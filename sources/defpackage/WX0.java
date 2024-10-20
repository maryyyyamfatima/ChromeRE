package defpackage;

import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WX0 {
    public final C1624Mn e;
    public final C6442iu3 h;
    public final LinkedList a = new LinkedList();
    public final C2644Uj b = new C2644Uj();
    public final HashSet c = new HashSet();
    public final Object d = new Object();
    public AbstractC9095qe2 f = C5785h.a;
    public final HashMap g = new HashMap();

    public static boolean e(AbstractC0952Hi1 abstractC0952Hi1, AbstractC0952Hi1 abstractC0952Hi12) {
        C14 it = ((RL2) abstractC0952Hi12.keySet()).iterator();
        while (true) {
            AbstractC11277x abstractC11277x = (AbstractC11277x) it;
            if (!abstractC11277x.hasNext()) {
                return false;
            }
            String str = (String) abstractC11277x.next();
            if (abstractC0952Hi1.containsKey(str) && !new C6506j53((Set) ((TL2) abstractC0952Hi1).get(str), (Set) ((TL2) abstractC0952Hi12).get(str)).isEmpty()) {
                return true;
            }
        }
    }

    public WX0(C6442iu3 c6442iu3, AbstractC9095qe2 abstractC9095qe2) {
        this.h = c6442iu3;
        this.e = (C1624Mn) abstractC9095qe2.d(C1624Mn.a());
    }

    public final void f(C1495Ln c1495Ln) {
        C1495Ln c1495Ln2;
        ArrayDeque arrayDeque = new ArrayDeque();
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        RV.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        synchronized (this) {
            this.g.remove(c1495Ln);
            this.c.add(c1495Ln);
            LinkedList linkedList = this.a;
            ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious() && (c1495Ln2 = (C1495Ln) listIterator.previous()) != c1495Ln) {
                arrayDeque.add(c1495Ln2);
            }
        }
        arrayDeque.add(c1495Ln);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        int i = 0;
        boolean z = false;
        while (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            int i2 = i + 1;
            if (objArr.length < i2) {
                objArr = Arrays.copyOf(objArr, AbstractC11518xi1.b(objArr.length, i2));
            } else if (z) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i] = next;
                i++;
            }
            z = false;
            objArr[i] = next;
            i++;
        }
        OL2 m = AbstractC0562Ei1.m(i, objArr);
        if (m == null) {
            throw new NullPointerException("Null records");
        }
        synchronized (this.d) {
            C3905bY0 c3905bY0 = (C3905bY0) ((InterfaceC6361ih) this.f.b());
            C1754Nn a = c3905bY0.a(new C6746jo(m, 4));
            synchronized (c3905bY0.c) {
                if (c3905bY0.g.c()) {
                    ((ZX0) c3905bY0.g.b()).a(a);
                    c3905bY0.c(a);
                }
            }
        }
    }

    public final C0720Fo b(C1495Ln c1495Ln) {
        C1070Ig c1070Ig;
        C3743b30 c3743b30;
        C1624Mn c1624Mn;
        C1495Ln c1495Ln2;
        LinkedList linkedList = this.a;
        int size = linkedList.size() + 1;
        C1624Mn c1624Mn2 = this.e;
        int i = c1624Mn2.a;
        HashMap hashMap = this.g;
        C2644Uj c2644Uj = this.b;
        if (size > i && (c1495Ln2 = (C1495Ln) linkedList.pollFirst()) != null) {
            Collection collection = (Collection) c2644Uj.h.remove(c1495Ln2);
            if (collection == null) {
                Collections.emptyList();
            } else {
                Collection c = c2644Uj.c();
                ((ArrayList) c).addAll(collection);
                c2644Uj.i -= collection.size();
                collection.clear();
                c2644Uj.f(c);
            }
            this.c.remove(c1495Ln2);
            if (c1495Ln2.c.d && hashMap.containsKey(c1495Ln2)) {
                RD1 rd1 = (RD1) hashMap.get(c1495Ln2);
                if (!rd1.isDone()) {
                    rd1.cancel(false);
                }
            }
        }
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        C5785h c5785h = C5785h.a;
        AbstractC9095qe2 abstractC9095qe2 = c5785h;
        while (true) {
            boolean hasPrevious = listIterator.hasPrevious();
            c1070Ig = c1495Ln.d;
            c3743b30 = c1495Ln.c;
            if (!hasPrevious) {
                c1624Mn = c1624Mn2;
                break;
            }
            C1495Ln c1495Ln3 = (C1495Ln) listIterator.previous();
            C10668vD0 c10668vD0 = ((C1200Jg) c1495Ln3.d.g).l;
            if (c10668vD0 == null) {
                c10668vD0 = C10668vD0.m;
            }
            C11064wN3 c11064wN3 = c10668vD0.k;
            if (c11064wN3 == null) {
                c11064wN3 = C11064wN3.l;
            }
            C10668vD0 c10668vD02 = ((C1200Jg) c1070Ig.g).l;
            if (c10668vD02 == null) {
                c10668vD02 = C10668vD0.m;
            }
            C11064wN3 c11064wN32 = c10668vD02.k;
            if (c11064wN32 == null) {
                c11064wN32 = C11064wN3.l;
            }
            AbstractC11750yN3.a(c11064wN3);
            AbstractC11750yN3.a(c11064wN32);
            c1624Mn = c1624Mn2;
            int compare = Long.compare(c11064wN3.j, c11064wN32.j);
            if (compare == 0) {
                compare = Integer.compare(c11064wN3.k, c11064wN32.k);
            }
            if (compare <= 0) {
                listIterator.next();
                break;
            }
            if (c1495Ln3.c.c && c1495Ln3.a().contains(c3743b30.a)) {
                AbstractC0952Hi1 abstractC0952Hi1 = c1495Ln.e;
                if (!abstractC0952Hi1.isEmpty()) {
                    AbstractC0952Hi1 abstractC0952Hi12 = c1495Ln3.e;
                    if (!abstractC0952Hi12.isEmpty() && !e(abstractC0952Hi12, abstractC0952Hi1)) {
                    }
                }
                if (!abstractC9095qe2.c()) {
                    abstractC9095qe2 = new C3242Yy2(c1495Ln3);
                }
            }
            c1624Mn2 = c1624Mn;
        }
        listIterator.add(c1495Ln);
        if (abstractC9095qe2.c()) {
            listIterator.previous();
            c2644Uj.e(c1495Ln, ((C1495Ln) abstractC9095qe2.b()).c.f);
            return new C0720Fo(listIterator, 2, abstractC9095qe2);
        }
        if (c3743b30.d) {
            AbstractC9095qe2 abstractC9095qe22 = c1624Mn.c;
            if (abstractC9095qe22.c()) {
                AbstractC9095qe2 abstractC9095qe23 = c3743b30.e;
                if (abstractC9095qe23.c()) {
                    this.h.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C10668vD0 c10668vD03 = ((C1200Jg) c1070Ig.g).l;
                    if (c10668vD03 == null) {
                        c10668vD03 = C10668vD0.m;
                    }
                    C11064wN3 c11064wN33 = c10668vD03.k;
                    if (c11064wN33 == null) {
                        c11064wN33 = C11064wN3.l;
                    }
                    AbstractC11750yN3.a(c11064wN33);
                    long a = FI1.a(FI1.b(c11064wN33.j, 1000L), c11064wN33.k / 1000000);
                    if (a > elapsedRealtime) {
                        a = elapsedRealtime;
                    }
                    long longValue = ((Long) abstractC9095qe23.b()).longValue() - (elapsedRealtime - a);
                    if (longValue <= 0) {
                        f(c1495Ln);
                    } else {
                        hashMap.put(c1495Ln, ((SY1) ((InterfaceScheduledExecutorServiceC4493dE1) abstractC9095qe22.b())).schedule(new VX0(new UX0(this), c1495Ln), longValue, TimeUnit.MILLISECONDS));
                    }
                }
            }
        }
        return new C0720Fo(listIterator, 1, c5785h);
    }

    public final C6746jo c(C1495Ln c1495Ln, ListIterator listIterator) {
        Object[] objArr;
        RD1 rd1;
        AbstractC1472Li1 a = c1495Ln.a();
        InterfaceC4248cY0 interfaceC4248cY0 = c1495Ln.c.f;
        C6403io c6403io = new C6403io();
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        RV.b(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        ArrayDeque arrayDeque = new ArrayDeque();
        while (listIterator.hasPrevious()) {
            C1495Ln c1495Ln2 = (C1495Ln) listIterator.previous();
            AbstractC0952Hi1 abstractC0952Hi1 = c1495Ln.e;
            if (abstractC0952Hi1.isEmpty() || c1495Ln2.e.isEmpty() || e(c1495Ln2.e, abstractC0952Hi1)) {
                arrayDeque.add(c1495Ln2);
                if (a.contains(c1495Ln2.c.a)) {
                    if (this.e.c.c() && (rd1 = (RD1) this.g.remove(c1495Ln2)) != null) {
                        rd1.cancel(false);
                    }
                    if (!this.c.contains(c1495Ln2)) {
                        C2644Uj c2644Uj = this.b;
                        Collection collection = (Collection) c2644Uj.a().get(c1495Ln2);
                        if (collection != null && collection.contains(interfaceC4248cY0)) {
                            c6403io.c(5);
                        } else {
                            c2644Uj.e(c1495Ln2, interfaceC4248cY0);
                            c6403io.c(2);
                        }
                    } else {
                        c6403io.c(6);
                    }
                    Iterator descendingIterator = arrayDeque.descendingIterator();
                    int i = 0;
                    boolean z = false;
                    while (descendingIterator.hasNext()) {
                        Object next = descendingIterator.next();
                        int i2 = i + 1;
                        if (objArr2.length < i2) {
                            objArr = Arrays.copyOf(objArr2, AbstractC11518xi1.b(objArr2.length, i2));
                        } else if (z) {
                            objArr = (Object[]) objArr2.clone();
                        } else {
                            objArr2[i] = next;
                            i++;
                        }
                        objArr2 = objArr;
                        z = false;
                        objArr2[i] = next;
                        i++;
                    }
                    c6403io.b(AbstractC0562Ei1.m(i, objArr2));
                    return c6403io.a();
                }
            }
        }
        c6403io.b(AbstractC0562Ei1.o(this.a));
        c6403io.c(3);
        return c6403io.a();
    }

    public static C6746jo d(C1495Ln c1495Ln, C0720Fo c0720Fo) {
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        RV.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        while (true) {
            ListIterator listIterator = c0720Fo.a;
            if (!listIterator.hasNext()) {
                break;
            }
            C1495Ln c1495Ln2 = (C1495Ln) listIterator.next();
            AbstractC0952Hi1 abstractC0952Hi1 = c1495Ln.e;
            if (abstractC0952Hi1.isEmpty() || c1495Ln2.e.isEmpty() || e(c1495Ln2.e, abstractC0952Hi1)) {
                int i2 = i + 1;
                if (objArr.length < i2) {
                    objArr = Arrays.copyOf(objArr, AbstractC11518xi1.b(objArr.length, i2));
                }
                objArr[i] = c1495Ln2;
                if (c1495Ln2 == c0720Fo.c.b()) {
                    i = i2;
                    break;
                }
                i = i2;
            }
        }
        OL2 m = AbstractC0562Ei1.m(i, objArr);
        if (m == null) {
            throw new NullPointerException("Null records");
        }
        return new C6746jo(m, 7);
    }

    public final synchronized AbstractC9095qe2 a(C1495Ln c1495Ln) {
        C0720Fo b = b(c1495Ln);
        int b2 = AbstractC2373Sg3.b(b.b);
        if (b2 != 0) {
            if (b2 == 1) {
                return new C3242Yy2(d(c1495Ln, b));
            }
            return C5785h.a;
        }
        if (c1495Ln.c.c) {
            return new C3242Yy2(c(c1495Ln, b.a));
        }
        return C5785h.a;
    }
}
