package org.chromium.chrome.browser.explore_sites;

import android.os.Parcel;
import android.util.Base64;
import defpackage.BA0;
import defpackage.C11707yF0;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b extends BA0 {
    public final /* synthetic */ C11707yF0 a;

    public b(C11707yF0 c11707yF0) {
        this.a = c11707yF0;
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        C11707yF0 c11707yF0;
        Tab tab2;
        if (("chrome-native".equals(gurl.h()) && "explore".equals(gurl.d())) || (tab2 = (c11707yF0 = this.a).l) == null || tab2.b() == null) {
            return;
        }
        NavigationController i = tab2.b().i();
        int k = i.k();
        if (i.e(k) == null) {
            return;
        }
        ExploreSitesPage$PageState exploreSitesPage$PageState = new ExploreSitesPage$PageState(Long.valueOf(System.currentTimeMillis()), (StableScrollLayoutManager$SavedState) c11707yF0.n.j0());
        Parcel obtain = Parcel.obtain();
        exploreSitesPage$PageState.writeToParcel(obtain, 0);
        String encodeToString = Base64.encodeToString(obtain.marshall(), 0);
        obtain.recycle();
        i.o(k, "ExploreSitesPageState", encodeToString);
    }
}
