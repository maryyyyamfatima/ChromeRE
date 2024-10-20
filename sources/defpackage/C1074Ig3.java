package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ig3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074Ig3 extends MetricAffectingSpan {
    public final float a;

    public C1074Ig3(float f) {
        this.a = f;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }
}
