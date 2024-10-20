package org.chromium.chrome.browser.offlinepages;

import defpackage.AbstractC2217Rb2;
import defpackage.ZE;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PublishPageCallback implements Callback {
    public final Callback a;
    public final OfflinePageItem g;
    public final WindowAndroid h;

    public PublishPageCallback(Callback callback, OfflinePageItem offlinePageItem, WindowAndroid windowAndroid) {
        this.h = windowAndroid;
        this.g = offlinePageItem;
        this.a = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public void onResult(String str) {
        OfflinePageItem offlinePageItem;
        if (str.isEmpty()) {
            offlinePageItem = null;
        } else {
            OfflinePageItem offlinePageItem2 = this.g;
            String str2 = offlinePageItem2.a;
            long j = offlinePageItem2.b;
            ClientId clientId = offlinePageItem2.c;
            offlinePageItem = new OfflinePageItem(str2, j, clientId.a, clientId.b, offlinePageItem2.d, str, offlinePageItem2.f, offlinePageItem2.g, offlinePageItem2.h, offlinePageItem2.i, offlinePageItem2.j);
        }
        AbstractC2217Rb2.h(this.a, offlinePageItem, this.h);
    }
}
