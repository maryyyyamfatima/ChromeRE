package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ud3 */
/* loaded from: classes2.dex */
public final class C10461ud3 implements InterfaceC8947qB3 {
    public final InterfaceC10590uz3 g;
    public final PropertyModel h;
    public final C5091ey3 i;
    public final C9432rd3 j;
    public final C9775sd3 k;
    public InterfaceC9289rB3 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Long q;
    public boolean r;
    public final Context s;
    public boolean t;
    public final C12157za2 a = new C12157za2();
    public final C8385oa2 l = new C8385oa2();

    @Override // defpackage.InterfaceC8947qB3
    public final /* synthetic */ void E(ViewGroup viewGroup) {
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void M(long j) {
    }

    @Override // defpackage.InterfaceC8947qB3
    public final /* synthetic */ ViewGroup S() {
        return null;
    }

    @Override // defpackage.InterfaceC8947qB3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.InterfaceC8947qB3
    public final int q() {
        return 2;
    }

    public C10461ud3(Context context, PropertyModel propertyModel, InterfaceC10590uz3 interfaceC10590uz3, C5091ey3 c5091ey3) {
        this.g = interfaceC10590uz3;
        this.h = propertyModel;
        this.i = c5091ey3;
        this.s = context;
        propertyModel.o(AbstractC10804vd3.b, c5091ey3.e(false).a);
        propertyModel.o(AbstractC10804vd3.a, new View.OnClickListener() { // from class: pd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10461ud3 c10461ud3 = C10461ud3.this;
                if (c10461ud3.m != null) {
                    AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c10461ud3.g;
                    if (abstractC11276wz3.i() != -1) {
                        c10461ud3.a();
                        C1998Pj3.c(abstractC11276wz3.h());
                    }
                }
            }
        });
        propertyModel.a(new VD2() { // from class: qd3
            @Override // defpackage.VD2
            public final void d(WD2 wd2, Object obj) {
                FD2 fd2 = (FD2) obj;
                LD2 ld2 = AbstractC10804vd3.c;
                C10461ud3 c10461ud3 = C10461ud3.this;
                if (fd2 != ld2) {
                    c10461ud3.getClass();
                } else {
                    c10461ud3.l.p(Boolean.valueOf(c10461ud3.b()));
                }
            }
        });
        this.j = new C9432rd3(this);
        this.k = new C9775sd3(this);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final boolean u0() {
        return this.h.j(AbstractC10804vd3.c);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void P(InterfaceC9975tB3 interfaceC9975tB3) {
        this.a.a(interfaceC9975tB3);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void z(DC3 dc3) {
        this.a.d(dc3);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void w(boolean z) {
        this.n = false;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.g;
        abstractC11276wz3.c.f(this.j);
        abstractC11276wz3.s(this.k);
        LD2 ld2 = AbstractC10804vd3.c;
        PropertyModel propertyModel = this.h;
        propertyModel.k(ld2, false);
        propertyModel.o(AbstractC10804vd3.b, this.i.e(false).a);
        propertyModel.o(AbstractC10804vd3.d, "");
        C12157za2 c12157za2 = this.a;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC9975tB3) c11814ya2.next()).a();
            }
        }
        Iterator it2 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya22 = (C11814ya2) it2;
            if (!c11814ya22.hasNext()) {
                return;
            } else {
                ((InterfaceC9975tB3) c11814ya22.next()).b();
            }
        }
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void m0(boolean z) {
        this.o = true;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.g;
        abstractC11276wz3.c(this.k);
        boolean a = UN.E.a();
        PropertyModel propertyModel = this.h;
        if (a && !abstractC11276wz3.i) {
            this.p = true;
            C7432ln3 c = C7432ln3.c();
            try {
                IE2.m(this.s);
                IE2 ie2 = IE2.g;
                c.close();
                if (ie2 != null) {
                    propertyModel.o(AbstractC10804vd3.d, ie2.i());
                    if (this.q == null) {
                        this.q = Long.valueOf(SystemClock.elapsedRealtime());
                    }
                }
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } else {
            abstractC11276wz3.c.b(this.j);
            TabModel j = abstractC11276wz3.j(false);
            int index = j.index();
            if (index != -1) {
                c(j.getTabAt(index));
                if (this.q == null) {
                    this.q = Long.valueOf(SystemClock.elapsedRealtime());
                }
            }
        }
        propertyModel.k(AbstractC10804vd3.c, true);
        C12157za2 c12157za2 = this.a;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC9975tB3) c11814ya2.next()).d();
            }
        }
        Iterator it2 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya22 = (C11814ya2) it2;
            if (!c11814ya22.hasNext()) {
                return;
            } else {
                ((InterfaceC9975tB3) c11814ya22.next()).c();
            }
        }
    }

    @Override // defpackage.InterfaceC8947qB3
    public final boolean C(boolean z) {
        if (!z && u0()) {
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.g;
            if (!abstractC11276wz3.o() && abstractC11276wz3.i() != -1) {
                a();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        a();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.l;
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void Q(long j) {
        Long l = this.q;
        if (l == null) {
            return;
        }
        StartSurfaceConfiguration.b(l.longValue() - j, "SingleTabTitleAvailableTime", AbstractC5177fD3.k(this.s, false));
        EI2.b("Startup.Android.LastVisitedTabIsSRPWhenOverviewShownAtLaunch", O83.a.e("Chrome.StartSurface.IsLastVisitedTabSRP", false));
    }

    @Override // defpackage.InterfaceC8947qB3
    public final C8385oa2 T() {
        return new C8385oa2();
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void m(boolean z) {
        this.t = z;
        this.l.p(Boolean.valueOf(b()));
    }

    public final boolean b() {
        if (!this.t && u0()) {
            InterfaceC10590uz3 interfaceC10590uz3 = this.g;
            if (!((AbstractC11276wz3) interfaceC10590uz3).o() && ((AbstractC11276wz3) interfaceC10590uz3).i() != -1) {
                return true;
            }
        }
        return false;
    }

    public final void c(Tab tab) {
        if (tab.e() && TextUtils.isEmpty(tab.getTitle())) {
            tab.v(new C10118td3(this));
        } else {
            this.h.o(AbstractC10804vd3.d, tab.getTitle());
        }
        GURL url = tab.getUrl();
        Callback callback = new Callback() { // from class: nd3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PD2 pd2 = AbstractC10804vd3.b;
                C10461ud3.this.h.o(pd2, (Drawable) obj);
            }
        };
        C5091ey3 c5091ey3 = this.i;
        c5091ey3.getClass();
        c5091ey3.c(url, false, new C4404cy3(callback));
    }

    public final void a() {
        if (this.o) {
            FI2.a("MobileTabReturnedToCurrentTab.SingleTabCard");
        }
        this.m.e(((AbstractC11276wz3) this.g).i(), SystemClock.uptimeMillis());
    }
}
