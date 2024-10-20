package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zo0 */
/* loaded from: classes.dex */
public final class C3320Zo0 implements InterfaceC9298rD2 {
    public final Wb4 a;

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
        throw null;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        C3661ap0 c3661ap0 = (C3661ap0) obj;
        Wb4 wb4 = c3661ap0.l ? this.a : null;
        if (wb4 != null) {
            C8908q5 c8908q5 = c3661ap0.m;
            if (c8908q5 == null) {
                c8908q5 = C8908q5.l;
            }
            C3190Yo0 c3190Yo0 = new C3190Yo0(wb4, c8908q5);
            interfaceC8177nx0.c(c3190Yo0);
            interfaceC8177nx0.d(c3190Yo0);
        }
    }

    public C3320Zo0(Wb4 wb4) {
        this.a = wb4;
    }

    @Override // defpackage.InterfaceC9298rD2
    public final OX0 a() {
        return C3661ap0.r;
    }
}
