package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yo1 */
/* loaded from: classes.dex */
public final class C3191Yo1 extends BA0 {
    public final /* synthetic */ C3321Zo1 a;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid != null) {
            C3321Zo1 c3321Zo1 = this.a;
            C4349cp1 c4349cp1 = c3321Zo1.c;
            TabImpl tabImpl = c3321Zo1.a;
            c4349cp1.c = tabImpl.C.d(tabImpl);
        }
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        this.a.c.a(tab.b());
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        this.a.c.a(null);
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        C4349cp1 c4349cp1 = this.a.c;
        c4349cp1.getClass();
        if (navigationHandle.g && navigationHandle.a) {
            C3321Zo1 c3321Zo1 = (C3321Zo1) c4349cp1.a;
            WebContents webContents = c3321Zo1.a.l;
            if (c4349cp1.d && webContents != null) {
                webContents.i().x();
            } else if (c4349cp1.e && webContents != null) {
                NavigationController i = webContents.i();
                int i2 = c3321Zo1.a().d;
                int b = c4349cp1.b();
                while (true) {
                    b--;
                    if (b <= i2) {
                        break;
                    } else {
                        i.r(b);
                    }
                }
            }
            c4349cp1.d = false;
            c4349cp1.e = false;
        }
    }

    public C3191Yo1(C3321Zo1 c3321Zo1) {
        this.a = c3321Zo1;
    }
}
