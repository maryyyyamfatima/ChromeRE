package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XK implements Runnable {
    public final /* synthetic */ YK a;

    public XK(YK yk) {
        this.a = yk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long nanoTime = System.nanoTime();
        YK yk = this.a;
        yk.c.getAndSet(null);
        try {
            yk.a(nanoTime);
        } finally {
        }
    }
}
