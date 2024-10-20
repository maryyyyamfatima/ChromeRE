package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10021tL extends H1 {
    public static C10021tL f;
    public C9678sL e;

    public static C10021tL f() {
        if (f == null) {
            f = new C10021tL();
        }
        return f;
    }

    @Override // defpackage.H1
    public final boolean c() {
        if (this.e == null) {
            C9678sL c9678sL = new C9678sL(this);
            this.e = c9678sL;
            ApplicationStatus.f(c9678sL);
        }
        if (this.d == null) {
            this.d = new F1(this);
            AccessibilityManager b = H1.b();
            b.addAccessibilityStateChangeListener(this.d);
            b.addTouchExplorationStateChangeListener(this.d);
        }
        Boolean bool = this.a;
        if (bool != null) {
            return bool.booleanValue();
        }
        TraceEvent.b("AccessibilityManager::isAccessibilityEnabled", null);
        AccessibilityManager b2 = H1.b();
        boolean z = true;
        boolean z2 = b2 != null && b2.isEnabled() && b2.isTouchExplorationEnabled();
        this.b = Boolean.valueOf(z2);
        if (b2 != null && b2.isEnabled() && !z2) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : b2.getEnabledAccessibilityServiceList(-1)) {
                if (Build.VERSION.SDK_INT < 24 ? !(accessibilityServiceInfo.getResolveInfo() == null || !accessibilityServiceInfo.getResolveInfo().toString().contains("switchaccess")) : (accessibilityServiceInfo.getCapabilities() & 32) != 0) {
                    break;
                }
            }
        }
        z = z2;
        this.a = Boolean.valueOf(z);
        TraceEvent.c("AccessibilityManager::isAccessibilityEnabled");
        return this.a.booleanValue();
    }

    @Override // defpackage.H1
    public final boolean d() {
        if (this.e == null) {
            C9678sL c9678sL = new C9678sL(this);
            this.e = c9678sL;
            ApplicationStatus.f(c9678sL);
        }
        if (this.d == null) {
            this.d = new F1(this);
            AccessibilityManager b = H1.b();
            b.addAccessibilityStateChangeListener(this.d);
            b.addTouchExplorationStateChangeListener(this.d);
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        TraceEvent.b("AccessibilityManager::isTouchExplorationEnabled", null);
        AccessibilityManager b2 = H1.b();
        this.b = Boolean.valueOf(b2 != null && b2.isEnabled() && b2.isTouchExplorationEnabled());
        TraceEvent.c("AccessibilityManager::isTouchExplorationEnabled");
        return this.b.booleanValue();
    }
}
