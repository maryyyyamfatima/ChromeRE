package com.google.common.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class m {
    static final m a = new m(0);
    volatile m next;
    volatile Thread thread;

    public m(int i) {
    }

    public m() {
        n.h.g(this, Thread.currentThread());
    }
}
