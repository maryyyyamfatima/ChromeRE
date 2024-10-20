package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.offlinepages.OfflinePageItem;
import org.chromium.chrome.browser.suggestions.tile.SuggestionsTileView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rp3 */
/* loaded from: classes.dex */
public final class C9504rp3 implements Callback {
    public final /* synthetic */ InterfaceC0263Ca2 a;
    public final /* synthetic */ WL3 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C9504rp3(WL3 wl3, AbstractC9847sp3 abstractC9847sp3, InterfaceC0263Ca2 interfaceC0263Ca2) {
        this.g = wl3;
        this.a = interfaceC0263Ca2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        OfflinePageItem offlinePageItem = (OfflinePageItem) obj;
        WL3 wl3 = this.g;
        wl3.getClass();
        PL3 pl3 = (PL3) this.a;
        boolean z = pl3.g != null;
        Long valueOf = offlinePageItem == null ? null : Long.valueOf(offlinePageItem.b);
        pl3.g = valueOf;
        if (z == (valueOf != null)) {
            return;
        }
        C5285fZ1 c5285fZ1 = wl3.b.d;
        c5285fZ1.getClass();
        SuggestionsTileView a = c5285fZ1.a(pl3.a);
        if (a != null) {
            a.a.setVisibility(pl3.g != null ? 0 : 8);
        }
        Runnable runnable = c5285fZ1.o;
        if (runnable != null) {
            runnable.run();
        }
    }
}
