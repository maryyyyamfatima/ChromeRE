package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Td0 */
/* loaded from: classes.dex */
public final class C2485Td0 implements InterfaceC0186Bl0, InterfaceC5131f52 {
    public final C4403cy2 g;
    public final C0624Eu3 h;
    public int k;
    public Cif l;
    public Boolean m;
    public final C12157za2 a = new C12157za2();
    public final C2225Rd0 i = new InterfaceC0494Du3() { // from class: Rd0
        @Override // defpackage.InterfaceC0494Du3
        public final void a() {
            C2485Td0.this.a();
        }
    };
    public final RunnableC2355Sd0 j = new Runnable() { // from class: Sd0
        @Override // java.lang.Runnable
        public final void run() {
            C2485Td0.this.a();
        }
    };

    @Override // defpackage.InterfaceC5131f52
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Rd0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Sd0] */
    public C2485Td0(I5 i5, C0624Eu3 c0624Eu3, C4403cy2 c4403cy2) {
        this.h = c0624Eu3;
        this.g = c4403cy2;
        i5.b(this);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.h.a.d(this.i);
        this.g.a.d(this.j);
    }

    @Override // defpackage.InterfaceC5131f52
    public final boolean h() {
        Boolean bool = this.m;
        return bool != null && bool.booleanValue();
    }

    @Override // defpackage.InterfaceC5131f52
    public final void b(InterfaceC4787e52 interfaceC4787e52) {
        this.a.a(interfaceC4787e52);
    }

    @Override // defpackage.InterfaceC5131f52
    public final void j(InterfaceC4787e52 interfaceC4787e52) {
        this.a.d(interfaceC4787e52);
    }

    public final void a() {
        int i = this.k;
        boolean z = i != 1 && (i == 2 || this.h.b || this.g.d);
        Boolean bool = this.m;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.m = valueOf;
        Cif cif = this.l;
        int i2 = valueOf.booleanValue() ? 2 : 1;
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) cif;
        if (layoutInflaterFactory2C0545Ef.S != i2) {
            layoutInflaterFactory2C0545Ef.S = i2;
            if (layoutInflaterFactory2C0545Ef.O) {
                layoutInflaterFactory2C0545Ef.o(true);
            }
        }
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4787e52) c11814ya2.next()).R();
            }
        }
    }
}
