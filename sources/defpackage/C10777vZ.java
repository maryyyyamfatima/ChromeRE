package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10777vZ implements InterfaceC10434uZ {
    public final InterfaceC10434uZ a;
    public final /* synthetic */ C11120wZ g;

    public C10777vZ(C11120wZ c11120wZ, InterfaceC10434uZ interfaceC10434uZ) {
        this.g = c11120wZ;
        this.a = interfaceC10434uZ;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        InterfaceC10434uZ interfaceC10434uZ = this.a;
        try {
            if (this.g.b.test(th)) {
                interfaceC10434uZ.b();
            } else {
                interfaceC10434uZ.onError(th);
            }
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            interfaceC10434uZ.onError(new M10(th, th2));
        }
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        this.a.c(interfaceC6416iq0);
    }
}
