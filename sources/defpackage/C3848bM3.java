package defpackage;

import J.N;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bM3 */
/* loaded from: classes.dex */
public class C3848bM3 implements VL3 {
    public final Context a;
    public final ViewOnClickListenerC1069If3 b;
    public final C9162qp3 c;
    public final MostVisitedSitesBridge d;
    public boolean e;
    public C3504aM3 f;

    public C3848bM3(Context context, Profile profile, C9162qp3 c9162qp3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        this.a = context;
        this.b = viewOnClickListenerC1069If3;
        this.c = c9162qp3;
        Object obj = ThreadUtils.a;
        if (C8819pp3.a == null) {
            C8819pp3.a = new C8819pp3();
        }
        C8819pp3.a.getClass();
        this.d = new MostVisitedSitesBridge(profile);
    }

    @Override // defpackage.VL3
    public void a(int i, PL3 pl3) {
        String i2 = pl3.a.b.i();
        if (i != 6) {
            d(pl3);
        }
        this.c.f(i2, i, false);
        AbstractC9999tG2.c("Chrome.Querytiles.RecentMvClicks");
    }

    @Override // defpackage.VL3
    public void b(List list) {
        MostVisitedSitesBridge mostVisitedSitesBridge;
        if (this.e) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            mostVisitedSitesBridge = this.d;
            if (!hasNext) {
                break;
            }
            PL3 pl3 = (PL3) it.next();
            long j = mostVisitedSitesBridge.a;
            if (j != 0) {
                int i = pl3.b;
                int i2 = pl3.c;
                int i3 = pl3.d;
                C7722me3 c7722me3 = pl3.a;
                N.MwKG6a15(j, mostVisitedSitesBridge, i, i2, i3, c7722me3.c, c7722me3.d, c7722me3.b);
            }
        }
        int size = list.size();
        long j2 = mostVisitedSitesBridge.a;
        if (j2 != 0) {
            N.MtbOuYlk(j2, mostVisitedSitesBridge, size);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PL3 pl32 = (PL3) it2.next();
            if (pl32.g != null) {
                EI2.h(pl32.b, 12, "NewTabPage.TileOfflineAvailable");
            }
        }
    }

    public final void c() {
        this.e = true;
        C3504aM3 c3504aM3 = this.f;
        if (c3504aM3 != null) {
            this.b.a(c3504aM3);
        }
        MostVisitedSitesBridge mostVisitedSitesBridge = this.d;
        N.MdGxo8sV(mostVisitedSitesBridge.a, mostVisitedSitesBridge);
        mostVisitedSitesBridge.a = 0L;
        mostVisitedSitesBridge.b = null;
    }

    public final void d(PL3 pl3) {
        R32.a(3);
        FI2.a("MobileNTPMostVisited");
        AbstractC5241fQ2.g("Chrome.StartSurface.TapMVTilesCount");
        MostVisitedSitesBridge mostVisitedSitesBridge = this.d;
        long j = mostVisitedSitesBridge.a;
        if (j == 0) {
            return;
        }
        int i = pl3.b;
        int i2 = pl3.c;
        C7722me3 c7722me3 = pl3.a;
        N.M6eoyhxR(j, mostVisitedSitesBridge, i, i2, c7722me3.c, c7722me3.d);
    }
}
