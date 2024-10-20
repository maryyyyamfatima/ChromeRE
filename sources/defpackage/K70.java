package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K70 implements M70 {
    public final /* synthetic */ N70 a;

    @Override // defpackage.L70
    public final float b() {
        return Math.round(((r0.R0() + r0.w) - (this.a.A0 != null ? r0.b0().r : 0.0f)) / r0.a);
    }

    public K70(N70 n70) {
        this.a = n70;
    }

    @Override // defpackage.M70
    public final void a(int i) {
        N70 n70 = this.a;
        n70.V0().b();
        ((ContextualSearchManager) n70.s0).n(i, true);
        n70.x0 = false;
    }
}
