package defpackage;

import J.N;
import android.graphics.Rect;
import android.view.ContextMenu;
import android.view.View;
import java.util.ArrayList;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategory;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategoryCardView;
import org.chromium.chrome.browser.explore_sites.ExploreSitesSite;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pF0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC8621pF0 implements G60, View.OnClickListener, View.OnCreateContextMenuListener, View.OnFocusChangeListener {
    public final GURL a;
    public final int g;
    public final /* synthetic */ ExploreSitesCategoryCardView h;

    @Override // defpackage.G60
    public final void d() {
    }

    @Override // defpackage.G60
    public final boolean e(int i) {
        return true;
    }

    @Override // defpackage.G60
    public final void a(int i) {
        this.h.k.d(i, new LoadUrlParams(this.a, 0));
    }

    @Override // defpackage.G60
    public final void b() {
        LD2 ld2;
        ExploreSitesCategoryCardView exploreSitesCategoryCardView = this.h;
        N.MJLsMSPT(exploreSitesCategoryCardView.l, this.a.i());
        ExploreSitesCategory exploreSitesCategory = exploreSitesCategoryCardView.n;
        ArrayList arrayList = exploreSitesCategory.d;
        int size = arrayList.size();
        int i = this.g;
        if (i <= size && i >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size2 = arrayList.size();
                ld2 = ExploreSitesSite.g;
                if (i2 < size2) {
                    if (!((ExploreSitesSite) arrayList.get(i2)).a.j(ld2)) {
                        i3++;
                    }
                    if (i + 1 == i3 && !((ExploreSitesSite) arrayList.get(i2)).a.j(ld2)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    break;
                }
            }
            if (i2 < arrayList.size()) {
                ((ExploreSitesSite) arrayList.get(i2)).a.k(ld2, true);
                PropertyModel propertyModel = ((ExploreSitesSite) arrayList.get(i2)).a;
                ND2 nd2 = ExploreSitesSite.c;
                propertyModel.m(nd2, -1);
                while (i2 < arrayList.size()) {
                    ExploreSitesSite exploreSitesSite = (ExploreSitesSite) arrayList.get(i2);
                    if (!((ExploreSitesSite) arrayList.get(i2)).a.j(ld2)) {
                        exploreSitesSite.a.m(nd2, i);
                        i++;
                    }
                    i2++;
                }
                exploreSitesCategory.e++;
            }
        }
        exploreSitesCategoryCardView.a(exploreSitesCategoryCardView.n);
    }

    @Override // defpackage.G60
    public final void c() {
        this.h.k.a(new LoadUrlParams(this.a, 0));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ExploreSitesCategoryCardView exploreSitesCategoryCardView = this.h;
        EI2.h(exploreSitesCategoryCardView.n.b, 20, "ExploreSites.CategoryClick");
        EI2.i((exploreSitesCategoryCardView.o * C11707yF0.u) + this.g, 1, 100, 100, "ExploreSites.SiteTilesClickIndex2");
        FI2.a("Android.ExploreSitesPage.ClickOnSiteIcon");
        Profile profile = exploreSitesCategoryCardView.l;
        GURL gurl = this.a;
        N.M3SRRqtf(profile, gurl.i(), exploreSitesCategoryCardView.n.b);
        exploreSitesCategoryCardView.k.d(1, new LoadUrlParams(gurl.i(), 2));
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.h.j.a(contextMenu, view, this);
    }

    public ViewOnClickListenerC8621pF0(ExploreSitesCategoryCardView exploreSitesCategoryCardView, GURL gurl, int i) {
        this.h = exploreSitesCategoryCardView;
        this.a = gurl;
        this.g = i;
    }

    @Override // defpackage.G60
    public final GURL getUrl() {
        return this.a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            View view2 = this.h;
            view2.getParent().requestChildRectangleOnScreen(view2, new Rect(0, 0, view2.getWidth(), view2.getHeight()), false);
        }
    }
}
