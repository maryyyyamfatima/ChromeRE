package defpackage;

import J.N;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import java.util.HashMap;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge;
import org.chromium.components.browser_ui.bottomsheet.BottomSheet;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oo2 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1892Oo2 extends Fl4 implements InterfaceC4481dC, View.OnLayoutChangeListener {
    public final PropertyModel g;
    public final Runnable h;
    public final WebContents i;
    public final WebContents j;
    public final InterfaceC1113Io2 k;
    public final Handler l;
    public final View m;
    public final QB n;
    public final int o;
    public int p;
    public final C1948Oz3 q;
    public final C1762No2 r;
    public int s;

    @Override // defpackage.InterfaceC4481dC
    public final void a(float f) {
    }

    @Override // defpackage.InterfaceC4481dC
    public final void b(PB pb) {
    }

    @Override // defpackage.InterfaceC4481dC
    public final void d(int i) {
    }

    public ViewOnLayoutChangeListenerC1892Oo2(PropertyModel propertyModel, RunnableC0593Eo2 runnableC0593Eo2, WebContents webContents, WebContents webContents2, C1642Mq2 c1642Mq2, View view, int i, QB qb, C1948Oz3 c1948Oz3, Activity activity) {
        super(webContents2);
        this.l = new Handler();
        this.p = 0;
        this.s = -1;
        this.m = view;
        this.n = qb;
        this.i = webContents;
        this.j = webContents2;
        this.o = i;
        this.g = propertyModel;
        propertyModel.o(AbstractC2282Ro2.b, new Runnable() { // from class: Mo2
            @Override // java.lang.Runnable
            public final void run() {
                NavigationController i2 = ViewOnLayoutChangeListenerC1892Oo2.this.j.i();
                if (i2 == null || !i2.h()) {
                    return;
                }
                i2.f();
            }
        });
        this.h = runnableC0593Eo2;
        this.k = c1642Mq2;
        propertyModel.m(AbstractC2282Ro2.a, ((int) (view.getHeight() * 0.9f)) - i);
        this.q = c1948Oz3;
        C1762No2 c1762No2 = new C1762No2(this);
        this.r = c1762No2;
        ApplicationStatus.e(c1762No2, activity);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.g.m(AbstractC2282Ro2.a, ((int) (this.m.getHeight() * 0.9f)) - this.o);
    }

    @Override // defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i != 0) {
            return;
        }
        this.p = 1;
        this.l.post(this.h);
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.c || !navigationHandle.g || !navigationHandle.a || N.Me8yLh8j(this.j)) {
            return;
        }
        this.l.post(new RunnableC1503Lo2(this));
    }

    @Override // defpackage.InterfaceC4481dC
    public final void j() {
        C1513Lq2 c1513Lq2 = ((C1642Mq2) this.k).w;
        c1513Lq2.a = true;
        c1513Lq2.a();
        final m mVar = (m) this.n;
        OX2 ox2 = (OX2) mVar.o.get();
        if (ox2 != null) {
            if (!(ox2.b.f != null)) {
                HashMap e = PropertyModel.e(UX2.l);
                ID2 id2 = UX2.a;
                DD2 dd2 = new DD2();
                dd2.a = 0;
                e.put(id2, dd2);
                HD2 hd2 = UX2.b;
                AD2 ad2 = new AD2();
                ad2.a = true;
                e.put(hd2, ad2);
                JD2 jd2 = UX2.c;
                BottomSheet bottomSheet = mVar.a;
                GD2 gd2 = new GD2();
                gd2.a = bottomSheet;
                e.put(jd2, gd2);
                HD2 hd22 = UX2.d;
                AD2 ad22 = new AD2();
                ad22.a = false;
                e.put(hd22, ad22);
                JD2 jd22 = UX2.f;
                Runnable runnable = new Runnable() { // from class: org.chromium.components.browser_ui.bottomsheet.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomSheet bottomSheet2 = m.this.a;
                        if (bottomSheet2.z) {
                            bottomSheet2.t(bottomSheet2.i(), 3, true);
                        }
                    }
                };
                GD2 gd22 = new GD2();
                gd22.a = runnable;
                e.put(jd22, gd22);
                ox2.b(new PropertyModel(e));
            }
        }
        if (this.s == -1) {
            this.s = this.q.a.a();
        }
    }

    @Override // defpackage.Fl4
    public final void destroy() {
        ApplicationStatus.h(this.r);
        int i = this.p;
        WebContents webContents = this.i;
        if (i == 1) {
            ServiceWorkerPaymentAppBridge.a(webContents, 17);
        } else if (i == 2) {
            ServiceWorkerPaymentAppBridge.a(webContents, 13);
        } else if (i == 3) {
            ServiceWorkerPaymentAppBridge.a(webContents, 15);
        } else if (i == 4) {
            ServiceWorkerPaymentAppBridge.a(webContents, 14);
        }
        this.l.removeCallbacksAndMessages(null);
        int i2 = this.s;
        if (i2 != -1) {
            this.q.a.c(i2);
            this.s = -1;
        }
        OX2 ox2 = (OX2) ((m) this.n).o.get();
        if (ox2 != null) {
            if (ox2.b.f != null) {
                ox2.a(true);
            }
        }
        super.destroy();
    }

    @Override // defpackage.Fl4
    public final void didFailLoad(boolean z, int i, GURL gurl, int i2) {
        if (z) {
            this.l.post(new Runnable() { // from class: Ko2
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnLayoutChangeListenerC1892Oo2 viewOnLayoutChangeListenerC1892Oo2 = ViewOnLayoutChangeListenerC1892Oo2.this;
                    viewOnLayoutChangeListenerC1892Oo2.p = 4;
                    viewOnLayoutChangeListenerC1892Oo2.h.run();
                }
            });
        }
    }

    @Override // defpackage.Fl4
    public final void didChangeVisibleSecurityState() {
        if (N.Me8yLh8j(this.j)) {
            return;
        }
        this.l.post(new RunnableC1503Lo2(this));
    }
}
