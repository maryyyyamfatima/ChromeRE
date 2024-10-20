package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LO0 implements Runnable {
    public final /* synthetic */ ViewTreeObserver.OnDrawListener a;
    public final /* synthetic */ MO0 g;

    public LO0(MO0 mo0, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.g = mo0;
        this.a = onDrawListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O51 a = O51.a();
        a.getClass();
        AbstractC10296u74.a();
        a.f.set(true);
        this.g.g.g = true;
        View view = this.g.a;
        view.getViewTreeObserver().removeOnDrawListener(this.a);
        this.g.g.a.clear();
    }
}
