package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8198o1 extends C7854n1 {
    public C8198o1(C8541p1 c8541p1) {
        super(c8541p1);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.b(i, new AccessibilityNodeInfoCompat(accessibilityNodeInfo), str, bundle);
    }
}
