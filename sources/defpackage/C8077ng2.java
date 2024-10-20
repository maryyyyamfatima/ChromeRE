package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ng2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8077ng2 implements InterfaceC10665vC2 {
    @Override // defpackage.InterfaceC10665vC2
    public final void b(Profile profile) {
    }

    @Override // defpackage.InterfaceC10665vC2
    public final void d(Profile profile) {
        HashMap hashMap = C8421og2.a;
        if (((C7389lg2) hashMap.get(profile)) != null) {
            hashMap.remove(profile);
        }
        if (hashMap.isEmpty()) {
            ProfileManager.a.d(C8421og2.b);
            C8421og2.b = null;
        }
    }
}
