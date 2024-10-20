package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N60 extends AbstractC1429Kz3 {
    public final /* synthetic */ P60 i;

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        this.i.c(tab, true, null);
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        this.i.c(tabImpl, false, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N60(P60 p60, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = p60;
    }
}
