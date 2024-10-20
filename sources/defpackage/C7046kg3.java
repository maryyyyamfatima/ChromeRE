package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kg3 */
/* loaded from: classes.dex */
public final class C7046kg3 extends AbstractC11937yv {
    public final C2456Sx1 A;
    public J74 B;
    public final RectF w;
    public final C3356Zv1 x;
    public final float[] y;
    public final Path z;

    public C7046kg3(JJ1 jj1, C2456Sx1 c2456Sx1) {
        super(jj1, c2456Sx1);
        this.w = new RectF();
        C3356Zv1 c3356Zv1 = new C3356Zv1();
        this.x = c3356Zv1;
        this.y = new float[8];
        this.z = new Path();
        this.A = c2456Sx1;
        c3356Zv1.setAlpha(0);
        c3356Zv1.setStyle(Paint.Style.FILL);
        c3356Zv1.setColor(c2456Sx1.l);
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        RectF rectF2 = this.w;
        C2456Sx1 c2456Sx1 = this.A;
        rectF2.set(0.0f, 0.0f, c2456Sx1.j, c2456Sx1.k);
        this.l.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        super.f(tj1, obj);
        if (obj == NJ1.E) {
            if (tj1 == null) {
                this.B = null;
            } else {
                this.B = new J74(tj1, null);
            }
        }
    }

    @Override // defpackage.AbstractC11937yv
    public final void k(Canvas canvas, Matrix matrix, int i) {
        C2456Sx1 c2456Sx1 = this.A;
        int alpha = Color.alpha(c2456Sx1.l);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.u.j == null ? 100 : ((Integer) r2.f()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        C3356Zv1 c3356Zv1 = this.x;
        c3356Zv1.setAlpha(intValue);
        J74 j74 = this.B;
        if (j74 != null) {
            c3356Zv1.setColorFilter((ColorFilter) j74.f());
        }
        if (intValue > 0) {
            float[] fArr = this.y;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = c2456Sx1.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = c2456Sx1.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.z;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c3356Zv1);
        }
    }
}
