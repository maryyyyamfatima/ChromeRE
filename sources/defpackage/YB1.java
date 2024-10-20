package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YB1 extends O0 {
    public final O0 d;

    public YB1(TextView textView) {
        O0 xb1;
        if (Build.VERSION.SDK_INT >= 26) {
            xb1 = new O0();
        } else {
            xb1 = new XB1(textView);
        }
        this.d = xb1;
    }

    @Override // defpackage.O0
    public final void h(View view, int i) {
        this.d.h(view, i);
    }

    @Override // defpackage.O0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        this.d.i(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.d.a(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        this.d.e(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        this.d.c(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.d.d(view, accessibilityNodeInfoCompat);
    }

    @Override // defpackage.O0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.d.f(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final C8541p1 b(View view) {
        return this.d.b(view);
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        return this.d.g(view, i, bundle);
    }
}
