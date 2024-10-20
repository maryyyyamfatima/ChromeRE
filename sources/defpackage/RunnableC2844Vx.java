package defpackage;

import org.chromium.base.library_loader.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vx */
/* loaded from: classes2.dex */
public final class RunnableC2844Vx implements Runnable {
    public final /* synthetic */ ComponentCallbacks2C2974Wx a;

    @Override // java.lang.Runnable
    public final void run() {
        ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = this.a;
        C5348fk c5348fk = componentCallbacks2C2974Wx.a;
        c5348fk.getClass();
        AbstractC4851eH1.d("BindingManager", "Release moderate connections: %d", Integer.valueOf(c5348fk.h));
        boolean f = b.n.f();
        C5348fk c5348fk2 = componentCallbacks2C2974Wx.a;
        if (f) {
            c5348fk2.getClass();
            EI2.e(c5348fk2.h, "Android.ModerateBindingCount");
        }
        c5348fk2.getClass();
        componentCallbacks2C2974Wx.c(c5348fk2.h);
    }

    public RunnableC2844Vx(ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx) {
        this.a = componentCallbacks2C2974Wx;
    }
}
