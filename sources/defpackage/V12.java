package defpackage;

import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V12 extends BA0 {
    public final Callback a;
    public final T12 g;
    public long h;

    public V12(SI0 si0, Tab tab) {
        this.a = si0;
        WebContents b = tab.b();
        if (b != null) {
            NavigationController i = b.i();
            T12 t12 = new T12(this, i.k(), i, tab);
            this.g = t12;
            b.h0(t12);
        } else {
            this.g = null;
        }
        if (tab.isHidden()) {
            return;
        }
        this.h = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        if (this.h == 0) {
            this.h = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        V0(tab);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        V0(tab);
    }

    public final void V0(Tab tab) {
        T12 t12;
        if (tab != null) {
            tab.w(this);
            if (tab.b() != null && (t12 = this.g) != null) {
                tab.b().P(t12);
            }
        }
        this.a.onResult(new U12(SystemClock.elapsedRealtime() - this.h));
    }

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        if ((loadUrlParams.d & 1040187392) != 0) {
            V0(tab);
        }
    }
}
