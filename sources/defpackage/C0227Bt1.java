package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bt1 */
/* loaded from: classes.dex */
public final class C0227Bt1 extends AbstractC0097At1 {
    public final C0617Et1 j;
    public final C0357Ct1 k;
    public final BJ l;
    public final Object m;

    @Override // defpackage.AbstractC0097At1
    public final void m(Throwable th) {
        C0617Et1 c0617Et1 = this.j;
        c0617Et1.getClass();
        BJ E = C0617Et1.E(this.l);
        C0357Ct1 c0357Ct1 = this.k;
        Object obj = this.m;
        if (E == null || !c0617Et1.L(c0357Ct1, E, obj)) {
            c0617Et1.q(c0357Ct1, obj);
        }
    }

    @Override // defpackage.InterfaceC7670mV0
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        m((Throwable) obj);
        return C8546p14.a;
    }

    public C0227Bt1(C0617Et1 c0617Et1, C0357Ct1 c0357Ct1, BJ bj, Object obj) {
        this.j = c0617Et1;
        this.k = c0357Ct1;
        this.l = bj;
        this.m = obj;
    }
}
