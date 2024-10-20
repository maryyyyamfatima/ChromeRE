package com.google.common.util.concurrent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class w extends j implements Runnable {
    public final Runnable j;

    public w(Runnable runnable) {
        this.j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.j.run();
        } catch (Error | RuntimeException e) {
            u(e);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        return "task=[" + this.j + "]";
    }
}
