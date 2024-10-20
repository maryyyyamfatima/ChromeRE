package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h63, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5826h63 extends AbstractC6512j63 {
    public static final RectF h = new RectF();
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    public C5826h63(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // defpackage.AbstractC6512j63
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.b, this.c, this.d, this.e);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
