package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K0 extends ClickableSpan {
    public final int a;
    public final AccessibilityNodeInfoCompat g;
    public final int h;

    public K0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2) {
        this.a = i;
        this.g = accessibilityNodeInfoCompat;
        this.h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.g.a.performAction(this.h, bundle);
    }
}
