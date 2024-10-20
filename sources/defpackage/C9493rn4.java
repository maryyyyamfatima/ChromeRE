package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rn4 */
/* loaded from: classes2.dex */
public final class C9493rn4 extends AbstractC5822h6 {
    public final PC i;
    public final C9766sc0 j;

    public C9493rn4(C6166i6 c6166i6, PC pc, C9766sc0 c9766sc0) {
        super(c6166i6);
        this.i = pc;
        this.j = c9766sc0;
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a && !navigationHandle.c) {
            boolean z = true;
            EI2.b("Webapp.NavigationStatus", !navigationHandle.i);
            if (this.i.K() && C1695Nb0.m(tabImpl).q == -1) {
                C9423rc0 c9423rc0 = this.j.i;
                if (c9423rc0 != null && c9423rc0.b == 2) {
                    z = false;
                }
                EI2.b("WebApk.Navigation.InScope", z);
            }
        }
    }
}
