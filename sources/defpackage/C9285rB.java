package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9285rB extends Drawable implements UY {
    public static final RectF k = new RectF();
    public static final RectF l = new RectF();
    public static final RectF m = new RectF();
    public final C8943qB a;
    public Paint g;
    public Path h;
    public Path i;
    public boolean j;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public C9285rB(C8943qB c8943qB) {
        this.a = c8943qB;
    }

    public static void c(Canvas canvas, RectF rectF, Path path, float[] fArr, Paint paint) {
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        if (path == null) {
            float min2 = Math.min(min, fArr[0]);
            canvas.drawRoundRect(rectF, min2, min2, paint);
        } else {
            if (path.isEmpty()) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float[] fArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Paint paint = this.g;
        boolean z = false;
        C8943qB c8943qB = this.a;
        if (paint == null || this.h == null) {
            this.g = new Paint();
            this.h = new Path();
            this.i = new Path();
            int i6 = 0;
            boolean z2 = false;
            float f = 0.0f;
            while (true) {
                fArr = c8943qB.j;
                if (i6 >= fArr.length) {
                    break;
                }
                float f2 = fArr[i6];
                if (f2 > 0.0f) {
                    z2 = true;
                }
                if (i6 != 0) {
                    if (f != f2) {
                        this.j = true;
                        break;
                    }
                } else {
                    f = f2;
                }
                i6++;
            }
            if (this.j && fArr.length != 8) {
                float[] fArr2 = new float[8];
                for (int i7 = 0; i7 < 4; i7++) {
                    int i8 = i7 * 2;
                    float[] fArr3 = c8943qB.j;
                    fArr2[i8] = fArr3[i7];
                    fArr2[i8 + 1] = fArr3[i7];
                }
                c8943qB.j = fArr2;
            }
            this.g.setPathEffect(c8943qB.i);
            this.g.setAntiAlias(c8943qB.i != null || z2);
            this.g.setStyle(Paint.Style.STROKE);
        }
        int i9 = c8943qB.e;
        int i10 = c8943qB.f;
        boolean z3 = i9 == i10 && i10 == (i5 = c8943qB.g) && i5 == c8943qB.h;
        float f3 = c8943qB.a;
        float f4 = c8943qB.b;
        if (f3 == f4) {
            float f5 = c8943qB.c;
            if (f4 == f5 && f5 == c8943qB.d) {
                z = true;
            }
        }
        if (z && f3 == 0.0f) {
            return;
        }
        RectF rectF = l;
        if (z && z3) {
            float f6 = f3 / 2.0f;
            rectF.set(getBounds());
            rectF.inset(f6, f6);
            this.g.setStrokeWidth(f3);
            this.g.setColor(i9);
            c(canvas, rectF, d(), c8943qB.j, this.g);
            return;
        }
        if (z) {
            this.g.setStrokeWidth(f3);
            float f7 = c8943qB.a / 2.0f;
            rectF.set(getBounds());
            int save = canvas.save();
            canvas.translate(rectF.left, rectF.top);
            rectF.offsetTo(0.0f, 0.0f);
            rectF.inset(f7, f7);
            RectF rectF2 = m;
            rectF2.set(rectF);
            float min = Math.min(rectF.width(), rectF.height()) / 3.0f;
            rectF2.inset(min, min);
            int i11 = c8943qB.e;
            if (i11 != 0) {
                int save2 = canvas.save();
                this.g.setColor(i11);
                this.i.reset();
                this.i.moveTo(rectF.left - f7, rectF.top - f7);
                this.i.lineTo(rectF2.left, rectF2.top);
                this.i.lineTo(rectF2.left, rectF2.bottom);
                this.i.lineTo(rectF.left - f7, rectF.bottom + f7);
                this.i.close();
                canvas.clipPath(this.i);
                c(canvas, rectF, d(), c8943qB.j, this.g);
                canvas.restoreToCount(save2);
            }
            int i12 = c8943qB.f;
            if (i12 != 0) {
                int save3 = canvas.save();
                this.g.setColor(i12);
                this.i.reset();
                this.i.moveTo(rectF.left - f7, rectF.top - f7);
                this.i.lineTo(rectF2.left, rectF2.top);
                this.i.lineTo(rectF2.right, rectF2.top);
                this.i.lineTo(rectF.right + f7, rectF.top - f7);
                this.i.close();
                canvas.clipPath(this.i);
                c(canvas, rectF, d(), c8943qB.j, this.g);
                canvas.restoreToCount(save3);
            }
            int i13 = c8943qB.g;
            if (i13 != 0) {
                int save4 = canvas.save();
                this.g.setColor(i13);
                this.i.reset();
                this.i.moveTo(rectF.right + f7, rectF.top - f7);
                this.i.lineTo(rectF2.right, rectF2.top);
                this.i.lineTo(rectF2.right, rectF2.bottom);
                this.i.lineTo(rectF.right + f7, rectF.bottom + f7);
                this.i.close();
                canvas.clipPath(this.i);
                c(canvas, rectF, d(), c8943qB.j, this.g);
                canvas.restoreToCount(save4);
            }
            int i14 = c8943qB.h;
            if (i14 != 0) {
                int save5 = canvas.save();
                this.g.setColor(i14);
                this.i.reset();
                this.i.moveTo(rectF.left - f7, rectF.bottom + f7);
                this.i.lineTo(rectF2.left, rectF2.bottom);
                this.i.lineTo(rectF2.right, rectF2.bottom);
                this.i.lineTo(rectF.right + f7, rectF.bottom + f7);
                this.i.close();
                canvas.clipPath(this.i);
                c(canvas, rectF, d(), c8943qB.j, this.g);
                canvas.restoreToCount(save5);
            }
            canvas.restoreToCount(save);
            return;
        }
        Rect bounds = getBounds();
        float f8 = c8943qB.a;
        if (f8 > 0.0f && (i4 = c8943qB.e) != 0) {
            float f9 = bounds.left;
            b(canvas, i4, f8, f9, bounds.top, Math.min(f9 + f8, bounds.right), bounds.bottom, true);
        }
        float f10 = c8943qB.c;
        if (f10 > 0.0f && (i3 = c8943qB.g) != 0) {
            b(canvas, i3, f10, Math.max(bounds.right - f10, bounds.left), bounds.top, bounds.right, bounds.bottom, true);
        }
        float f11 = c8943qB.b;
        if (f11 > 0.0f && (i2 = c8943qB.f) != 0) {
            float f12 = bounds.left;
            float f13 = bounds.top;
            b(canvas, i2, f11, f12, f13, bounds.right, Math.min(f13 + f11, bounds.bottom), false);
        }
        float f14 = c8943qB.d;
        if (f14 <= 0.0f || (i = c8943qB.h) == 0) {
            return;
        }
        b(canvas, i, f14, bounds.left, Math.max(bounds.bottom - f14, bounds.top), bounds.right, bounds.bottom, false);
    }

    public final void b(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.g.setStrokeWidth(f);
        this.g.setColor(i);
        RectF rectF = k;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = l;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        c(canvas, rectF2, d(), this.a.j, this.g);
        canvas.restoreToCount(save);
    }

    public final Path d() {
        if (this.j) {
            return this.h;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.g;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.g;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Paint paint = this.g;
        if (paint != null) {
            return paint.getColorFilter();
        }
        return null;
    }

    @Override // defpackage.UY
    public final boolean a(UY uy) {
        return equals(uy);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9285rB) {
            return EY.b(this.a, ((C9285rB) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
