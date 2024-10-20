package defpackage;

import J.N;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202Jg1 {
    public static C1202Jg1 a;

    public static C1202Jg1 a() {
        if (a == null) {
            a = new C1202Jg1();
        }
        return a;
    }

    public static IdentityManager b(Profile profile) {
        Object obj = ThreadUtils.a;
        return (IdentityManager) N.MjWAsIev(profile);
    }

    public static SigninManager c(Profile profile) {
        Object obj = ThreadUtils.a;
        return (SigninManager) N.MOZZ$5wu(profile);
    }
}
