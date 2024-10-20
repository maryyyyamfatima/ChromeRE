package defpackage;

import J.N;
import org.chromium.chrome.browser.password_check.PasswordCheckBridge;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ok2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1872Ok2 {
    public static C2392Sk2 a;

    public static InterfaceC0963Hk2 b(SettingsLauncher settingsLauncher) {
        if (a == null) {
            a = new C2392Sk2(settingsLauncher);
        }
        return a;
    }

    public static void a() {
        C2392Sk2 c2392Sk2 = a;
        if (c2392Sk2 == null) {
            return;
        }
        PasswordCheckBridge passwordCheckBridge = c2392Sk2.a;
        long j = passwordCheckBridge.a;
        if (j != 0) {
            N.M$1pAUJ0(j);
            passwordCheckBridge.a = 0L;
        }
        a = null;
    }
}
