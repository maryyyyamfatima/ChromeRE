package defpackage;

import J.N;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.components.signin.identitymanager.AccountTrackerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fa3 */
/* loaded from: classes.dex */
public abstract class AbstractC0654Fa3 {
    public static C0524Ea3 a;

    public static C0524Ea3 a() {
        if (a == null) {
            Object obj = ThreadUtils.a;
            if (!C12272zt3.j) {
                if (AbstractC1658Mt3.b() != null) {
                    C12272zt3.i = new C12272zt3();
                }
                C12272zt3.j = true;
            }
            Profile d = Profile.d();
            C1202Jg1.a().getClass();
            SigninManager c = C1202Jg1.c(d);
            C1202Jg1.a().getClass();
            a = new C0524Ea3(c, (AccountTrackerService) N.Mxrf_LNZ(d));
        }
        return a;
    }
}
