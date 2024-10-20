package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class T23 extends View.AccessibilityDelegate {
    public final /* synthetic */ U23 a;

    public T23(U23 u23) {
        this.a = u23;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        U23 u23 = this.a;
        C7526m33 c7526m33 = u23.h;
        accessibilityNodeInfo.setCheckable((c7526m33 == null || !c7526m33.e() || u23.i == null) ? false : true);
        accessibilityNodeInfo.setChecked(u23.isChecked());
    }
}
