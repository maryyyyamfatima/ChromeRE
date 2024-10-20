package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GZ extends AbstractC5770gx implements InterfaceC10434uZ {
    public final InterfaceC11128wa2 a;
    public InterfaceC6416iq0 g;

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        return i & 2;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final /* bridge */ /* synthetic */ Object poll() {
        return null;
    }

    public GZ(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
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

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.g.dispose();
    }
}
