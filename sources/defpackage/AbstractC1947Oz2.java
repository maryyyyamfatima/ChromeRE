package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oz2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1947Oz2 {
    public static boolean e() {
        boolean z;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            z = N.M6bsIDpc("CommercePriceTracking", "enable_price_tracking", false);
        } else {
            z = false;
        }
        return z || b();
    }

    public static boolean b() {
        if (!AbstractC8293oI0.a()) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        return N.M6bsIDpc("CommercePriceTracking", "enable_price_notification", false);
    }

    public static boolean d() {
        return e() && US.a(C1202Jg1.a(), 1) && N.Mfmn09fr(Profile.d());
    }

    public static boolean c() {
        return d() && b();
    }

    public static boolean a() {
        if (AbstractC8293oI0.a()) {
            if (d()) {
                C7928nE c7928nE = UN.a;
                if (N.M6bsIDpc("CommercePriceTracking", "allow_disable_price_annotations", true)) {
                    return true;
                }
            }
            return false;
        }
        return d();
    }
}
