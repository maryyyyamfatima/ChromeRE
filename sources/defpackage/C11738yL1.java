package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yL1 */
/* loaded from: classes.dex */
public final class C11738yL1 extends BA0 {
    public final /* synthetic */ CL1 a;

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        CL1 cl1 = this.a;
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
        cl1.d1();
        cl1.e1();
    }

    public C11738yL1(CL1 cl1) {
        this.a = cl1;
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.a.d1();
    }
}
