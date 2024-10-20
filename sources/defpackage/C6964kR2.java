package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kR2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6964kR2 {
    public final int a;
    public final int b;
    public final int c;
    public final RectF d;
    public final Paint e;
    public final TextPaint f;
    public final float g;

    public C6964kR2(Resources resources, int i, int i2, int i3, int i4, int i5) {
        this((int) (resources.getDisplayMetrics().density * i), (int) (resources.getDisplayMetrics().density * i2), (int) (resources.getDisplayMetrics().density * i3), i4, resources.getDisplayMetrics().density * i5);
    }

    public C6964kR2(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = new RectF(0.0f, 0.0f, i, i2);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(i4);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setColor(-1);
        textPaint.setFakeBoldText(true);
        textPaint.setTextSize(f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        this.g = Math.max((i2 - (fontMetrics.bottom - fontMetrics.top)) / 2.0f, 0.0f) - fontMetrics.top;
    }

    public final Bitmap a(String str) {
        int i = this.b;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i2 = this.a;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, config);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = this.d;
        int i3 = this.c;
        canvas.drawRoundRect(rectF, i3, i3, this.e);
        canvas.drawText(str.substring(0, Math.min(1, str.length())).toUpperCase(Locale.getDefault()), i2 / 2.0f, this.g, this.f);
        return createBitmap;
    }

    public final Bitmap b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String b = T34.b(str, z);
        if (!TextUtils.isEmpty(b)) {
            str = b;
        } else if (str.startsWith("chrome://") || str.startsWith("chrome-native://")) {
            str = "chrome";
        } else {
            try {
                NZ3 nz3 = new NZ3(str);
                if (!TextUtils.isEmpty(nz3.d())) {
                    str = nz3.d();
                }
            } catch (Exception unused) {
                AbstractC4851eH1.f("RoundedIconGenerator", "Unable to parse the URL for generating an icon: ".concat(str), new Object[0]);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }
}
