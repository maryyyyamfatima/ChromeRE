package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import org.chromium.base.SysUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lO1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7292lO1 {
    public static Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int i = SysUtils.isLowEndDevice() ? 256 : 512;
        Matrix matrix = new Matrix();
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (max < (SysUtils.isLowEndDevice() ? 256 : 512)) {
            return bitmap;
        }
        matrix.postTranslate(bitmap.getWidth() / (-2.0f), bitmap.getHeight() / (-2.0f));
        float f = i;
        float f2 = (1.0f * f) / max;
        matrix.postScale(f2, f2);
        float f3 = f / 2.0f;
        matrix.postTranslate(f3, f3);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
        return createBitmap;
    }
}
