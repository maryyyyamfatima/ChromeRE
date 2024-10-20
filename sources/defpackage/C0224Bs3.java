package defpackage;

import J.N;
import android.content.Context;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.OverscrollRefreshHandler;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bs3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224Bs3 extends CD3 implements OverscrollRefreshHandler {
    public int g;
    public C2303Rs3 h;
    public final Tab i;
    public Q50 j;
    public RunnableC11923ys3 k;
    public RunnableC12266zs3 l;
    public String m;
    public C5154f91 n;

    public static C0224Bs3 h(Tab tab) {
        C0224Bs3 c0224Bs3 = (C0224Bs3) tab.F().b(C0224Bs3.class);
        return c0224Bs3 == null ? (C0224Bs3) tab.F().d(C0224Bs3.class, new C0224Bs3(tab)) : c0224Bs3;
    }

    public C0224Bs3(Tab tab) {
        super(tab);
        this.i = tab;
        tab.v(new C0094As3(this));
    }

    @Override // defpackage.CD3
    public final void c(WebContents webContents) {
        webContents.D0(this);
        this.j = this.i.y();
    }

    @Override // defpackage.CD3
    public final void a(WebContents webContents) {
        g();
        this.j = null;
        this.n = null;
        reset();
    }

    @Override // defpackage.CD3
    public final void b() {
        C2303Rs3 c2303Rs3 = this.h;
        if (c2303Rs3 != null) {
            c2303Rs3.a = null;
            c2303Rs3.g = null;
        }
    }

    @Override // org.chromium.ui.OverscrollRefreshHandler
    public final boolean start(int i, float f, float f2, boolean z) {
        C5154f91 c5154f91;
        int c;
        int g;
        this.g = i;
        Tab tab = this.i;
        if (i != 1) {
            if (i != 2 || (c5154f91 = this.n) == null) {
                this.g = 0;
                return false;
            }
            F12 f12 = c5154f91.o;
            if (f12 != null) {
                f12.h = 1;
            }
            return (z && !tab.j()) || (f12 != null && f12.c(f, f2, z));
        }
        if (this.h == null) {
            final Context context = tab.getContext();
            C2303Rs3 c2303Rs3 = new C2303Rs3(context);
            this.h = c2303Rs3;
            c2303Rs3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            boolean isIncognito = tab.isIncognito();
            if (isIncognito) {
                c = context.getColor(R.color.f17410_resource_name_obfuscated_res_0x7f0700ea);
            } else {
                c = AbstractC11746yN.c(context, R.dimen.f30400_resource_name_obfuscated_res_0x7f080172);
            }
            C2303Rs3 c2303Rs32 = this.h;
            c2303Rs32.o.setBackgroundColor(c);
            c2303Rs32.t.g.w = c;
            if (!isIncognito) {
                g = AbstractC10957w33.g(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context);
            } else {
                g = context.getColor(R.color.f17740_resource_name_obfuscated_res_0x7f070116);
            }
            int[] iArr = {g};
            C11400xM1 c11400xM1 = this.h.t.g;
            c11400xM1.j = iArr;
            c11400xM1.b(0);
            c11400xM1.b(0);
            if (this.j != null) {
                this.h.setEnabled(true);
            }
            C2303Rs3 c2303Rs33 = this.h;
            c2303Rs33.a = new InterfaceC2173Qs3() { // from class: ws3
                @Override // defpackage.InterfaceC2173Qs3
                public final void a() {
                    C0224Bs3 c0224Bs3 = C0224Bs3.this;
                    c0224Bs3.e();
                    QF3 qf3 = AbstractC5103f04.a;
                    if (c0224Bs3.k == null) {
                        c0224Bs3.k = new RunnableC11923ys3(c0224Bs3);
                    }
                    PostTask.b(qf3, c0224Bs3.k, 7500L);
                    if (c0224Bs3.m == null) {
                        c0224Bs3.m = context.getResources().getString(R.string.f66300_resource_name_obfuscated_res_0x7f140164);
                    }
                    c0224Bs3.h.announceForAccessibility(c0224Bs3.m);
                    c0224Bs3.i.c();
                    FI2.a("MobilePullGestureReload");
                }
            };
            c2303Rs33.g = new C11580xs3(this);
        }
        if (this.l != null) {
            ThreadUtils.b().removeCallbacks(this.l);
            this.l = null;
        }
        if (this.h.getParent() == null) {
            this.j.addView(this.h);
        }
        C2303Rs3 c2303Rs34 = this.h;
        C7928nE c7928nE = UN.a;
        return c2303Rs34.j(N.M09VlOh_("OptimizeLayoutsForPullRefresh"));
    }

    @Override // org.chromium.ui.OverscrollRefreshHandler
    public final void reset() {
        F12 f12;
        e();
        C2303Rs3 c2303Rs3 = this.h;
        if (c2303Rs3 != null) {
            c2303Rs3.f();
        }
        C5154f91 c5154f91 = this.n;
        if (c5154f91 == null || (f12 = c5154f91.o) == null) {
            return;
        }
        int i = f12.h;
        ND2 nd2 = AbstractC10087tY0.a;
        PropertyModel propertyModel = f12.i;
        if (i == 2) {
            propertyModel.m(nd2, 5);
        } else if (i == 3) {
            propertyModel.m(nd2, 6);
        }
        f12.h = 0;
        f12.j = 0.0f;
    }

    public final void e() {
        if (this.k != null) {
            ThreadUtils.b().removeCallbacks(this.k);
        }
    }

    public final void g() {
        if (this.h == null) {
            return;
        }
        if (this.l != null) {
            ThreadUtils.b().removeCallbacks(this.l);
            this.l = null;
        }
        if (this.h.getParent() != null) {
            this.j.removeView(this.h);
        }
    }

    @Override // org.chromium.ui.OverscrollRefreshHandler
    public final void pull(float f, float f2) {
        C5154f91 c5154f91;
        F12 f12;
        TraceEvent.b("SwipeRefreshHandler.pull", null);
        int i = this.g;
        if (i == 1) {
            this.h.d(f2);
        } else if (i == 2 && (c5154f91 = this.n) != null && (f12 = c5154f91.o) != null) {
            float f3 = f12.j + f;
            f12.j = f3;
            int i2 = f12.h;
            PropertyModel propertyModel = f12.i;
            if (i2 == 2) {
                propertyModel.l(AbstractC10087tY0.d, f3);
            } else if (i2 == 3) {
                propertyModel.l(AbstractC10087tY0.e, f3);
            }
        }
        TraceEvent.c("SwipeRefreshHandler.pull");
    }

    @Override // org.chromium.ui.OverscrollRefreshHandler
    public final void release(boolean z) {
        C5154f91 c5154f91;
        F12 f12;
        TraceEvent.b("SwipeRefreshHandler.release", null);
        int i = this.g;
        if (i == 1) {
            this.h.e(z);
        } else if (i == 2 && (c5154f91 = this.n) != null && (f12 = c5154f91.o) != null) {
            f12.b(z);
        }
        TraceEvent.c("SwipeRefreshHandler.release");
    }
}
