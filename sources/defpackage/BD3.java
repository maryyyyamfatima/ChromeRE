package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BD3 extends BA0 {
    public final /* synthetic */ CD3 a;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        CD3 cd3 = this.a;
        if (cd3.a == tab.b()) {
            return;
        }
        WebContents webContents = cd3.a;
        if (webContents != null) {
            cd3.a(webContents);
        }
        WebContents b = tab.b();
        cd3.a = b;
        if (b != null) {
            cd3.c(b);
        }
    }

    public BD3(CD3 cd3) {
        this.a = cd3;
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.w(this);
    }
}
