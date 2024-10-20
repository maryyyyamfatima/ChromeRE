package org.chromium.chrome.browser.touch_to_fill.data;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class Credential {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final long g;

    public Credential(String str, String str2, String str3, String str4, boolean z, boolean z2, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = j;
    }

    public String getUsername() {
        return this.a;
    }

    public String getPassword() {
        return this.b;
    }

    public String getOriginUrl() {
        return this.d;
    }

    public boolean isPublicSuffixMatch() {
        return this.e;
    }

    public boolean isAffiliationBasedMatch() {
        return this.f;
    }

    public long lastUsedMsSinceEpoch() {
        return this.g;
    }
}
