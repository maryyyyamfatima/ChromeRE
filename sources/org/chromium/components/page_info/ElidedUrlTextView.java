package org.chromium.components.page_info;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import defpackage.C10475ug;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ElidedUrlTextView extends C10475ug {
    public Integer k;
    public Integer l;
    public boolean m;
    public int n;
    public int o;

    public ElidedUrlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
        this.n = -1;
        this.o = Integer.MAX_VALUE;
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        super.setMaxLines(i);
        this.o = i;
    }

    @Override // defpackage.C10475ug, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
        String charSequence = getText().toString();
        int i3 = this.n;
        Layout layout = getLayout();
        boolean z = false;
        int i4 = 0;
        while (i4 < layout.getLineCount() && layout.getLineEnd(i4) < i3) {
            i4++;
        }
        this.k = Integer.valueOf(i4 + 1 + 1);
        int indexOf = charSequence.indexOf(35);
        if (indexOf == -1) {
            indexOf = charSequence.length();
        }
        Layout layout2 = getLayout();
        int i5 = 0;
        while (i5 < layout2.getLineCount() && layout2.getLineEnd(i5) < indexOf) {
            i5++;
        }
        Integer valueOf = Integer.valueOf(i5 + 1 + 1);
        this.l = valueOf;
        if (valueOf.intValue() < this.k.intValue()) {
            this.k = this.l;
        }
        int intValue = this.l.intValue();
        if (this.m) {
            intValue = this.k.intValue();
        }
        if (intValue != this.o) {
            setMaxLines(intValue);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }
}
