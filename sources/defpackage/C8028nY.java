package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nY */
/* loaded from: classes.dex */
public final class C8028nY implements InterfaceC10665vC2 {
    @Override // defpackage.InterfaceC10665vC2
    public final void b(Profile profile) {
    }

    @Override // defpackage.InterfaceC10665vC2
    public final void d(Profile profile) {
        HashMap hashMap = C8372oY.a;
        C7340lY c7340lY = (C7340lY) hashMap.get(profile);
        if (c7340lY != null) {
            c7340lY.a();
            hashMap.remove(profile);
        }
        if (hashMap.isEmpty()) {
            ProfileManager.a.d(C8372oY.b);
            C8372oY.b = null;
        }
    }
}
