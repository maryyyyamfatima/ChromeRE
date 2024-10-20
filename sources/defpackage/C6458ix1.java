package defpackage;

import android.content.Intent;
import androidx.preference.Preference;
import org.chromium.chrome.browser.language.settings.LanguageSettings;
import org.chromium.chrome.browser.language.settings.SelectLanguageFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ix1 */
/* loaded from: classes.dex */
public final class C6458ix1 implements InterfaceC9555ry2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ LanguageSettings i;

    public C6458ix1(LanguageSettings languageSettings, int i, int i2, int i3) {
        this.i = languageSettings;
        this.a = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        C9549rx1.h(this.a);
        int i = LanguageSettings.m0;
        LanguageSettings languageSettings = this.i;
        Intent e = languageSettings.j0.e(languageSettings.getActivity(), SelectLanguageFragment.class.getName());
        e.putExtra("SelectLanguageFragment.PotentialLanguages", this.g);
        languageSettings.startActivityForResult(e, this.h);
        return true;
    }
}
