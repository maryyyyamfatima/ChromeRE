package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eo3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594Eo3 implements InterfaceC10434uZ, InterfaceC0724Fo3 {
    public final InterfaceC0334Co3 a;
    public InterfaceC6416iq0 g;

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
    }

    public C0594Eo3(InterfaceC0334Co3 interfaceC0334Co3) {
        this.a = interfaceC0334Co3;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.g, interfaceC6416iq0)) {
            this.g = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        this.g.dispose();
    }
}
