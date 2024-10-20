package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660Fc implements TypeEvaluator {
    public C2667Un2[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C2667Un2[] c2667Un2Arr = (C2667Un2[]) obj;
        C2667Un2[] c2667Un2Arr2 = (C2667Un2[]) obj2;
        if (!AbstractC2927Wn2.a(c2667Un2Arr, c2667Un2Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC2927Wn2.a(this.a, c2667Un2Arr)) {
            this.a = AbstractC2927Wn2.e(c2667Un2Arr);
        }
        for (int i = 0; i < c2667Un2Arr.length; i++) {
            C2667Un2 c2667Un2 = this.a[i];
            C2667Un2 c2667Un22 = c2667Un2Arr[i];
            C2667Un2 c2667Un23 = c2667Un2Arr2[i];
            c2667Un2.getClass();
            c2667Un2.a = c2667Un22.a;
            int i2 = 0;
            while (true) {
                float[] fArr = c2667Un22.b;
                if (i2 < fArr.length) {
                    c2667Un2.b[i2] = (c2667Un23.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.a;
    }
}
