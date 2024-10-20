package defpackage;

import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gp4 */
/* loaded from: classes2.dex */
public final class C5727gp4 {
    public final AccessibilityManagerTouchExplorationStateChangeListenerC5383fp4 a;
    public final /* synthetic */ WindowAndroid b;

    public C5727gp4(C10285u6 c10285u6) {
        this.b = c10285u6;
        AccessibilityManagerTouchExplorationStateChangeListenerC5383fp4 accessibilityManagerTouchExplorationStateChangeListenerC5383fp4 = new AccessibilityManagerTouchExplorationStateChangeListenerC5383fp4(this);
        this.a = accessibilityManagerTouchExplorationStateChangeListenerC5383fp4;
        c10285u6.m.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC5383fp4);
    }
}
