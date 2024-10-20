package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.vr.VrShell;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ej4 */
/* loaded from: classes4.dex */
public final class C5003ej4 extends AbstractC1429Kz3 {
    public final /* synthetic */ VrShell i;

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        VrShell vrShell = this.i;
        long j = vrShell.A;
        if (j == 0) {
            return;
        }
        N.MT175_UO(j, vrShell, tab.isIncognito(), tab.getId(), tab.getTitle());
    }

    @Override // defpackage.BA0
    public final void k0(Tab tab, boolean z) {
        VrShell vrShell = this.i;
        long j = vrShell.A;
        if (j == 0) {
            return;
        }
        if (!z) {
            N.MT175_UO(j, vrShell, tab.isIncognito(), tab.getId(), tab.getTitle());
        } else {
            N.M3mI95le(j, vrShell, tab.isIncognito(), tab.getId());
        }
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        VrShell vrShell = this.i;
        long j = vrShell.A;
        if (j == 0) {
            return;
        }
        N.M3mI95le(j, vrShell, tab.isIncognito(), tab.getId());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5003ej4(VrShell vrShell, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = vrShell;
    }
}
