package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TI0 extends BA0 {
    public final Runnable a;

    public TI0(RunnableC4522dK0 runnableC4522dK0) {
        this.a = runnableC4522dK0;
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        this.a.run();
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        tabImpl.w(this);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.w(this);
    }
}
