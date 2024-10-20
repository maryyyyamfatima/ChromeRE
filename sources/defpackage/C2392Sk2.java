package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import org.chromium.chrome.browser.password_check.PasswordCheckBridge;
import org.chromium.chrome.browser.password_check.PasswordCheckFragmentView;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sk2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2392Sk2 implements InterfaceC0963Hk2 {
    public final SettingsLauncher c;
    public int f = 0;
    public boolean d = false;
    public boolean e = false;
    public final PasswordCheckBridge a = new PasswordCheckBridge(this);
    public final C12157za2 b = new C12157za2();

    public C2392Sk2(SettingsLauncher settingsLauncher) {
        this.c = settingsLauncher;
    }

    public final void b(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("password-check-referrer", i);
        this.c.b(context, PasswordCheckFragmentView.class, bundle);
        if (i != 1) {
            N.M9QKlyGA(this.a.a);
        }
    }

    public final void a(InterfaceC0833Gk2 interfaceC0833Gk2, boolean z) {
        this.b.a(interfaceC0833Gk2);
        if (z && this.d) {
            interfaceC0833Gk2.b();
        }
        if (z && this.e) {
            interfaceC0833Gk2.c();
        }
    }
}
