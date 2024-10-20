package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b5 */
/* loaded from: classes.dex */
public final class C3754b5 implements InterfaceC11778yT1 {
    public final /* synthetic */ C4097c5 a;

    @Override // defpackage.InterfaceC11778yT1
    public final boolean d(BS1 bs1) {
        C4097c5 c4097c5 = this.a;
        if (bs1 == c4097c5.h) {
            return false;
        }
        ((SubMenuC0074Ao3) bs1).A.getClass();
        c4097c5.getClass();
        InterfaceC11778yT1 interfaceC11778yT1 = c4097c5.j;
        if (interfaceC11778yT1 != null) {
            return interfaceC11778yT1.d(bs1);
        }
        return false;
    }

    public C3754b5(C4097c5 c4097c5) {
        this.a = c4097c5;
    }

    @Override // defpackage.InterfaceC11778yT1
    public final void c(BS1 bs1, boolean z) {
        if (bs1 instanceof SubMenuC0074Ao3) {
            bs1.k().c(false);
        }
        InterfaceC11778yT1 interfaceC11778yT1 = this.a.j;
        if (interfaceC11778yT1 != null) {
            interfaceC11778yT1.c(bs1, z);
        }
    }
}
