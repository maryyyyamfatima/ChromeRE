package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qX3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9057qX3 extends AbstractRunnableC9172qr1 {
    public final Callable h;
    public final /* synthetic */ RunnableFutureC9399rX3 i;

    public C9057qX3(RunnableFutureC9399rX3 runnableFutureC9399rX3, Callable callable) {
        this.i = runnableFutureC9399rX3;
        this.h = callable;
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
    public final void b(Object obj) {
        this.i.t(obj);
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
