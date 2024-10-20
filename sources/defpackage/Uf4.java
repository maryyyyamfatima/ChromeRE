package defpackage;

import J.N;
import org.chromium.base.ThreadUtils;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Uf4 extends Fl4 {
    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        RenderFrameHost O;
        if (navigationHandle.g && navigationHandle.a && !navigationHandle.i) {
            GURL gurl = navigationHandle.e;
            WebContents webContents = (WebContents) this.a.get();
            if (webContents != null && (O = webContents.O()) != null) {
                TemplateUrlService a = IG3.a();
                a.getClass();
                Object obj = ThreadUtils.a;
                if (N.MF3JCGn0(a.c, a, gurl)) {
                    O.d();
                }
            }
        }
        destroy();
    }

    public Uf4(WebContents webContents) {
        super(webContents);
    }
}
