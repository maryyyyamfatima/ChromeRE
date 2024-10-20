package org.chromium.chrome.browser.explore_sites;

import J.N;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExploreSitesCategoryTile {
    public final String a;
    public final String b;
    public final String c;

    public ExploreSitesCategoryTile(String str, String str2, String str3) {
        this.c = str;
        this.b = str2;
        this.a = N.MFDJT1zY() + str3;
    }

    public static void createInList(List list, String str, String str2, String str3) {
        list.add(new ExploreSitesCategoryTile(str3, str2, str));
    }
}
