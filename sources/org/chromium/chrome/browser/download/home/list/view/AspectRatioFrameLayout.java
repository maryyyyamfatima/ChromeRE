package org.chromium.chrome.browser.download.home.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.C7066kk;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AspectRatioFrameLayout extends FrameLayout {
    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7066kk();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C7066kk();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7066kk(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7066kk(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams() instanceof C7066kk) {
                C7066kk c7066kk = (C7066kk) childAt.getLayoutParams();
                int i4 = c7066kk.f;
                c7066kk.d = i4;
                int i5 = c7066kk.g;
                c7066kk.e = i5;
                float f = c7066kk.a;
                if (f > 0.0f) {
                    boolean z = c7066kk.b || i4 == 0;
                    boolean z2 = c7066kk.c || i5 == 0;
                    if (z) {
                        int i6 = ((FrameLayout.LayoutParams) c7066kk).height;
                        if (i6 == -1) {
                            i6 = size2;
                        }
                        ((FrameLayout.LayoutParams) c7066kk).width = Math.round(i6 * f);
                        c7066kk.b = true;
                    }
                    if (z2) {
                        int i7 = ((FrameLayout.LayoutParams) c7066kk).width;
                        if (i7 == -1) {
                            i7 = size;
                        }
                        ((FrameLayout.LayoutParams) c7066kk).height = Math.round(i7 / f);
                        c7066kk.c = true;
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getLayoutParams() instanceof C7066kk) {
                C7066kk c7066kk = (C7066kk) childAt.getLayoutParams();
                if (c7066kk.b) {
                    ((FrameLayout.LayoutParams) c7066kk).width = c7066kk.d;
                }
                if (c7066kk.c) {
                    ((FrameLayout.LayoutParams) c7066kk).height = c7066kk.e;
                }
                c7066kk.b = false;
                c7066kk.c = false;
            }
        }
    }
}
