package org.chromium.chrome.browser.ui.android.webid.data;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class IdentityProviderMetadata {
    public final Integer a;
    public final Integer b;
    public final String c;

    public IdentityProviderMetadata(long j, long j2, String str) {
        this.a = j == 2147483648L ? null : Integer.valueOf((int) j);
        this.b = j2 != 2147483648L ? Integer.valueOf((int) j2) : null;
        this.c = str;
    }
}
