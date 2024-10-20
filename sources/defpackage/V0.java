package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V0 implements AccessibilityManager.AccessibilityStateChangeListener {
    public final U0 a;

    public V0(C11017wE1 c11017wE1) {
        this.a = c11017wE1;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V0) {
            return this.a.equals(((V0) obj).a);
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        C11017wE1 c11017wE1 = (C11017wE1) this.a;
        c11017wE1.getClass();
        synchronized (J1.class) {
        }
        C11703yE1 c11703yE1 = (C11703yE1) c11017wE1.a.get();
        if (c11703yE1 == null) {
            return;
        }
        c11703yE1.n(z);
        c11703yE1.I = true;
        c11703yE1.requestLayout();
    }
}
