package defpackage;

import J.N;
import android.text.TextUtils;
import android.view.ViewStub;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.search_resumption.SearchResumptionModuleBridge;
import org.chromium.chrome.browser.search_resumption.SearchResumptionModuleView;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileContainerView;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileView;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.components.omnibox.AutocompleteResult;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p03 */
/* loaded from: classes.dex */
public final class C8539p03 implements InterfaceC2799Vo, InterfaceC5298fb3, InterfaceC1528Lt3 {
    public final ViewStub a;
    public final Tab g;
    public final Tab h;
    public final C10253u03 i;
    public final SigninManager j;
    public final AbstractC1658Mt3 k;
    public AutocompleteController l;
    public PropertyModel m;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public SearchResumptionModuleView q;
    public SearchResumptionModuleBridge r;

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void i() {
    }

    public C8539p03(ViewStub viewStub, Tab tab, Tab tab2, Profile profile, C10253u03 c10253u03, C11625y03 c11625y03) {
        this.a = viewStub;
        this.g = tab;
        this.h = tab2;
        this.i = c10253u03;
        C7928nE c7928nE = UN.a;
        boolean M6bsIDpc = N.M6bsIDpc("SearchResumptionModuleAndroid", "use_new_service", false);
        if (c11625y03 != null) {
            if (M6bsIDpc) {
                e(c11625y03.b, c11625y03.c, true);
            } else {
                d(c11625y03.d, true);
            }
        } else if (!M6bsIDpc) {
            AutocompleteController autocompleteController = profile == null ? null : (AutocompleteController) N.MDwR4hsq(profile);
            this.l = autocompleteController;
            autocompleteController.a.add(this);
            TemplateUrlService a = IG3.a();
            GURL url = tab.getUrl();
            a.getClass();
            Object obj = ThreadUtils.a;
            int i = N.MF3JCGn0(a.c, a, url) ? 9 : 4;
            AutocompleteController autocompleteController2 = this.l;
            String i2 = tab.getUrl().i();
            String title = tab.getTitle();
            if (autocompleteController2.b != 0 && !TextUtils.isEmpty(i2)) {
                N.MmFptZoy(autocompleteController2.b, "", i2, i, title);
            }
        } else {
            SearchResumptionModuleBridge searchResumptionModuleBridge = new SearchResumptionModuleBridge(profile);
            this.r = searchResumptionModuleBridge;
            String i3 = tab.getUrl().i();
            C8196o03 c8196o03 = new C8196o03(this);
            long j = searchResumptionModuleBridge.a;
            if (j != 0) {
                searchResumptionModuleBridge.b = c8196o03;
                N.MK2gNevr(j, searchResumptionModuleBridge, i3);
            }
        }
        C1202Jg1.a().getClass();
        SigninManager c = C1202Jg1.c(profile);
        this.j = c;
        c.b(this);
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        this.k = b;
        b.a(this);
        IG3.a().a(new C7508m03(this));
    }

