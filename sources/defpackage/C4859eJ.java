package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4859eJ extends O0 {
    public final /* synthetic */ CheckableImageButton d;

    public C4859eJ(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    @Override // defpackage.O0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        CheckableImageButton checkableImageButton = this.d;
        boolean z = checkableImageButton.j;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
