package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2123Qi3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewOnKeyListenerC2383Si3 a;

    public ViewTreeObserverOnGlobalLayoutListenerC2123Qi3(ViewOnKeyListenerC2383Si3 viewOnKeyListenerC2383Si3) {
        this.a = viewOnKeyListenerC2383Si3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC2383Si3 viewOnKeyListenerC2383Si3 = this.a;
        if (!viewOnKeyListenerC2383Si3.a() || viewOnKeyListenerC2383Si3.n.D) {
            return;
        }
        View view = viewOnKeyListenerC2383Si3.s;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC2383Si3.dismiss();
        } else {
            viewOnKeyListenerC2383Si3.n.b();
        }
    }
}
