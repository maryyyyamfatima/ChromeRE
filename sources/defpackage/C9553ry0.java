package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ry0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9553ry0 extends Drawable {
    public final Matrix a = new Matrix();
    public final Paint b = new Paint(3);
    public final RectF c = new RectF();
    public final ImageView.ScaleType d;
    public final Bitmap e;
    public final RectF f;
    public boolean g;
    public boolean h;
    public final AbstractC9896sy0 i;

    public C9553ry0(Bitmap bitmap, ImageView.ScaleType scaleType, AbstractC9896sy0 abstractC9896sy0) {
        RectF rectF = new RectF();
        this.f = rectF;
        this.g = false;
        this.h = false;
        this.e = bitmap;
        rectF.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        this.d = scaleType;
        this.i = abstractC9896sy0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.a);
        Paint paint = this.b;
        paint.setShader(bitmapShader);
        canvas.drawRect(this.c, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Paint paint = this.b;
        if (paint.getAlpha() == 255) {
            return -1;
        }
        return paint.getAlpha() == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        a();
        b(rect);
        invalidateSelf();
    }

    public void b(Rect rect) {
        float f;
        float f2;
        float f3;
        Bitmap bitmap = this.e;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float width2 = rect.width();
        float height2 = rect.height();
        Matrix matrix = this.a;
        matrix.reset();
        if (width <= 0.0f || height <= 0.0f || width2 <= 0.0f || height2 <= 0.0f) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        ImageView.ScaleType scaleType2 = this.d;
        if (scaleType2 == scaleType) {
            scaleType2 = (width > width2 || height > height2) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER;
        }
        int i = AbstractC9211qy0.a[scaleType2.ordinal()];
        RectF rectF = this.f;
        RectF rectF2 = this.c;
        if (i == 1) {
            float centerX = rect.centerX() - rectF.centerX();
            float centerY = rect.centerY() - rectF.centerY();
            matrix.setTranslate(centerX, centerY);
            rectF2.set(rectF);
            rectF2.offset(centerX, centerY);
            rectF2.intersect(rect.left, rect.top, rect.right, rect.bottom);
        } else if (i == 2) {
            if (width * height2 > width2 * height) {
                f2 = height2 / height;
                f3 = ((width2 - (width * f2)) * 0.5f) + rect.left;
                f = rect.top;
            } else {
                float f4 = width2 / width;
                f = ((height2 - (height * f4)) * 0.5f) + rect.top;
                f2 = f4;
                f3 = rect.left;
            }
            matrix.setScale(f2, f2);
            matrix.postTranslate(Math.round(f3), Math.round(f));
            rectF2.set(rect);
        } else if (i == 3) {
            rectF2.set(rect);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            matrix.mapRect(rectF2, rectF);
        } else {
            rectF2.set(rect);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
        }
        if (this.h) {
            matrix.preTranslate(width, 0.0f);
            matrix.preScale(-1.0f, 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.g != z) {
            this.g = z;
            if (a()) {
                b(getBounds());
                invalidateSelf();
            }
        }
    }

    public final boolean a() {
        boolean z = this.g && getLayoutDirection() == 1;
        if (this.h == z) {
            return false;
        }
        this.h = z;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        if (!a()) {
            return false;
        }
        b(getBounds());
        invalidateSelf();
        return true;
    }
}
