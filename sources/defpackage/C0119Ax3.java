package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ax3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119Ax3 extends LinearLayout {
    public ValueAnimator a;
    public final /* synthetic */ TabLayout g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119Ax3(TabLayout tabLayout, Context context) {
        super(context);
        this.g = tabLayout;
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.g;
        boolean z = true;
        if (tabLayout.A == 1 || tabLayout.D == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) Ee4.a(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.A = 0;
                tabLayout.w(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            c(this.g.j(), -1, false);
        } else {
            a();
        }
    }

    public final void a() {
        TabLayout tabLayout = this.g;
        View childAt = getChildAt(tabLayout.j());
        C10237tx3 c10237tx3 = tabLayout.H;
        Drawable drawable = tabLayout.q;
        c10237tx3.getClass();
        RectF a = C10237tx3.a(tabLayout, childAt);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }

    public final void b(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            TabLayout tabLayout = this.g;
            tabLayout.H.b(tabLayout, view, view2, f, tabLayout.q);
        } else {
            TabLayout tabLayout2 = this.g;
            Drawable drawable = tabLayout2.q;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.q.getBounds().bottom);
        }
        WeakHashMap weakHashMap = Ec4.a;
        postInvalidateOnAnimation();
    }

    public final void c(int i, int i2, boolean z) {
        View childAt = getChildAt(this.g.j());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        C12295zx3 c12295zx3 = new C12295zx3(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0270Cc.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c12295zx3);
            valueAnimator.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener(c12295zx3);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.g;
        int height2 = tabLayout.q.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.q.getIntrinsicHeight();
        }
        int i = tabLayout.C;
        if (i == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                height2 = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.q.getBounds().width() > 0) {
            Rect bounds = tabLayout.q.getBounds();
            tabLayout.q.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.q.draw(canvas);
        }
        super.draw(canvas);
    }
}
