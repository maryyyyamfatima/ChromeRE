package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PH2 extends AbstractC0909Gz3 {
    public final /* synthetic */ QH2 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        this.h.g.p(Boolean.valueOf(tab.getLaunchType() == 18));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PH2(QH2 qh2, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = qh2;
    }
}
