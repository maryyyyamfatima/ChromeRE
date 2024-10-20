package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5205fJ1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C4518dJ1 a;
    public final /* synthetic */ C5893hJ1 g;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC5205fJ1(C5893hJ1 c5893hJ1, C4518dJ1 c4518dJ1) {
        this.g = c5893hJ1;
        this.a = c4518dJ1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        synchronized (this.g.e) {
            this.g.a(this.a.k);
            this.g.a.remove(this.a.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
