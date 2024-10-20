package defpackage;

import J.N;
import org.chromium.chrome.browser.browsing_data.BrowsingDataBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4222cT implements InterfaceC11609xx3 {
    @Override // defpackage.InterfaceC11266wx3
    public final void b(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void g(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void k(C0249Bx3 c0249Bx3) {
        int i = c0249Bx3.e;
        BrowsingDataBridge b = BrowsingDataBridge.b();
        b.getClass();
        N.MrfS11o2(b, i);
        if (i == 0) {
            FI2.a("ClearBrowsingData_SwitchTo_BasicTab");
        } else {
            FI2.a("ClearBrowsingData_SwitchTo_AdvancedTab");
        }
    }
}
