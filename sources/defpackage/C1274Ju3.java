package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ju3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1274Ju3 implements InterfaceC8104nl {
    public final /* synthetic */ int a;

    public C1274Ju3(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC8104nl
    public final C0964Hk3 a(int i) {
        if (i != 0) {
            return null;
        }
        float f = (this.a * 0.5f) / 0.5f;
        float f2 = 0.866f * f;
        float f3 = -f;
        float f4 = f3 / 2.0f;
        float f5 = f3 - f2;
        float f6 = 2.0f * f;
        RectF rectF = new RectF(f4, f5, f4 + f6, f6 + f5);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setAlpha(187);
        paint.setStyle(Paint.Style.FILL);
        Bitmap createBitmap = Bitmap.createBitmap((int) f, (int) (f - f2), Bitmap.Config.ALPHA_8);
        new Canvas(createBitmap).drawArc(rectF, 45.0f, 90.0f, true, paint);
        return new C0964Hk3(createBitmap);
    }
}
