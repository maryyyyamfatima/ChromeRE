package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xw2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11603xw2 {
    public boolean e;
    public Size a = new Size(0, 0);
    public final Matrix b = new Matrix();
    public final Rect c = new Rect();
    public final Point d = new Point();
    public Size f = new Size(0, 0);
    public final Rect g = new Rect();
    public final float[] h = new float[9];
    public final Rect i = new Rect();

    public final float c() {
        Matrix matrix = this.b;
        float[] fArr = this.h;
        matrix.getValues(fArr);
        return fArr[2];
    }

    public final float d() {
        Matrix matrix = this.b;
        float[] fArr = this.h;
        matrix.getValues(fArr);
        return fArr[5];
    }

    public final float b() {
        Matrix matrix = this.b;
        float[] fArr = this.h;
        matrix.getValues(fArr);
        return fArr[0];
    }

    public final Rect a() {
        Matrix matrix = this.b;
        float[] fArr = this.h;
        matrix.getValues(fArr);
        int round = Math.round(fArr[2]);
        int round2 = Math.round(fArr[5]);
        int width = this.a.getWidth() + round;
        int height = this.a.getHeight() + round2;
        Rect rect = this.g;
        rect.set(round, round2, width, height);
        return rect;
    }

    public final void g(float f, float f2) {
        Matrix matrix = this.b;
        float[] fArr = this.h;
        matrix.getValues(fArr);
        fArr[2] = f;
        fArr[5] = f2;
        matrix.setValues(fArr);
    }

    public final void f(float f) {
        Matrix matrix = this.b;
        float[] fArr = this.h;
        matrix.getValues(fArr);
        fArr[0] = f;
        fArr[4] = f;
        matrix.setValues(fArr);
    }

    public final Rect e(boolean z) {
        if (!z) {
            return a();
        }
        Rect rect = this.c;
        if (rect.isEmpty()) {
            return rect;
        }
        Rect a = a();
        int i = a.left + rect.left;
        int i2 = a.top + rect.top;
        int width = rect.width() + i;
        int height = rect.height() + i2;
        Rect rect2 = this.i;
        rect2.set(i, i2, width, height);
        return rect2;
    }
}
