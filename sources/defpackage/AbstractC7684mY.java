package defpackage;

import J.N;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7684mY {
    public static String a() {
        String str;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            str = N.MMltG$kc("CommercePriceTracking", "subscriptions_service_base_url");
        } else {
            str = "https://memex-pa.googleapis.com/v1/shopping/subscriptions";
        }
        return TextUtils.isEmpty(str) ? "https://memex-pa.googleapis.com/v1/shopping/subscriptions" : str;
    }
}
