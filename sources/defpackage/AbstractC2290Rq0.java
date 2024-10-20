package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2290Rq0 {
    public static GURL a(GURL gurl) {
        return gurl.k() ? gurl : (GURL) N.M1WDPiaY(gurl.i());
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return N.Me1sexxj(str);
    }

    public static boolean c(GURL gurl) {
        return b(gurl.i());
    }
}
