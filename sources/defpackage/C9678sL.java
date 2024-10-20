package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityManager;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9678sL implements InterfaceC11179wj {
    public final /* synthetic */ C10021tL a;

    public C9678sL(C10021tL c10021tL) {
        this.a = c10021tL;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        boolean isEmpty = ApplicationStatus.a.isEmpty();
        C10021tL c10021tL = this.a;
        if (!isEmpty) {
            c10021tL.getClass();
            if (i == 3) {
                c10021tL.e();
                return;
            }
            return;
        }
        C12157za2 c12157za2 = c10021tL.c;
        if (c12157za2 != null) {
            c12157za2.clear();
        }
        if (c10021tL.d != null) {
            AccessibilityManager b = H1.b();
            b.removeAccessibilityStateChangeListener(c10021tL.d);
            b.removeTouchExplorationStateChangeListener(c10021tL.d);
        }
        C9678sL c9678sL = c10021tL.e;
        if (c9678sL != null) {
            ApplicationStatus.h(c9678sL);
            c10021tL.e = null;
        }
    }
}
