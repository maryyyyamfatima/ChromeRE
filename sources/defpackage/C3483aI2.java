package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.DrawableWrapper;
import android.text.TextPaint;
import com.android.chrome.R;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aI2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3483aI2 extends DrawableWrapper {
    public final Rect a;
    public final TextPaint g;
    public ColorStateList h;
    public int i;

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C3483aI2(Activity activity) {
        super(AbstractC8540p04.e(R.drawable.f50120_resource_name_obfuscated_res_0x7f09030d, R.color.f17870_resource_name_obfuscated_res_0x7f07012b, activity));
        this.a = new Rect();
        TextPaint textPaint = new TextPaint();
        this.g = textPaint;
        b(Y50.b(activity, R.color.f17870_resource_name_obfuscated_res_0x7f07012b));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-condensed", 1));
        textPaint.setColor(a());
        textPaint.setTextSize(activity.getResources().getDimension(R.dimen.f39610_resource_name_obfuscated_res_0x7f0806ec));
    }

    public final void b(ColorStateList colorStateList) {
        if (this.h == colorStateList) {
            return;
        }
        this.h = colorStateList;
        if (colorStateList != null) {
            setColorFilter(a(), PorterDuff.Mode.SRC_IN);
        }
        super.setTint(a());
        TextPaint textPaint = this.g;
        if (textPaint != null) {
            textPaint.setColor(a());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        b(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String format;
        super.draw(canvas);
        int i = this.i;
        if (i <= 0) {
            format = "";
        } else {
            format = i > 99 ? ":D" : String.format(Locale.getDefault(), "%d", Integer.valueOf(this.i));
        }
        if (format.isEmpty()) {
            return;
        }
        TextPaint textPaint = this.g;
        int length = format.length();
        Rect rect = this.a;
        textPaint.getTextBounds(format, 0, length, rect);
        Rect bounds = getBounds();
        int round = Math.round(bounds.width() * 0.583f) + bounds.left;
        int round2 = Math.round(bounds.height() * 0.5833333f) + bounds.top;
        int i2 = rect.bottom;
        canvas.drawText(format, round, (((i2 - rect.top) / 2) + round2) - i2, textPaint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        if (this.h == null) {
            z = false;
        } else {
            setColorFilter(a(), PorterDuff.Mode.SRC_IN);
            z = true;
        }
        if (z) {
            this.g.setColor(a());
        }
        return z || super.onStateChange(iArr);
    }

    public final int a() {
        return this.h.getColorForState(getState(), 0);
    }
}
