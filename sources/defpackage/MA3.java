package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MA3 extends IC implements InterfaceC8775pi1 {
    public final TabImpl i;
    public WebContents j;
    public boolean k;

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.IC, defpackage.C8385oa2
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Integer) obj);
    }

    public MA3(TabImpl tabImpl) {
        this.i = tabImpl;
        tabImpl.v(new LA3(this));
        WebContents webContents = tabImpl.l;
        if (this.j == webContents) {
            return;
        }
        this.j = webContents;
        if (webContents == null) {
            return;
        }
        ImeAdapterImpl.b(webContents).n.add(this);
    }

    public final void u() {
        p(Integer.valueOf(s()));
    }

    @Override // defpackage.InterfaceC8775pi1
    public final void o(boolean z, boolean z2) {
        u();
    }

    public int s() {
        TabImpl tabImpl = this.i;
        WebContents webContents = tabImpl.l;
        if (webContents != null && !webContents.isDestroyed()) {
            r3 = (!tabImpl.isHidden()) & (!SelectionPopupControllerImpl.k(webContents).v) & (!(AbstractC6832k23.a(tabImpl.l) == 5)) & (!r4.h().equals("chrome-native")) & (tabImpl.getUrl() != null) & (!r4.h().equals("chrome")) & (!tabImpl.s) & (!tabImpl.A) & (!this.k) & (!C10021tL.f().c()) & C1096Il0.c().f;
        }
        return r3 ? 3 : 1;
    }
}
