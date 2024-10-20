package defpackage;

import J.N;
import androidx.preference.Preference;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EK1 implements InterfaceC4184cL1 {
    @Override // defpackage.InterfaceC4184cL1
    public final /* synthetic */ boolean a(Preference preference) {
        return false;
    }

    @Override // defpackage.InterfaceC4184cL1
    public final /* synthetic */ boolean c() {
        return AbstractC9008qO.a();
    }

    @Override // defpackage.InterfaceC4184cL1
    public final boolean b(Preference preference) {
        if ("search_engine".equals(preference.q)) {
            TemplateUrlService a = IG3.a();
            return N.MELaF8Vs(a.c, a);
        }
        if (AbstractC0193Bm2.l() && "passwords".equals(preference.q)) {
            return false;
        }
        return d(preference);
    }

    @Override // defpackage.InterfaceC4184cL1
    public final boolean d(Preference preference) {
        if ("search_engine".equals(preference.q)) {
            TemplateUrlService a = IG3.a();
            return N.MELaF8Vs(a.c, a);
        }
        if (AbstractC0193Bm2.l() && "passwords".equals(preference.q)) {
            return R44.a(Profile.d()).d("credentials_enable_service");
        }
        return false;
    }
}
