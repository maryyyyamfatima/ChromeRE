package org.chromium.components.search_engines;

import J.N;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TemplateUrl {
    public final long a;

    public static TemplateUrl create(long j) {
        return new TemplateUrl(j);
    }

    public TemplateUrl(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TemplateUrl) && this.a == ((TemplateUrl) obj).a;
    }

    public final String toString() {
        return String.format(Locale.US, "TemplateURL -- keyword: %s, short name: %s, prepopulated: %b", b(), c(), Boolean.valueOf(a()));
    }

    public final String c() {
        return N.M35ewi23(this.a);
    }

    public final String b() {
        return N.M74Ymq6T(this.a);
    }

    public final boolean a() {
        return N.M_Gh_h3K(this.a);
    }
}
