package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v70 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC10635v70 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ContextualSearchManager b;

    public ViewTreeObserverOnGlobalFocusChangeListenerC10635v70(ContextualSearchManager contextualSearchManager, View view) {
        this.b = contextualSearchManager;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        View view3 = this.a;
        if (view3 == null || !view3.hasFocus()) {
            return;
        }
        this.b.i(0);
    }
}
