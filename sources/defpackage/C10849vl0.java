package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vl0 */
/* loaded from: classes.dex */
public final class C10849vl0 extends BA0 {
    public final /* synthetic */ C11192wl0 a;

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        C11192wl0 c11192wl0 = this.a;
        if (c11192wl0.b.n) {
            c11192wl0.i();
        }
    }

    @Override // defpackage.BA0
    public final void w0(NavigationHandle navigationHandle) {
        if (this.a.b.n) {
            boolean z = navigationHandle.a;
        }
    }

    public C10849vl0(C11192wl0 c11192wl0) {
        this.a = c11192wl0;
    }
}
