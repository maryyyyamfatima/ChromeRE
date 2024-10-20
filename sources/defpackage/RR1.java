package defpackage;

import android.graphics.Bitmap;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RR1 extends BA0 {
    public final /* synthetic */ SR1 a;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        this.a.a();
    }

    public RR1(SR1 sr1) {
        this.a = sr1;
    }

    @Override // defpackage.BA0
    public final void x0(Tab tab, Bitmap bitmap) {
        this.a.b.j(bitmap);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        SR1 sr1 = this.a;
        ER1 er1 = sr1.b;
        if (er1 != null) {
            er1.b();
            if (er1.c != null) {
                Runnable runnable = er1.s;
                if (runnable != null) {
                    er1.r.removeCallbacks(runnable);
                    er1.s = null;
                }
                er1.f();
                er1.k = null;
            }
            CR1 cr1 = er1.c;
            if (cr1 != null) {
                cr1.destroy();
            }
            er1.c = null;
            LargeIconBridge largeIconBridge = er1.t;
            if (largeIconBridge != null) {
                largeIconBridge.a();
            }
            er1.t = null;
        }
        sr1.a.w(this);
        sr1.a = null;
    }
}
