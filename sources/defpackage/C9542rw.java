package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9542rw extends View.AccessibilityDelegate {
    public final /* synthetic */ C0110Aw a;
    public final /* synthetic */ ImageView b;

    public C9542rw(C0110Aw c0110Aw, ImageView imageView) {
        this.a = c0110Aw;
        this.b = imageView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        String str;
        if (i == 16 && (str = this.a.d) != null) {
            this.b.announceForAccessibility(str);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
