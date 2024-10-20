package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XA0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ZA0 a;

    public XA0(ZA0 za0) {
        this.a = za0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        ZA0 za0 = this.a;
        if (za0.x == null || (accessibilityManager = za0.w) == null) {
            return;
        }
        WeakHashMap weakHashMap = Ec4.a;
        if (za0.isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(new W0(za0.x));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        ZA0 za0 = this.a;
        C10560uu0 c10560uu0 = za0.x;
        if (c10560uu0 == null || (accessibilityManager = za0.w) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(new W0(c10560uu0));
    }
}
