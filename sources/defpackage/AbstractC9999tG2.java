package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.segmentation_platform.SegmentSelectionResult;
import org.chromium.components.segmentation_platform.SegmentationPlatformServiceImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9999tG2 {
    public static Boolean a;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9999tG2.d():boolean");
    }

    public static int b() {
        SegmentationPlatformServiceImpl segmentationPlatformServiceImpl = (SegmentationPlatformServiceImpl) N.MGkN3uZ4(Profile.d());
        SegmentSelectionResult segmentSelectionResult = (SegmentSelectionResult) N.MoSpmdy8(segmentationPlatformServiceImpl.a, segmentationPlatformServiceImpl, "query_tiles");
        if (segmentSelectionResult.a) {
            return segmentSelectionResult.b == 13 ? 2 : 1;
        }
        return 0;
    }

    public static void e(boolean z) {
        int a2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            a2 = a(28, "num_days_keep_showing_query_tiles");
        } else {
            a2 = a(7, "num_days_mv_clicks_below_threshold");
        }
        long j = (a2 * 86400000) + currentTimeMillis;
        Q83 q83 = O83.a;
        q83.p("Chrome.Querytiles.ShowOnNTP", z);
        q83.s(j, "Chrome.Querytiles.NextDecisionTime");
        q83.m("Chrome.Querytiles.RecentMvClicks");
        q83.m("Chrome.Querytiles.RecentQueryTileClicks");
    }

    public static void c(String str) {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("QueryTilesSegmentation")) {
            long currentTimeMillis = System.currentTimeMillis();
            Q83 q83 = O83.a;
            if (q83.g(-1L, "Chrome.Querytiles.NextDecisionTime") < (a(7, "num_days_mv_clicks_below_threshold") * 86400000) + currentTimeMillis) {
                q83.d(str);
            }
        }
    }

    public static int a(int i, String str) {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("QueryTilesSegmentation", str);
        if (TextUtils.isEmpty(MMltG$kc)) {
            return i;
        }
        try {
            return Integer.parseInt(MMltG$kc);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
