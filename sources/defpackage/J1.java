package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class J1 {
    public static boolean a(AccessibilityManager accessibilityManager) {
        if (!Boolean.getBoolean("is_accessibility_enabled")) {
            if (!((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
        }
        return true;
    }
}
