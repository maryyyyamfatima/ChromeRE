package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ab2 */
/* loaded from: classes.dex */
public final class C0008Ab2 implements InterfaceC0679Ff3 {
    public final /* synthetic */ InterfaceC10590uz3 a;

    public C0008Ab2(InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = interfaceC10590uz3;
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        int intValue = ((Integer) obj).intValue();
        FI2.a("OfflinePages.ReloadButtonClicked");
        Tab m = ((AbstractC11276wz3) this.a).m(intValue);
        if (m == null) {
            return;
        }
        if (!AbstractC2217Rb2.f(m.b())) {
            FI2.a("OfflinePages.ReloadButtonClickedViewingUntrustedPage");
        }
        m.c();
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        FI2.a("OfflinePages.ReloadButtonNotClicked");
    }
}
