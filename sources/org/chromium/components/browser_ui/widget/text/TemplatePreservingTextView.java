package org.chromium.components.browser_ui.widget.text;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.C10475ug;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TemplatePreservingTextView extends C10475ug {
    public String k;
    public CharSequence l;
    public CharSequence m;

    public TemplatePreservingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = "";
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.l = charSequence;
        String str = this.k;
        if (str != null) {
            charSequence = String.format(str, charSequence);
        }
        setContentDescription(charSequence);
        g(0, true);
    }

    @Override // defpackage.C10475ug, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        g((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), View.MeasureSpec.getMode(i) == 0);
        super.onMeasure(i, i2);
    }

    public final void g(int i, boolean z) {
        CharSequence format;
        if (this.k == null) {
            format = this.l;
        } else if (getMaxLines() == 1 && !z) {
            TextPaint paint = getPaint();
            format = String.format(this.k, TextUtils.ellipsize(this.l, paint, Math.max(i - paint.measureText(String.format(this.k, "")), 0.0f), TextUtils.TruncateAt.END));
        } else {
            format = String.format(this.k, this.l);
        }
        if (format.equals(this.m)) {
            return;
        }
        this.m = format;
        super.setText(format, TextView.BufferType.SPANNABLE);
    }
}
