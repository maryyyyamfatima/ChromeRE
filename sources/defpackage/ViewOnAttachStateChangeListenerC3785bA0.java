package defpackage;

import android.view.View;
import java.util.Iterator;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bA0 */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3785bA0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C4128cA0 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C4128cA0 c4128cA0 = this.a;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c4128cA0.b;
        Iterator it = abstractC11276wz3.a.iterator();
        while (it.hasNext()) {
            ((TabModel) it.next()).i(c4128cA0.d);
        }
        abstractC11276wz3.s(c4128cA0.e);
    }

    public ViewOnAttachStateChangeListenerC3785bA0(C4128cA0 c4128cA0) {
        this.a = c4128cA0;
    }
}
