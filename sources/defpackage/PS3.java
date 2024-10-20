package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PS3 extends BA0 {
    public final /* synthetic */ QS3 a;

    @Override // defpackage.BA0
    public final void f0(TabImpl tabImpl) {
        int i;
        QS3 qs3 = this.a;
        qs3.getClass();
        if (tabImpl.isNativePage() || tabImpl.l == null || T34.i(tabImpl.getUrl())) {
            return;
        }
        int k = tabImpl.l.k();
        if (k == 0) {
            i = 0;
        } else {
            i = !qs3.j(k, tabImpl) ? 1 : 2;
        }
        EI2.h(i, 3, "Android.ThemeColor");
    }

    @Override // defpackage.BA0
    public final void s0(int i, Tab tab) {
        this.a.k(i, tab, true);
    }

    public PS3(QS3 qs3) {
        this.a = qs3;
    }
}
