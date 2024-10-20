package org.chromium.chrome.browser.touch_to_fill.data;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebAuthnCredential {
    public final String a;
    public final String b;
    public final String c;

    public WebAuthnCredential(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String getUsername() {
        return this.a;
    }

    public String getDisplayName() {
        return this.b;
    }

    public String getId() {
        return this.c;
    }
}
