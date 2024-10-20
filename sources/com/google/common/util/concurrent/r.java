package com.google.common.util.concurrent;

import defpackage.AbstractRunnableC9172qr1;
import defpackage.C7335lX;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class r extends AbstractRunnableC9172qr1 {
    public final Executor h;
    public final /* synthetic */ C7335lX i;

    public abstract void h(Object obj);

    @Override // defpackage.AbstractRunnableC9172qr1
    public final void a(Throwable th) {
        C7335lX c7335lX = this.i;
        c7335lX.n = null;
        if (th instanceof ExecutionException) {
            c7335lX.u(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c7335lX.cancel(false);
        } else {
            c7335lX.u(th);
        }
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final void b(Object obj) {
        this.i.n = null;
        h(obj);
    }

    public r(C7335lX c7335lX, Executor executor) {
        this.i = c7335lX;
        this.h = executor;
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final boolean d() {
        return this.i.isDone();
    }
}
