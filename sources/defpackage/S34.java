package defpackage;

import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class S34 {
    public static boolean a(GURL gurl) {
        return gurl.b && !gurl.h().isEmpty() && ("https".equals(gurl.h()) || "http".equals(gurl.h()));
    }
}
