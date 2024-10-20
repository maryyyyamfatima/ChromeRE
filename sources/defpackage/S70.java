package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S70 {
    public final C5491g80 b;
    public final H70 d;
    public Q70 e;
    public final Q83 a = O83.a;
    public final C4190cM2 c = new C4190cM2(this);

    public S70(C5491g80 c5491g80, H70 h70) {
        this.b = c5491g80;
        this.d = h70;
    }

    public static boolean d() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("ContextualSearchDelayedIntelligence") && !c();
    }

    public static boolean b() {
        return a().c("search.contextual_search_enabled").equals("false");
    }

    public static boolean c() {
        return a().c("search.contextual_search_enabled").equals("true");
    }

    public static boolean e() {
        return (a().c("search.contextual_search_enabled").isEmpty() && (N.MFs_R_Ad(a().a, "search.contextual_search_fully_opted_in") ^ true)) && a().b("search.contextual_search_promo_card_shown_count") < 3;
    }

    public static void f(int i) {
        if (i == 0) {
            N.MRGBEdxZ(a().a, "search.contextual_search_enabled");
            return;
        }
        if (i == 1) {
            a().f("search.contextual_search_enabled", "true");
        } else if (i == 2) {
            a().f("search.contextual_search_enabled", "false");
        } else {
            AbstractC4851eH1.a("ContextualSearch", AbstractC9076qb1.a("Unexpected state for ContextualSearchPreference state=", i), new Object[0]);
        }
    }

    public static PrefService a() {
        return R44.a(Profile.d());
    }

    public final boolean g() {
        if (N.MaV3tKHW() == 0) {
            return false;
        }
        int i = this.b.f;
        return (i == 1 || i == 3) && c();
    }
}
