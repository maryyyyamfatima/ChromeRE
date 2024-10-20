package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import org.chromium.chrome.browser.language.settings.ContentLanguagesPreference;
import org.chromium.chrome.browser.language.settings.LanguageSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hx1 */
/* loaded from: classes.dex */
public final class C6116hx1 implements InterfaceC9213qy2 {
    public final /* synthetic */ ContentLanguagesPreference a;
    public final /* synthetic */ PreferenceCategory g;

    public C6116hx1(ContentLanguagesPreference contentLanguagesPreference, PreferenceCategory preferenceCategory) {
        this.a = contentLanguagesPreference;
        this.g = preferenceCategory;
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LanguageSettings.R0().e("translate.enabled", booleanValue);
        this.a.V.S();
        this.g.S(booleanValue);
        C9549rx1.g(booleanValue ? 5 : 4);
        return true;
    }
}
