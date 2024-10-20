package org.chromium.chrome.browser.compositor.bottombar;

import J.N;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC1741Nk1;
import defpackage.AbstractC4290cf2;
import defpackage.Al4;
import defpackage.C10815vf2;
import defpackage.C11158wf2;
import defpackage.C11501xf2;
import defpackage.C11844yf2;
import defpackage.C6047hl4;
import defpackage.C8758pf2;
import defpackage.G70;
import defpackage.InterfaceC0079Ap3;
import defpackage.Q50;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OverlayPanelContent {
    public final ViewGroup a;
    public final WindowAndroid b;
    public final InterfaceC0079Ap3 c;
    public WebContents e;
    public Q50 f;
    public final Activity h;
    public C11158wf2 i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final AbstractC4290cf2 o;
    public final C8758pf2 p;
    public String q;
    public int s;
    public int t;
    public boolean u;
    public final int v;
    public int w;
    public long g = N.MIJaVtKT(this);
    public final boolean r = false;
    public final C10815vf2 d = new C10815vf2(this);

    public OverlayPanelContent(G70 g70, C8758pf2 c8758pf2, Activity activity, float f, CompositorViewHolder compositorViewHolder, WindowAndroid windowAndroid, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.o = g70;
        this.p = c8758pf2;
        this.h = activity;
        this.v = (int) (f * activity.getResources().getDisplayMetrics().density);
        this.a = compositorViewHolder;
        this.b = windowAndroid;
        this.c = interfaceC0079Ap3;
    }

    public final void c(String str) {
        this.q = null;
        a();
        this.j = str;
        this.k = true;
        this.m = true;
        this.e.i().d(new LoadUrlParams(str, 0));
    }

    public final void a() {
        int makeMeasureSpec;
        if (this.e != null) {
            if (!this.k || this.l) {
                return;
            } else {
                b();
            }
        }
        boolean z = this.r;
        WindowAndroid windowAndroid = this.b;
        WebContents a = Al4.a(AbstractC1741Nk1.b(windowAndroid, z), true);
        this.e = a;
        Q50 q50 = new Q50(this.h, a);
        int i = this.s;
        if (i != 0 || this.t != 0) {
            if (i == 0) {
                makeMeasureSpec = Q50.n;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            }
            int i2 = this.t;
            int makeMeasureSpec2 = i2 == 0 ? Q50.n : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            q50.k = makeMeasureSpec;
            q50.l = makeMeasureSpec2;
        }
        this.e.I(new C11844yf2(this, q50), q50, windowAndroid, new C6047hl4());
        N.Mt4iWzCb(this.e, false);
        N.MzHfGFwX(this.g, this, this.e, this.d);
        this.i = new C11158wf2(this, this.e);
        this.f = q50;
        N.MhbyyKle(this.g, this, new C11501xf2(this), this.e);
        this.o.getClass();
        d();
        this.a.addView(this.f, 1);
    }

    public final void b() {
        if (this.e != null) {
            this.a.removeView(this.f);
            N.Mgx0E3X8(this.g, this);
            this.e = null;
            C11158wf2 c11158wf2 = this.i;
            if (c11158wf2 != null) {
                c11158wf2.destroy();
                this.i = null;
            }
            this.k = false;
            this.m = false;
            this.l = false;
        }
    }

    public final void clearNativePanelContentPtr() {
        this.g = 0L;
    }

    public final void d() {
        WebContents webContents = this.e;
        if (webContents == null) {
            return;
        }
        int i = this.t - (this.u ? this.v : 0);
        N.M7MukokD(this.g, this, webContents, this.s, i);
        this.e.b(this.s, i);
    }
}
