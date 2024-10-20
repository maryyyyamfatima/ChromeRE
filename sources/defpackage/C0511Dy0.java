package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511Dy0 implements LineHeightSpan {
    public final float a;

    public C0511Dy0(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        float f = this.a;
        if (f > 0.0f) {
            int i5 = fontMetricsInt.bottom;
            double d = (f - (i5 - r5)) / 2.0f;
            fontMetricsInt.top = (int) (fontMetricsInt.top - Math.floor(d));
            int ceil = (int) (Math.ceil(d) + fontMetricsInt.bottom);
            fontMetricsInt.bottom = ceil;
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = ceil;
        }
    }
}
