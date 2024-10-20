package com.google.common.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b {
    static final b c;
    static final b d;
    final boolean a;
    final Throwable b;

    static {
        if (n.a) {
            d = null;
            c = null;
        } else {
            d = new b(false, null);
            c = new b(true, null);
        }
    }

    public b(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
