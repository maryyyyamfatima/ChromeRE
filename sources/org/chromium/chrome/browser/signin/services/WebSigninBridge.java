package org.chromium.chrome.browser.signin.services;

import J.N;
import defpackage.C8121nn4;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.base.GoogleServiceAuthError;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class WebSigninBridge {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface Listener {
        void a(GoogleServiceAuthError googleServiceAuthError);

        void b();
    }

    public WebSigninBridge(Profile profile, CoreAccountInfo coreAccountInfo, C8121nn4 c8121nn4) {
        this.a = N.Mbi2nhML(profile, coreAccountInfo, c8121nn4);
    }

    public static void onSigninSucceeded(Listener listener) {
        listener.b();
    }

    public static void onSigninFailed(Listener listener, GoogleServiceAuthError googleServiceAuthError) {
        listener.a(googleServiceAuthError);
    }
}
