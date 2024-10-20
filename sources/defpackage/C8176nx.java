package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8176nx implements InterfaceC11974z13 {
    public static final boolean g = B10.a;
    public final InterfaceC11974z13 a;
    public final C4513dI1 c;
    public final SparseArray b = new SparseArray();
    public int d = Integer.MAX_VALUE;
    public int e = -1;
    public int f = -1;

    public C8176nx(InterfaceC11974z13 interfaceC11974z13, C4513dI1 c4513dI1, String str) {
        this.a = interfaceC11974z13;
        this.c = c4513dI1;
    }

    @Override // defpackage.InterfaceC11974z13
    public final void i(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        int i2;
        int i3;
        int i4;
        int i5 = this.d;
        SparseArray sparseArray = this.b;
        if (i5 == 1 && i >= (i2 = this.e) && i <= (i4 = i2 + (i3 = this.f)) && i >= i4) {
            this.f = i3 + 1;
            this.e = Math.min(i, i2);
            sparseArray.put(i, interfaceC7976nN2);
        } else {
            c();
            this.e = i;
            this.f = 1;
            this.d = 1;
            sparseArray.put(i, interfaceC7976nN2);
        }
    }

    @Override // defpackage.InterfaceC11974z13
    public final void g(ArrayList arrayList, int i, int i2) {
        c();
        this.a.g(arrayList, i, i2);
        if (g) {
            e(i, arrayList);
        }
    }

    @Override // defpackage.InterfaceC11974z13
    public final void k(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        int i2;
        int i3;
        int i4;
        int i5 = this.d;
        SparseArray sparseArray = this.b;
        if (i5 == 2 && i <= (i3 = this.f + (i2 = this.e)) && (i4 = i + 1) >= i2) {
            this.e = Math.min(i, i2);
            this.f = Math.max(i3, i4) - this.e;
            sparseArray.put(i, interfaceC7976nN2);
        } else {
            c();
            this.e = i;
            this.f = 1;
            this.d = 2;
            sparseArray.put(i, interfaceC7976nN2);
        }
    }

    @Override // defpackage.InterfaceC11974z13
    public final void l(ArrayList arrayList, int i, int i2) {
        c();
        this.a.l(arrayList, i, i2);
        if (g) {
            f(i, arrayList);
        }
    }

    @Override // defpackage.InterfaceC11974z13
    public final void a(int i) {
        int i2;
        if (this.d == 3 && (i2 = this.e) >= i && i2 <= i + 1) {
            this.f++;
            this.e = i;
        } else {
            c();
            this.e = i;
            this.f = 1;
            this.d = 3;
        }
    }

    @Override // defpackage.InterfaceC11974z13
    public final void n(int i, int i2) {
        c();
        this.a.n(i, i2);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void m(int i, int i2) {
        c();
        this.a.m(i, i2);
        if (g) {
            Thread.currentThread().getName();
            this.c.c(i, i2);
        }
    }

    @Override // defpackage.InterfaceC11974z13
    public final void o(boolean z, C10259u13 c10259u13) {
        this.a.o(z, c10259u13);
    }

    @Override // defpackage.InterfaceC11974z13
    public final boolean d() {
        return this.a.d();
    }

    public final void c() {
        int i = this.d;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        SparseArray sparseArray = this.b;
        C4513dI1 c4513dI1 = this.c;
        boolean z = g;
        InterfaceC11974z13 interfaceC11974z13 = this.a;
        if (i == 1) {
            ArrayList b = b(this.e, this.f, sparseArray);
            int i2 = this.f;
            if (i2 > 1) {
                interfaceC11974z13.g(b, this.e, i2);
                if (z) {
                    e(this.e, b);
                }
            } else {
                int i3 = this.e;
                interfaceC11974z13.i(i3, (InterfaceC7976nN2) sparseArray.get(i3));
                if (z) {
                    int i4 = this.e;
                    Thread.currentThread().getName();
                    c4513dI1.b(i4);
                }
            }
        } else if (i == 2) {
            ArrayList b2 = b(this.e, this.f, sparseArray);
            int i5 = this.f;
            if (i5 > 1) {
                interfaceC11974z13.l(b2, this.e, i5);
                if (z) {
                    f(this.e, b2);
                }
            } else {
                int i6 = this.e;
                interfaceC11974z13.k(i6, (InterfaceC7976nN2) sparseArray.get(i6));
                if (z) {
                    int i7 = this.e;
                    Thread.currentThread().getName();
                    c4513dI1.e(i7);
                }
            }
        } else if (i == 3) {
            int i8 = this.f;
            if (i8 > 1) {
                interfaceC11974z13.n(this.e, i8);
                if (z) {
                    int i9 = this.e;
                    int i10 = this.f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        Thread.currentThread().getName();
                        c4513dI1.a(i9 + i11);
                    }
                }
            } else {
                interfaceC11974z13.a(this.e);
                if (z) {
                    int i12 = this.e;
                    Thread.currentThread().getName();
                    c4513dI1.a(i12);
                }
            }
        }
        this.d = Integer.MAX_VALUE;
        sparseArray.clear();
    }

    public static ArrayList b(int i, int i2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            InterfaceC7976nN2 interfaceC7976nN2 = (InterfaceC7976nN2) sparseArray.get(i3);
            if (interfaceC7976nN2 == null) {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", Integer.valueOf(i3)));
            }
            arrayList.add(interfaceC7976nN2);
        }
        return arrayList;
    }

    public final void e(int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Thread.currentThread().getName();
            this.c.b(i + i2);
        }
    }

    public final void f(int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Thread.currentThread().getName();
            this.c.e(i + i2);
        }
    }
}
