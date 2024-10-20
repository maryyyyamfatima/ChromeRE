package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BG extends Drawable {
    public int a;
    public int b;
    public final Paint c;
    public final Paint h;
    public float i;
    public float j;
    public boolean m;
    public boolean n;
    public final Path d = new Path();
    public final Path e = new Path();
    public final Path f = new Path();
    public final Path g = new Path();
    public float k = -1.0f;
    public float l = -1.0f;
    public boolean o = true;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public BG() {
        Paint paint = new Paint(5);
        this.h = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(paint);
        this.c = paint2;
        paint2.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h.setAlpha(i);
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        boolean z = this.o;
        Paint paint = this.c;
        Path path = this.e;
        Path path2 = this.g;
        Path path3 = this.f;
        Path path4 = this.d;
        Paint paint2 = this.h;
        if (z) {
            float f2 = this.j + this.i;
            int i = this.a;
            paint2.setShader(new RadialGradient(f2, f2, f2, new int[]{i, i, this.b}, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
            float f3 = this.k;
            if (f3 == -1.0f) {
                f3 = 0.0f;
            }
            float f4 = this.l;
            if (f4 == -1.0f) {
                f4 = b(this.j) * 0.5f;
            }
            int ceil = (int) Math.ceil(b(this.j) - f3);
            int ceil2 = (int) Math.ceil(b(this.j) + f3);
            int ceil3 = (int) Math.ceil(b(this.j) - f4);
            int ceil4 = (int) Math.ceil(b(this.j) + f4);
            a(path4, ceil, ceil3, this.i);
            a(path3, ceil2, ceil3, this.i);
            a(path, ceil, ceil4, this.i);
            a(path2, ceil2, ceil4, this.i);
            int i2 = this.a;
            paint.setShader(new LinearGradient(0.0f, f2, 0.0f, 0.0f, new int[]{i2, i2, this.b}, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAntiAlias(false);
            this.o = false;
        }
        Rect bounds = getBounds();
        int save = canvas.save();
        if (!this.m) {
            canvas.translate(bounds.left, bounds.top);
            canvas.drawPath(path4, paint2);
            canvas.restoreToCount(save);
            int save2 = canvas.save();
            canvas.translate(bounds.right, bounds.top);
            canvas.scale(-1.0f, 1.0f);
            canvas.drawPath(path3, paint2);
            canvas.restoreToCount(save2);
        }
        if (this.n) {
            f = -1.0f;
        } else {
            int save3 = canvas.save();
            canvas.translate(bounds.right, bounds.bottom);
            f = -1.0f;
            canvas.scale(-1.0f, -1.0f);
            canvas.drawPath(path2, paint2);
            canvas.restoreToCount(save3);
            int save4 = canvas.save();
            canvas.translate(bounds.left, bounds.bottom);
            canvas.scale(1.0f, -1.0f);
            canvas.drawPath(path, paint2);
            canvas.restoreToCount(save4);
        }
        float f5 = this.k;
        if (f5 == f) {
            f5 = 0.0f;
        }
        float f6 = this.l;
        if (f6 == f) {
            f6 = b(this.j) * 0.5f;
        }
        int ceil5 = (int) Math.ceil(b(this.j) - f5);
        int ceil6 = (int) Math.ceil(b(this.j) - f6);
        int ceil7 = (int) Math.ceil(b(this.j) + f5);
        int ceil8 = (int) Math.ceil(b(this.j) + f6);
        int save5 = canvas.save();
        if (!this.m) {
            canvas.translate(bounds.left, bounds.top);
            canvas.drawRect(this.i + ceil5, 0.0f, (bounds.width() - this.i) - ceil7, ceil6, paint);
            canvas.restoreToCount(save5);
        }
        if (!this.n) {
            int save6 = canvas.save();
            canvas.translate(bounds.right, bounds.bottom);
            canvas.rotate(180.0f);
            canvas.drawRect(this.i + ceil7, 0.0f, (bounds.width() - this.i) - ceil5, ceil8, paint);
            canvas.restoreToCount(save6);
        }
        int save7 = canvas.save();
        canvas.translate(bounds.left, bounds.bottom);
        canvas.rotate(270.0f);
        canvas.drawRect(this.n ? 0.0f : ceil8 + this.i, 0.0f, bounds.height() - (this.m ? 0.0f : this.i + ceil6), ceil5, paint);
        canvas.restoreToCount(save7);
        int save8 = canvas.save();
        canvas.translate(bounds.right, bounds.top);
        canvas.rotate(90.0f);
        canvas.drawRect(this.m ? 0.0f : ceil6 + this.i, 0.0f, bounds.height() - (this.n ? 0.0f : this.i + ceil8), ceil7, paint);
        canvas.restoreToCount(save8);
    }

    public static void a(Path path, int i, int i2, float f) {
        float f2 = i;
        float f3 = i2;
        float f4 = 2.0f * f;
        RectF rectF = new RectF(f2, f3, f2 + f4, f3 + f4);
        RectF rectF2 = new RectF(0.0f, 0.0f, f4, f4);
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f5 = f2 + f;
        path.moveTo(f5, f3);
        path.arcTo(rectF, 270.0f, -90.0f, true);
        path.rLineTo(-i, 0.0f);
        path.lineTo(0.0f, f);
        path.arcTo(rectF2, 180.0f, 90.0f, true);
        path.lineTo(f5, 0.0f);
        path.rLineTo(0.0f, f3);
        path.close();
    }

    public static int b(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }
}
