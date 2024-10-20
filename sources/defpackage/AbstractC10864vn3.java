package defpackage;

import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10864vn3 {
    public static final char[] a = {';', ',', '\"', '\'', '\n', '\r', '\t'};

    public static String a(String str) {
        char[] cArr = a;
        for (int i = 0; i < 7; i++) {
            str = str.replace(cArr[i], ' ');
        }
        try {
            str = str.replaceAll("  *", " ");
        } catch (PatternSyntaxException unused) {
        }
        return str.toLowerCase(Locale.US).trim();
    }
}
