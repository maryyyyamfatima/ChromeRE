package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cc3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274Cc3 implements InterfaceC1314Kc3 {
    public final InterfaceC1314Kc3 a;
    public final /* synthetic */ C0404Dc3 g;

    public C0274Cc3(C0404Dc3 c0404Dc3, InterfaceC1314Kc3 interfaceC1314Kc3) {
        this.g = c0404Dc3;
        this.a = interfaceC1314Kc3;
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        this.a.c(interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void a(Object obj) {
        InterfaceC1314Kc3 interfaceC1314Kc3 = this.a;
        try {
            this.g.b.accept(obj);
            interfaceC1314Kc3.a(obj);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            interfaceC1314Kc3.onError(th);
        }
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
