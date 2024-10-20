package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6280iS extends Drawable implements Animatable {
    public static final LinearInterpolator l = new LinearInterpolator();
    public static final HH0 m = new HH0();
    public static final int[] n = {-16777216};
    public final C5936hS a;
    public float g;
    public final Resources h;
    public ValueAnimator i;
    public float j;
    public boolean k;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C6280iS(Context context) {
        this.h = context.getResources();
        C5936hS c5936hS = new C5936hS();
        this.a = c5936hS;
        c5936hS.i = n;
        c5936hS.a(0);
        c5936hS.h = 2.5f;
        c5936hS.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C5248fS(this, c5936hS));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(l);
        ofFloat.addListener(new C5592gS(this, c5936hS));
        this.i = ofFloat;
    }

    public final void c(float f, float f2, float f3, float f4) {
        float f5 = this.h.getDisplayMetrics().density;
        float f6 = f2 * f5;
        C5936hS c5936hS = this.a;
        c5936hS.h = f6;
        c5936hS.b.setStrokeWidth(f6);
        c5936hS.q = f * f5;
        c5936hS.a(0);
        c5936hS.r = (int) (f3 * f5);
        c5936hS.s = (int) (f4 * f5);
    }

    public final void d(int i) {
        if (i == 0) {
            c(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            c(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.g, bounds.exactCenterX(), bounds.exactCenterY());
        C5936hS c5936hS = this.a;
        RectF rectF = c5936hS.a;
        float f = c5936hS.q;
        float f2 = (c5936hS.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c5936hS.r * c5936hS.p) / 2.0f, c5936hS.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = c5936hS.e;
        float f4 = c5936hS.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((c5936hS.f + f4) * 360.0f) - f5;
        Paint paint = c5936hS.b;
        paint.setColor(c5936hS.u);
        paint.setAlpha(c5936hS.t);
        float f7 = c5936hS.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c5936hS.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        if (c5936hS.n) {
            Path path = c5936hS.o;
            if (path == null) {
                Path path2 = new Path();
                c5936hS.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (c5936hS.r * c5936hS.p) / 2.0f;
            c5936hS.o.moveTo(0.0f, 0.0f);
            c5936hS.o.lineTo(c5936hS.r * c5936hS.p, 0.0f);
            Path path3 = c5936hS.o;
            float f10 = c5936hS.r;
            float f11 = c5936hS.p;
            path3.lineTo((f10 * f11) / 2.0f, c5936hS.s * f11);
            c5936hS.o.offset((rectF.centerX() + min) - f9, (c5936hS.h / 2.0f) + rectF.centerY());
            c5936hS.o.close();
            Paint paint2 = c5936hS.c;
            paint2.setColor(c5936hS.u);
            paint2.setAlpha(c5936hS.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c5936hS.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        C5936hS c5936hS = this.a;
        float f = c5936hS.e;
        c5936hS.k = f;
        float f2 = c5936hS.f;
        c5936hS.l = f2;
        c5936hS.m = c5936hS.g;
        if (f2 != f) {
            this.k = true;
            this.i.setDuration(666L);
            this.i.start();
            return;
        }
        c5936hS.a(0);
        c5936hS.k = 0.0f;
        c5936hS.l = 0.0f;
        c5936hS.m = 0.0f;
        c5936hS.e = 0.0f;
        c5936hS.f = 0.0f;
        c5936hS.g = 0.0f;
        this.i.setDuration(1332L);
        this.i.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.g = 0.0f;
        C5936hS c5936hS = this.a;
        if (c5936hS.n) {
            c5936hS.n = false;
        }
        c5936hS.a(0);
        c5936hS.k = 0.0f;
        c5936hS.l = 0.0f;
        c5936hS.m = 0.0f;
        c5936hS.e = 0.0f;
        c5936hS.f = 0.0f;
        c5936hS.g = 0.0f;
        invalidateSelf();
    }

    public final void b(float f, C5936hS c5936hS, boolean z) {
        float interpolation;
        float f2;
        if (this.k) {
            e(f, c5936hS);
            float floor = (float) (Math.floor(c5936hS.m / 0.8f) + 1.0d);
            float f3 = c5936hS.k;
            float f4 = c5936hS.l;
            c5936hS.e = (((f4 - 0.01f) - f3) * f) + f3;
            c5936hS.f = f4;
            float f5 = c5936hS.m;
            c5936hS.g = AbstractC2277Rn2.a(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = c5936hS.m;
            HH0 hh0 = m;
            if (f < 0.5f) {
                interpolation = c5936hS.k;
                f2 = (hh0.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = c5936hS.k + 0.79f;
                interpolation = f7 - (((1.0f - hh0.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f7;
            }
            float f8 = (0.20999998f * f) + f6;
            float f9 = (f + this.j) * 216.0f;
            c5936hS.e = interpolation;
            c5936hS.f = f2;
            c5936hS.g = f8;
            this.g = f9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    public static void e(float f, C5936hS c5936hS) {
        if (f <= 0.75f) {
            c5936hS.u = c5936hS.i[c5936hS.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = c5936hS.i;
        int i = c5936hS.j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        c5936hS.u = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }
}
