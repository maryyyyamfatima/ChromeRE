package defpackage;

import android.view.View;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC9551rx3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ TabImpl a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        TabImpl tabImpl = this.a;
        tabImpl.F = true;
        tabImpl.a0();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TabImpl tabImpl = this.a;
        tabImpl.F = false;
        tabImpl.a0();
    }

    public ViewOnAttachStateChangeListenerC9551rx3(TabImpl tabImpl) {
        this.a = tabImpl;
    }
}
