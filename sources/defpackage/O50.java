package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class O50 {
    public static String a(String str, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        String a = AbstractC4199cO1.a("--", str, "=");
        for (String str2 : strArr) {
            if (str2 != null && str2.startsWith(a)) {
                return str2.substring(a.length());
            }
        }
        return null;
    }
}
