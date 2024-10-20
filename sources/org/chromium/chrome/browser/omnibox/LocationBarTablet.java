package org.chromium.chrome.browser.omnibox;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.android.chrome.R;
import defpackage.AbstractC4159cG1;
import org.chromium.ui.base.LocalizationUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LocationBarTablet extends AbstractC4159cG1 {
    public float A;
    public float B;
    public int C;
    public View q;
    public View r;
    public View s;
    public View[] t;
    public final Rect u;
    public final int v;
    public final int w;
    public final int x;
    public boolean y;
    public float z;

    public LocationBarTablet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new Rect();
        this.v = getResources().getDimensionPixelOffset(R.dimen.f42260_resource_name_obfuscated_res_0x7f0807ff) * 3;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f34870_resource_name_obfuscated_res_0x7f0803bf);
        this.w = dimensionPixelOffset;
        this.x = dimensionPixelOffset;
    }

    @Override // defpackage.AbstractC4159cG1, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.q = findViewById(R.id.location_bar_status_icon);
        this.r = findViewById(R.id.bookmark_button);
        this.s = findViewById(R.id.save_offline_button);
        LinearLayout linearLayout = this.o;
        boolean z = linearLayout.getLayoutDirection() == 1;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f34960_resource_name_obfuscated_res_0x7f0803c8);
        int paddingLeft = z ? dimensionPixelSize : linearLayout.getPaddingLeft();
        int paddingTop = linearLayout.getPaddingTop();
        if (z) {
            dimensionPixelSize = linearLayout.getRight();
        }
        linearLayout.setPadding(paddingLeft, paddingTop, dimensionPixelSize, linearLayout.getPaddingBottom());
        this.t = new View[]{this.i, this.a};
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View[] viewArr = this.t;
        if (viewArr == null) {
            return true;
        }
        View view = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (View view2 : viewArr) {
            if (view2.isShown()) {
                int width = view2.getWidth();
                int height = view2.getHeight();
                Rect rect = this.u;
                rect.set(0, 0, width, height);
                offsetDescendantRectToMyCoords(view2, rect);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f4 = rect.left;
                float f5 = rect.right;
                float f6 = x < f4 ? f4 - x : x > f5 ? f5 - x : 0.0f;
                float f7 = rect.top;
                float f8 = rect.bottom;
                float f9 = y < f7 ? f7 - y : y > f8 ? f8 - y : 0.0f;
                float abs = Math.abs(f9) + Math.abs(f6);
                if (view == null || abs < f3) {
                    f = x + f6;
                    f2 = y + f9;
                    view = view2;
                    f3 = abs;
                }
            }
        }
        if (view == null) {
            return false;
        }
        motionEvent.setLocation(f, f2);
        return view.onTouchEvent(motionEvent);
    }

    @Override // defpackage.AbstractC4159cG1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != measuredWidth) {
            e(getMeasuredWidth());
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A = i;
        this.B = i3;
        if (this.y) {
            g(this.z);
        }
    }

    public final void f() {
        ImageButton imageButton = this.g;
        imageButton.setTranslationX(0.0f);
        ImageButton imageButton2 = this.h;
        imageButton2.setTranslationX(0.0f);
        ImageButton imageButton3 = this.a;
        imageButton3.setTranslationX(0.0f);
        this.r.setTranslationX(0.0f);
        this.s.setTranslationX(0.0f);
        this.q.setTranslationX(0.0f);
        this.i.setTranslationX(0.0f);
        imageButton.setAlpha(1.0f);
        imageButton2.setAlpha(1.0f);
        imageButton3.setAlpha(1.0f);
        this.r.setAlpha(1.0f);
        this.s.setAlpha(1.0f);
    }

    public final void g(float f) {
        this.z = f;
        float f2 = (this.v + this.C) * f;
        if (LocalizationUtils.isLayoutRtl()) {
            setRight((int) (this.B + f2));
        } else {
            setLeft((int) (this.A - f2));
        }
        int i = (int) (this.w * f);
        if (this.h.getVisibility() == 0) {
            i += (int) (this.x * f);
        }
        int i2 = (int) f2;
        int layoutDirection = getLayoutDirection();
        ImageButton imageButton = this.a;
        if (layoutDirection != 1) {
            if (this.s.getVisibility() == 0) {
                this.s.setTranslationX(i2);
            } else {
                this.g.setTranslationX(i2);
            }
            if (imageButton.getVisibility() == 0) {
                imageButton.setTranslationX(i2 + i);
                return;
            } else {
                this.r.setTranslationX(i2);
                return;
            }
        }
        float f3 = i2;
        this.q.setTranslationX(f3);
        this.i.setTranslationX(f3);
        if (imageButton.getVisibility() == 0) {
            imageButton.setTranslationX(-i);
        }
    }
}
