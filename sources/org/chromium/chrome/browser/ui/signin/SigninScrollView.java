package org.chromium.chrome.browser.ui.signin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC0139Bb3;
import defpackage.ViewTreeObserverOnScrollChangedListenerC0269Cb3;
import org.chromium.chrome.browser.ui.signin.SigninScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SigninScrollView extends ScrollView {
    public static final /* synthetic */ int i = 0;
    public final ViewTreeObserverOnGlobalLayoutListenerC0139Bb3 a;
    public final ViewTreeObserverOnScrollChangedListenerC0269Cb3 g;
    public Runnable h;

    @Override // android.widget.ScrollView, android.view.View
    public final float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bb3] */
    /* JADX WARN: Type inference failed for: r1v2, types: [Cb3] */
    public SigninScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Bb3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i2 = SigninScrollView.i;
                SigninScrollView.this.a();
            }
        };
        this.g = new ViewTreeObserver.OnScrollChangedListener() { // from class: Cb3
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i2 = SigninScrollView.i;
                SigninScrollView.this.a();
            }
        };
    }

    public final void a() {
        if (this.h == null) {
            return;
        }
        if (getChildCount() == 0) {
            this.h.run();
            return;
        }
        if (getScrollY() + getHeight() < getChildAt(getChildCount() - 1).getBottom()) {
            return;
        }
        this.h.run();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.h != null) {
            this.h = null;
            getViewTreeObserver().removeOnGlobalLayoutListener(this.a);
            getViewTreeObserver().removeOnScrollChangedListener(this.g);
        }
        super.onDetachedFromWindow();
    }
}
