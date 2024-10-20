package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nw */
/* loaded from: classes.dex */
public final class C1799Nw extends O0 {
    public final /* synthetic */ AbstractC2969Ww d;

    public C1799Nw(AbstractC2969Ww abstractC2969Ww) {
        this.d = abstractC2969Ww;
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.g(view, i, bundle);
        }
        ((C0029Af3) this.d).a(3);
        return true;
    }

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.a(1048576);
        accessibilityNodeInfoCompat.a.setDismissable(true);
    }
}
