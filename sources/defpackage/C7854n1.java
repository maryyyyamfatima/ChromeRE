package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7854n1 extends AbstractC7510m1 {
    public C7854n1(C8541p1 c8541p1) {
        super(c8541p1);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        AccessibilityNodeInfoCompat f = this.a.f(i);
        if (f == null) {
            return null;
        }
        return f.a;
    }
}
