package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11000wB extends C9553ry0 {
    public final Paint j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final BitmapShader o;
    public C0641Ey0 p;
    public final Path q;
    public JI2 r;
    public Paint s;

    public C11000wB(Bitmap bitmap, ImageView.ScaleType scaleType, float f, int i, float f2, boolean z, AbstractC9896sy0 abstractC9896sy0) {
        super(bitmap, scaleType, abstractC9896sy0);
        this.q = new Path();
        this.m = z;
        this.k = f;
        this.l = f2;
        Paint paint = new Paint();
        this.j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        this.n = (int) (f * 0.5f);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.o = new BitmapShader(bitmap, tileMode, tileMode);
    }

    @Override // defpackage.C9553ry0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        LinearGradient linearGradient3;
        LinearGradient linearGradient4;
        BitmapShader bitmapShader = this.o;
        bitmapShader.setLocalMatrix(this.a);
        Paint paint = this.b;
        paint.setShader(bitmapShader);
        boolean z = this.m;
        Paint paint2 = this.j;
        RectF rectF = this.c;
        if (z) {
            float min = Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f);
            Paint paint3 = this.s;
            if (paint3 != null) {
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), min, paint3);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), min, paint);
            C0641Ey0 c0641Ey0 = this.p;
            if (c0641Ey0 != null && (linearGradient4 = c0641Ey0.g) != null) {
                paint.setShader(linearGradient4);
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), min, paint);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), min, paint2);
            return;
        }
        float f = this.l;
        float f2 = this.k;
        if (f <= 0.5f) {
            Paint paint4 = this.s;
            if (paint4 != null) {
                canvas.drawRect(rectF, paint4);
            }
            canvas.drawRect(rectF, paint);
            C0641Ey0 c0641Ey02 = this.p;
            if (c0641Ey02 != null && (linearGradient = c0641Ey02.g) != null) {
                paint.setShader(linearGradient);
                canvas.drawRect(rectF, paint);
            }
            if (f2 > 0.5f) {
                canvas.drawRect(rectF, paint2);
                return;
            }
            return;
        }
        if (c()) {
            Paint paint5 = this.s;
            if (paint5 != null) {
                canvas.drawRoundRect(rectF, f, f, paint5);
            }
            canvas.drawRoundRect(rectF, f, f, paint);
            C0641Ey0 c0641Ey03 = this.p;
            if (c0641Ey03 != null && (linearGradient3 = c0641Ey03.g) != null) {
                paint.setShader(linearGradient3);
                canvas.drawRoundRect(rectF, f, f, paint);
            }
            if (f2 > 0.5f) {
                canvas.drawRoundRect(rectF, f, f, paint2);
                return;
            }
            return;
        }
        Paint paint6 = this.s;
        Path path = this.q;
        if (paint6 != null) {
            canvas.drawPath(path, paint6);
        }
        canvas.drawPath(path, paint);
        C0641Ey0 c0641Ey04 = this.p;
        if (c0641Ey04 != null && (linearGradient2 = c0641Ey04.g) != null) {
            paint.setShader(linearGradient2);
            canvas.drawPath(path, paint);
        }
        if (f2 > 0.5f) {
            canvas.drawPath(path, paint2);
        }
    }

    public final void d() {
        if (this.r == null) {
            return;
        }
        float[] fArr = new float[8];
        boolean z = getLayoutDirection() == 1;
        Path path = this.q;
        path.reset();
        boolean m = this.r.m();
        float f = this.l;
        if (m || ((!z && this.r.o()) || (z && this.r.l()))) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if (this.r.n() || ((!z && this.r.l()) || (z && this.r.o()))) {
            fArr[2] = f;
            fArr[3] = f;
        }
        if (this.r.j() || ((!z && this.r.h()) || (z && this.r.k()))) {
            fArr[4] = f;
            fArr[5] = f;
        }
        if (this.r.i() || ((!z && this.r.k()) || (z && this.r.h()))) {
            fArr[6] = f;
            fArr[7] = f;
        }
        path.addRoundRect(this.c, fArr, Path.Direction.CW);
    }

    public final boolean c() {
        JI2 ji2 = this.r;
        if (ji2 == null) {
            return true;
        }
        if (!UP0.l(ji2, 4) && !UP0.l(this.r, 6) && !UP0.l(this.r, 10) && !UP0.l(this.r, 8) && !UP0.l(this.r, 12) && !UP0.l(this.r, 14) && !UP0.l(this.r, 16) && !UP0.l(this.r, 18)) {
            return true;
        }
        if (this.r.m() && this.r.n() && this.r.j() && this.r.i()) {
            return true;
        }
        return this.r.o() && this.r.l() && this.r.k() && this.r.h();
    }

    @Override // defpackage.C9553ry0
    public final void b(Rect rect) {
        Rect rect2 = new Rect(rect);
        int i = this.n;
        rect2.inset(i, i);
        super.b(rect2);
        C0641Ey0 c0641Ey0 = this.p;
        if (c0641Ey0 != null) {
            c0641Ey0.b(this.c, getLayoutDirection() == 1, this.g);
        }
        if (c()) {
            return;
        }
        d();
    }

    @Override // defpackage.C9553ry0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.l > 0.0f) {
            return -3;
        }
        return super.getOpacity();
    }
}
