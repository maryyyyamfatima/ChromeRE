package defpackage;

import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G33 implements InterfaceC9924t3 {
    public final Runnable a;
    public final Profile b;

    @Override // defpackage.InterfaceC9924t3
    public final int a() {
        return 1;
    }

    @Override // defpackage.InterfaceC9924t3
    public final void destroy() {
    }

    public G33(D33 d33, Profile profile) {
        this.a = d33;
        this.b = profile;
    }

    @Override // defpackage.InterfaceC9924t3
    public final void b(C7178l3 c7178l3, String str) {
        C1202Jg1.a().getClass();
        C1202Jg1.c(this.b).s(B4.c(str), new F33(this));
    }
}
