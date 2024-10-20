package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.Ec4;
import defpackage.JG2;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RoundedCornerImageView extends AppCompatImageView {
    public final RectF i;
    public final Matrix j;
    public final Paint k;
    public Paint l;
    public boolean m;
    public final boolean n;
    public RoundRectShape o;
    public int p;

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        this.i = new RectF();
        this.j = new Matrix();
        Paint paint = new Paint(1);
        this.k = paint;
        new Matrix();
        this.p = 0;
        this.n = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, JG2.H0, 0, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            i4 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            i3 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            i5 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int color = obtainStyledAttributes.getColor(4, 0);
            obtainStyledAttributes.recycle();
            i2 = color;
            i6 = dimensionPixelSize;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        c(i6, i4, i3, i5);
        this.p = i2;
        paint.setColor(i2);
        invalidate();
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a();
    }

    public final void c(int i, int i2, int i3, int i4) {
        float[] fArr;
        boolean z = (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? false : true;
        this.m = z;
        if (z) {
            WeakHashMap weakHashMap = Ec4.a;
            if (getLayoutDirection() == 0) {
                float f = i;
                float f2 = i2;
                float f3 = i4;
                float f4 = i3;
                fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
            } else {
                float f5 = i2;
                float f6 = i;
                float f7 = i3;
                float f8 = i4;
                fArr = new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
            }
            this.o = new RoundRectShape(fArr, null, null);
        }
    }

    public final void a() {
        Drawable drawable = getDrawable();
        if (this.n) {
            boolean z = drawable instanceof ColorDrawable;
            Paint paint = this.k;
            if (z) {
                paint.setColor(((ColorDrawable) getDrawable()).getColor());
                this.l = null;
                return;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    paint.setColor(this.p);
                    this.l = new Paint(1);
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    Paint paint2 = this.l;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    return;
                }
            }
            paint.setColor(this.p);
            this.l = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.m) {
            super.onDraw(canvas);
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.o.resize(width, height);
        int save = canvas.save();
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            Paint paint = this.k;
            if (paint.getColor() != 0) {
                this.o.draw(canvas, paint);
                if (getDrawable() instanceof ColorDrawable) {
                    return;
                }
            }
            Paint paint2 = this.l;
            if (paint2 == null) {
                canvas.restoreToCount(save);
                super.onDraw(canvas);
                return;
            }
            Shader shader = paint2.getShader();
            if (shader != null) {
                Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
                Matrix matrix = this.j;
                matrix.set(getImageMatrix());
                matrix.preScale(r2.getIntrinsicWidth() / bitmap.getWidth(), r2.getIntrinsicHeight() / bitmap.getHeight());
                shader.setLocalMatrix(matrix);
                RectF rectF = this.i;
                rectF.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                canvas.clipRect(rectF);
            }
            this.o.draw(canvas, this.l);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
