package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SU0 extends AbstractC1429Kz3 {
    public final /* synthetic */ InterfaceC10590uz3 i;
    public final /* synthetic */ XU0 j;

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.a && !navigationHandle.c && tabImpl == ((AbstractC11276wz3) this.i).h()) {
            this.j.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SU0(XU0 xu0, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC10590uz3 interfaceC10590uz32) {
        super(interfaceC10590uz3);
        this.j = xu0;
        this.i = interfaceC10590uz32;
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        this.j.l(tab.y());
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.j.f();
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        if (z && tab == ((AbstractC11276wz3) this.i).h()) {
            this.j.getClass();
            Runnable runnable = tab != null ? (Runnable) C2313Ru3.a(tab).b("EnterFullscreen") : null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
