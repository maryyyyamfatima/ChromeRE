package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2089Qc {
    public final Context a;
    public final float b;
    public String d;
    public int e;
    public final SpannableStringBuilder c = new SpannableStringBuilder();
    public int f = 1;

    public AbstractC2089Qc(Context context) {
        this.a = context;
        this.b = context.getResources().getDisplayMetrics().density;
    }

    public final void a(String str, MetricAffectingSpan[] metricAffectingSpanArr) {
        int textSize;
        int indexOf;
        String obj = Html.fromHtml(str).toString();
        C2219Rc c2219Rc = (C2219Rc) this;
        if (c2219Rc.g && c2219Rc.h == 10 && (indexOf = obj.indexOf(" = ")) > 0) {
            obj = obj.substring(indexOf + 3);
        }
        for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
            if ((metricAffectingSpan instanceof TextAppearanceSpan) && this.e < (textSize = (int) (((TextAppearanceSpan) r3).getTextSize() / this.b))) {
                this.e = textSize;
            }
        }
        SpannableStringBuilder spannableStringBuilder = this.c;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) obj);
        int length2 = spannableStringBuilder.length();
        for (MetricAffectingSpan metricAffectingSpan2 : metricAffectingSpanArr) {
            spannableStringBuilder.setSpan(metricAffectingSpan2, length, length2, 33);
        }
    }
}
