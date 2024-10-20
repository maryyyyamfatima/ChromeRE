package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tE3 */
/* loaded from: classes.dex */
public final class C9990tE3 extends AbstractC5822h6 {
    public Tab i;
    public final /* synthetic */ C10333uE3 j;

    @Override // defpackage.AbstractC5822h6
    public final void destroy() {
        C8276oE3 c8276oE3;
        C10333uE3 c10333uE3 = this.j;
        InterfaceC1422Ky1 interfaceC1422Ky1 = c10333uE3.s;
        if (interfaceC1422Ky1 != null && (c8276oE3 = c10333uE3.c1) != null) {
            ((C9897sy1) interfaceC1422Ky1).L(c8276oE3);
        }
        super.destroy();
        W0(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9990tE3(C10333uE3 c10333uE3, C6166i6 c6166i6) {
        super(c6166i6);
        this.j = c10333uE3;
    }

    @Override // defpackage.AbstractC5822h6
    public final void V0(Tab tab) {
        W0(tab);
    }

    public final void W0(Tab tab) {
        Tab tab2 = this.i;
        if (tab2 != null && !tab2.isDestroyed()) {
            C0224Bs3.h(this.i).n = null;
        }
        this.i = tab;
        if (tab != null) {
            C0224Bs3.h(tab).n = this.j.T0;
        }
    }
}
