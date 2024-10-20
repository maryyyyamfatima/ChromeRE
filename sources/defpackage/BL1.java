package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BL1 extends AbstractC0909Gz3 {
    public final /* synthetic */ CL1 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        CL1 cl1 = this.h;
        cl1.l.remove(tab);
        tab.w(cl1.w);
        KL1 kl1 = cl1.k;
        kl1.getClass();
        WebContents b = tab.b();
        if (b != null) {
            JL1 a = kl1.a(b);
            WebContents webContents = a.a;
            if (webContents != null) {
                webContents.P(a.g);
            }
            a.e = null;
            a.b.clear();
            a.f = false;
            kl1.a.remove(b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BL1(CL1 cl1, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = cl1;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        CL1 cl1 = this.h;
        if (cl1.l.add(tab)) {
            tab.v(cl1.w);
        }
        cl1.e1();
    }
}
