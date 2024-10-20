package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g63, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5482g63 extends AbstractC6856k63 {
    public final C6170i63 c;
    public final float d;
    public final float e;

    public C5482g63(C6170i63 c6170i63, float f, float f2) {
        this.c = c6170i63;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.AbstractC6856k63
    public final void a(Matrix matrix, M53 m53, int i, Canvas canvas) {
        C6170i63 c6170i63 = this.c;
        float f = c6170i63.c;
        float f2 = this.e;
        float f3 = c6170i63.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        m53.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = M53.i;
        iArr[0] = m53.f;
        iArr[1] = m53.e;
        iArr[2] = m53.d;
        Paint paint = m53.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, M53.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        C6170i63 c6170i63 = this.c;
        return (float) Math.toDegrees(Math.atan((c6170i63.c - this.e) / (c6170i63.b - this.d)));
    }
}
