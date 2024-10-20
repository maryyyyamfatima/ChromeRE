package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7892n71 extends O0 {
    public final /* synthetic */ C8236o71 d;

    public C7892n71(C8236o71 c8236o71) {
        this.d = c8236o71;
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        if (i == 262144 || i == 524288) {
            return this.d.performClick();
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C5792h1 c5792h1;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        if (this.d.h) {
            c5792h1 = C5792h1.u;
        } else {
            c5792h1 = C5792h1.v;
        }
        accessibilityNodeInfoCompat.b(new C5792h1(1, ((AccessibilityNodeInfo.AccessibilityAction) c5792h1.a).getLabel()));
        accessibilityNodeInfoCompat.b(c5792h1);
    }
}
