package defpackage;

import J.N;
import android.graphics.Bitmap;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ux1 */
/* loaded from: classes.dex */
public final class C2716Ux1 implements FaviconHelper$FaviconImageCallback {
    public final /* synthetic */ Tab a;
    public final /* synthetic */ LayerTitleCache b;

    @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
    public final void onFaviconAvailable(Bitmap bitmap, GURL gurl) {
        LayerTitleCache layerTitleCache = this.b;
        layerTitleCache.getClass();
        Tab tab = this.a;
        if (tab.isInitialized()) {
            int id = tab.getId();
            C2846Vx1 c2846Vx1 = (C2846Vx1) layerTitleCache.c.get(id);
            if (c2846Vx1 == null) {
                return;
            }
            boolean z = c2846Vx1.c;
            C7837my c7837my = c2846Vx1.a;
            boolean z2 = false;
            if (z) {
                c7837my.c(bitmap);
                c2846Vx1.c = false;
                z2 = true;
            }
            if (z2) {
                long j = layerTitleCache.e;
                if (j != 0) {
                    N.MJ3tyP3k(j, layerTitleCache, id, c7837my.a);
                }
            }
        }
    }

    public C2716Ux1(LayerTitleCache layerTitleCache, Tab tab) {
        this.b = layerTitleCache;
        this.a = tab;
    }
}
