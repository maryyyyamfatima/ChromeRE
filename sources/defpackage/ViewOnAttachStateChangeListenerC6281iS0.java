package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iS0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC6281iS0 implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    public final View i;
    public boolean j;
    public Drawable k;
    public final RectF a = new RectF();
    public final RectF g = new RectF();
    public final Matrix h = new Matrix();
    public ImageView.ScaleType l = ImageView.ScaleType.FIT_CENTER;

    public ViewOnAttachStateChangeListenerC6281iS0(View view) {
        this.i = view;
        view.addOnAttachStateChangeListener(this);
        view.addOnLayoutChangeListener(this);
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.k;
        if (drawable2 == drawable) {
            return;
        }
        View view = this.i;
        if (drawable2 != null) {
            WeakHashMap weakHashMap = Ec4.a;
            if (view.isAttachedToWindow()) {
                this.k.setVisible(false, false);
            }
            this.k.setCallback(null);
            view.unscheduleDrawable(this.k);
            this.k = null;
        }
        this.k = drawable;
        if (drawable != null) {
            this.j = true;
            WeakHashMap weakHashMap2 = Ec4.a;
            drawable.setLayoutDirection(view.getLayoutDirection());
            if (this.k.isStateful()) {
                this.k.setState(view.getDrawableState());
            }
            if (view.isAttachedToWindow()) {
                this.k.setVisible(view.getWindowVisibility() == 0 && view.isShown(), false);
            }
            this.k.setCallback(view);
        }
        view.requestLayout();
        view.invalidate();
    }

    public final void a(Canvas canvas) {
        Drawable drawable = this.k;
        if (drawable == null) {
            return;
        }
        Matrix matrix = this.h;
        if (drawable != null && this.j) {
            matrix.reset();
            int intrinsicWidth = this.k.getIntrinsicWidth();
            int intrinsicHeight = this.k.getIntrinsicHeight();
            View view = this.i;
            int width = view.getWidth();
            int height = view.getHeight();
            RectF rectF = this.a;
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            RectF rectF2 = this.g;
            rectF2.set(0.0f, 0.0f, width, height);
            ImageView.ScaleType scaleType = this.l;
            if (scaleType == ImageView.ScaleType.FIT_START) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                this.k.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            } else if (scaleType == ImageView.ScaleType.FIT_CENTER) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                this.k.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            } else if (scaleType == ImageView.ScaleType.FIT_END) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                this.k.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            } else if (scaleType == ImageView.ScaleType.CENTER) {
                matrix.setTranslate(Math.round((width - intrinsicWidth) * 0.5f), Math.round((height - intrinsicHeight) * 0.5f));
                this.k.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            } else {
                this.k.setBounds(0, 0, width, height);
            }
            this.j = false;
        }
        if (matrix.isIdentity()) {
            this.k.draw(canvas);
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.concat(matrix);
        this.k.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    public final void b(View view, int i) {
        View view2 = this.i;
        if (view2 != view || this.k == null) {
            return;
        }
        ViewParent parent = view2.getParent();
        if ((parent != null && (!(parent instanceof ViewGroup) || ((ViewGroup) parent).isShown())) && view2.getWindowVisibility() == 0) {
            this.k.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.k == null) {
            return;
        }
        View view2 = this.i;
        if (!view2.isShown() || view2.getWindowVisibility() == 8) {
            return;
        }
        this.k.setVisible(view2.getVisibility() == 0, false);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.k == null) {
            return;
        }
        View view2 = this.i;
        if (!view2.isShown() || view2.getWindowVisibility() == 8) {
            return;
        }
        this.k.setVisible(false, false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Drawable drawable = this.k;
        if (drawable == null) {
            return;
        }
        int i9 = i4 - i2;
        if (i3 - i == drawable.getBounds().width() && i9 == this.k.getBounds().height()) {
            return;
        }
        this.j = true;
    }
}
