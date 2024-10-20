package defpackage;

import J.N;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pz2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2077Pz2 {
    public static final Q83 a = O83.a;

    public static boolean c() {
        if (AbstractC1947Oz2.d()) {
            if (a.e("Chrome.PriceTracking.TrackPricesOnTabs", AbstractC1947Oz2.e())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        if (AbstractC1947Oz2.d()) {
            if (a.e("Chrome.PriceTracking.PriceWelcome", AbstractC1947Oz2.e())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a() {
        boolean z;
        if (!AbstractC1947Oz2.c()) {
            return false;
        }
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            z = N.M6bsIDpc("CommercePriceTracking", "implicit_subscriptions_enabled", false);
        } else {
            z = false;
        }
        if (z) {
            return a.e("Chrome.PriceTracking.PriceAlerts", AbstractC1947Oz2.e());
        }
        return false;
    }
}
