package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hV0 */
/* loaded from: classes.dex */
public final class C5952hV0 extends BA0 {
    public final Activity a;
    public final Tab g;
    public WebContents h;
    public C6296iV0 i;
    public final /* synthetic */ C6638jV0 j;

    public C5952hV0(C6638jV0 c6638jV0, Activity activity, Tab tab) {
        this.j = c6638jV0;
        this.a = activity;
        this.g = tab;
        tab.v(this);
        if (tab == null) {
            return;
        }
        WebContents b = tab.b();
        this.h = b;
        if (b == null) {
            return;
        }
        this.i = new C6296iV0(c6638jV0, activity, b);
    }

    public final void V0() {
        C6296iV0 c6296iV0 = this.i;
        if (c6296iV0 == null) {
            return;
        }
        c6296iV0.h.P(c6296iV0);
        this.i = null;
        this.h = null;
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid != null) {
            C6638jV0.a(this.j, this.a, 5);
        }
    }

    @Override // defpackage.BA0
    public final void k0(Tab tab, boolean z) {
        C6638jV0.a(this.j, this.a, 2);
        V0();
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        C6638jV0.a(this.j, this.a, 3);
        V0();
    }

    @Override // defpackage.BA0
    public final void U0(Tab tab) {
        C6638jV0.a(this.j, this.a, 7);
        V0();
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        Tab tab2 = this.g;
        if (tab != tab2) {
            return;
        }
        V0();
        if (tab2 == null) {
            return;
        }
        WebContents b = tab2.b();
        this.h = b;
        if (b == null) {
            return;
        }
        this.i = new C6296iV0(this.j, this.a, b);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        if (tab != this.g) {
            return;
        }
        V0();
    }
}
