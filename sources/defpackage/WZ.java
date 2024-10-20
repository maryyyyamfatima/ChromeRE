package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WZ extends AbstractC10593v00 implements Cloneable, InterfaceC4449d61, SC0 {
    public static final AtomicInteger B = new AtomicInteger(1);
    public static final C10223tv0[] C = new C10223tv0[0];
    public InterfaceC2671Uo1 A;
    public final String j;
    public ArrayList k;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public C7849n00 r;
    public BY t;
    public SparseArray u;
    public SparseIntArray v;
    public HashMap w;
    public C6206iD0 x;
    public Context y;
    public AbstractC6726jk3 z;
    public int l = B.getAndIncrement();
    public AtomicBoolean q = new AtomicBoolean();
    public boolean s = false;

    public boolean U() {
        return this instanceof C4929eX;
    }

    public void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
    }

    public InterfaceC2671Uo1 W() {
        return null;
    }

    public AbstractC6726jk3 X() {
        return null;
    }

    @Override // defpackage.InterfaceC4449d61
    public final InterfaceC4487dD0 b() {
        return this;
    }

    public WZ d0() {
        return null;
    }

    public void n0(QD0 qd0) {
    }

    public WZ(String str) {
        this.j = str;
        boolean z = B10.a;
        this.z = X();
        this.A = W();
    }

    public final String c0() {
        WZ d0 = d0();
        String str = this.j;
        if (d0 == null) {
            return str;
        }
        while (d0.d0() != null) {
            d0 = d0.d0();
        }
        return str + "(" + d0.c0() + ")";
    }

    public final void m0(C7849n00 c7849n00, int i, int i2, C8753pe3 c8753pe3) {
        C1032Hy1 c1032Hy1 = c7849n00.o;
        C0772Fy1 c0772Fy1 = c1032Hy1 == null ? null : c1032Hy1.a;
        if (c0772Fy1 == null) {
            throw new IllegalStateException(AbstractC7848n0.a(c0(), ": Trying to measure a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."));
        }
        HashMap hashMap = c0772Fy1.o;
        InterfaceC3331Zq1 interfaceC3331Zq1 = (InterfaceC3331Zq1) hashMap.get(Integer.valueOf(this.l));
        if (interfaceC3331Zq1 == null || !OM1.a(interfaceC3331Zq1.U0(), i, interfaceC3331Zq1.getWidth()) || !OM1.a(interfaceC3331Zq1.b0(), i2, interfaceC3331Zq1.getHeight())) {
            hashMap.remove(Integer.valueOf(this.l));
            interfaceC3331Zq1 = AbstractC3106Xx1.d(c0772Fy1.g, c7849n00, this, i, i2, null, null, null);
            hashMap.put(Integer.valueOf(this.l), interfaceC3331Zq1);
            if (m() == 1) {
                interfaceC3331Zq1.t(i);
                interfaceC3331Zq1.N(i2);
                interfaceC3331Zq1.A(interfaceC3331Zq1.getWidth());
                interfaceC3331Zq1.F1(interfaceC3331Zq1.getHeight());
            }
        }
        c8753pe3.a = interfaceC3331Zq1.getWidth();
        c8753pe3.b = interfaceC3331Zq1.getHeight();
    }

    @Override // defpackage.SC0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || getClass() != wz.getClass()) {
            return false;
        }
        if (this.l == wz.l) {
            return true;
        }
        return A10.d(this, wz);
    }

    public WZ k0() {
        try {
            WZ wz = (WZ) super.clone();
            wz.q = new AtomicBoolean();
            wz.n = null;
            wz.s = false;
            wz.r = null;
            wz.v = null;
            wz.w = null;
            return wz;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public SparseArray Y() {
        return this.u;
    }

    public final String Z() {
        if (this.o == null && !this.p) {
            this.o = Integer.toString(this.a);
        }
        return this.o;
    }

    public boolean e0() {
        SparseArray sparseArray = this.u;
        return sparseArray != null && sparseArray.size() > 0;
    }

    public final WZ l0(C7849n00 c7849n00) {
        WZ k0 = k0();
        C1032Hy1 c1032Hy1 = c7849n00.o;
        k0.n = A10.c(this);
        k0.V(k0.A, this.A);
        k0.o0(c7849n00).k = n(c7849n00.g());
        return k0;
    }

    public final String toString() {
        return c0();
    }

    public final C7849n00 o0(C7849n00 c7849n00) {
        int i;
        AbstractC6726jk3 abstractC6726jk3;
        C2526Tl1 c2526Tl1;
        Object obj;
        List list;
        String c = A10.c(this);
        if ((B10.a || B10.d) && c == null) {
            WZ wz = c7849n00.f;
            String Z = Z();
            if (wz == null) {
                c = Z;
            } else {
                String str = wz.n;
                if (str == null) {
                    E10.a(2, "ComponentKeyUtils:NullParentKey", KR0.a("Trying to generate parent-based key for component ", c0(), " , but parent ", wz.c0(), " has a null global key \". This is most likely a configuration mistake, check the value of ComponentsConfiguration.useGlobalKeys."));
                    c = "null" + Z;
                } else {
                    String a = AbstractC10204ts.a(new StringBuilder(str.length() + Z.length() + 1), str, ",", Z);
                    if (this.p) {
                        synchronized (wz) {
                            if (wz.w == null) {
                                wz.w = new HashMap();
                            }
                            i = wz.w.containsKey(a) ? ((Integer) wz.w.get(a)).intValue() : 0;
                            wz.w.put(a, Integer.valueOf(i + 1));
                        }
                        if (i != 0) {
                            E10.a(1, "ComponentKeyUtils:DuplicateManualKey", KR0.a("The manual key ", Z, " you are setting on this ", c0(), " is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it."));
                        }
                    } else {
                        synchronized (wz) {
                            if (wz.v == null) {
                                wz.v = new SparseIntArray();
                            }
                            int i2 = this.a;
                            i = wz.v.get(i2, 0);
                            wz.v.put(i2, i + 1);
                        }
                    }
                    if (i == 0) {
                        c = a;
                    } else {
                        StringBuilder sb = new StringBuilder(a.length() + 4);
                        sb.append(a);
                        sb.append('!');
                        sb.append(i);
                        c = sb.toString();
                    }
                }
            }
            this.n = c;
        }
        C7849n00 c7849n002 = new C7849n00(c7849n00, c7849n00.d, c7849n00.k, c7849n00.o);
        c7849n002.f = this;
        c7849n002.l = c7849n00.l;
        this.r = c7849n002;
        O(c7849n002.k);
        if (q()) {
            C7070kk3 c7070kk3 = c7849n00.d;
            synchronized (c7070kk3) {
                if (c7070kk3.e == null) {
                    c7070kk3.e = new HashMap(4);
                }
            }
            synchronized (c7070kk3) {
                if (c7070kk3.f == null) {
                    c7070kk3.f = new HashSet();
                }
            }
            if (q()) {
                C7849n00 c7849n003 = this.r;
                synchronized (c7070kk3) {
                    abstractC6726jk3 = (AbstractC6726jk3) c7070kk3.e.get(c);
                    c7070kk3.f.add(c);
                }
                if (abstractC6726jk3 != null) {
                    T(abstractC6726jk3, this.z);
                } else {
                    ComponentTree componentTree = c7849n003.l;
                    if (componentTree == null || (c2526Tl1 = componentTree.i) == null) {
                        f(c7849n003);
                    } else {
                        synchronized (c2526Tl1) {
                            obj = c2526Tl1.b.get(this.n);
                            if (obj == null) {
                                obj = new Object();
                                c2526Tl1.b.put(this.n, obj);
                            }
                        }
                        synchronized (obj) {
                            AbstractC6726jk3 abstractC6726jk32 = (AbstractC6726jk3) c2526Tl1.a.get(this.n);
                            if (abstractC6726jk32 == null) {
                                f(c7849n003);
                                c2526Tl1.a.put(this.n, this.z);
                            } else {
                                T(abstractC6726jk32, this.z);
                            }
                        }
                    }
                }
                synchronized (c7070kk3) {
                    HashMap hashMap = c7070kk3.a;
                    list = hashMap == null ? null : (List) hashMap.get(c);
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.z.a((C6383ik3) it.next());
                    }
                    AbstractC10674vE1.a.addAndGet(list.size());
                    synchronized (c7070kk3) {
                        c7070kk3.a.remove(c);
                        HashMap hashMap2 = c7070kk3.b;
                        if (hashMap2 != null) {
                            hashMap2.remove(c);
                        }
                        c7070kk3.d.put(c, list);
                    }
                }
                synchronized (c7070kk3) {
                    c7070kk3.e.put(c, this.z);
                }
            }
        }
        this.x = c7849n00.b();
        AtomicBoolean atomicBoolean = this.q;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        return c7849n002;
    }

    public final SparseArray a0() {
        if (this.u == null) {
            this.u = new SparseArray();
        }
        return this.u;
    }

    public final InterfaceC11801yY b0() {
        if (this.t == null) {
            this.t = new BY();
        }
        return this.t;
    }

    public static boolean g0(WZ wz) {
        return (wz != null && wz.m() == 1) && wz.e();
    }

    public static boolean h0(WZ wz) {
        return (wz == null || wz.m() == 1) ? false : true;
    }

    public static boolean i0(WZ wz) {
        return wz != null && wz.m() == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j0(defpackage.WZ r1, defpackage.C7849n00 r2) {
        /*
            boolean r0 = g0(r1)
            if (r0 != 0) goto L25
            r0 = 0
            if (r1 == 0) goto L26
            if (r2 == 0) goto L22
            Hy1 r2 = r2.o
            if (r2 != 0) goto L11
            r2 = 0
            goto L13
        L11:
            Fy1 r2 = r2.a
        L13:
            if (r2 == 0) goto L22
            java.util.HashMap r2 = r2.o
            int r1 = r1.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.containsKey(r1)
            goto L23
        L22:
            r1 = r0
        L23:
            if (r1 == 0) goto L26
        L25:
            r0 = 1
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WZ.j0(WZ, n00):boolean");
    }
}
