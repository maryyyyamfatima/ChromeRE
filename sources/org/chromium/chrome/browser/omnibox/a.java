package org.chromium.chrome.browser.omnibox;

import J.N;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ActionMode;
import android.view.View;
import android.widget.ImageButton;
import com.android.chrome.R;
import defpackage.AbstractC1878Ol3;
import defpackage.AbstractC4159cG1;
import defpackage.AbstractC8215o34;
import defpackage.C0257Bz1;
import defpackage.C0538Ed2;
import defpackage.C10285u6;
import defpackage.C10501uk1;
import defpackage.C1202Jg1;
import defpackage.C1245Jp;
import defpackage.C1359Kl3;
import defpackage.C2649Uk;
import defpackage.C3799bD;
import defpackage.C4496dF;
import defpackage.C4502dG0;
import defpackage.C4573dU1;
import defpackage.C4959ec2;
import defpackage.C5303fc2;
import defpackage.C5809h34;
import defpackage.C6153i34;
import defpackage.C7183l34;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.C8815pp;
import defpackage.C8820pp4;
import defpackage.C9189qu0;
import defpackage.C9425rc2;
import defpackage.C9435re0;
import defpackage.C9861ss;
import defpackage.I5;
import defpackage.IG3;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0408Dd2;
import defpackage.InterfaceC10111tc2;
import defpackage.InterfaceC1068If2;
import defpackage.InterfaceC3173Yk3;
import defpackage.InterfaceC3472aG1;
import defpackage.InterfaceC5991hc2;
import defpackage.InterfaceC6092ht1;
import defpackage.InterfaceC6114hx;
import defpackage.InterfaceC6564jG1;
import defpackage.InterfaceC6908kG1;
import defpackage.InterfaceC7114ks;
import defpackage.InterfaceC7444lp3;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC7913nB;
import defpackage.InterfaceC9158qp;
import defpackage.InterpolatorC0485Dt;
import defpackage.LD2;
import defpackage.NW0;
import defpackage.O83;
import defpackage.Q83;
import defpackage.QZ2;
import defpackage.RunnableC0335Cp;
import defpackage.SF1;
import defpackage.UN;
import defpackage.V02;
import defpackage.Vf4;
import defpackage.ViewOnClickListenerC3303Zk3;
import defpackage.YF1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.omnibox.geo.GeolocationHeader;
import org.chromium.chrome.browser.omnibox.status.StatusView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a implements SF1, V02, InterfaceC10111tc2, InterfaceC9158qp {
    public AbstractC4159cG1 a;
    public YF1 g;
    public I5 h;
    public C5809h34 i;
    public C8815pp j;
    public ViewOnClickListenerC3303Zk3 k;
    public final C8820pp4 l;
    public final WindowAndroid m;
    public final View n;
    public g o;
    public View p;
    public View q;
    public View r;
    public View s;
    public final C0538Ed2 t;
    public C4496dF u;
    public boolean v;

    public a(View view, View view2, InterfaceC7697ma2 interfaceC7697ma2, InterfaceC3472aG1 interfaceC3472aG1, ActionMode.Callback callback, C8820pp4 c8820pp4, C10285u6 c10285u6, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC7697ma2 interfaceC7697ma22, InterfaceC0079Ap3 interfaceC0079Ap32, C10501uk1 c10501uk1, I5 i5, InterfaceC1068If2 interfaceC1068If2, InterfaceC7114ks interfaceC7114ks, QZ2 qz2, Runnable runnable, InterfaceC3173Yk3 interfaceC3173Yk3, Callback callback2, InterfaceC6908kG1 interfaceC6908kG1, InterfaceC6564jG1 interfaceC6564jG1, InterfaceC0079Ap3 interfaceC0079Ap33, InterfaceC6114hx interfaceC6114hx, InterfaceC7913nB interfaceC7913nB, InterfaceC6092ht1 interfaceC6092ht1, C8385oa2 c8385oa2, C4959ec2 c4959ec2, C3799bD c3799bD, Callback callback3, C9861ss c9861ss) {
        C0538Ed2 c0538Ed2 = new C0538Ed2();
        this.t = c0538Ed2;
        this.u = new C4496dF();
        this.a = (AbstractC4159cG1) view;
        this.l = c8820pp4;
        this.m = c10285u6;
        this.h = i5;
        i5.b(this);
        this.n = view2;
        this.p = this.a.findViewById(R.id.url_bar);
        this.o = new g(this.a.getContext(), this.a, interfaceC3472aG1, interfaceC7697ma2, interfaceC1068If2, LocaleManager.getInstance(), c0538Ed2, interfaceC7114ks, c10285u6, DeviceFormFactor.b(c10285u6) && (this.a instanceof LocationBarTablet), qz2, C0257Bz1.b, runnable, interfaceC6908kG1, interfaceC6564jG1, interfaceC7913nB);
        if (c9861ss != null && C9861ss.b()) {
            c9861ss.a(this.o, 13);
        }
        boolean z = c10501uk1 != null && c10501uk1.b();
        UrlBarApi26 urlBarApi26 = (UrlBarApi26) this.p;
        C4496dF c4496dF = this.u;
        final g gVar = this.o;
        Objects.requireNonNull(gVar);
        C5809h34 c5809h34 = new C5809h34(urlBarApi26, c8820pp4, callback, c4496dF.b(new Callback() { // from class: TF1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final g gVar2 = g.this;
                gVar2.b0(true);
                gVar2.M = booleanValue;
                gVar2.R.p(Boolean.valueOf(booleanValue));
                gVar2.i0();
                gVar2.k0();
                gVar2.v();
                InterfaceC3472aG1 interfaceC3472aG12 = gVar2.j;
                if (booleanValue) {
                    if (gVar2.E) {
                        FI2.a("FocusLocation");
                    }
                    C6153i34 s = interfaceC3472aG12.s();
                    if (s.c != null) {
                        gVar2.o.f(s, 0, 0);
                    }
                } else {
                    gVar2.F = false;
                    gVar2.G = false;
                }
                ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3 = gVar2.l;
                C1359Kl3 c1359Kl3 = viewOnClickListenerC3303Zk3.g;
                if (c1359Kl3.k != booleanValue) {
                    c1359Kl3.k = booleanValue;
                    c1359Kl3.f();
                    c1359Kl3.e();
                    c1359Kl3.d(0);
                    if (!c1359Kl3.k && true != c1359Kl3.K) {
                        c1359Kl3.K = true;
                        c1359Kl3.d(0);
                    }
                }
                viewOnClickListenerC3303Zk3.k = booleanValue;
                viewOnClickListenerC3303Zk3.d();
                if (!gVar2.G) {
                    gVar2.J(booleanValue);
                }
                if (booleanValue && interfaceC3472aG12.o() && !interfaceC3472aG12.isIncognito()) {
                    if (gVar2.E) {
                        InterfaceC0408Dd2 interfaceC0408Dd2 = gVar2.t;
                        if (((TemplateUrlService) interfaceC0408Dd2.get()).e()) {
                            GeolocationHeader.f((Profile) ((C8385oa2) gVar2.p).g, (TemplateUrlService) interfaceC0408Dd2.get());
                        }
                    }
                    gVar2.s.add(new Runnable() { // from class: eG1
                        @Override // java.lang.Runnable
                        public final void run() {
                            g gVar3 = g.this;
                            InterfaceC0408Dd2 interfaceC0408Dd22 = gVar3.t;
                            if (((TemplateUrlService) interfaceC0408Dd22.get()).e()) {
                                GeolocationHeader.f((Profile) ((C8385oa2) gVar3.p).g, (TemplateUrlService) interfaceC0408Dd22.get());
                            }
                        }
                    });
                }
                if (booleanValue || !interfaceC3472aG12.o()) {
                    return;
                }
                gVar2.Y(interfaceC3472aG12.h(), interfaceC3472aG12.s());
            }
        }), this.o, c10285u6.r(), z, callback3);
        this.i = c5809h34;
        this.j = new C8815pp(this.a, this, this, c5809h34, interfaceC7697ma22, interfaceC0079Ap3, interfaceC0079Ap32, interfaceC3472aG1, interfaceC7697ma2, callback2, interfaceC0079Ap33, interfaceC6114hx, interfaceC6092ht1, c4959ec2);
        ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3 = new ViewOnClickListenerC3303Zk3(DeviceFormFactor.b(c10285u6), (StatusView) this.a.findViewById(R.id.location_bar_status), interfaceC3472aG1, c0538Ed2, qz2, interfaceC7697ma2, c10285u6, interfaceC3173Yk3, c8385oa2, c3799bD);
        this.k = viewOnClickListenerC3303Zk3;
        g gVar2 = this.o;
        C5809h34 c5809h342 = this.i;
        C8815pp c8815pp = this.j;
        gVar2.o = c5809h342;
        gVar2.m = c8815pp;
        gVar2.l = viewOnClickListenerC3303Zk3;
        gVar2.k0();
        gVar2.i0();
        gVar2.j0();
        this.o.d(this.j);
        this.o.d(this.i);
        View findViewById = this.a.findViewById(R.id.delete_button);
        this.q = findViewById;
        final g gVar3 = this.o;
        Objects.requireNonNull(gVar3);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: UF1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                g gVar4 = g.this;
                if (gVar4.E) {
                    FI2.a("MobileOmniboxDeleteUrl");
                    gVar4.o.f(C6153i34.h, 2, 0);
                    gVar4.H();
                    gVar4.i0();
                }
            }
        });
        View findViewById2 = this.a.findViewById(R.id.mic_button);
        this.r = findViewById2;
        final g gVar4 = this.o;
        Objects.requireNonNull(gVar4);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: VF1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                g gVar5 = g.this;
                if (gVar5.E) {
                    FI2.a("MobileOmniboxVoiceSearch");
                    gVar5.i.h(0);
                }
            }
        });
        View findViewById3 = this.a.findViewById(R.id.lens_camera_button);
        this.s = findViewById3;
        final g gVar5 = this.o;
        Objects.requireNonNull(gVar5);
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: WF1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                g gVar6 = g.this;
                if (!gVar6.E || gVar6.j == null) {
                    return;
                }
                AbstractC1427Kz1.a(3);
                gVar6.g0(3);
            }
        });
        this.p.setOnKeyListener(this.o);
        this.i.g.l.add(this.j);
        C5809h34 c5809h343 = this.i;
        c5809h343.g.a.o(AbstractC8215o34.i, this.u.b(new Callback() { // from class: XF1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                a aVar = a.this;
                AbstractC4159cG1 abstractC4159cG1 = aVar.a;
                int intValue = ((Integer) obj).intValue();
                WeakHashMap weakHashMap = Ec4.a;
                abstractC4159cG1.setLayoutDirection(intValue);
                aVar.j.b();
            }
        }));
        this.a.getContext().registerComponentCallbacks(this.o);
        this.a.a(this.j, this.i, this.k, interfaceC3472aG1, qz2);
        AbstractC4159cG1 abstractC4159cG1 = this.a;
        if (abstractC4159cG1 instanceof LocationBarPhone) {
            this.g = new b((LocationBarPhone) view);
        } else if (abstractC4159cG1 instanceof LocationBarTablet) {
            this.g = new c((LocationBarTablet) view);
        }
    }

    @Override // defpackage.SF1
    public final void destroy() {
        YF1 yf1 = this.g;
        if (yf1 != null) {
            yf1.destroy();
            this.g = null;
        }
        this.p.setOnKeyListener(null);
        this.p = null;
        this.q.setOnClickListener(null);
        this.q = null;
        this.r.setOnClickListener(null);
        this.r = null;
        this.s.setOnClickListener(null);
        this.s = null;
        this.o.U(this.i);
        C5809h34 c5809h34 = this.i;
        C7183l34 c7183l34 = c5809h34.g;
        c7183l34.l.clear();
        c7183l34.m.clear();
        c7183l34.g = new C9435re0();
        c5809h34.g = null;
        c5809h34.a.removeCallbacks(c5809h34.j);
        c5809h34.a.removeCallbacks(c5809h34.k);
        UrlBarApi26 urlBarApi26 = c5809h34.a;
        urlBarApi26.F = false;
        urlBarApi26.setFocusable(false);
        urlBarApi26.setFocusableInTouchMode(false);
        urlBarApi26.v = null;
        urlBarApi26.setOnFocusChangeListener(null);
        urlBarApi26.y = null;
        urlBarApi26.w = null;
        urlBarApi26.x = null;
        c5809h34.a = null;
        c5809h34.l = null;
        this.i = null;
        this.a.getContext().unregisterComponentCallbacks(this.o);
        this.o.U(this.j);
        C8815pp c8815pp = this.j;
        ((C8385oa2) c8815pp.g).n(c8815pp.h);
        C1245Jp c1245Jp = c8815pp.i;
        if (c1245Jp.w != null) {
            c1245Jp.m(false);
            c1245Jp.w.a.remove(c1245Jp);
        }
        C9189qu0 c9189qu0 = c1245Jp.m;
        ImageFetcher imageFetcher = c9189qu0.f;
        if (imageFetcher != null) {
            imageFetcher.b();
            c9189qu0.f = null;
        }
        LargeIconBridge largeIconBridge = c9189qu0.h;
        if (largeIconBridge != null) {
            largeIconBridge.a();
            c9189qu0.h = null;
        }
        C9425rc2 c9425rc2 = c8815pp.j;
        if (c9425rc2 != null) {
            c9425rc2.h.c().a();
            c9425rc2.W0 = null;
            c9425rc2.X0.getViewTreeObserver().removeOnGlobalLayoutListener(c9425rc2.Z0);
            AbstractC4159cG1 abstractC4159cG1 = c9425rc2.Y0;
            if (abstractC4159cG1 != null) {
                abstractC4159cG1.removeOnLayoutChangeListener(c9425rc2.a1);
            }
            c9425rc2.Y0 = null;
            c9425rc2.a1 = null;
            c8815pp.j = null;
        }
        this.j = null;
        ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3 = this.k;
        C1359Kl3 c1359Kl3 = viewOnClickListenerC3303Zk3.g;
        c1359Kl3.E.removeCallbacksAndMessages(null);
        c1359Kl3.D.a.d(c1359Kl3);
        c1359Kl3.F.removeCallbacksAndMessages(null);
        InterfaceC0079Ap3 interfaceC0079Ap3 = c1359Kl3.j;
        if (interfaceC0079Ap3 != null && interfaceC0079Ap3.get() != null) {
            ((C4573dU1) interfaceC0079Ap3.get()).k = null;
        }
        InterfaceC0408Dd2 interfaceC0408Dd2 = c1359Kl3.h;
        if (interfaceC0408Dd2.i()) {
            ((TemplateUrlService) interfaceC0408Dd2.get()).h(c1359Kl3);
        }
        viewOnClickListenerC3303Zk3.j.r(viewOnClickListenerC3303Zk3);
        viewOnClickListenerC3303Zk3.j = null;
        this.k = null;
        AbstractC4159cG1 abstractC4159cG12 = this.a;
        if (abstractC4159cG12.k != null) {
            abstractC4159cG12.k = null;
        }
        abstractC4159cG12.j = null;
        this.a = null;
        this.u.a();
        this.u = null;
        g gVar = this.o;
        C0538Ed2 c0538Ed2 = gVar.k;
        if (c0538Ed2.get() != null) {
            C2649Uk c2649Uk = (C2649Uk) c0538Ed2.get();
            c2649Uk.i.h(c2649Uk);
            c2649Uk.l.d(c2649Uk);
            c2649Uk.m.j(c2649Uk);
        }
        InterfaceC0408Dd2 interfaceC0408Dd22 = gVar.t;
        if (interfaceC0408Dd22.i()) {
            ((TemplateUrlService) interfaceC0408Dd22.get()).h(gVar);
        }
        gVar.l = null;
        gVar.m = null;
        gVar.o = null;
        gVar.i.f.d(gVar);
        gVar.i = null;
        gVar.j.r(gVar);
        gVar.s.clear();
        gVar.z.clear();
        this.o = null;
    }

    @Override // defpackage.V02
    public final void U() {
        this.h.c(this);
        this.h = null;
        this.t.a(IG3.a());
        g gVar = this.o;
        gVar.E = true;
        gVar.n = new C5303fc2();
        TemplateUrlService templateUrlService = (TemplateUrlService) gVar.t.get();
        if (templateUrlService != null) {
            templateUrlService.a(gVar);
        }
        C0538Ed2 c0538Ed2 = gVar.k;
        Context context = gVar.u;
        C4502dG0 c4502dG0 = C4502dG0.b;
        NW0 c = NW0.c(context);
        Q83 q83 = O83.a;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        c0538Ed2.a(new C2649Uk(context, c4502dG0, templateUrlService, c, gVar, q83, C1202Jg1.b(d), AccountManagerFacadeProvider.getInstance()));
        gVar.b();
        AbstractC4159cG1 abstractC4159cG1 = gVar.h;
        abstractC4159cG1.c();
        gVar.W((Profile) ((C8385oa2) gVar.p).g);
        gVar.v();
        ArrayList arrayList = gVar.s;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            abstractC4159cG1.post((Runnable) it.next());
        }
        arrayList.clear();
        gVar.i0();
        this.i.a.q = true;
        C1245Jp c1245Jp = this.j.i;
        c1245Jp.v = true;
        C9189qu0 c9189qu0 = c1245Jp.m;
        c9189qu0.d.a();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = c9189qu0.a;
            if (i >= arrayList2.size()) {
                break;
            }
            ((InterfaceC7444lp3) arrayList2.get(i)).a();
            i++;
        }
        c1245Jp.k();
        ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3 = this.k;
        C1359Kl3 c1359Kl3 = viewOnClickListenerC3303Zk3.g;
        c1359Kl3.d(0);
        c1359Kl3.a.o(AbstractC1878Ol3.e, viewOnClickListenerC3303Zk3);
        c1359Kl3.e();
        InterfaceC0079Ap3 interfaceC0079Ap3 = c1359Kl3.j;
        if (interfaceC0079Ap3 != null && interfaceC0079Ap3.get() != null) {
            ((C4573dU1) interfaceC0079Ap3.get()).k = c1359Kl3;
        }
        C7928nE c7928nE = UN.a;
        c1359Kl3.P = N.M37SqSAy("PageInfoDiscoverability", "PermissionIconTimeoutMs", 8500);
        this.v = true;
    }

    @Override // defpackage.SF1
    public final void q() {
        this.o.v();
    }

    @Override // defpackage.SF1
    public final void l(boolean z) {
        this.o.getClass();
    }

    @Override // defpackage.SF1
    public final void r() {
        this.i.a.sendAccessibilityEvent(8);
    }

    @Override // defpackage.SF1
    public final void s() {
        g gVar = this.o;
        if (gVar.M || gVar.F) {
            return;
        }
        gVar.G = true;
        gVar.Z(null, 8, true);
    }

    @Override // defpackage.SF1
    public final void h() {
        this.i.a.selectAll();
    }

    @Override // defpackage.SF1
    public final void m() {
        this.o.V();
    }

    @Override // defpackage.SF1
    public final View d() {
        return this.a;
    }

    @Override // defpackage.SF1
    public final View p() {
        return this.a.m.a.i;
    }

    @Override // defpackage.SF1
    public final Vf4 b() {
        return this.o.I();
    }

    @Override // defpackage.SF1
    public final InterfaceC5991hc2 j() {
        return this.o;
    }

    public final void o(String str) {
        this.i.f(C6153i34.b(str), 0, 1);
        this.o.i0();
    }

    @Override // defpackage.SF1
    public final void k() {
        if (this.v) {
            C1245Jp c1245Jp = this.j.i;
            c1245Jp.getClass();
            c1245Jp.i(new RunnableC0335Cp(c1245Jp), -1L);
        }
    }

    public final void t(boolean z) {
        C7183l34 c7183l34 = this.i.g;
        LD2 ld2 = AbstractC8215o34.b;
        PropertyModel propertyModel = c7183l34.a;
        propertyModel.k(ld2, z);
        if (z) {
            propertyModel.k(AbstractC8215o34.f, c7183l34.h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:            if ((r1.a.getVisibility() == 0) != false) goto L131;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(int r10) {
        /*
            r9 = this;
            org.chromium.chrome.browser.omnibox.g r0 = r9.o
            cG1 r1 = r0.h
            org.chromium.chrome.browser.omnibox.LocationBarTablet r1 = (org.chromium.chrome.browser.omnibox.LocationBarTablet) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r4[r6] = r5
            org.chromium.chrome.browser.omnibox.d r5 = r0.g
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r5, r4)
            r7 = 75
            r4.setStartDelay(r7)
            r7 = 225(0xe1, double:1.11E-321)
            r4.setDuration(r7)
            Dt r5 = defpackage.InterpolatorC0485Dt.c
            r4.setInterpolator(r5)
            org.chromium.chrome.browser.omnibox.f r5 = new org.chromium.chrome.browser.omnibox.f
            r5.<init>(r0, r1, r10)
            r4.addListener(r5)
            r2.add(r4)
            android.widget.ImageButton r10 = r1.a
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L3d
            r10 = r3
            goto L3e
        L3d:
            r10 = r6
        L3e:
            if (r10 != 0) goto L49
            android.view.View r10 = r1.r
            android.animation.ObjectAnimator r10 = r0.A(r10)
            r2.add(r10)
        L49:
            boolean r10 = r0.f0()
            if (r10 == 0) goto L66
            android.view.View r10 = r1.s
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L59
            r10 = r3
            goto L5a
        L59:
            r10 = r6
        L5a:
            if (r10 == 0) goto L66
            android.view.View r10 = r1.s
            android.animation.ObjectAnimator r10 = r0.A(r10)
            r2.add(r10)
            goto L8e
        L66:
            boolean r10 = r0.M
            if (r10 == 0) goto L76
            android.widget.ImageButton r10 = r1.a
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L73
            goto L74
        L73:
            r3 = r6
        L74:
            if (r3 == 0) goto L8e
        L76:
            android.widget.ImageButton r10 = r1.g
            android.animation.ObjectAnimator r10 = r0.A(r10)
            r2.add(r10)
            boolean r10 = r0.e0()
            if (r10 == 0) goto L8e
            android.widget.ImageButton r10 = r1.h
            android.animation.ObjectAnimator r10 = r0.A(r10)
            r2.add(r10)
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.omnibox.a.a(int):java.util.List");
    }

    public final List n(int i) {
        g gVar = this.o;
        LocationBarTablet locationBarTablet = (LocationBarTablet) gVar.h;
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gVar, gVar.g, 0.0f);
        ofFloat.setDuration(225L);
        ofFloat.setInterpolator(InterpolatorC0485Dt.c);
        ofFloat.addListener(new e(gVar, locationBarTablet, i));
        arrayList.add(ofFloat);
        if (!(locationBarTablet.a.getVisibility() == 0)) {
            arrayList.add(gVar.B(locationBarTablet.r));
        }
        if (!gVar.f0()) {
            ImageButton imageButton = locationBarTablet.g;
            if (!(imageButton.getVisibility() == 0) || imageButton.getAlpha() != 1.0f) {
                arrayList.add(gVar.B(imageButton));
            }
            if (gVar.e0()) {
                ImageButton imageButton2 = locationBarTablet.h;
                if (!(imageButton2.getVisibility() == 0) || imageButton2.getAlpha() != 1.0f) {
                    arrayList.add(gVar.B(imageButton2));
                }
            }
        } else {
            arrayList.add(gVar.B(locationBarTablet.s));
        }
        return arrayList;
    }
}
