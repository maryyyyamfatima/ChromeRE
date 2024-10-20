package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QN2 implements ThreadFactory {
    public final String a = "fonts-androidx";
    public final int g = 10;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new PN2(runnable, this.a, this.g);
    }
}
