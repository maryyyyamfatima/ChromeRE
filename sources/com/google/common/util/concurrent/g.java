package com.google.common.util.concurrent;

import defpackage.RD1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    final n a;
    final RD1 g;

    public g(n nVar, RD1 rd1) {
        this.a = nVar;
        this.g = rd1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.a.value;
        if (obj != this) {
            return;
        }
        if (n.h.b(this.a, this, n.o(this.g))) {
            n.m(this.a);
        }
    }
}
