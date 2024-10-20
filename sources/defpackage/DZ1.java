package defpackage;

import android.widget.NumberPicker;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DZ1 implements NumberPicker.Formatter {
    public final String a;

    public DZ1(String str) {
        this.a = str;
    }

    @Override // android.widget.NumberPicker.Formatter
    public final String format(int i) {
        return String.format(Locale.getDefault(), this.a, Integer.valueOf(i));
    }
}
