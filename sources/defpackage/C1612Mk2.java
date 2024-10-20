package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.device_reauth.ReauthenticatorBridge;
import org.chromium.chrome.browser.password_check.PasswordCheckFragmentView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mk2 */
/* loaded from: classes.dex */
public final class C1612Mk2 implements IA1 {
    public final C12008z71 a;
    public final PasswordCheckFragmentView b;
    public final SettingsLauncher c;
    public final C10159tk2 d;
    public final C3983bl2 e;
    public PropertyModel f;

    public C1612Mk2(PasswordCheckFragmentView passwordCheckFragmentView, C12008z71 c12008z71, SettingsLauncher settingsLauncher, KH kh, KH kh2) {
        this.a = c12008z71;
        this.b = passwordCheckFragmentView;
        this.c = settingsLauncher;
        passwordCheckFragmentView.j0 = this;
        C10159tk2 c10159tk2 = new C10159tk2(passwordCheckFragmentView.getActivity(), passwordCheckFragmentView.M());
        this.d = c10159tk2;
        this.e = new C3983bl2(new C1093Ik2(passwordCheckFragmentView.getActivity(), settingsLauncher, kh, kh2), c10159tk2, new ReauthenticatorBridge(5), settingsLauncher, new C2262Rk2(new LargeIconBridge(Profile.d()), passwordCheckFragmentView.N().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08017a)));
    }
}
