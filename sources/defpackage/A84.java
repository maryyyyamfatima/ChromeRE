package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A84 {
    public static final A84 a = new A84();
    public static final Set b = Collections.synchronizedSet(new HashSet());

    public static String b(String str, C1193Je2 c1193Je2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(",");
        sb.append(c1193Je2);
        sb.append(",");
        sb.append(i);
        return Y5.a(sb, ",", "");
    }

    public static HashSet a() {
        C7432ln3 c = C7432ln3.c();
        try {
            HashSet hashSet = new HashSet(O83.a.j("verified_digital_asset_links"));
            c.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
