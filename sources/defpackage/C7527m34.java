package defpackage;

import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m34, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7527m34 {
    public final String a;
    public final String b;

    public C7527m34(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "%s: user text: %s; autocomplete text: %s", C7527m34.class.getSimpleName(), this.a, this.b);
    }
}
