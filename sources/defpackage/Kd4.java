package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.ViewPager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Kd4 extends O0 {
    public final /* synthetic */ ViewPager d;

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.m("androidx.viewpager.widget.ViewPager");
        ViewPager viewPager = this.d;
        AbstractC3965bi2 abstractC3965bi2 = viewPager.j;
        accessibilityNodeInfoCompat.q(abstractC3965bi2 != null && abstractC3965bi2.f() > 1);
        if (viewPager.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.a(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.a(8192);
        }
    }

    public Kd4(ViewPager viewPager) {
        this.d = viewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:            if (r0.f() > 1) goto L72;     */
    @Override // defpackage.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.c(r3, r4)
            java.lang.String r3 = "androidx.viewpager.widget.ViewPager"
            r4.setClassName(r3)
            androidx.viewpager.widget.ViewPager r3 = r2.d
            bi2 r0 = r3.j
            if (r0 == 0) goto L16
            int r0 = r0.f()
            r1 = 1
            if (r0 <= r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            r4.setScrollable(r1)
            int r0 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L37
            bi2 r0 = r3.j
            if (r0 == 0) goto L37
            int r0 = r0.f()
            r4.setItemCount(r0)
            int r0 = r3.k
            r4.setFromIndex(r0)
            int r3 = r3.k
            r4.setToIndex(r3)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Kd4.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        ViewPager viewPager = this.d;
        if (i == 4096) {
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.w(viewPager.k + 1);
            return true;
        }
        if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager.w(viewPager.k - 1);
        return true;
    }
}
