package org.chromium.chrome.browser.device_reauth;

import J.N;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ReauthenticatorBridge {
    public final long a;
    public Callback b;

    public ReauthenticatorBridge(int i) {
        this.a = N.MZO11iFf(this, i);
    }

    public void onReauthenticationCompleted(boolean z) {
        Callback callback = this.b;
        if (callback == null) {
            return;
        }
        callback.onResult(Boolean.valueOf(z));
        this.b = null;
    }
}
