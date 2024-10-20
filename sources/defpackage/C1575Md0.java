package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Md0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1575Md0 extends AbstractC4276cd0 {
    public final /* synthetic */ C1705Nd0 a;

    @Override // defpackage.AbstractC4276cd0
    public final void b(Tab tab) {
        C1705Nd0 c1705Nd0 = this.a;
        Runnable runnable = c1705Nd0.f;
        if (runnable != null) {
            runnable.run();
            c1705Nd0.f = null;
        }
        c1705Nd0.a.a.d(this);
    }

    public C1575Md0(C1705Nd0 c1705Nd0) {
        this.a = c1705Nd0;
    }
}
