package defpackage;

import android.view.View;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cQ3 */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC4211cQ3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C9707sQ3 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C9707sQ3 c9707sQ3 = this.a;
        c9707sQ3.j((Tab) c9707sQ3.y.g);
    }

    public ViewOnAttachStateChangeListenerC4211cQ3(C9707sQ3 c9707sQ3) {
        this.a = c9707sQ3;
    }
}
