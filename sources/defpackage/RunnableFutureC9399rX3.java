package defpackage;

import com.google.common.util.concurrent.s;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rX3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableFutureC9399rX3 extends s implements RunnableFuture {
    public volatile AbstractRunnableC9172qr1 j;

    public RunnableFutureC9399rX3(Callable callable) {
        this.j = new C9057qX3(this, callable);
    }

    public RunnableFutureC9399rX3(InterfaceC2909Wk interfaceC2909Wk) {
        this.j = new C8714pX3(this, interfaceC2909Wk);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC9172qr1 abstractRunnableC9172qr1 = this.j;
        if (abstractRunnableC9172qr1 != null) {
            abstractRunnableC9172qr1.run();
        }
        this.j = null;
    }

    @Override // com.google.common.util.concurrent.n
    public final void k() {
        AbstractRunnableC9172qr1 abstractRunnableC9172qr1;
        if (w() && (abstractRunnableC9172qr1 = this.j) != null) {
            abstractRunnableC9172qr1.c();
        }
        this.j = null;
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        AbstractRunnableC9172qr1 abstractRunnableC9172qr1 = this.j;
        if (abstractRunnableC9172qr1 != null) {
            return "task=[" + abstractRunnableC9172qr1 + "]";
        }
        return super.r();
    }
}
