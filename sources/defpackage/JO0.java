package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JO0 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ O51 a;
    public final /* synthetic */ KO0 g;

    public JO0(KO0 ko0, O51 o51) {
        this.g = ko0;
        this.a = o51;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.g.g = true;
        this.a.getClass();
        AbstractC10296u74.a();
        if (!r0.f.get()) {
            AbstractC10296u74.h(new IO0(this));
        }
    }
}
