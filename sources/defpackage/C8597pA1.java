package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pA1 */
/* loaded from: classes.dex */
public final class C8597pA1 implements InterfaceC8149ns2 {
    public static final HashMap a = new HashMap();
    public static InterfaceC10665vC2 b;

    public C8597pA1() {
        if (b == null) {
            C8254oA1 c8254oA1 = new C8254oA1();
            b = c8254oA1;
            ProfileManager.a(c8254oA1);
        }
    }

    @Override // defpackage.InterfaceC8149ns2
    public final InterfaceC7805ms2 a() {
        Profile d = Profile.d();
        HashMap hashMap = a;
        C7910nA1 c7910nA1 = (C7910nA1) hashMap.get(d);
        if (c7910nA1 != null) {
            return c7910nA1;
        }
        C7910nA1 c7910nA12 = new C7910nA1(d);
        hashMap.put(d, c7910nA12);
        return c7910nA12;
    }
}
