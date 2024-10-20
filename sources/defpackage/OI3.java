package defpackage;

import android.text.TextUtils;
import android.view.inputmethod.SurroundingText;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OI3 {
    public final CharSequence a;
    public final YG2 b;
    public final YG2 c;
    public final boolean d;
    public final boolean e;

    public final SurroundingText a(int i, int i2) {
        YG2 yg2 = this.b;
        int max = Math.max(0, Math.min(i, yg2.a));
        CharSequence charSequence = this.a;
        return new SurroundingText(TextUtils.substring(charSequence, yg2.a - max, yg2.b + Math.max(0, Math.min(i2, charSequence.length() - yg2.b))), max, yg2.b - (yg2.a - max), -1);
    }

    public OI3(CharSequence charSequence, YG2 yg2, YG2 yg22, boolean z, boolean z2) {
        int length = charSequence.length();
        yg2.a = Math.min(Math.max(yg2.a, 0), length);
        yg2.b = Math.max(Math.min(yg2.b, length), 0);
        if (yg22.a != -1 || yg22.b != -1) {
            int length2 = charSequence.length();
            yg22.a = Math.min(Math.max(yg22.a, 0), length2);
            yg22.b = Math.max(Math.min(yg22.b, length2), 0);
        }
        this.a = charSequence;
        this.b = yg2;
        this.c = yg22;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OI3)) {
            return false;
        }
        OI3 oi3 = (OI3) obj;
        if (oi3 == this) {
            return true;
        }
        return TextUtils.equals(this.a, oi3.a) && this.b.equals(oi3.b) && this.c.equals(oi3.c) && this.d == oi3.d && this.e == oi3.e;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 13) + (this.b.hashCode() * 11) + (this.a.hashCode() * 7) + (this.d ? 19 : 0) + (this.e ? 23 : 0);
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = this.a;
        objArr[1] = this.b;
        objArr[2] = this.c;
        objArr[3] = this.d ? "SIN" : "MUL";
        objArr[4] = this.e ? " ReplyToRequest" : "";
        return String.format(locale, "TextInputState {[%s] SEL%s COM%s %s%s}", objArr);
    }
}
