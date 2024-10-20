package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v34, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10615v34 {
    public static GURL a(String str) {
        if (TextUtils.isEmpty(str)) {
            return GURL.emptyGURL();
        }
        GURL.b();
        return (GURL) N.Ml2KxI$W(str);
    }

    public static String b(int i, GURL gurl) {
        return gurl == null ? "" : N.MN7bz_Mm(gurl, i);
    }
}
