package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsFragmentV3;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UA2 implements InterfaceC0679Ff3 {
    public final Context a;
    public final SettingsLauncher g;
    public final ViewOnClickListenerC1069If3 h;

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
    }

    public UA2(Context context, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, I53 i53) {
        Object obj = ThreadUtils.a;
        this.a = context;
        this.h = viewOnClickListenerC1069If3;
        this.g = i53;
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        PrivacySandboxSettingsFragmentV3.S0(this.a, this.g, 1);
    }
}
