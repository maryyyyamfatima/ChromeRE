package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ww0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11258ww0 implements InputFilter {
    public final /* synthetic */ Pattern a;

    public C11258ww0(Pattern pattern) {
        this.a = pattern;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i == i2 || this.a.matcher(charSequence.subSequence(i, i2)).matches()) {
            return null;
        }
        return "";
    }
}
