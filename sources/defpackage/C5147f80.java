package defpackage;

import android.text.TextUtils;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f80 */
/* loaded from: classes.dex */
public final class C5147f80 extends AbstractC10430uY0 {
    public final /* synthetic */ C5491g80 a;

    @Override // defpackage.AbstractC10430uY0
    public final void d(int i, int i2, boolean z) {
        ContextualSearchManager contextualSearchManager = (ContextualSearchManager) this.a.a;
        if (contextualSearchManager.k()) {
            return;
        }
        contextualSearchManager.i(8);
    }

    public C5147f80(C5491g80 c5491g80) {
        this.a = c5491g80;
    }

    @Override // defpackage.AbstractC10430uY0
    public final void c(int i, int i2) {
        System.nanoTime();
        C5491g80 c5491g80 = this.a;
        c5491g80.getClass();
        ContextualSearchManager contextualSearchManager = (ContextualSearchManager) c5491g80.a;
        if (contextualSearchManager.r.f == 3) {
            contextualSearchManager.v.R();
        }
    }

    @Override // defpackage.AbstractC10430uY0
    public final void e() {
        System.nanoTime();
        this.a.getClass();
    }

    @Override // defpackage.AbstractC10430uY0
    public final void f() {
        long nanoTime = System.nanoTime();
        C5491g80 c5491g80 = this.a;
        c5491g80.m = nanoTime;
        c5491g80.n = TextUtils.isEmpty(c5491g80.e);
    }
}
