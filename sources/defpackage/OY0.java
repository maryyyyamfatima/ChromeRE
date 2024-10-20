package defpackage;

import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.offlinepages.ClientId;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.chrome.browser.offlinepages.OfflinePageItem;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OY0 implements Callback {
    public final Tab a;
    public final Callback g;
    public final OfflinePageBridge h;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Callback callback;
        Tab tab;
        OfflinePageItem offlinePageItem;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            callback = this.g;
            tab = this.a;
            if (!hasNext) {
                WebContents b = tab.b();
                ClientId clientId = new ClientId("live_page_sharing", Integer.toString(tab.getId()));
                WindowAndroid m = tab.m();
                OfflinePageBridge offlinePageBridge = this.h;
                offlinePageBridge.b(b, clientId, new YU2(m, callback, offlinePageBridge));
                return;
            }
            offlinePageItem = (OfflinePageItem) it.next();
        } while (!offlinePageItem.a.equals(tab.getUrl().i()));
        AbstractC2217Rb2.h(callback, offlinePageItem, tab.m());
    }

    public OY0(Tab tab, E63 e63, OfflinePageBridge offlinePageBridge) {
        this.a = tab;
        this.g = e63;
        this.h = offlinePageBridge;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
