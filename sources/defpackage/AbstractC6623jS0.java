package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6623jS0 extends MB1 {
    public Drawable u;
    public final Rect v;
    public final Rect w;
    public int x;
    public final boolean y;
    public boolean z;

    public AbstractC6623jS0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.v = new Rect();
        this.w = new Rect();
        this.x = 119;
        this.y = true;
        this.z = false;
        TypedArray d = SJ3.d(context, attributeSet, JG2.R, 0, 0, new int[0]);
        this.x = d.getInt(1, this.x);
        Drawable drawable = d.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.y = d.getBoolean(2, true);
        d.recycle();
    }

    @Override // android.view.View
    public final int getForegroundGravity() {
        return this.x;
    }

    @Override // android.view.View
    public final void setForegroundGravity(int i) {
        if (this.x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.x = i;
            if (i == 119 && this.u != null) {
                this.u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.u.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.u);
            }
            this.u = drawable;
            this.z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.u;
    }

    @Override // defpackage.MB1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.z = z | this.z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.z = true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.u;
        if (drawable != null) {
            if (this.z) {
                this.z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.y;
                Rect rect = this.v;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.w;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}
