package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eJ0 */
/* loaded from: classes.dex */
public abstract class AbstractC4860eJ0 {
    public static boolean a = true;

    public static boolean b() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("WebFeed")) {
            C1202Jg1 a2 = C1202Jg1.a();
            Profile d = Profile.d();
            a2.getClass();
            if (C1202Jg1.c(d).p().c(1) && !Profile.d().h()) {
                return true;
            }
        }
        return false;
    }

    public static int a() {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("WebFeed", "feed_tab_stickiness_logic");
        if ("reset_upon_chrome_restart".equals(MMltG$kc)) {
            if (a) {
                a = false;
                c(0);
                return 0;
            }
            return R44.a(Profile.d()).b("feedv2.last_seen_feed_type");
        }
        if (!"indefinitely_persisted".equals(MMltG$kc)) {
            c(0);
            return 0;
        }
        return R44.a(Profile.d()).b("feedv2.last_seen_feed_type");
    }

    public static void c(int i) {
        a = false;
        N.MPBZLcVx(R44.a(Profile.d()).a, "feedv2.last_seen_feed_type", i);
    }
}
