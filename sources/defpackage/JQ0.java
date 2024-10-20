package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JQ0 implements QQ0, CG2 {
    public final InterfaceC0334Co3 a;
    public InterfaceC0724Fo3 g;

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
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
    public final Object poll() {
        return null;
    }

    public JQ0(InterfaceC0334Co3 interfaceC0334Co3) {
        this.a = interfaceC0334Co3;
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
        this.a.onError(th);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        this.g.cancel();
    }
}
