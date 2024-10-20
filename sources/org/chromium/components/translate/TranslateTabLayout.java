package org.chromium.components.translate;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.C0249Bx3;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TranslateTabLayout extends TabLayout {
    public C0249Bx3 U;
    public ObjectAnimator V;
    public final int W;
    public final int a0;

    public TranslateTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.U0, 0, R.style.f113340_resource_name_obfuscated_res_0x7f150877);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.a0 = dimensionPixelSize;
        this.W = dimensionPixelSize;
        this.W = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
    }

    public final void x() {
        if (1 >= l() || this.U != null) {
            return;
        }
        C0249Bx3 k = k(1);
        this.U = k;
        View view = k.f;
        if (view instanceof TranslateTabContent) {
            TranslateTabContent translateTabContent = (TranslateTabContent) view;
            translateTabContent.a.setVisibility(4);
            translateTabContent.g.setVisibility(0);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.U != null) {
            return true;
        }
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void d(C0249Bx3 c0249Bx3, int i, boolean z) {
        if (!(c0249Bx3.f instanceof TranslateTabContent)) {
            throw new IllegalArgumentException();
        }
        super.d(c0249Bx3, i, z);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void e(C0249Bx3 c0249Bx3, boolean z) {
        if (!(c0249Bx3.f instanceof TranslateTabContent)) {
            throw new IllegalArgumentException();
        }
        super.e(c0249Bx3, z);
    }
}
