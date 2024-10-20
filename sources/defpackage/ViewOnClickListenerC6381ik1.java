package defpackage;

import android.view.View;
import org.chromium.chrome.browser.incognito.reauth.IncognitoReauthSettingSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ik1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC6381ik1 implements View.OnClickListener {
    public final /* synthetic */ IncognitoReauthSettingSwitchPreference a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.f0.run();
    }

    public ViewOnClickListenerC6381ik1(IncognitoReauthSettingSwitchPreference incognitoReauthSettingSwitchPreference) {
        this.a = incognitoReauthSettingSwitchPreference;
    }
}
