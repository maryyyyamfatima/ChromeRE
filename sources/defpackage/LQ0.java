package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LQ0 implements QQ0, InterfaceC6416iq0 {
    public final InterfaceC10434uZ a;
    public InterfaceC0724Fo3 g;

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
    }

    public LQ0(InterfaceC10434uZ interfaceC10434uZ) {
        this.a = interfaceC10434uZ;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.g, interfaceC0724Fo3)) {
            this.g = interfaceC0724Fo3;
            this.a.c(this);
            interfaceC0724Fo3.a(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        this.g = EnumC0854Go3.a;
        this.a.onError(th);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        this.g = EnumC0854Go3.a;
        this.a.b();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.g.cancel();
        this.g = EnumC0854Go3.a;
    }
}
