package defpackage;

import android.view.View;
import org.chromium.chrome.browser.infobar.InfoBarContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ol1 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC8450ol1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ InfoBarContainer a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0967Hl1 c0967Hl1 = this.a.q;
        if (c0967Hl1 == null) {
            return;
        }
        c0967Hl1.g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C0967Hl1 c0967Hl1 = this.a.q;
        if (c0967Hl1 == null) {
            return;
        }
        c0967Hl1.c();
    }

    public ViewOnAttachStateChangeListenerC8450ol1(InfoBarContainer infoBarContainer) {
        this.a = infoBarContainer;
    }
}
