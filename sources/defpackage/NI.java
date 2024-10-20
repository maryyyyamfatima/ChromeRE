package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NI {
    public static final ArrayList c = new ArrayList();
    public MI a;
    public final ArrayList b = new ArrayList();

    public static MI b(Y03 y03, Y03 y032, ArrayList arrayList, C4513dI1 c4513dI1, String str, String str2, boolean z) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashMap hashMap;
        int i;
        ArrayList arrayList5;
        int i2;
        boolean z2 = y03 == null;
        boolean z3 = y032 == null;
        if (z2 && z3) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        }
        if (z3) {
            int i3 = y03.m;
            arrayList.add(y03);
            MI a = MI.a(y03.m, y032, z);
            for (int i4 = 0; i4 < i3; i4++) {
                ArrayList arrayList6 = AI.i;
                a.b(AI.b(3, 0, A00.r(), null, null));
            }
            return a;
        }
        String d = d(y03, str);
        String d2 = d(y032, str2);
        if (!z2) {
            y032.getClass();
            if (!AbstractC8888q13.j(y03, y032)) {
                MI a2 = MI.a(y03.m, y032, z);
                y032.m = a2.d;
                c4513dI1.d();
                return a2;
            }
        }
        c4513dI1.d();
        if (y032.h()) {
            MI a3 = MI.a(z2 ? 0 : y03.m, y032, z);
            y032.g(y032.h, a3, y03, y032);
            y032.m = a3.d;
            return a3;
        }
        MI a4 = MI.a(0, y032, z);
        HashMap l = Y03.l(y03);
        HashMap l2 = Y03.l(y032);
        ArrayList arrayList7 = y03 == null ? c : new ArrayList(y03.n);
        ArrayList arrayList8 = y032.n;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i5 < arrayList8.size()) {
            String str3 = ((Y03) arrayList8.get(i5)).o;
            if (l.containsKey(str3)) {
                C8776pi2 c8776pi2 = (C8776pi2) l.get(str3);
                Y03 y033 = (Y03) c8776pi2.a;
                int intValue = ((Integer) c8776pi2.b).intValue();
                if (i6 > intValue) {
                    arrayList5 = arrayList8;
                    for (int i8 = 0; i8 < y033.m; i8++) {
                        a4.b(AI.a(0, c(str3, arrayList7), i7, 1, null, null, null, null));
                    }
                    arrayList7.remove(intValue);
                    arrayList7.add(i6, y033);
                    int size = arrayList7.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Y03 y034 = (Y03) arrayList7.get(i9);
                        C8776pi2 c8776pi22 = (C8776pi2) l.get(y034.o);
                        if (((Integer) c8776pi22.b).intValue() != i9) {
                            i2 = i7;
                            l.put(y034.o, new C8776pi2((Y03) c8776pi22.a, Integer.valueOf(i9)));
                        } else {
                            i2 = i7;
                        }
                        i9++;
                        i7 = i2;
                    }
                    i = i7;
                } else {
                    i = i7;
                    arrayList5 = arrayList8;
                    if (intValue > i6) {
                        i7 = (c(str3, arrayList7) + ((Y03) arrayList7.get(intValue)).m) - 1;
                        i6 = intValue;
                        i5++;
                        arrayList8 = arrayList5;
                    }
                }
            } else {
                i = i7;
                arrayList5 = arrayList8;
            }
            i7 = i;
            i5++;
            arrayList8 = arrayList5;
        }
        ArrayList arrayList9 = arrayList8;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (i10 < arrayList7.size()) {
            String str4 = ((Y03) arrayList7.get(i10)).o;
            Y03 y035 = (Y03) arrayList7.get(i10);
            if (l2.get(str4) == null) {
                arrayList4 = arrayList9;
                hashMap = l2;
                sparseArray.put(i10, b(y035, null, arrayList, c4513dI1, d, d2, z));
            } else {
                arrayList4 = arrayList9;
                hashMap = l2;
            }
            i10++;
            arrayList9 = arrayList4;
            l2 = hashMap;
        }
        ArrayList arrayList10 = arrayList9;
        int i11 = 0;
        int i12 = 0;
        while (i12 < arrayList10.size()) {
            ArrayList arrayList11 = arrayList10;
            Y03 y036 = (Y03) arrayList11.get(i12);
            C8776pi2 c8776pi23 = (C8776pi2) l.get(y036.o);
            int intValue2 = c8776pi23 != null ? ((Integer) c8776pi23.b).intValue() : -1;
            if (intValue2 < 0) {
                MI mi = (MI) sparseArray.get(i11);
                arrayList2 = arrayList11;
                int i13 = i11;
                MI b = b(null, y036, arrayList, c4513dI1, d, d2, z);
                sparseArray.put(i13, MI.c(mi, b));
                if (mi != null) {
                    mi.d();
                }
                b.d();
                arrayList3 = arrayList7;
                i11 = i13;
            } else {
                arrayList2 = arrayList11;
                MI mi2 = (MI) sparseArray.get(intValue2);
                int i14 = intValue2;
                arrayList3 = arrayList7;
                MI b2 = b((Y03) arrayList7.get(intValue2), y036, arrayList, c4513dI1, d, d2, z);
                sparseArray.put(i14, MI.c(mi2, b2));
                if (mi2 != null) {
                    mi2.d();
                }
                b2.d();
                i11 = i14;
            }
            i12++;
            arrayList10 = arrayList2;
            arrayList7 = arrayList3;
        }
        AtomicInteger atomicInteger = Y03.q;
        int size2 = sparseArray.size();
        for (int i15 = 0; i15 < size2; i15++) {
            MI mi3 = (MI) sparseArray.valueAt(i15);
            a4 = MI.c(a4, mi3);
            if (mi3 != null) {
                mi3.d();
            }
        }
        y032.m = a4.d;
        return a4;
    }

    public static final String d(Y03 y03, String str) {
        if (y03 == null || y03.a != null) {
            return y03 != null ? AbstractC8192o0.a(str, "->", y03.getClass().getSimpleName()) : "";
        }
        return y03.getClass().getSimpleName();
    }

    public static NI a(C3390a13 c3390a13, Y03 y03, Y03 y032, C4513dI1 c4513dI1, boolean z) {
        NI ni = new NI();
        C5524gE1 e = c3390a13.e();
        InterfaceC9173qr2 b = E13.b(c3390a13, 13, y03, y032);
        ArrayList arrayList = ni.b;
        String str = y032.j;
        if (y03 == null || y03.j.equals(str)) {
            Thread.currentThread().getName();
            ni.a = b(y03, y032, arrayList, c4513dI1, "", "", z);
        } else {
            Thread.currentThread().getName();
            MI b2 = b(y03, null, arrayList, c4513dI1, "", "", z);
            Thread.currentThread().getName();
            ni.a = MI.c(b2, b(null, y032, arrayList, c4513dI1, "", "", z));
        }
        if (e != null && b != null) {
            b.f();
            ni.a.a.size();
            b.f();
            int i = ni.a.d;
            b.f();
            if (ni.a.c != null) {
                b.f();
                b.f();
                b.f();
                b.f();
                b.f();
                b.f();
                b.f();
                b.f();
            }
            C5524gE1.a(b);
        }
        if (!((y03 != null && y03.m < 0) || y032.m < 0)) {
            return ni;
        }
        StringBuilder sb = new StringBuilder("Changet count is below 0! Current section: ");
        if (y03 == null) {
            sb.append("null; ");
        } else {
            String str2 = y03.o;
            int i2 = y03.m;
            int size = y03.n.size();
            StringBuilder sb2 = new StringBuilder();
            AbstractC9972tB0.a(sb2, y03.j, " , key=", str2, ", count=");
            sb2.append(i2);
            sb2.append(", childrenSize=");
            sb2.append(size);
            sb2.append("; ");
            sb.append(sb2.toString());
        }
        sb.append("Next section: ");
        sb.append(str + " , key=" + y032.o + ", count=" + y032.m + ", childrenSize=" + y032.n.size() + "; ");
        sb.append("Changes: [");
        MI mi = ni.a;
        for (int i3 = 0; i3 < mi.d; i3++) {
            AI ai = (AI) mi.a.get(i3);
            sb.append(ai.a + " " + ai.b + " " + ai.c);
            sb.append(", ");
        }
        sb.append("]");
        throw new IllegalStateException(sb.toString());
    }

    public static final int c(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Y03 y03 = (Y03) it.next();
            if (y03.o.equals(str)) {
                return i;
            }
            i += y03.m;
        }
        return i;
    }
}
