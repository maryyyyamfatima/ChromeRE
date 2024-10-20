package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pX3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8714pX3 extends AbstractRunnableC9172qr1 {
    public final InterfaceC2909Wk h;
    public final /* synthetic */ RunnableFutureC9399rX3 i;

    @Override // defpackage.AbstractRunnableC9172qr1
    public final void b(Object obj) {
        this.i.v((RD1) obj);
    }

    public C8714pX3(RunnableFutureC9399rX3 runnableFutureC9399rX3, InterfaceC2909Wk interfaceC2909Wk) {
        this.i = runnableFutureC9399rX3;
        this.h = interfaceC2909Wk;
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final boolean d() {
        return this.i.isDone();
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final Object e() {
        return this.h.call();
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final void a(Throwable th) {
        this.i.u(th);
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final String f() {
        return this.h.toString();
    }
}
