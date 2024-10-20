package defpackage;

import android.app.Activity;
import android.text.style.ForegroundColorSpan;
import com.android.chrome.R;
import org.chromium.chrome.browser.incognito.reauth.IncognitoReauthSettingSwitchPreference;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pj1 */
/* loaded from: classes.dex */
public final class C8781pj1 {
    public final IncognitoReauthSettingSwitchPreference a;
    public boolean b;
    public C3166Yj1 c;

    public C8781pj1(IncognitoReauthSettingSwitchPreference incognitoReauthSettingSwitchPreference) {
        this.a = incognitoReauthSettingSwitchPreference;
    }

    public final void a(Activity activity) {
        CharSequence a;
        if (C3166Yj1.b()) {
            if (AbstractC6724jk1.a()) {
                a = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140a0a);
            } else {
                a = AbstractC9108qg3.a(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140a09), new C8765pg3(new ForegroundColorSpan(AbstractC10957w33.e(activity)), "<link>", "</link>"));
            }
            IncognitoReauthSettingSwitchPreference incognitoReauthSettingSwitchPreference = this.a;
            incognitoReauthSettingSwitchPreference.P(a);
            incognitoReauthSettingSwitchPreference.e0 = AbstractC6724jk1.a();
            incognitoReauthSettingSwitchPreference.q();
            boolean a2 = R44.a(Profile.d()).a("incognito.incognito_reauthentication");
            this.b = true;
            incognitoReauthSettingSwitchPreference.W(a2);
            this.b = false;
        }
    }
}
