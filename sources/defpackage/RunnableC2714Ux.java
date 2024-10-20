package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ux, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2714Ux implements Runnable {
    public final /* synthetic */ ComponentCallbacks2C2974Wx a;

    @Override // java.lang.Runnable
    public final void run() {
        ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = this.a;
        C5348fk c5348fk = componentCallbacks2C2974Wx.a;
        c5348fk.getClass();
        AbstractC4851eH1.d("BindingManager", "onLowMemory: evict %d bindings", Integer.valueOf(c5348fk.h));
        C5348fk c5348fk2 = componentCallbacks2C2974Wx.a;
        c5348fk2.getClass();
        componentCallbacks2C2974Wx.c(c5348fk2.h);
    }

    public RunnableC2714Ux(ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx) {
        this.a = componentCallbacks2C2974Wx;
    }
}
