package org.chromium.chrome.browser.explore_sites;

import defpackage.AD2;
import defpackage.DD2;
import defpackage.FD2;
import defpackage.GD2;
import defpackage.ID2;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.ND2;
import defpackage.PD2;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExploreSitesSite {
    public static final ID2 b = new ID2();
    public static final ND2 c = new ND2();
    public static final JD2 d = new JD2();
    public static final JD2 e = new JD2();
    public static final PD2 f = new PD2();
    public static final LD2 g = new LD2();
    public final PropertyModel a;

    public ExploreSitesSite(int i, String str, GURL gurl, boolean z) {
        ID2 id2 = b;
        ND2 nd2 = c;
        JD2 jd2 = d;
        JD2 jd22 = e;
        LD2 ld2 = g;
        HashMap e2 = PropertyModel.e(new FD2[]{id2, nd2, jd2, jd22, f, ld2});
        DD2 dd2 = new DD2();
        dd2.a = i;
        e2.put(id2, dd2);
        GD2 gd2 = new GD2();
        gd2.a = str;
        e2.put(jd2, gd2);
        GD2 gd22 = new GD2();
        gd22.a = gurl;
        e2.put(jd22, gd22);
        AD2 ad2 = new AD2();
        ad2.a = z;
        e2.put(ld2, ad2);
        DD2 dd22 = new DD2();
        dd22.a = -1;
        e2.put(nd2, dd22);
        this.a = new PropertyModel(e2);
    }

    public static void createSiteInCategory(int i, String str, GURL gurl, boolean z, ExploreSitesCategory exploreSitesCategory) {
        ExploreSitesSite exploreSitesSite = new ExploreSitesSite(i, str, gurl, z);
        exploreSitesCategory.d.add(exploreSitesSite);
        if (exploreSitesSite.a.j(g)) {
            exploreSitesCategory.e++;
        }
    }
}
