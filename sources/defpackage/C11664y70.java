package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y70 */
/* loaded from: classes.dex */
public final class C11664y70 extends AbstractC1429Kz3 {
    public final /* synthetic */ ContextualSearchManager i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11664y70(ContextualSearchManager contextualSearchManager, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = contextualSearchManager;
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        this.i.i(0);
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        if (C8693pT2.W0(tabImpl)) {
            this.i.i(0);
        }
    }

    @Override // defpackage.BA0
    public final void k0(Tab tab, boolean z) {
        if (z) {
            this.i.i(0);
        }
    }
}
