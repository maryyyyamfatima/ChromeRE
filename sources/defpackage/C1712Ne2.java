package defpackage;

import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ne2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1712Ne2 extends C0538Ed2 implements InterfaceC10665vC2 {
    @Override // defpackage.InterfaceC10665vC2
    public final void d(Profile profile) {
    }

    public C1712Ne2() {
        ProfileManager.a(this);
    }

    @Override // defpackage.InterfaceC10665vC2
    public final void b(Profile profile) {
        if (profile.i()) {
            return;
        }
        a(profile);
        ProfileManager.a.d(this);
    }
}
