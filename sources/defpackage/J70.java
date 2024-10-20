package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J70 implements M70 {
    public final /* synthetic */ N70 a;

    @Override // defpackage.L70
    public final float b() {
        N70 n70 = this.a;
        return Math.round((n70.R0() + n70.w) / n70.a);
    }

    public J70(N70 n70) {
        this.a = n70;
    }

    @Override // defpackage.M70
    public final void a(int i) {
        N70 n70 = this.a;
        n70.U0().b();
        ((ContextualSearchManager) n70.s0).n(i, false);
        n70.x0 = true;
    }
}
