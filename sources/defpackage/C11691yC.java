package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yC */
/* loaded from: classes.dex */
public final class C11691yC extends AbstractC5822h6 {
    public final /* synthetic */ CC i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11691yC(CC cc, C6166i6 c6166i6) {
        super(c6166i6);
        this.i = cc;
    }

    @Override // defpackage.AbstractC5822h6
    public final void V0(Tab tab) {
        CC cc = this.i;
        Tab tab2 = cc.A;
        cc.A = tab;
        C3799bD c3799bD = cc.g;
        if (tab2 != tab && tab != null) {
            c3799bD.y();
            if (tab.isUserInteractable()) {
                cc.h();
            }
        }
        if (tab != null || ((Integer) c3799bD.g).intValue() == 2) {
            return;
        }
        cc.m();
    }
}
