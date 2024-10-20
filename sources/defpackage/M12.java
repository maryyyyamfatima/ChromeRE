package defpackage;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M12 extends O0 {
    public final /* synthetic */ NavigationMenuItemView d;

    public M12(NavigationMenuItemView navigationMenuItemView) {
        this.d = navigationMenuItemView;
    }

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.a.setCheckable(this.d.B);
    }
}
