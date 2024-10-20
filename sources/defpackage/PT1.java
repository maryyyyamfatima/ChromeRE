package defpackage;

import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PT1 {
    public final WebContents a;
    public final NavigationHandle b;

    public PT1(NavigationHandle navigationHandle, WebContents webContents) {
        this.b = navigationHandle;
        this.a = webContents;
    }

    public final String a() {
        GURL gurl;
        NavigationHandle navigationHandle = this.b;
        if (navigationHandle == null || (gurl = navigationHandle.e) == null) {
            return null;
        }
        return gurl.d();
    }
}
