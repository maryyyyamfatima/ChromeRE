package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: he0 */
/* loaded from: classes.dex */
public final class C6001he0 extends AbstractC2338Rz3 {
    public final /* synthetic */ C6687je0 a;

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        this.a.d();
    }

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        this.a.d();
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        this.a.d();
    }

    @Override // defpackage.BA0
    public final void s0(int i, Tab tab) {
        this.a.d();
    }

    public C6001he0(C6687je0 c6687je0) {
        this.a = c6687je0;
    }

    @Override // defpackage.AbstractC2338Rz3
    public final void V0() {
        C6687je0.a(this.a);
    }

    @Override // defpackage.AbstractC2338Rz3
    public final void W0(Tab tab) {
        C6687je0.a(this.a);
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a && !navigationHandle.c) {
            C6687je0 c6687je0 = this.a;
            c6687je0.s = null;
            c6687je0.d();
        }
    }
}
