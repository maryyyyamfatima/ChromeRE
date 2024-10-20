package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import org.chromium.chrome.browser.device_reauth.BiometricAuthenticatorBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ey, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5087ey extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ BiometricAuthenticatorBridge a;

    public C5087ey(BiometricAuthenticatorBridge biometricAuthenticatorBridge) {
        this.a = biometricAuthenticatorBridge;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        if (i == 10) {
            this.a.a(3);
        } else {
            this.a.a(4);
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        int authenticationType;
        super.onAuthenticationSucceeded(authenticationResult);
        if (Build.VERSION.SDK_INT < 30) {
            this.a.a(0);
            return;
        }
        authenticationType = authenticationResult.getAuthenticationType();
        if (authenticationType == 2) {
            this.a.a(1);
        } else {
            this.a.a(2);
        }
    }
}
