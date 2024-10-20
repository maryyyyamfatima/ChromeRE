package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7510m1 extends AccessibilityNodeProvider {
    public final C8541p1 a;

    public AbstractC7510m1(C8541p1 c8541p1) {
        this.a = c8541p1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfoCompat d = this.a.d(i);
        if (d == null) {
            return null;
        }
        return d.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        List e = this.a.e();
        if (e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = e.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((AccessibilityNodeInfoCompat) e.get(i2)).a);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.h(i, i2, bundle);
    }
}
