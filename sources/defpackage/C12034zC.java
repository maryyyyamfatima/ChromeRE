package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zC */
/* loaded from: classes.dex */
public final class C12034zC extends AbstractC1429Kz3 {
    public final /* synthetic */ CC i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12034zC(CC cc, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = cc;
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        if (z && tab == this.i.A) {
            C3223Yu3 V0 = C3223Yu3.V0(tab);
            if (V0.l) {
                CC.c(this.i, V0.g, V0.h, V0.i, V0.j, V0.k);
            }
        }
    }

    @Override // defpackage.BA0
    public final void L0(Tab tab, boolean z) {
        CC cc = this.i;
        if (tab != cc.A || z) {
            return;
        }
        cc.p(false);
    }

    @Override // defpackage.BA0
    public final void i0(TabImpl tabImpl, int i, int i2, int i3, int i4, int i5) {
        if (tabImpl == this.i.A && tabImpl.isUserInteractable() && !tabImpl.isNativePage()) {
            CC.c(this.i, i, i2, i3, i4, i5);
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        CC cc = this.i;
        if (tabImpl == cc.A && C8693pT2.W0(tabImpl)) {
            cc.p(false);
        }
    }
}
