package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x70 */
/* loaded from: classes.dex */
public final class C11321x70 extends AbstractC0909Gz3 {
    public final /* synthetic */ ContextualSearchManager h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        ContextualSearchManager contextualSearchManager = this.h;
        if ((contextualSearchManager.K || tab.getId() == i2) && !((AbstractC11276wz3) contextualSearchManager.p).o()) {
            return;
        }
        contextualSearchManager.i(0);
        C5491g80 c5491g80 = contextualSearchManager.r;
        c5491g80.f = 0;
        c5491g80.e = null;
        c5491g80.h = false;
        c5491g80.p = false;
        c5491g80.q = false;
        c5491g80.r = false;
        c5491g80.i = null;
        c5491g80.m = 0L;
        c5491g80.j = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11321x70(ContextualSearchManager contextualSearchManager, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = contextualSearchManager;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        WebContents b = tab.b();
        ContextualSearchManager contextualSearchManager = this.h;
        if (b == contextualSearchManager.g()) {
            return;
        }
        contextualSearchManager.i(0);
    }
}
