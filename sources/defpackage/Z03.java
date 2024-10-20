package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z03 implements InterfaceC11974z13, InterfaceC2194Qx {
    public final KJ2 a;
    public final boolean b;

    public Z03(KJ2 kj2, boolean z) {
        this.a = kj2;
        this.b = z;
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void b(int i, int i2) {
        this.a.b(i, i2);
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void h(C8753pe3 c8753pe3, int i, int i2, C6206iD0 c6206iD0) {
        this.a.h(c8753pe3, i, i2, c6206iD0);
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void f(RecyclerView recyclerView) {
        this.a.f(recyclerView);
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void t(C8617pE1 c8617pE1) {
        this.a.getClass();
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void u(C8617pE1 c8617pE1) {
        this.a.getClass();
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void v(RecyclerView recyclerView) {
        this.a.v(recyclerView);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void i(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.E();
            kj2.B();
            if (D13.a) {
                interfaceC7976nN2.getName();
            }
            KJ2.D(interfaceC7976nN2);
            O00 J2 = kj2.J(interfaceC7976nN2);
            synchronized (J2) {
                J2.p = false;
            }
            C10357uJ2 c10357uJ2 = new C10357uJ2(i, J2);
            synchronized (kj2) {
                kj2.e0 = true;
                kj2.b.add(i, J2);
                kj2.h0(c10357uJ2);
            }
            return;
        }
        KJ2 kj22 = this.a;
        kj22.getClass();
        LK3.a();
        kj22.B();
        if (D13.a) {
            interfaceC7976nN2.getName();
        }
        KJ2.D(interfaceC7976nN2);
        O00 J3 = kj22.J(interfaceC7976nN2);
        synchronized (kj22) {
            if (kj22.e0) {
                throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
            }
            kj22.a.add(i, J3);
            kj22.m0.a(interfaceC7976nN2);
        }
        kj22.e.a.e(i, 1);
        C4292cf4 c4292cf4 = kj22.j0;
        c4292cf4.c(c4292cf4.a(i, kj22.Z));
    }

    @Override // defpackage.InterfaceC11974z13
    public final void g(ArrayList arrayList, int i, int i2) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.E();
            kj2.B();
            if (D13.a) {
                String[] strArr = new String[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    strArr[i3] = ((InterfaceC7976nN2) arrayList.get(i3)).getName();
                }
                arrayList.size();
                Arrays.toString(strArr);
            }
            synchronized (kj2) {
                kj2.e0 = true;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    InterfaceC7976nN2 interfaceC7976nN2 = (InterfaceC7976nN2) arrayList.get(i4);
                    KJ2.D(interfaceC7976nN2);
                    int i5 = i + i4;
                    O00 J2 = kj2.J(interfaceC7976nN2);
                    synchronized (J2) {
                        J2.p = false;
                    }
                    C10357uJ2 c10357uJ2 = new C10357uJ2(i5, J2);
                    kj2.b.add(i5, J2);
                    kj2.h0(c10357uJ2);
                }
            }
            return;
        }
        this.a.U(i, arrayList);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void k(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.E();
            boolean z = D13.a;
            synchronized (kj2) {
                kj2.x(new C12072zJ2(i, interfaceC7976nN2));
            }
            return;
        }
        this.a.n0(i, interfaceC7976nN2);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void l(ArrayList arrayList, int i, int i2) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.E();
            if (D13.a) {
                arrayList.size();
            }
            synchronized (kj2) {
                kj2.x(new AJ2(i, arrayList));
            }
            return;
        }
        this.a.o0(i, arrayList);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void m(int i, int i2) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.E();
            boolean z = D13.a;
            C10700vJ2 c10700vJ2 = new C10700vJ2(i, i2);
            synchronized (kj2) {
                kj2.e0 = true;
                ArrayList arrayList = kj2.b;
                arrayList.add(i2, (O00) arrayList.remove(i));
                kj2.x(c10700vJ2);
            }
            return;
        }
        this.a.f0(i, i2);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void o(boolean z, C10259u13 c10259u13) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.getClass();
            boolean z2 = D13.a;
            kj2.e0 = true;
            kj2.E();
            kj2.F(z, c10259u13);
            if (LK3.b()) {
                kj2.A(0);
                if (z) {
                    int i = AbstractC10331uE1.a;
                    kj2.d0();
                }
            } else if (kj2.k.get()) {
                ((C3839bL) C3839bL.a()).b(kj2.M);
            }
            if (B10.a || B10.b) {
                kj2.A.set(-1L);
                return;
            }
            return;
        }
        this.a.g0(z, c10259u13);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void a(int i) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.E();
            boolean z = D13.a;
            C11386xJ2 c11386xJ2 = new C11386xJ2(i);
            synchronized (kj2) {
                kj2.e0 = true;
                kj2.b.remove(i);
                kj2.x(c11386xJ2);
            }
            return;
        }
        this.a.i0(i);
    }

    @Override // defpackage.InterfaceC11974z13
    public final void n(int i, int i2) {
        if (this.b) {
            KJ2 kj2 = this.a;
            kj2.E();
            kj2.C(i2);
            boolean z = D13.a;
            C11729yJ2 c11729yJ2 = new C11729yJ2(i, i2);
            synchronized (kj2) {
                kj2.e0 = true;
                for (int i3 = 0; i3 < i2; i3++) {
                    kj2.b.remove(i);
                }
                kj2.x(c11729yJ2);
            }
            return;
        }
        this.a.j0(i, i2);
    }

    @Override // defpackage.InterfaceC11974z13
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.InterfaceC2194Qx
    public final boolean e() {
        return this.a.P;
    }

    @Override // defpackage.InterfaceC2194Qx
    public final boolean j() {
        return this.a.Q;
    }
}
