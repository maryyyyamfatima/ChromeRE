package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Az0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126Az0 implements InputFilter {
    public final TextView a;

    public C0126Az0(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        synchronized (AbstractC7499lz0.a) {
        }
        throw null;
    }
}
