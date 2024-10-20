package defpackage;

import android.view.accessibility.AccessibilityManager;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fp4 */
/* loaded from: classes2.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC5383fp4 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ C5727gp4 a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC5383fp4(C5727gp4 c5727gp4) {
        this.a = c5727gp4;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C5727gp4 c5727gp4 = this.a;
        WindowAndroid windowAndroid = c5727gp4.b;
        windowAndroid.o = windowAndroid.m.isTouchExplorationEnabled();
        c5727gp4.b.x();
    }
}
