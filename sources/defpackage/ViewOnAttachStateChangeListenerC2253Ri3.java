package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ri3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2253Ri3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewOnKeyListenerC2383Si3 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC2253Ri3(ViewOnKeyListenerC2383Si3 viewOnKeyListenerC2383Si3) {
        this.a = viewOnKeyListenerC2383Si3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC2383Si3 viewOnKeyListenerC2383Si3 = this.a;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2383Si3.u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC2383Si3.u = view.getViewTreeObserver();
            }
            viewOnKeyListenerC2383Si3.u.removeGlobalOnLayoutListener(viewOnKeyListenerC2383Si3.o);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
