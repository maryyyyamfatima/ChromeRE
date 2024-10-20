package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.segmentation_platform.SegmentSelectionResult;
import org.chromium.components.segmentation_platform.SegmentationPlatformServiceImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MJ0 {
    public static boolean d() {
        C7928nE c7928nE = UN.a;
        return N.M6bsIDpc("FeedPositionAndroid", "push_down_feed_small", false) && a();
    }

    public static boolean c() {
        C7928nE c7928nE = UN.a;
        return N.M6bsIDpc("FeedPositionAndroid", "push_down_feed_large", false) && a();
    }

    public static boolean b() {
        C7928nE c7928nE = UN.a;
        return N.M6bsIDpc("FeedPositionAndroid", "pull_up_feed", false) && a();
    }

    public static boolean a() {
        int i;
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("FeedPositionAndroid", "feed_active_targeting");
        if (MMltG$kc == null) {
            return true;
        }
        SegmentationPlatformServiceImpl segmentationPlatformServiceImpl = (SegmentationPlatformServiceImpl) N.MGkN3uZ4(Profile.d());
        SegmentSelectionResult segmentSelectionResult = (SegmentSelectionResult) N.MoSpmdy8(segmentationPlatformServiceImpl.a, segmentationPlatformServiceImpl, "feed_user_segment");
        if (segmentSelectionResult.a) {
            i = segmentSelectionResult.b == 18 ? 1 : 2;
        } else {
            i = 0;
        }
        EI2.h(i, 3, "NewTabPage.FeedPositionSegmentationResult");
        return !MMltG$kc.equals("active") ? !MMltG$kc.equals("non-active") || i == 2 : i == 1;
    }
}
