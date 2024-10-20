package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.android.chrome.R;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pC3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8609pC3 extends LN3 {
    public final float b;
    public final float c;
    public final Rect d;
    public final TextPaint e;
    public int f;
    public boolean g;

    public static C8609pC3 d(Context context, int i) {
        return new C8609pC3(context, i, BitmapFactory.decodeResource(context.getResources(), R.drawable.f45210_resource_name_obfuscated_res_0x7f0900d8));
    }

    public C8609pC3(Context context, int i, Bitmap bitmap) {
        super(context, bitmap);
        this.d = new Rect();
        c(Y50.b(context, AbstractC3494aK3.d(i)));
        this.b = context.getResources().getDimension(R.dimen.f42420_resource_name_obfuscated_res_0x7f08080f);
        this.c = context.getResources().getDimension(R.dimen.f42430_resource_name_obfuscated_res_0x7f080810);
        TextPaint textPaint = new TextPaint();
        this.e = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-condensed", 1));
        textPaint.setColor(this.a.getColorForState(getState(), 0));
    }

    @Override // defpackage.LN3, android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (onStateChange) {
            this.e.setColor(this.a.getColorForState(getState(), 0));
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String format;
        super.draw(canvas);
        int i = this.f;
        if (i <= 0) {
            format = "";
        } else if (i > 99) {
            format = this.g ? ";)" : ":D";
        } else {
            format = String.format(Locale.getDefault(), "%d", Integer.valueOf(this.f));
        }
        if (format.isEmpty()) {
            return;
        }
        TextPaint textPaint = this.e;
        int length = format.length();
        Rect rect = this.d;
        textPaint.getTextBounds(format, 0, length, rect);
        Rect bounds = getBounds();
        int width = bounds.width() / 2;
        int height = bounds.height() / 2;
        int i2 = rect.bottom;
        canvas.drawText(format, width, (((i2 - rect.top) / 2) + height) - i2, textPaint);
    }

    public final void e(int i, boolean z) {
        if (i == this.f && z == this.g) {
            return;
        }
        this.f = i;
        this.g = z;
        this.e.setTextSize(i > 9 ? this.c : this.b);
        invalidateSelf();
    }

    @Override // defpackage.LN3
    public final void c(ColorStateList colorStateList) {
        super.c(colorStateList);
        TextPaint textPaint = this.e;
        if (textPaint != null) {
            textPaint.setColor(this.a.getColorForState(getState(), 0));
        }
    }
}
