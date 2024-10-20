package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GZ3 extends ReplacementSpan {
    public final C0646Ez0 g;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public float h = 1.0f;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C7843mz0.a().getClass();
        C0646Ez0 c0646Ez0 = this.g;
        VW1 vw1 = c0646Ez0.b;
        Typeface typeface = vw1.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(vw1.b, c0646Ez0.a * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    public GZ3(C0646Ez0 c0646Ez0) {
        this.g = c0646Ez0;
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0646Ez0 c0646Ez0 = this.g;
        this.h = abs / (c0646Ez0.c().a(14) != 0 ? r8.b.getShort(r1 + r8.a) : (short) 0);
        FW1 c = c0646Ez0.c();
        int a = c.a(14);
        if (a != 0) {
            c.b.getShort(a + c.a);
        }
        short s = (short) ((c0646Ez0.c().a(12) != 0 ? r5.b.getShort(r7 + r5.a) : (short) 0) * this.h);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
