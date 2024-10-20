package defpackage;

import androidx.preference.Preference;
import org.chromium.chrome.browser.language.settings.ContentLanguagesPreference;
import org.chromium.chrome.browser.language.settings.LanguageSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gx1 */
/* loaded from: classes.dex */
public final class C5772gx1 implements InterfaceC9213qy2 {
    public final /* synthetic */ ContentLanguagesPreference a;

    public C5772gx1(ContentLanguagesPreference contentLanguagesPreference) {
        this.a = contentLanguagesPreference;
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LanguageSettings.R0().e("translate.enabled", booleanValue);
        this.a.V.S();
        C9549rx1.g(booleanValue ? 5 : 4);
        return true;
    }
}
