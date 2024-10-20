package defpackage;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ey0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641Ey0 {
    public final float a;
    public final int[] b;
    public final float[] c;
    public final PointF d;
    public final PointF e;
    public final int f;
    public LinearGradient g;
    public final AbstractC9896sy0 h;

    public C0641Ey0(float f, PointF pointF, PointF pointF2, int[] iArr, float[] fArr, int i, AbstractC9896sy0 abstractC9896sy0) {
        this.a = f;
        this.b = iArr;
        this.c = fArr;
        this.d = pointF;
        this.e = pointF2;
        this.f = i;
        this.h = abstractC9896sy0;
    }

    public final void b(RectF rectF, boolean z, boolean z2) {
        float f;
        float f2;
        PointF pointF;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        PointF pointF2 = this.d;
        if (pointF2 != null && (pointF = this.e) != null) {
            if (AbstractC2373Sg3.b(this.f) == 1) {
                if (z && z2) {
                    float f10 = rectF.right;
                    f3 = f10 - pointF2.x;
                    f4 = f10 - pointF.x;
                } else {
                    float f11 = rectF.left;
                    f3 = pointF2.x + f11;
                    f4 = f11 + pointF.x;
                }
                float f12 = f3;
                f5 = f4;
                f6 = f12;
                f7 = rectF.top;
                f8 = f7 + pointF2.y;
                f9 = pointF.y;
            } else {
                if (z && z2) {
                    f6 = rectF.right - (rectF.width() * pointF2.x);
                    f5 = rectF.right - (rectF.width() * pointF.x);
                } else {
                    f6 = rectF.left + (rectF.width() * pointF2.x);
                    f5 = rectF.left + (rectF.width() * pointF.x);
                }
                f8 = (rectF.height() * pointF2.y) + rectF.top;
                f9 = rectF.top;
                f7 = rectF.height() * pointF.y;
            }
            this.g = c(f6, f8, f5, f7 + f9, this.b, this.c);
            return;
        }
        float f13 = this.a;
        int i = (int) (f13 / 90.0f);
        double centerY = rectF.centerY() - (Math.tan(Math.toRadians(90.0f + f13)) * rectF.centerX());
        AbstractC9896sy0 abstractC9896sy0 = this.h;
        PointF a = a(d(rectF, i % 4, abstractC9896sy0), centerY, f13);
        PointF a2 = a(d(rectF, (i + 2) % 4, abstractC9896sy0), centerY, f13);
        if (z && z2) {
            f = rectF.right - Math.abs(a.x - rectF.left);
            f2 = rectF.right - Math.abs(a2.x - rectF.left);
        } else {
            f = a.x;
            f2 = a2.x;
        }
        this.g = c(f, a.y, f2, a2.y, this.b, this.c);
    }

    public static PointF d(RectF rectF, int i, AbstractC9896sy0 abstractC9896sy0) {
        if (i == 0) {
            return new PointF(rectF.left, rectF.bottom);
        }
        if (i == 1) {
            return new PointF(rectF.left, rectF.top);
        }
        if (i == 2) {
            return new PointF(rectF.right, rectF.top);
        }
        if (i == 3) {
            return new PointF(rectF.right, rectF.bottom);
        }
        abstractC9896sy0.a(EnumC11438xU.u, "ElementsLinearGradientWrapper Quadrant has to be in the range 0 to 3");
        return new PointF(rectF.left, rectF.bottom);
    }

    public static LinearGradient c(float f, float f2, float f3, float f4, int[] iArr, float[] fArr) {
        if (fArr == null || iArr.length != fArr.length) {
            return new LinearGradient(f, f2, f3, f4, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(f, f2, f3, f4, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public static PointF a(PointF pointF, double d, float f) {
        double tan = Math.tan(Math.toRadians(f + 90.0f));
        double pow = ((((pointF.y * (-1.0d)) + (pointF.x * tan)) + d) * (-1.0d)) / (Math.pow(tan, 2.0d) + 1.0d);
        PointF pointF2 = new PointF();
        pointF2.x = (float) ((tan * pow) + pointF.x);
        pointF2.y = (float) ((pow * (-1.0d)) + pointF.y);
        return pointF2;
    }
}
