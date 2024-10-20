package defpackage;

import android.app.Application;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N5 implements Runnable {
    public final /* synthetic */ Application a;
    public final /* synthetic */ P5 g;

    public N5(Application application, P5 p5) {
        this.a = application;
        this.g = p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.g);
    }
}
