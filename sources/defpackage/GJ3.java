package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class GJ3 {
    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof FJ3) || callback == null) ? callback : new FJ3(callback, textView);
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        return (!(callback instanceof FJ3) || Build.VERSION.SDK_INT < 26) ? callback : ((FJ3) callback).a;
    }

    public static void a(int i, TextView textView) {
        int i2;
        if (Build.VERSION.SDK_INT < 28) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.top;
            } else {
                i2 = fontMetricsInt.ascent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void b(int i, TextView textView) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void c(int i, TextView textView) {
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }
}
