package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E74 extends ImageSpan {
    public final Paint.FontMetricsInt a;

    public E74(C6386il0 c6386il0) {
        super(c6386il0, 0);
        this.a = new Paint.FontMetricsInt();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = this.a;
        paint.getFontMetricsInt(fontMetricsInt);
        Rect bounds = drawable.getBounds();
        int i6 = fontMetricsInt.bottom;
        canvas.translate(f, (((i4 + i6) - ((i6 - fontMetricsInt.top) / 2)) - (bounds.height() / 2)) + 1);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        int i3 = fontMetricsInt2.ascent;
        int i4 = fontMetricsInt2.top;
        int i5 = i3 - i4;
        int i6 = fontMetricsInt2.bottom;
        int i7 = i6 - fontMetricsInt2.descent;
        int i8 = i6 - ((i6 - i4) / 2);
        int height = bounds.height() / 2;
        if (fontMetricsInt != null) {
            int i9 = i8 - height;
            fontMetricsInt.ascent = i9;
            int i10 = i8 + height;
            fontMetricsInt.descent = i10;
            fontMetricsInt.top = i9 - i5;
            fontMetricsInt.bottom = i10 + i7;
        }
        return bounds.right;
    }
}
