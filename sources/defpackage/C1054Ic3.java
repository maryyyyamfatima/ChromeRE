package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ic3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054Ic3 implements InterfaceC1314Kc3 {
    public final InterfaceC1314Kc3 a;
    public final DV0 g;

    public C1054Ic3(InterfaceC1314Kc3 interfaceC1314Kc3, DV0 dv0) {
        this.a = interfaceC1314Kc3;
        this.g = dv0;
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        this.a.c(interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void a(Object obj) {
        try {
            Object apply = this.g.apply(obj);
            Q82.a(apply, "The mapper function returned a null value.");
            this.a.a(apply);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
