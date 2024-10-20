package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7237lD1 {
    public final PC1 a;
    public final C0036Ah0 b;
    public final C1855Oh0 c;
    public final C2760Vg0 d;
    public final InterfaceC12197zh0 e;
    public final C2115Qh0 f;
    public final InterfaceC11007wC1 g;
    public final InterfaceC12197zh0 h;
    public final QC1 i;
    public final C11711yG j;
    public int k = 0;
    public final C6549jD1 l = new C6549jD1(this);

    public C7237lD1(C0351Cs0 c0351Cs0, C4722du1 c4722du1, C0036Ah0 c0036Ah0, PC1 pc1) {
        this.b = c0036Ah0;
        this.a = pc1;
        C6893kD1 c6893kD1 = new C6893kD1();
        boolean z = c0351Cs0.f;
        this.e = z ? new C2890Wg0() : c6893kD1;
        this.h = z ? new C2592Ty2() : c6893kD1;
        C11711yG c11711yG = new C11711yG();
        this.j = c11711yG;
        this.c = new C1855Oh0(c4722du1);
        this.d = new C2760Vg0(c4722du1);
        this.f = new C2115Qh0();
        this.g = c0351Cs0.e ? new C5474g51(c11711yG) : c6893kD1;
        this.i = new QC1(c0351Cs0);
        a();
        c0036Ah0.a();
    }

    public final void a() {
        boolean z = this.k == 7;
        InterfaceC11007wC1 interfaceC11007wC1 = z ? this.f : this.c;
        InterfaceC11007wC1 interfaceC11007wC12 = z ? this.g : this.d;
        InterfaceC12197zh0 interfaceC12197zh0 = z ? this.h : this.e;
        this.b.h = interfaceC11007wC1;
        interfaceC11007wC1.a(interfaceC11007wC12).a(interfaceC12197zh0).a(this.i).a(this.l);
    }
}
