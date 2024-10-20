package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import com.google.android.libraries.elements.interfaces.RectCornersProxy;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000Hs extends Drawable {
    public static final int[] j = {R.attr.state_pressed};
    public static final int[] k = {R.attr.state_activated};
    public final Paint a;
    public final RectF b;
    public int c;
    public int d;
    public int e;
    public float f;
    public RectCornersProxy g;
    public Path h;
    public boolean i;

    public C1000Hs() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new RectF();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.h = null;
        this.i = false;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Paint paint = this.a;
        int color = paint.getColor();
        if (StateSet.stateSetMatches(j, iArr)) {
            int i = this.c;
            if (color == i) {
                return false;
            }
            paint.setColor(i);
            invalidateSelf();
            return true;
        }
        if (StateSet.stateSetMatches(k, iArr)) {
            int i2 = this.d;
            if (color == i2) {
                return false;
            }
            paint.setColor(i2);
            invalidateSelf();
            return true;
        }
        int i3 = this.e;
        if (i3 != 0) {
            if (color == i3) {
                return false;
            }
            paint.setColor(i3);
            invalidateSelf();
            return true;
        }
        if (color != 0) {
            paint.setColor(0);
            invalidateSelf();
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Path path;
        RectF rectF = this.b;
        rectF.set(rect);
        if (!a() && this.h == null) {
            RectCornersProxy rectCornersProxy = this.g;
            if (rectCornersProxy == null) {
                path = new Path();
            } else {
                float[] fArr = new float[8];
                if (rectCornersProxy.topLeft() || ((!this.i && this.g.topStart()) || (this.i && this.g.topEnd()))) {
                    float f = this.f;
                    fArr[0] = f;
                    fArr[1] = f;
                }
                if (this.g.topRight() || ((!this.i && this.g.topEnd()) || (this.i && this.g.topStart()))) {
                    float f2 = this.f;
                    fArr[2] = f2;
                    fArr[3] = f2;
                }
                if (this.g.bottomRight() || ((!this.i && this.g.bottomEnd()) || (this.i && this.g.bottomStart()))) {
                    float f3 = this.f;
                    fArr[4] = f3;
                    fArr[5] = f3;
                }
                if (this.g.bottomLeft() || ((!this.i && this.g.bottomStart()) || (this.i && this.g.bottomEnd()))) {
                    float f4 = this.f;
                    fArr[6] = f4;
                    fArr[7] = f4;
                }
                path = new Path();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            this.h = path;
        }
        if (this.e == 0 || isStateful()) {
            return;
        }
        this.a.setColor(this.e);
    }

    public final boolean a() {
        RectCornersProxy rectCornersProxy = this.g;
        if (rectCornersProxy == null) {
            return true;
        }
        if (!rectCornersProxy.hasBottomEnd() && !this.g.hasBottomStart() && !this.g.hasTopEnd() && !this.g.hasTopStart() && !this.g.hasBottomRight() && !this.g.hasBottomLeft() && !this.g.hasTopRight() && !this.g.hasTopLeft()) {
            return true;
        }
        if (this.g.topLeft() && this.g.topRight() && this.g.bottomRight() && this.g.bottomLeft()) {
            return true;
        }
        return this.g.topStart() && this.g.topEnd() && this.g.bottomStart() && this.g.bottomEnd();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.f;
        RectF rectF = this.b;
        Paint paint = this.a;
        if (f <= 0.5f) {
            canvas.drawRect(rectF, paint);
        } else if (a()) {
            float f2 = this.f;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        } else {
            canvas.drawPath(this.h, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.c == 0 && this.d == 0) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.a.getAlpha();
        if (alpha != 255 || this.f >= 0.5f) {
            return alpha == 0 ? -2 : -3;
        }
        return -1;
    }
}
