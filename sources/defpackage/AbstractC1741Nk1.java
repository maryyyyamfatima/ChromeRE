package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nk1 */
/* loaded from: classes.dex */
public abstract class AbstractC1741Nk1 {
    public static Profile b(WindowAndroid windowAndroid, boolean z) {
        if (!z) {
            return Profile.d();
        }
        Profile a = a(windowAndroid);
        return a != null ? a : Profile.d().f(true);
    }

    public static Profile a(WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            return null;
        }
        K14 k14 = C5688gj1.g;
        C5688gj1 c5688gj1 = (C5688gj1) C5688gj1.g.e(windowAndroid.t);
        if (c5688gj1 == null) {
            return null;
        }
        if (c5688gj1.a == null) {
            OTRProfileID oTRProfileID = OTRProfileID.b;
            c5688gj1.a = (OTRProfileID) N.Mgdxq2wn("CCT:Incognito");
        }
        return Profile.d().e(c5688gj1.a);
    }

    public static ProfileKey c(OTRProfileID oTRProfileID) {
        if (oTRProfileID == null) {
            return ProfileKey.a();
        }
        return Profile.d().e(oTRProfileID).g();
    }
}
