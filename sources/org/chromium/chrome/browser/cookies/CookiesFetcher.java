package org.chromium.chrome.browser.cookies;

import defpackage.AbstractC0185Bl;
import defpackage.V60;
import defpackage.Y80;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CookiesFetcher {
    public static String a() {
        return V60.a.getFileStreamPath("COOKIES.DAT").getAbsolutePath();
    }

    public static CanonicalCookie createCookie(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, boolean z, boolean z2, int i, int i2, boolean z3, String str5, int i3, int i4) {
        return new CanonicalCookie(str, str2, str3, str4, j, j2, j3, j4, z, z2, i, i2, z3, str5, i3, i4);
    }

    public static void onCookieFetchFinished(CanonicalCookie[] canonicalCookieArr) {
        new Y80(canonicalCookieArr).c(AbstractC0185Bl.f);
    }

    public static CanonicalCookie[] createCookiesArray(int i) {
        return new CanonicalCookie[i];
    }
}
