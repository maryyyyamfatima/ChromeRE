package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vL */
/* loaded from: classes.dex */
public final class C10707vL extends AbstractC5822h6 {
    public final /* synthetic */ C11736yL i;

    @Override // defpackage.AbstractC5822h6
    public final void V0(Tab tab) {
        C11736yL c11736yL;
        Tab tab2;
        WebContents webContents;
        if (tab == null || tab == (tab2 = (c11736yL = this.i).b)) {
            return;
        }
        C10364uL c10364uL = c11736yL.a;
        if (tab2 != null && tab2.isInitialized()) {
            AD3.e(c11736yL.b).h.d(c10364uL);
        }
        c11736yL.b = tab;
        AD3 e = AD3.e(tab);
        if (!e.h.a(c10364uL) || (webContents = e.g.l) == null) {
            return;
        }
        c10364uL.onResult(webContents);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10707vL(C11736yL c11736yL, C6166i6 c6166i6) {
        super(c6166i6);
        this.i = c11736yL;
    }
}
