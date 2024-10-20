package org.chromium.components.omnibox.action;

import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class HistoryClustersAction extends OmniboxPedal {
    public final String c;

    public HistoryClustersAction(int i, String str, String str2) {
        super(i, str);
        this.c = str2;
    }

    public static HistoryClustersAction build(int i, String str, String str2, String str3, String str4, GURL gurl, String str5) {
        return new HistoryClustersAction(i, str, str5);
    }
}
