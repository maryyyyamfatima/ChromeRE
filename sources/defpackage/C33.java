package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class C33 {
    public static AbstractC9095qe2 a(String str, Profile profile) {
        Integer num = (Integer) N.MMM3n4FP(profile, str);
        if (num == null) {
            return C5785h.a;
        }
        return new C3242Yy2(Integer.valueOf(num.intValue()));
    }
}
