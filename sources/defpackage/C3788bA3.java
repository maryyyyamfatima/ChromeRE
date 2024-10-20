package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bA3 */
/* loaded from: classes.dex */
public final class C3788bA3 extends AbstractC1429Kz3 {
    public final /* synthetic */ C9284rA3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3788bA3(C9284rA3 c9284rA3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = c9284rA3;
    }

    @Override // defpackage.BA0
    public final void H0(Tab tab) {
        if (!tab.isDestroyed()) {
            JA3.a(tab).b(true);
        }
        C9284rA3 c9284rA3 = this.i;
        c9284rA3.b(tab);
        c9284rA3.r();
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        if (tab.isDestroyed()) {
            return;
        }
        JA3.a(tab).b(true);
    }

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        if (tab.isDestroyed()) {
            return;
        }
        JA3.a(tab).b(true);
    }

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        C9284rA3 c9284rA3 = this.i;
        c9284rA3.b(tabImpl);
        c9284rA3.r();
    }

    @Override // defpackage.AbstractC1429Kz3
    public final void V0(int i, Tab tab) {
        C9284rA3 c9284rA3 = this.i;
        c9284rA3.b(tab);
        c9284rA3.r();
    }
}
