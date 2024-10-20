package defpackage;

import J.N;
import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oA1 */
/* loaded from: classes.dex */
public final class C8254oA1 implements InterfaceC10665vC2 {
    @Override // defpackage.InterfaceC10665vC2
    public final void b(Profile profile) {
    }

    @Override // defpackage.InterfaceC10665vC2
    public final void d(Profile profile) {
        HashMap hashMap = C8597pA1.a;
        C7910nA1 c7910nA1 = (C7910nA1) hashMap.get(profile);
        if (c7910nA1 != null) {
            N.MJWrJ5q6(c7910nA1.a.a);
            hashMap.remove(profile);
        }
        if (hashMap.isEmpty()) {
            ProfileManager.a.d(C8597pA1.b);
            C8597pA1.b = null;
        }
    }
}
