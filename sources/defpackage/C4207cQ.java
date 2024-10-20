package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cQ */
/* loaded from: classes.dex */
public final class C4207cQ extends BA0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5582gQ g;

    public C4207cQ(C5582gQ c5582gQ, String str) {
        this.g = c5582gQ;
        this.a = str;
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        C5582gQ c5582gQ = this.g;
        c5582gQ.getClass();
        if (!tab.isUserInteractable() || tab.e()) {
            return;
        }
        c5582gQ.h(tab, this.a);
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        C5582gQ c5582gQ = this.g;
        c5582gQ.getClass();
        if (!tab.isUserInteractable() || tab.e()) {
            return;
        }
        c5582gQ.h(tab, this.a);
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        tab.w(this);
    }
}
