package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8541p1 {
    public final Object a;

    public void b(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    public AccessibilityNodeInfoCompat d(int i) {
        return null;
    }

    public List e() {
        return null;
    }

    public AccessibilityNodeInfoCompat f(int i) {
        return null;
    }

    public boolean h(int i, int i2, Bundle bundle) {
        return false;
    }

    public C8541p1() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new C8198o1(this);
        } else {
            this.a = new C7854n1(this);
        }
    }

    public C8541p1(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }
}
