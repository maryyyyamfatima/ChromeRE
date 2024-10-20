package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e {
    static final e c = new e();
    final Runnable a;
    final Executor b;
    e next;

    public e(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }

    public e() {
        this.a = null;
        this.b = null;
    }
}
