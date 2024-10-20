package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Region;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qs3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9180qs3 extends FrameLayout {
    public final C8150ns3 a;
    public final ViewOnLayoutChangeListenerC8494os3 g;
    public final DecelerateInterpolator h;
    public int i;
    public Animator j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public WebContents o;

    public abstract void d(boolean z);

    public AbstractC9180qs3(Context context) {
        super(context, null);
        this.a = new C8150ns3(this);
        this.i = 0;
        this.g = new ViewOnLayoutChangeListenerC8494os3(this);
        this.h = new DecelerateInterpolator(1.0f);
        setWillNotDraw(false);
    }

    public final void e(WebContents webContents) {
        WebContents webContents2 = this.o;
        C8150ns3 c8150ns3 = this.a;
        if (webContents2 != null) {
            GestureListenerManagerImpl.d(webContents2).f(c8150ns3);
        }
        this.o = webContents;
        if (webContents == null || this.m <= 0) {
            return;
        }
        GestureListenerManagerImpl.d(webContents).b(c8150ns3);
    }

    public final boolean c() {
        if (getParent() == null) {
            return false;
        }
        ((ViewGroup) getParent()).removeView(this);
        removeOnLayoutChangeListener(this.g);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C0967Hl1.w) {
            return;
        }
        setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (C0967Hl1.w) {
            return;
        }
        setTranslationY(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height = getParent() == null ? 0 : ((View) getParent()).getHeight();
        if (this.k != height) {
            this.k = height;
            this.i = 0;
            Animator animator = this.j;
            if (animator != null) {
                animator.end();
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int measuredHeight = getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        this.m = measuredHeight;
        WebContents webContents = this.o;
        if (webContents != null) {
            C8150ns3 c8150ns3 = this.a;
            if (measuredHeight > 0) {
                GestureListenerManagerImpl.d(webContents).b(c8150ns3);
            } else {
                GestureListenerManagerImpl.d(webContents).f(c8150ns3);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final boolean f(int i) {
        return ((((float) i) > (((float) this.m) * 0.5f) ? 1 : (((float) i) == (((float) this.m) * 0.5f) ? 0 : -1)) < 0) || ((getTranslationY() > (((float) this.m) * 0.5f) ? 1 : (getTranslationY() == (((float) this.m) * 0.5f) ? 0 : -1)) < 0);
    }

    public final ObjectAnimator b(boolean z) {
        float f = z ? 0.0f : this.m;
        long max = Math.max(0L, (Math.abs(f - getTranslationY()) / this.m) * 250.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<AbstractC9180qs3, Float>) View.TRANSLATION_Y, f);
        ofFloat.setDuration(max);
        ofFloat.setInterpolator(this.h);
        return ofFloat;
    }

    public final boolean a() {
        if (this.n) {
            return false;
        }
        Animator animator = this.j;
        if (animator == null) {
            return true;
        }
        animator.cancel();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        float translationY = getTranslationY();
        setTranslationY(0.0f);
        boolean gatherTransparentRegion = super.gatherTransparentRegion(region);
        setTranslationY(translationY);
        return gatherTransparentRegion;
    }
}
