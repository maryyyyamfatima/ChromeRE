package org.chromium.chrome.browser.findinpage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC8142nr1;
import defpackage.C4198cO0;
import defpackage.C4542dO0;
import defpackage.C4885eO0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FindToolbarTablet extends a {
    public ObjectAnimator E;
    public ObjectAnimator F;
    public ObjectAnimator G;
    public final int H;

    public FindToolbarTablet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = (int) (context.getResources().getDisplayMetrics().density * 8.0f);
    }

    @Override // org.chromium.chrome.browser.findinpage.a, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        Resources resources = getContext().getResources();
        float dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f32200_resource_name_obfuscated_res_0x7f080236) + resources.getDimensionPixelSize(R.dimen.f32210_resource_name_obfuscated_res_0x7f080237);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<FindToolbarTablet, Float>) View.TRANSLATION_X, dimensionPixelOffset, 0.0f);
        this.F = ofFloat;
        ofFloat.setDuration(200L);
        ObjectAnimator objectAnimator = this.F;
        DecelerateInterpolator decelerateInterpolator = AbstractC8142nr1.a;
        objectAnimator.setInterpolator(decelerateInterpolator);
        this.F.addListener(new C4198cO0(this));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<FindToolbarTablet, Float>) View.TRANSLATION_X, 0.0f, dimensionPixelOffset);
        this.G = ofFloat2;
        ofFloat2.setDuration(200L);
        this.G.setInterpolator(decelerateInterpolator);
        this.G.addListener(new C4542dO0(this));
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final void g() {
        if (this.E == this.F) {
            return;
        }
        B(true);
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final void i(boolean z) {
        if (this.E != this.G) {
            B(false);
        }
        super.i(z);
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final void e(Rect rect) {
        float f = getContext().getResources().getDisplayMetrics().density;
        boolean z = false;
        if (rect != null && rect.intersects((int) (getLeft() / f), 0, (int) (getRight() / f), (int) (getHeight() / f))) {
            z = true;
        }
        A(z);
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final void c() {
        super.c();
        A(false);
    }

    public final void A(boolean z) {
        float f = z ? -(getHeight() - this.H) : 0.0f;
        if (f == getTranslationY()) {
            return;
        }
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            if (objectAnimator == this.F || objectAnimator == this.G) {
                objectAnimator.end();
            } else {
                objectAnimator.cancel();
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<FindToolbarTablet, Float>) View.TRANSLATION_Y, f);
        this.E = ofFloat;
        ofFloat.setDuration(200L);
        this.E.setInterpolator(AbstractC8142nr1.a);
        this.E.addListener(new C4885eO0(this));
        this.r.C(this.E);
    }

    public final void B(boolean z) {
        ObjectAnimator objectAnimator;
        if (z && getVisibility() != 0 && this.E != this.F) {
            View findViewById = getRootView().findViewById(R.id.toolbar);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.topMargin = findViewById.getBottom() - this.H;
            setLayoutParams(layoutParams);
            objectAnimator = this.F;
        } else {
            if (!z && getVisibility() != 8) {
                ObjectAnimator objectAnimator2 = this.E;
                ObjectAnimator objectAnimator3 = this.G;
                if (objectAnimator2 != objectAnimator3) {
                    t(false);
                    objectAnimator = objectAnimator3;
                }
            }
            objectAnimator = null;
        }
        if (objectAnimator != null) {
            ObjectAnimator objectAnimator4 = this.E;
            if (objectAnimator4 != null) {
                objectAnimator4.cancel();
            }
            this.E = objectAnimator;
            this.r.C(objectAnimator);
            postInvalidateOnAnimation();
        }
    }
}
