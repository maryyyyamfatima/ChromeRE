package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GC0 implements View.OnLayoutChangeListener {
    public final Context a;
    public final C10285u6 g;
    public final View h;
    public final C6166i6 i;
    public final InterfaceC0079Ap3 j;
    public final QB k;
    public final boolean l;
    public LC0 m;
    public WebContents n;
    public Q50 o;
    public PC0 p;
    public DC0 q;
    public GURL r;
    public GURL s;
    public int t;
    public boolean u;
    public boolean v;

    public GC0(Context context, C10285u6 c10285u6, View view, C6166i6 c6166i6, InterfaceC0079Ap3 interfaceC0079Ap3, QB qb, boolean z) {
        this.a = context;
        this.g = c10285u6;
        this.h = view;
        this.i = c6166i6;
        this.j = interfaceC0079Ap3;
        this.k = qb;
        this.l = z;
    }

    public final void a(GURL gurl, GURL gurl2, String str, boolean z) {
        Profile a;
        this.r = gurl;
        this.s = gurl2;
        C10285u6 c10285u6 = this.g;
        if (!z) {
            a = Profile.d();
        } else {
            a = AbstractC1741Nk1.a(c10285u6);
            if (a == null) {
                a = Profile.d().f(true);
            }
        }
        LC0 lc0 = this.m;
        QB qb = this.k;
        Context context = this.a;
        if (lc0 == null) {
            this.m = new LC0(qb, new FC0(context), (int) (context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080803) / c10285u6.i.d));
        }
        if (this.n == null) {
            WebContents a2 = Al4.a(a, true);
            this.n = a2;
            Q50 q50 = new Q50(context, a2);
            this.o = q50;
            this.n.I(new ViewAndroidDelegate(q50), this.o, c10285u6, new C6047hl4());
            N.Mt4iWzCb(this.n, false);
            DC0 dc0 = new DC0(this);
            this.q = dc0;
            ((m) qb).a(dc0);
            C2021Po1 c2021Po1 = c10285u6.a;
            if (c2021Po1 == null) {
                AbstractC4851eH1.f("WindowAndroid", "Cannot get IntentRequestTracker as the WindowAndroid is neither a ActivityWindowAndroid or a FragmentWindowAndroid.", new Object[0]);
            }
            Context context2 = this.a;
            AC0 ac0 = new Runnable() { // from class: AC0
                public /* synthetic */ AC0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GC0 gc0 = GC0.this;
                    if (!gc0.l || gc0.r == null) {
                        return;
                    }
                    ((m) gc0.k).l(gc0.p, true, 7);
                    GURL gurl3 = gc0.s;
                    if (gurl3 == null) {
                        gurl3 = gc0.r;
                    }
                    ((AbstractC10569uv3) gc0.j.get()).b(0, (Tab) gc0.i.g, new LoadUrlParams(gurl3.i(), 0));
                }
            };
            BC0 bc0 = new Runnable() { // from class: BC0
                public /* synthetic */ BC0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = (m) GC0.this.k;
                    int i = mVar.i();
                    if (i == 1) {
                        mVar.e();
                    } else if (i == 3) {
                        mVar.c();
                    }
                }
            };
            CC0 cc0 = new Runnable() { // from class: CC0
                public /* synthetic */ CC0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GC0 gc0 = GC0.this;
                    ((m) gc0.k).l(gc0.p, true, 0);
                }
            };
            Tab tab = (Tab) this.i.g;
            PC0 pc0 = new PC0(context2, ac0, bc0, cc0, (tab == null || tab.a() == null) ? 0 : tab.a().getHeight(), c2021Po1);
            this.p = pc0;
            LC0 lc02 = this.m;
            WebContents webContents = this.n;
            Q50 q502 = this.o;
            lc02.g = a;
            lc02.d = webContents;
            lc02.e = pc0;
            lc02.f = new IC0(lc02, webContents);
            KC0 kc0 = new KC0(lc02);
            lc02.getClass();
            PC0 pc02 = lc02.e;
            pc02.n = lc02.d;
            pc02.o = q502;
            if (q502.getParent() != null) {
                ((ViewGroup) pc02.o.getParent()).removeView(pc02.o);
            }
            pc02.p.a(pc02.n, pc02.o, kc0);
            pc02.j.q(pc02.n.Q0().t);
            this.h.addOnLayoutChangeListener(this);
        }
        this.u = false;
        this.v = false;
        LC0 lc03 = this.m;
        lc03.a(gurl);
        ((TextView) lc03.e.l.findViewById(R.id.title)).setText(str);
        ((m) lc03.a).p(lc03.e, true);
        KU3 a3 = LU3.a(a);
        if (a3.isInitialized()) {
            a3.notifyEvent("ephemeral_tab_used");
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.p == null) {
            return;
        }
        Tab tab = (Tab) this.i.g;
        int height = (tab == null || tab.a() == null) ? 0 : tab.a().getHeight();
        if (height == 0 || this.t == height) {
            return;
        }
        PC0 pc0 = this.p;
        if (height == 0) {
            pc0.getClass();
        } else {
            C6930kK3 c6930kK3 = pc0.p;
            c6930kK3.getClass();
            c6930kK3.getLayoutParams().height = ((int) (height * 0.9f)) - pc0.i;
            pc0.m.requestLayout();
        }
        this.t = height;
    }
}
