package defpackage;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11717yH0 {
    public final Paint a = new Paint();
    public final Matrix b = new Matrix();
    public final LinearGradient c;

    public C11717yH0(int i) {
        float[] fArr = new float[8];
        int[] iArr = new int[8];
        int i2 = 16777215 & i;
        int alpha = Color.alpha(i);
        for (int i3 = 0; i3 < 8; i3++) {
            float f = i3 / 7.0f;
            fArr[i3] = f;
            iArr[i3] = (Math.round(alpha * (((f * f) * (1.8f - (0.6f * f))) + (1.0f - (2.2f * f)))) << 24) | i2;
        }
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }
}
