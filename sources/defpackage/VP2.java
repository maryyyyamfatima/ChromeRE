package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VP2 implements Runnable {
    public final /* synthetic */ WP2 a;

    @Override // java.lang.Runnable
    public final void run() {
        WP2 wp2 = this.a;
        wp2.c.run();
        wp2.c = null;
        wp2.b = null;
    }

    public VP2(WP2 wp2) {
        this.a = wp2;
    }
}
