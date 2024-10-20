package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.chromium.chrome.browser.omnibox.status.StatusView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3178Yl3 extends View.AccessibilityDelegate {
    public final /* synthetic */ StatusView a;

    public C3178Yl3(StatusView statusView) {
        this.a = statusView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        StatusView statusView = this.a;
        if (statusView.r == 0) {
            return;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, statusView.getContext().getResources().getString(statusView.r)));
    }
}
