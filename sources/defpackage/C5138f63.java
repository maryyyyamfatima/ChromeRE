package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f63, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5138f63 extends AbstractC6856k63 {
    public final C5826h63 c;

    public C5138f63(C5826h63 c5826h63) {
        this.c = c5826h63;
    }

    @Override // defpackage.AbstractC6856k63
    public final void a(Matrix matrix, M53 m53, int i, Canvas canvas) {
        C5826h63 c5826h63 = this.c;
        float f = c5826h63.f;
        float f2 = c5826h63.g;
        RectF rectF = new RectF(c5826h63.b, c5826h63.c, c5826h63.d, c5826h63.e);
        m53.getClass();
        boolean z = f2 < 0.0f;
        Path path = m53.g;
        int[] iArr = M53.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = m53.f;
            iArr[2] = m53.e;
            iArr[3] = m53.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = m53.d;
            iArr[2] = m53.e;
            iArr[3] = m53.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = M53.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = m53.b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, m53.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
