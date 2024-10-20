package org.chromium.content_public.browser;

import android.graphics.Bitmap;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NavigationEntry {
    public final int a;
    public final GURL b;
    public final GURL c;
    public final GURL d;
    public final GURL e;
    public final String f;
    public Bitmap g;

    public NavigationEntry(int i, GURL gurl, GURL gurl2, GURL gurl3, GURL gurl4, String str, Bitmap bitmap) {
        this.a = i;
        this.b = gurl;
        this.d = gurl2;
        this.c = gurl3;
        this.e = gurl4;
        this.f = str;
        this.g = bitmap;
    }
}
