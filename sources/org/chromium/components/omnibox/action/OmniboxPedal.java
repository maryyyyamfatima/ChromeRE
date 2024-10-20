package org.chromium.components.omnibox.action;

import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OmniboxPedal {
    public final int a;
    public final String b;

    public OmniboxPedal(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static OmniboxPedal build(int i, String str, String str2, String str3, String str4, GURL gurl) {
        return new OmniboxPedal(i, str);
    }
}
