package defpackage;

import android.view.View;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pe */
/* loaded from: classes.dex */
public final class C1969Pe extends O0 {
    public final /* synthetic */ AppBarLayout.Behavior d;

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.q(this.d.p);
        accessibilityNodeInfoCompat.m(ScrollView.class.getName());
    }

    public C1969Pe(AppBarLayout.Behavior behavior) {
        this.d = behavior;
    }
}
