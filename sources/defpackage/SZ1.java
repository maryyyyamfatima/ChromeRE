package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SZ1 extends BA0 {
    public final /* synthetic */ UZ1 a;

    public SZ1(UZ1 uz1) {
        this.a = uz1;
    }

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        if (tab.isIncognito()) {
            return;
        }
        int i = this.a.w;
        O83.a.t(AbstractC6265iP.i.b(String.valueOf(i)), tab.getTitle());
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        if (tabImpl.isIncognito()) {
            return;
        }
        int i = this.a.w;
        O83.a.t(AbstractC6265iP.k.b(String.valueOf(i)), tabImpl.z().i());
    }
}
