package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oY */
/* loaded from: classes.dex */
public final class C8372oY {
    public static final HashMap a = new HashMap();
    public static InterfaceC10665vC2 b;

    public C8372oY() {
        if (b == null) {
            C8028nY c8028nY = new C8028nY();
            b = c8028nY;
            ProfileManager.a(c8028nY);
        }
    }

    public static C7340lY a() {
        Profile d = Profile.d();
        HashMap hashMap = a;
        C7340lY c7340lY = (C7340lY) hashMap.get(d);
        if (c7340lY != null) {
            return c7340lY;
        }
        C8875pz2 a2 = AbstractC7157kz2.a();
        C3063Xo3 c3063Xo3 = new C3063Xo3(d, a2);
        C1202Jg1.a().getClass();
        C7340lY c7340lY2 = new C7340lY(c3063Xo3, C1202Jg1.b(d), a2);
        hashMap.put(d, c7340lY2);
        return c7340lY2;
    }
}
