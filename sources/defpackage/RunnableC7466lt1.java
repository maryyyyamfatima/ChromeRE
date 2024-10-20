package defpackage;

import J.N;
import org.chromium.base.JavaHandlerThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7466lt1 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ JavaHandlerThread g;

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a.quit();
        N.MYwg$x8E(this.a);
    }

    public RunnableC7466lt1(JavaHandlerThread javaHandlerThread, long j) {
        this.g = javaHandlerThread;
        this.a = j;
    }
}
