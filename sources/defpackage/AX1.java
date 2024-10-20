package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AX1 extends AbstractC0909Gz3 {
    public final /* synthetic */ BX1 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        BX1 bx1 = this.h;
        bx1.a.p(Boolean.valueOf(bx1.i.a.S0(tab)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AX1(BX1 bx1, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = bx1;
    }
}
