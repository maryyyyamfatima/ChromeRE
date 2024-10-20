package org.chromium.chrome.browser.suggestions.mostvisited;

import J.N;
import defpackage.C7722me3;
import defpackage.PL3;
import defpackage.WY1;
import defpackage.ZL3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MostVisitedSitesBridge {
    public long a;
    public WY1 b;

    public MostVisitedSitesBridge(Profile profile) {
        this.a = N.M8pqI3Tk(this, profile);
    }

    public final void onURLsAvailable(String[] strArr, GURL[] gurlArr, int[] iArr, int[] iArr2, int[] iArr3) {
        if (this.a == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(strArr.length);
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            arrayList2.add(new C7722me3(iArr2[i], iArr3[i], iArr[i], strArr[i], gurlArr[i]));
        }
        arrayList.addAll(arrayList2);
        ZL3 zl3 = (ZL3) this.b;
        boolean z2 = true;
        boolean z3 = zl3.j != null;
        boolean z4 = zl3.k == null;
        zl3.i = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7722me3 c7722me3 = (C7722me3) it.next();
            zl3.i.add(c7722me3);
            if (c7722me3.e == 1) {
                GURL gurl = zl3.j;
                GURL gurl2 = c7722me3.b;
                if (gurl2.equals(gurl)) {
                    z3 = false;
                }
                if (gurl2.equals(zl3.k)) {
                    z4 = true;
                }
                if (c7722me3.d == 6 && !zl3.m) {
                    zl3.m = true;
                    N.Mr5wBIg_(Profile.d(), 0);
                }
            }
        }
        if (zl3.j != null && z3) {
            zl3.j = null;
            z = true;
        }
        if (zl3.k == null || !z4) {
            z2 = z;
        } else {
            zl3.k = null;
        }
        if (zl3.l && zl3.a.isVisible() && !z2) {
            return;
        }
        zl3.c();
    }

    public final void onIconMadeAvailable(GURL gurl) {
        if (this.a != 0) {
            ZL3 zl3 = (ZL3) this.b;
            zl3.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < zl3.h.size(); i++) {
                for (PL3 pl3 : (List) zl3.h.valueAt(i)) {
                    if (pl3.a.b.equals(gurl)) {
                        arrayList.add(pl3);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zl3.e.d((PL3) it.next(), zl3.n);
            }
        }
    }
}
