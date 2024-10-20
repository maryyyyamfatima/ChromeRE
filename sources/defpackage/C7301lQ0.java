package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7301lQ0 implements TypeEvaluator {
    public final float[] a = new float[9];
    public final float[] b = new float[9];
    public final Matrix c = new Matrix();
    public final /* synthetic */ AbstractC10390uQ0 d;

    public C7301lQ0(AbstractC10390uQ0 abstractC10390uQ0) {
        this.d = abstractC10390uQ0;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        this.d.o = f;
        float[] fArr = this.a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = AbstractC2277Rn2.a(f2, f3, f, f3);
        }
        Matrix matrix = this.c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
