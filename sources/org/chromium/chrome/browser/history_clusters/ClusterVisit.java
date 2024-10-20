package org.chromium.chrome.browser.history_clusters;

import java.util.ArrayList;
import java.util.List;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ClusterVisit {
    public final String a;
    public final String b;
    public final GURL c;
    public final List d;
    public final List e;
    public final GURL f;
    public final long g;
    public final List h;
    public int i;

    public ClusterVisit(GURL gurl, String str, String str2, ArrayList arrayList, ArrayList arrayList2, GURL gurl2, long j, ArrayList arrayList3) {
        this.c = gurl;
        this.a = str;
        this.b = str2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = gurl2;
        this.g = j;
        this.h = arrayList3;
    }
}
