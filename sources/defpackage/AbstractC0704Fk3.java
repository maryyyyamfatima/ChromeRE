package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fk3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0704Fk3 {
    public static StaticLayout a(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, DH3 dh3, int i5, int i6, int i7, boolean z2) {
        int i8 = Build.VERSION.SDK_INT;
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, 0, i, textPaint, i2).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i3).setMaxLines(i4).setTextDirection(AbstractC0834Gk3.a(dh3)).setBreakStrategy(i5).setHyphenationFrequency(i6).setIndents(null, null);
        if (i8 >= 26) {
            indents.setJustificationMode(i7);
        }
        if (i8 >= 28) {
            indents.setUseLineSpacingFromFallbacks(z2);
        }
        return indents.build();
    }
}