    @Override // defpackage.InterfaceC2799Vo
    public final void a(AutocompleteResult autocompleteResult, String str, boolean z) {
        boolean z2;
        if (z && this.m == null) {
            List<AutocompleteMatch> list = autocompleteResult.b;
            if (list.size() >= 2) {
                int i = 0;
                for (AutocompleteMatch autocompleteMatch : list) {
                    z2 = true;
                    if ((TextUtils.isEmpty(autocompleteMatch.d) ^ true) && autocompleteMatch.a == 8) {
                        i++;
                    }
                    if (i >= 2) {
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                AbstractC9224r03.a(0);
            } else {
                d(autocompleteResult.b, false);
            }
        }
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        this.p = N.Mlc5dpRY(((SyncServiceImpl) this.k).c);
        f();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        this.o = true;
        f();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void g() {
        this.o = false;
        f();
    }

    public final void d(List list, boolean z) {
        if (c()) {
            SearchResumptionTileContainerView searchResumptionTileContainerView = (SearchResumptionTileContainerView) this.q.findViewById(R.id.search_resumption_module_tiles_container);
            C10253u03 c10253u03 = this.i;
            c10253u03.getClass();
            TraceEvent i = TraceEvent.i("SearchSuggestionTileProvider.addTileSection", null);
            try {
                int min = Math.min(list.size(), 3);
                int i2 = 0;
                for (int i3 = 0; i2 < min && i3 < list.size(); i3++) {
                    AutocompleteMatch autocompleteMatch = (AutocompleteMatch) list.get(i3);
                    boolean z2 = true;
                    if (!(!TextUtils.isEmpty(autocompleteMatch.d)) || autocompleteMatch.a != 8) {
                        z2 = false;
                    }
                    if (z2) {
                        searchResumptionTileContainerView.addView(c10253u03.a(autocompleteMatch.d, autocompleteMatch.j, searchResumptionTileContainerView));
                        i2++;
                    }
                }
                int childCount = searchResumptionTileContainerView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    ((SearchResumptionTileView) searchResumptionTileContainerView.getChildAt(i4)).a(i4, childCount);
                }
                if (i != null) {
                    i.close();
                }
                EI2.h(O83.a.e("Chrome.SearchResumptionModule.Collapse", false) ? 1 : 0, 2, z ? "NewTabPage.SearchResumptionModule.Show.Cached" : "NewTabPage.SearchResumptionModule.Show");
                if (z) {
                    return;
                }
                GURL url = this.g.getUrl();
                Tab tab = this.h;
                if (tab == null || !T34.k(tab.getUrl())) {
                    return;
                }
                C11968z03 a = C11968z03.a(tab);
                if (a == null) {
                    a = new C11968z03();
                }
                a.a = System.currentTimeMillis();
                a.g = new C11625y03(url, list);
                tab.F().d(C11968z03.class, a);
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
    }

    public final void e(String[] strArr, GURL[] gurlArr, boolean z) {
        if (c()) {
            SearchResumptionTileContainerView searchResumptionTileContainerView = (SearchResumptionTileContainerView) this.q.findViewById(R.id.search_resumption_module_tiles_container);
            C10253u03 c10253u03 = this.i;
            c10253u03.getClass();
            TraceEvent i = TraceEvent.i("SearchSuggestionTileProvider.addTileSection", null);
            try {
                int min = Math.min(gurlArr.length, 3);
                int i2 = 0;
                for (int i3 = 0; i2 < min && i3 < gurlArr.length; i3++) {
                    if (!TextUtils.isEmpty(strArr[i3])) {
                        searchResumptionTileContainerView.addView(c10253u03.a(strArr[i3], gurlArr[i3], searchResumptionTileContainerView));
                        i2++;
                    }
                }
                int childCount = searchResumptionTileContainerView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    ((SearchResumptionTileView) searchResumptionTileContainerView.getChildAt(i4)).a(i4, childCount);
                }
                if (i != null) {
                    i.close();
                }
                EI2.h(O83.a.e("Chrome.SearchResumptionModule.Collapse", false) ? 1 : 0, 2, z ? "NewTabPage.SearchResumptionModule.Show.Cached" : "NewTabPage.SearchResumptionModule.Show");
                if (z) {
                    return;
                }
                GURL url = this.g.getUrl();
                Tab tab = this.h;
                if (tab == null || !T34.k(tab.getUrl())) {
                    return;
                }
                C11968z03 a = C11968z03.a(tab);
                if (a == null) {
                    a = new C11968z03();
                }
                a.a = System.currentTimeMillis();
                a.g = new C11625y03(url, strArr, gurlArr);
                tab.F().d(C11968z03.class, a);
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.m != null) {
            return false;
        }
        this.q = (SearchResumptionModuleView) this.a.inflate();
        PropertyModel propertyModel = new PropertyModel(InterfaceC8882q03.c);
        this.m = propertyModel;
        UD2.a(propertyModel, this.q, new C9910t03());
        this.m.o(InterfaceC8882q03.b, new Callback() { // from class: n03
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Boolean bool = (Boolean) obj;
                C8539p03.this.getClass();
                O83.a.p("Chrome.SearchResumptionModule.Collapse", !bool.booleanValue());
                FI2.a(bool.booleanValue() ? "SearchResumptionModule.NTP.Expand" : "SearchResumptionModule.NTP.Collapse");
            }
        });
        return true;
    }

    public final void f() {
        PropertyModel propertyModel = this.m;
        if (propertyModel != null) {
            propertyModel.k(InterfaceC8882q03.a, this.n && this.o && this.p);
        }
    }
}
