package org.chromium.chrome.browser.history_clusters;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HistoryCluster {
    public final List a;
    public final String b;
    public final List c;
    public final long d;
    public final List e;
    public final String f;

    public HistoryCluster(List list, String str, String str2, ArrayList arrayList, long j, List list2) {
        this.a = list;
        this.b = str;
        this.f = str2;
        this.c = arrayList;
        this.d = j;
        this.e = list2;
        for (int i = 0; i < this.a.size(); i++) {
            ((ClusterVisit) this.a.get(i)).i = i;
        }
    }
}
