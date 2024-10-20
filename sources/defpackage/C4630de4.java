package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: de4 */
/* loaded from: classes.dex */
public final class C4630de4 extends RecyclerView {
    public final /* synthetic */ ViewPager2 P0;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.P0.t && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.P0.t && super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4630de4(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.P0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.P0.v.getClass();
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.P0;
        accessibilityEvent.setFromIndex(viewPager2.i);
        accessibilityEvent.setToIndex(viewPager2.i);
        accessibilityEvent.setSource(viewPager2.v.d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }
}
