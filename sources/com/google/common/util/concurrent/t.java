package com.google.common.util.concurrent;

import defpackage.RD1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class t extends j implements Runnable {
    public RD1 j;

    public t(RD1 rd1) {
        this.j = rd1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RD1 rd1 = this.j;
        if (rd1 != null) {
            v(rd1);
        }
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        RD1 rd1 = this.j;
        if (rd1 == null) {
            return null;
        }
        return "delegate=[" + rd1 + "]";
    }

    @Override // com.google.common.util.concurrent.n
    public final void k() {
        this.j = null;
    }
}
