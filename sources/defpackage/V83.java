package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class V83 {
    public static boolean a() {
        if (!AbstractC8293oI0.a()) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("ShoppingList") || !US.a(C1202Jg1.a(), 1) || !N.Mfmn09fr(Profile.d())) {
            return false;
        }
        PrefService a = R44.a(Profile.d());
        return a != null && a.a("web_and_app_activity_enabled_for_shopping");
    }
}
