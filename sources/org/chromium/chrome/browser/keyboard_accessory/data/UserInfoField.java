package org.chromium.chrome.browser.keyboard_accessory.data;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UserInfoField {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Callback f;

    public UserInfoField(String str, String str2, String str3, String str4, boolean z, Callback callback) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = callback;
    }

    public String getDisplayText() {
        return this.a;
    }

    public String getTextToFill() {
        return this.b;
    }

    public String getA11yDescription() {
        return this.c;
    }

    public String getId() {
        return this.d;
    }

    public boolean isSelectable() {
        return this.f != null;
    }

    public boolean isObfuscated() {
        return this.e;
    }
}
