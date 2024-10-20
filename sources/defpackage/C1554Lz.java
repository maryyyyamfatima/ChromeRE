package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lz */
/* loaded from: classes.dex */
public final class C1554Lz implements BookmarkBridge.PriceUpdateCallback {
    public final /* synthetic */ BookmarkBridge.PriceUpdateCallback a;
    public final /* synthetic */ HashMap b;

    public C1554Lz(C0898Gx2 c0898Gx2, HashMap hashMap) {
        this.a = c0898Gx2;
        this.b = hashMap;
    }

    @Override // org.chromium.chrome.browser.bookmarks.BookmarkBridge.PriceUpdateCallback
    public final void a(BookmarkId bookmarkId, GURL gurl, C1038Hz2 c1038Hz2) {
        this.a.a((BookmarkId) this.b.get(gurl), gurl, c1038Hz2);
    }
}
