package org.chromium.chrome.browser.instantapps;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class InstantAppsBannerData {
    public final String a;
    public final Bitmap b;
    public final String c;
    public final Intent d;
    public final WebContents e;
    public final Uri f;
    public final String g;
    public final boolean h;

    public InstantAppsBannerData(String str, Bitmap bitmap, String str2, Uri uri, Intent intent, String str3, WebContents webContents, boolean z) {
        this.a = str;
        this.b = bitmap;
        this.c = str2;
        this.d = intent;
        this.g = str3;
        this.e = webContents;
        this.f = uri;
        this.h = z;
    }
}
