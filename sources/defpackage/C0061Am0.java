package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Am0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061Am0 {
    public final int[] a;
    public final int[] b;
    public final AbstractC11884ym0 c;
    public final int d;
    public final int e;
    public final boolean f;

    public C0061Am0(C2235Rf0 c2235Rf0, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        AbstractC11884ym0 abstractC11884ym0;
        int[] iArr3;
        int[] iArr4;
        int i;
        C12227zm0 c12227zm0;
        int i2;
        this.a = iArr;
        this.b = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.c = c2235Rf0;
        int e = c2235Rf0.e();
        this.d = e;
        int d = c2235Rf0.d();
        this.e = d;
        this.f = z;
        C12227zm0 c12227zm02 = arrayList.isEmpty() ? null : (C12227zm0) arrayList.get(0);
        if (c12227zm02 == null || c12227zm02.a != 0 || c12227zm02.b != 0) {
            arrayList.add(0, new C12227zm0(0, 0, 0));
        }
        arrayList.add(new C12227zm0(e, d, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            abstractC11884ym0 = this.c;
            iArr3 = this.b;
            iArr4 = this.a;
            if (!hasNext) {
                break;
            }
            C12227zm0 c12227zm03 = (C12227zm0) it.next();
            for (int i3 = 0; i3 < c12227zm03.c; i3++) {
                int i4 = c12227zm03.a + i3;
                int i5 = c12227zm03.b + i3;
                int i6 = abstractC11884ym0.a(i4, i5) ? 1 : 2;
                iArr4[i4] = (i5 << 4) | i6;
                iArr3[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C12227zm0 c12227zm04 = (C12227zm0) it2.next();
                while (true) {
                    i = c12227zm04.a;
                    if (i7 < i) {
                        if (iArr4[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    c12227zm0 = (C12227zm0) arrayList.get(i8);
                                    while (true) {
                                        i2 = c12227zm0.b;
                                        if (i9 < i2) {
                                            if (iArr3[i9] == 0 && abstractC11884ym0.b(i7, i9)) {
                                                int i10 = abstractC11884ym0.a(i7, i9) ? 8 : 4;
                                                iArr4[i7] = (i9 << 4) | i10;
                                                iArr3[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = c12227zm0.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c12227zm04.c + i;
            }
        }
    }

    public static C0191Bm0 a(ArrayDeque arrayDeque, int i, boolean z) {
        C0191Bm0 c0191Bm0;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0191Bm0 = null;
                break;
            }
            c0191Bm0 = (C0191Bm0) it.next();
            if (c0191Bm0.a == i && c0191Bm0.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0191Bm0 c0191Bm02 = (C0191Bm0) it.next();
            if (z) {
                c0191Bm02.b--;
            } else {
                c0191Bm02.b++;
            }
        }
        return c0191Bm0;
    }
}
