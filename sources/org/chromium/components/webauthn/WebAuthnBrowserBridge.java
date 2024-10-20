package org.chromium.components.webauthn;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebAuthnBrowserBridge {
    public long a;

    public static String getWebAuthnCredentialDetailsUserName(WebAuthnCredentialDetails webAuthnCredentialDetails) {
        return webAuthnCredentialDetails.a;
    }

    public static String getWebAuthnCredentialDetailsUserDisplayName(WebAuthnCredentialDetails webAuthnCredentialDetails) {
        return webAuthnCredentialDetails.b;
    }

    public static byte[] getWebAuthnCredentialDetailsUserId(WebAuthnCredentialDetails webAuthnCredentialDetails) {
        return webAuthnCredentialDetails.c;
    }

    public static byte[] getWebAuthnCredentialDetailsCredentialId(WebAuthnCredentialDetails webAuthnCredentialDetails) {
        return webAuthnCredentialDetails.d;
    }
}
