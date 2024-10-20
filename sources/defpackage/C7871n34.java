package defpackage;

import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n34, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7871n34 {
    public final CharSequence a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final int e;

    public C7871n34(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final String toString() {
        return String.format(Locale.US, "%s: text: %s; scrollType: %d; selectionState: %d", C7871n34.class.getSimpleName(), this.a, Integer.valueOf(this.c), Integer.valueOf(this.e));
    }
}
