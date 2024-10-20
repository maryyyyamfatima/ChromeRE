package defpackage;

import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3829bJ {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        AbstractC0087Ar1.d(forName, "forName(\"UTF-8\")");
        a = forName;
        AbstractC0087Ar1.d(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        AbstractC0087Ar1.d(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        AbstractC0087Ar1.d(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        AbstractC0087Ar1.d(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        AbstractC0087Ar1.d(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
