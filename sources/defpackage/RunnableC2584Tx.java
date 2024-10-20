package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2584Tx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentCallbacks2C2974Wx g;

    public RunnableC2584Tx(ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx, int i) {
        this.g = componentCallbacks2C2974Wx;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = this.g;
        C5348fk c5348fk = componentCallbacks2C2974Wx.a;
        c5348fk.getClass();
        AbstractC4851eH1.d("BindingManager", "onTrimMemory: level=%d, size=%d", Integer.valueOf(i), Integer.valueOf(c5348fk.h));
        C5348fk c5348fk2 = componentCallbacks2C2974Wx.a;
        if (c5348fk2.isEmpty()) {
            return;
        }
        if (i <= 5) {
            ComponentCallbacks2C2974Wx.a(componentCallbacks2C2974Wx, 0.25f);
            return;
        }
        if (i <= 10) {
            ComponentCallbacks2C2974Wx.a(componentCallbacks2C2974Wx, 0.5f);
        } else {
            if (i == 20) {
                return;
            }
            c5348fk2.getClass();
            componentCallbacks2C2974Wx.c(c5348fk2.h);
        }
    }
}
