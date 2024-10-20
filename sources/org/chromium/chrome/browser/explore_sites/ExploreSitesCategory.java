package org.chromium.chrome.browser.explore_sites;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExploreSitesCategory {
    public final int a;
    public final int b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public int e;

    public ExploreSitesCategory(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        return this.d.size() - this.e;
    }

    public static ExploreSitesCategory createAndAppendToList(int i, int i2, String str, int i3, int i4, List list) {
        ExploreSitesCategory exploreSitesCategory = new ExploreSitesCategory(i, i2, str);
        list.add(exploreSitesCategory);
        return exploreSitesCategory;
    }
}
