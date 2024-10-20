package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XZ extends O0 {
    public final /* synthetic */ YZ d;

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        YZ yz = this.d;
        yz.getClass();
        yz.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
    }

    public XZ(YZ yz) {
        this.d = yz;
    }

    @Override // defpackage.O0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        boolean a;
        a = super.a(view, accessibilityEvent);
        return a;
    }

    @Override // defpackage.O0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super/*mF0*/.c(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        boolean f;
        f = super.f(viewGroup, view, accessibilityEvent);
        return f;
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        boolean g;
        g = super.g(view, i, bundle);
        return g;
    }

    @Override // defpackage.O0
    public final void h(View view, int i) {
        super.h(view, i);
    }

    @Override // defpackage.O0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        super.i(view, accessibilityEvent);
    }
}
