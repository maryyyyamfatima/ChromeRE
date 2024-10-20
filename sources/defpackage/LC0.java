package defpackage;

import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LC0 {
    public final QB a;
    public final FC0 b;
    public final int c;
    public WebContents d;
    public PC0 e;
    public IC0 f;
    public Profile g;

    public LC0(QB qb, FC0 fc0, int i) {
        this.a = qb;
        this.b = fc0;
        this.c = i;
    }

    public final void a(GURL gurl) {
        this.d.i().d(new LoadUrlParams(gurl.i(), 0));
    }
}
