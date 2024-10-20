package defpackage;

import J.N;
import android.app.Activity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XU0 implements InterfaceC11179wj, InterfaceC12208zj, View.OnSystemUiVisibilityChangeListener, ZU0 {
    public final Activity a;
    public final WU0 g;
    public final C8385oa2 h;
    public final InterfaceC7697ma2 i;
    public final boolean j;
    public final C12157za2 k = new C12157za2();
    public WebContents l;
    public Q50 m;
    public Tab n;
    public C3546aV0 o;
    public boolean p;
    public View q;
    public ViewPropertyAnimator r;
    public final OU0 s;
    public View.OnLayoutChangeListener t;
    public C3546aV0 u;
    public RU0 v;
    public SU0 w;
    public Tab x;
    public Q50 y;

    /* JADX WARN: Type inference failed for: r2v5, types: [OU0] */
    public XU0(Activity activity, C8385oa2 c8385oa2) {
        this.a = activity;
        this.i = c8385oa2;
        c8385oa2.m(new Callback() { // from class: NU0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C3546aV0 c3546aV0;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                XU0 xu0 = XU0.this;
                if (!booleanValue) {
                    xu0.getClass();
                    return;
                }
                Tab tab = xu0.x;
                if (tab == null || (c3546aV0 = xu0.u) == null) {
                    return;
                }
                if (c3546aV0.c) {
                    C3093Xu3.c(1, tab, true);
                } else {
                    xu0.e(c3546aV0, tab);
                }
                xu0.u = null;
            }
        });
        this.g = new WU0(this);
        C8385oa2 c8385oa22 = new C8385oa2();
        this.h = c8385oa22;
        c8385oa22.p(Boolean.FALSE);
        this.j = true;
        this.s = new Runnable() { // from class: OU0
            @Override // java.lang.Runnable
            public final void run() {
                final XU0 xu0 = XU0.this;
                if (xu0.q == null) {
                    return;
                }
                xu0.p = false;
                xu0.g.removeCallbacks(xu0.s);
                xu0.r.cancel();
                xu0.r.alpha(0.0f).setDuration(500L).withEndAction(new Runnable() { // from class: PU0
                    @Override // java.lang.Runnable
                    public final void run() {
                        XU0.this.h();
                    }
                });
            }
        };
    }

    public final void a(YU0 yu0) {
        this.k.a(yu0);
    }

    public final void k(YU0 yu0) {
        this.k.d(yu0);
    }

    public final void l(Q50 q50) {
        Q50 q502 = this.y;
        if (q50 == q502) {
            return;
        }
        if (q502 != null) {
            q502.h.d(this);
        }
        this.y = q50;
        if (q50 != null) {
            q50.h.a(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [QU0] */
    public final void i(final C3546aV0 c3546aV0, final Tab tab) {
        ?? r0 = new Runnable() { // from class: QU0
            @Override // java.lang.Runnable
            public final void run() {
                XU0 xu0 = XU0.this;
                boolean g = xu0.g();
                C3546aV0 c3546aV02 = c3546aV0;
                if (!g || !Objects.equals(xu0.o, c3546aV02)) {
                    xu0.h.p(Boolean.TRUE);
                    if (((Boolean) ((C8385oa2) xu0.i).g).booleanValue()) {
                        xu0.e(c3546aV02, xu0.x);
                    } else {
                        xu0.u = c3546aV02;
                    }
                }
                xu0.n(false);
                Tab tab2 = tab;
                WebContents b = tab2.b();
                if (b != null) {
                    SelectionPopupControllerImpl.k(b).j();
                }
                XU0.m(tab2, null);
            }
        };
        if (tab.isUserInteractable()) {
            r0.run();
        } else {
            m(tab, r0);
        }
        Iterator it = this.k.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((YU0) c11814ya2.next()).b(tab);
            }
        }
    }

    public final void j(Tab tab) {
        m(tab, null);
        if (tab == this.x) {
            f();
        }
        Iterator it = this.k.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((YU0) c11814ya2.next()).a();
            }
        }
    }

    public final void n(boolean z) {
        WebContents b;
        GestureListenerManagerImpl d;
        Tab tab = this.x;
        if (tab == null || tab.isHidden() || (b = this.x.b()) == null || (d = GestureListenerManagerImpl.d(b)) == null) {
            return;
        }
        long j = d.k;
        if (j == 0) {
            return;
        }
        N.M6a5zchR(j, d, z);
    }

    public static void m(Tab tab, QU0 qu0) {
        C2313Ru3 a = C2313Ru3.a(tab);
        if (qu0 == null) {
            a.a.remove("EnterFullscreen");
        } else {
            a.c(qu0, "EnterFullscreen");
        }
    }

    public final void f() {
        if (g()) {
            h();
            this.p = false;
            this.h.p(Boolean.FALSE);
            WebContents webContents = this.l;
            if (webContents == null || this.n == null) {
                this.u.c = true;
            } else {
                Q50 q50 = this.m;
                h();
                this.p = false;
                WU0 wu0 = this.g;
                wu0.removeMessages(1);
                wu0.removeMessages(2);
                int systemUiVisibility = q50.getSystemUiVisibility() & (-5640);
                Window window = this.a.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                if ((67108864 & i) != 0) {
                    attributes.flags = i & (-67108865);
                    window.setAttributes(attributes);
                }
                q50.setSystemUiVisibility(systemUiVisibility);
                View.OnLayoutChangeListener onLayoutChangeListener = this.t;
                if (onLayoutChangeListener != null) {
                    q50.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                TU0 tu0 = new TU0(this, q50);
                this.t = tu0;
                q50.addOnLayoutChangeListener(tu0);
                if (!webContents.isDestroyed()) {
                    webContents.h();
                }
            }
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
        }
        n(true);
    }

    public final boolean g() {
        return ((Boolean) this.h.g).booleanValue();
    }

    public final void e(C3546aV0 c3546aV0, Tab tab) {
        WebContents b = tab.b();
        if (b == null) {
            return;
        }
        this.o = c3546aV0;
        Q50 y = tab.y();
        int systemUiVisibility = y.getSystemUiVisibility();
        int i = systemUiVisibility & 4;
        if (i == 4 || (systemUiVisibility & 2) == 2) {
            C3546aV0 c3546aV02 = this.o;
            if ((i != 4) == c3546aV02.b && ((systemUiVisibility & 2) != 2) == c3546aV02.a) {
                return;
            } else {
                systemUiVisibility = b(systemUiVisibility & (-5640));
            }
        } else if ((systemUiVisibility & 1024) == 1024 || (systemUiVisibility & 512) == 512) {
            systemUiVisibility = b(systemUiVisibility);
        } else {
            Activity b2 = AbstractC7239lD3.b(tab);
            C7851n02.i.getClass();
            if (!C7851n02.q(b2) && !C7851n02.p(b2)) {
                r4 = false;
            }
            if (!this.o.b && !r4) {
                Window window = this.a.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.flags |= 67108864;
                window.setAttributes(attributes);
            }
            C3546aV0 c3546aV03 = this.o;
            if (!c3546aV03.a) {
                systemUiVisibility |= 512;
            }
            if (!c3546aV03.b) {
                systemUiVisibility |= 1024;
            }
        }
        View.OnLayoutChangeListener onLayoutChangeListener = this.t;
        if (onLayoutChangeListener != null) {
            y.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        UU0 uu0 = new UU0(this, y);
        this.t = uu0;
        y.addOnLayoutChangeListener(uu0);
        y.setSystemUiVisibility(systemUiVisibility);
        this.o = c3546aV0;
        y.requestLayout();
        this.l = b;
        this.m = y;
        this.n = tab;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r6 = this;
            android.view.View r0 = r6.q
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r6.p
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lc
            goto L40
        Lc:
            org.chromium.chrome.browser.tab.Tab r0 = r6.n
            if (r0 != 0) goto L11
            goto L40
        L11:
            org.chromium.chrome.browser.tab.Tab r0 = r6.x
            if (r0 != 0) goto L16
            goto L40
        L16:
            li4 r0 = org.chromium.chrome.browser.vr.VrModuleProvider.b()
            boolean r0 = r0.a()
            if (r0 != 0) goto L40
            li4 r0 = org.chromium.chrome.browser.vr.VrModuleProvider.b()
            r0.getClass()
            boolean r0 = defpackage.AbstractC7403li4.c()
            if (r0 == 0) goto L2e
            goto L40
        L2e:
            org.chromium.chrome.browser.tab.Tab r0 = r6.x
            Q50 r0 = r0.y()
            if (r0 != 0) goto L37
            goto L40
        L37:
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L3e
            goto L40
        L3e:
            r0 = r1
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L44
            return
        L44:
            android.app.Activity r0 = r6.a
            android.view.Window r3 = r0.getWindow()
            r4 = 2130772811(0x7f01034b, float:1.714875E38)
            android.view.View r3 = r3.findViewById(r4)
            r6.q = r3
            if (r3 != 0) goto L64
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r4 = 2131624217(0x7f0e0119, float:1.8875607E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r5)
            r6.q = r3
            goto L65
        L64:
            r1 = r2
        L65:
            android.view.View r3 = r6.q
            r4 = 0
            r3.setAlpha(r4)
            android.view.View r3 = r6.q
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r6.r = r3
            if (r1 == 0) goto L82
            android.view.View r1 = r6.q
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r0.addContentView(r1, r2)
            goto L87
        L82:
            android.view.View r0 = r6.q
            r0.setVisibility(r2)
        L87:
            android.view.ViewPropertyAnimator r0 = r6.r
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
            OU0 r0 = r6.s
            r1 = 5000(0x1388, double:2.4703E-320)
            WU0 r3 = r6.g
            r3.postDelayed(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XU0.c():void");
    }

    public final void h() {
        if (this.q == null) {
            return;
        }
        this.g.removeCallbacks(this.s);
        this.r.cancel();
        this.r = null;
        this.q.setVisibility(8);
        this.q = null;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 5 && this.j) {
            f();
            return;
        }
        if (i == 6) {
            ApplicationStatus.h(this);
            C12157za2 c12157za2 = ApplicationStatus.g;
            if (c12157za2 == null) {
                return;
            }
            c12157za2.d(this);
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if (this.n == null || !g()) {
            return;
        }
        this.g.sendEmptyMessageDelayed(1, 200L);
    }

    @Override // defpackage.InterfaceC12208zj
    public final void d(Activity activity, boolean z) {
        if (this.a != activity) {
            return;
        }
        if (z) {
            c();
        } else {
            h();
        }
        WU0 wu0 = this.g;
        wu0.removeMessages(1);
        wu0.removeMessages(2);
        if (this.n != null && g() && z) {
            wu0.sendEmptyMessageDelayed(1, 200L);
        }
    }

    public final int b(int i) {
        C3546aV0 c3546aV0 = this.o;
        boolean z = c3546aV0 != null ? c3546aV0.a : false;
        boolean z2 = c3546aV0 != null ? c3546aV0.b : false;
        int i2 = (z2 || z) ? 4096 : 4097;
        if (!z) {
            i2 = i2 | 2 | 512;
        }
        if (!z2) {
            i2 = i2 | 4 | 1024;
        }
        return i | i2;
    }
}
