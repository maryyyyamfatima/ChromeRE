package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kt3 */
/* loaded from: classes2.dex */
public final class C7124kt3 implements InterfaceC4954eb3 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ SyncConsentFragmentBase c;

    public C7124kt3(SyncConsentFragmentBase syncConsentFragmentBase, boolean z, Runnable runnable) {
        this.c = syncConsentFragmentBase;
        this.a = z;
        this.b = runnable;
    }

    @Override // defpackage.InterfaceC4954eb3
    public final void a() {
        N.MnEYaN9w(Profile.d(), true);
        boolean z = this.a;
        if (!z) {
            AbstractC1658Mt3.b().m(0);
        }
        this.c.M0(z);
        this.b.run();
    }

    @Override // defpackage.InterfaceC4954eb3
    public final void b() {
        this.b.run();
    }
}
