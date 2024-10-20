package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Wd4 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    @Override // defpackage.AbstractC12077zK2
    public final boolean q0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void G0(LK2 lk2, int[] iArr) {
        int height;
        int paddingBottom;
        ViewPager2 viewPager2 = this.E;
        int i = viewPager2.u;
        if (i != -1) {
            C4630de4 c4630de4 = viewPager2.o;
            if (!(viewPager2.l.p == 1)) {
                height = c4630de4.getWidth() - c4630de4.getPaddingLeft();
                paddingBottom = c4630de4.getPaddingRight();
            } else {
                height = c4630de4.getHeight() - c4630de4.getPaddingTop();
                paddingBottom = c4630de4.getPaddingBottom();
            }
            int i2 = (height - paddingBottom) * i;
            iArr[0] = i2;
            iArr[1] = i2;
            return;
        }
        super.G0(lk2, iArr);
    }

    public Wd4(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean l0(b bVar, LK2 lk2, int i, Bundle bundle) {
        this.E.v.getClass();
        return super.l0(bVar, lk2, i, bundle);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void Y(b bVar, LK2 lk2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.Y(bVar, lk2, accessibilityNodeInfoCompat);
        this.E.v.getClass();
    }

    @Override // defpackage.AbstractC12077zK2
    public final void a0(b bVar, LK2 lk2, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.E.v.d(view, accessibilityNodeInfoCompat);
    }
}
