package defpackage;

import J.N;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.banners.AppBannerInProductHelpControllerProvider;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.toolbar.bottom.ScrollingBottomViewResourceFrameLayout;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.webapps.bottomsheet.PwaBottomSheetController;
import org.chromium.components.webapps.bottomsheet.PwaBottomSheetControllerProvider;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uE3 */
/* loaded from: classes.dex */
public final class C10333uE3 extends C4559dR2 {
    public final C9990tE3 E0;
    public C11019wE3 F0;
    public C4128cA0 G0;
    public C6732jl3 H0;
    public C9304rE3 I0;
    public C2992Xa2 J0;
    public C3579ab2 K0;
    public CH2 L0;
    public C8459om4 M0;
    public C9647sE3 N0;
    public WO3 O0;
    public C5828h7 P0;
    public C6333ic0 Q0;
    public C1190Je R0;
    public PwaBottomSheetController S0;
    public C5154f91 T0;
    public W12 U0;
    public G10 V0;
    public C9897sy1 W0;
    public C7340lY X0;
    public Q04 Y0;
    public final int Z0;
    public final InterfaceC0079Ap3 a1;
    public final BV0 b1;
    public C8276oE3 c1;
    public final C8385oa2 d1;
    public int e1;

    public C10333uE3(a aVar, XQ xq, K63 k63, C6166i6 c6166i6, C0519Dz3 c0519Dz3, C8385oa2 c8385oa2, C8385oa2 c8385oa22, C8385oa2 c8385oa23, C0649Ez3 c0649Ez3, C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, C0538Ed2 c0538Ed23, C0538Ed2 c0538Ed24, C8385oa2 c8385oa24, CC cc, C10285u6 c10285u6, C6434it1 c6434it1, I5 i5, C8385oa2 c8385oa25, InterfaceC9377rT1 interfaceC9377rT1, YQ yq, C8385oa2 c8385oa26, InterfaceC12202zi interfaceC12202zi, C3525aR c3525aR, C3869bR c3869bR, C11255wv3 c11255wv3, XU0 xu0, C8385oa2 c8385oa27, C8385oa2 c8385oa28, C4212cR c4212cR, C11418xQ c11418xQ, C4556dR c4556dR, InterfaceC0560Ei interfaceC0560Ei, InterfaceC2783Vk3 interfaceC2783Vk3, C8385oa2 c8385oa29, C2021Po1 c2021Po1, C1881Om1 c1881Om1, C4899eR c4899eR, C0538Ed2 c0538Ed25, boolean z, C9861ss c9861ss) {
        super(aVar, xq, k63, c6166i6, c0519Dz3, c8385oa2, c8385oa22, c8385oa23, c0649Ez3, c0538Ed2, c0538Ed22, c0538Ed23, c0538Ed24, c8385oa24, cc, c10285u6, c6434it1, i5, c8385oa25, interfaceC9377rT1, yq, c8385oa26, interfaceC12202zi, c3525aR, c3869bR, c11255wv3, xu0, c8385oa27, c8385oa28, c4212cR, 0, c11418xQ, c4556dR, interfaceC0560Ei, interfaceC2783Vk3, c2021Po1, c0538Ed25, c8385oa29, z, c9861ss);
        this.Z0 = R.dimen.0_resource_name_obfuscated_res_0x7f080154;
        this.a1 = c1881Om1;
        this.b1 = c4899eR;
        this.d1 = c8385oa29;
        this.y = new InterfaceC0079Ap3() { // from class: ZD3
            public /* synthetic */ ZD3() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                C6166i6 c6166i62;
                C10333uE3 c10333uE3 = C10333uE3.this;
                if (c10333uE3.h == null || (c6166i62 = c10333uE3.l) == null) {
                    return Boolean.FALSE;
                }
                Tab tab = (Tab) c6166i62.g;
                return Boolean.valueOf((tab == null || !tab.isUserInteractable() || tab.isNativePage()) ? false : true);
            }
        };
        if (this.V0 == null) {
            this.V0 = new G10(new IC[0]);
        }
        G10 g10 = this.V0;
        C3799bD c3799bD = cc.g;
        g10.i.add(c3799bD);
        c3799bD.m(g10.j);
        this.E0 = new C9990tE3(this, c6166i6);
    }

    @Override // defpackage.C4559dR2, defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        C4496dF c4496dF;
        TD3 td3;
        AbstractC9664sI0.c(1);
        C11019wE3 c11019wE3 = this.F0;
        if (c11019wE3 != null && (td3 = c11019wE3.a) != null) {
            InterfaceC10590uz3 interfaceC10590uz3 = td3.l;
            if (interfaceC10590uz3 != null) {
                ((AbstractC11276wz3) interfaceC10590uz3).s(td3.m);
            }
            InterfaceC10240ty1 interfaceC10240ty1 = td3.o;
            if (interfaceC10240ty1 != null) {
                ((C9897sy1) interfaceC10240ty1).L(td3.p);
            }
            C4496dF c4496dF2 = td3.q;
            if (c4496dF2 != null) {
                c4496dF2.a();
                td3.q = null;
            }
            VrModuleProvider.g(td3);
            ((XU0) td3.i).k(td3.n);
        }
        C4128cA0 c4128cA0 = this.G0;
        if (c4128cA0 != null && (c4496dF = c4128cA0.g) != null) {
            c4496dF.a();
            c4128cA0.g = null;
        }
        C2992Xa2 c2992Xa2 = this.J0;
        if (c2992Xa2 != null) {
            C1562Ma2 c1562Ma2 = c2992Xa2.d;
            if (c1562Ma2 != null) {
                ApplicationStatus.i(c1562Ma2);
                C4779e40 c4779e40 = c1562Ma2.g;
                if (c4779e40 != null) {
                    NetworkChangeNotifier.g(c4779e40);
                    c4779e40.g();
                    c4779e40.a = null;
                    c1562Ma2.g = null;
                }
                c1562Ma2.k.removeCallbacks(c1562Ma2.l);
                c2992Xa2.d = null;
            }
            InterfaceC7697ma2 interfaceC7697ma2 = c2992Xa2.e;
            if (interfaceC7697ma2 != null) {
                ((C8385oa2) interfaceC7697ma2).n(c2992Xa2.g);
                c2992Xa2.e = null;
            }
            c2992Xa2.g = null;
            Handler handler = c2992Xa2.c;
            if (handler != null) {
                handler.removeCallbacks(c2992Xa2.j);
                handler.removeCallbacks(c2992Xa2.l);
            }
        }
        C9707sQ3 c9707sQ3 = this.x;
        if (c9707sQ3 != null) {
            ((g) c9707sQ3.D.j()).U(this.N0);
        }
        C3579ab2 c3579ab2 = this.K0;
        if (c3579ab2 != null) {
            c3579ab2.j.a.h.remove(c3579ab2);
        }
        C6732jl3 c6732jl3 = this.H0;
        if (c6732jl3 != null) {
            c6732jl3.a.h.remove(this.I0);
            this.H0.a.h.remove(this.p0);
            C6732jl3 c6732jl32 = this.H0;
            if (c6732jl32.k) {
                c6732jl32.d.run();
            }
            boolean z = c6732jl32.h;
            if (z && z) {
                c6732jl32.f.j.b();
                c6732jl32.g.a().e(c6732jl32.e);
                c6732jl32.h = false;
            }
            ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3 = c6732jl32.a;
            ValueAnimator valueAnimator = viewOnLayoutChangeListenerC0059Al3.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = viewOnLayoutChangeListenerC0059Al3.q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            AnimatorSet animatorSet = viewOnLayoutChangeListenerC0059Al3.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = viewOnLayoutChangeListenerC0059Al3.s;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            ((CC) viewOnLayoutChangeListenerC0059Al3.g).g(viewOnLayoutChangeListenerC0059Al3);
        }
        WO3 wo3 = this.O0;
        if (wo3 != null) {
            AbstractC9664sI0.c(3);
            wo3.a.a();
            wo3.i.c(wo3);
        }
        C8459om4 c8459om4 = this.M0;
        if (c8459om4 != null) {
            c8459om4.c.a();
        }
        C9990tE3 c9990tE3 = this.E0;
        if (c9990tE3 != null) {
            c9990tE3.destroy();
        }
        C5828h7 c5828h7 = this.P0;
        if (c5828h7 != null) {
            c5828h7.a = null;
        }
        C1190Je c1190Je = this.R0;
        if (c1190Je != null) {
            AppBannerInProductHelpControllerProvider.a.b(c1190Je);
        }
        C6333ic0 c6333ic0 = this.Q0;
        if (c6333ic0 != null) {
            c6333ic0.d.a();
        }
        PwaBottomSheetController pwaBottomSheetController = this.S0;
        if (pwaBottomSheetController != null) {
            PwaBottomSheetControllerProvider.a.b(pwaBottomSheetController);
        }
        C5154f91 c5154f91 = this.T0;
        if (c5154f91 != null) {
            F12 f12 = c5154f91.o;
            InterfaceC0079Ap3 interfaceC0079Ap3 = this.o0;
            if (interfaceC0079Ap3.i() && f12 != null) {
                ((CompositorViewHolder) interfaceC0079Ap3.get()).a.d(f12);
            }
            C5154f91 c5154f912 = this.T0;
            C10452uc0 c10452uc0 = c5154f912.j;
            if (c10452uc0 != null) {
                c10452uc0.a();
                c5154f912.j = null;
            }
            C1751Nm1 c1751Nm1 = c5154f912.i;
            if (c1751Nm1 != null) {
                c1751Nm1.g.d(c5154f912);
                c5154f912.i = null;
            }
            c5154f912.h = null;
            c5154f912.g.removeCallbacks(c5154f912.a);
            C1198Jf2 c1198Jf2 = c5154f912.p;
            if (c1198Jf2 != null) {
                c1198Jf2.g.c();
                c5154f912.p = null;
            }
            F12 f122 = c5154f912.o;
            if (f122 != null) {
                f122.g = null;
                f122.b.removeOnAttachStateChangeListener(f122.e);
                f122.d = null;
                c5154f912.r.onResult(c5154f912.o);
                c5154f912.o = null;
            }
            I5 i5 = c5154f912.k;
            if (i5 != null) {
                i5.c(c5154f912);
                c5154f912.k = null;
            }
            this.T0 = null;
        }
        Q04 q04 = this.Y0;
        if (q04 != null) {
            InterfaceC10590uz3 interfaceC10590uz32 = q04.g;
            if (interfaceC10590uz32 != null) {
                AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz32;
                abstractC11276wz3.s(q04.j);
                C7502lz3 c7502lz3 = abstractC11276wz3.c;
                C1024Hw3 c1024Hw3 = (C1024Hw3) c7502lz3.e(false);
                M04 m04 = q04.i;
                c1024Hw3.f0(m04);
                ((C1024Hw3) c7502lz3.e(true)).f0(m04);
            }
            q04.k.a();
        }
        C7340lY c7340lY = this.X0;
        if (c7340lY != null) {
            c7340lY.a();
            this.X0 = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.C4559dR2, defpackage.InterfaceC6044hl1
    public final void W() {
        super.W();
        this.F0 = new C11019wE3(this.h.getWindow(), (InterfaceC10590uz3) ((C8385oa2) this.U).g, this.h0, this.n0);
    }

    @Override // defpackage.C4559dR2
    public final void l() {
        super.l();
        GC0 gc0 = (GC0) this.d1.g;
        if (gc0 != null) {
            if (gc0.u || gc0.v) {
                ((m) gc0.k).l(gc0.p, true, 0);
            }
        }
    }

    @Override // defpackage.C4559dR2, defpackage.V02
    public final void U() {
        boolean z;
        super.U();
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.o0;
        ViewGroup viewGroup = (ViewGroup) interfaceC0079Ap3.get();
        Runnable runnable = new Runnable() { // from class: fE3
            @Override // java.lang.Runnable
            public final void run() {
                C10333uE3.this.W0.r.F();
            }
        };
        C4496dF c4496dF = this.S;
        RunnableC4152cF c = c4496dF.c(runnable);
        C1751Nm1 c1751Nm1 = (C1751Nm1) this.a1.get();
        C7932nE3 c7932nE3 = new C7932nE3(this);
        final CompositorViewHolder compositorViewHolder = (CompositorViewHolder) interfaceC0079Ap3.get();
        Objects.requireNonNull(compositorViewHolder);
        Callback callback = new Callback() { // from class: gE3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CompositorViewHolder.this.a.a((F12) obj);
            }
        };
        final CompositorViewHolder compositorViewHolder2 = (CompositorViewHolder) interfaceC0079Ap3.get();
        Objects.requireNonNull(compositorViewHolder2);
        Callback callback2 = new Callback() { // from class: hE3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CompositorViewHolder.this.a.d((F12) obj);
            }
        };
        C9897sy1 c9897sy1 = this.W0;
        final C5154f91 c5154f91 = new C5154f91();
        C10285u6 c10285u6 = this.k;
        c5154f91.p = new C1198Jf2(c10285u6, viewGroup, c);
        c5154f91.h = new ViewGroupOnHierarchyChangeListenerC6528j91(viewGroup.getContext(), new InterfaceC0079Ap3() { // from class: Z81
            public /* synthetic */ Z81() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                Tab tab = C5154f91.this.m;
                return Boolean.valueOf(tab != null && tab.isNativePage());
            }
        }, c5154f91.p, new Callback() { // from class: a91
            public /* synthetic */ C3436a91() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                F12 f12 = C5154f91.this.o;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (f12.a()) {
                    if (booleanValue) {
                        f12.g.i();
                        return;
                    }
                    Handler handler = f12.c;
                    final C7932nE3 c7932nE32 = f12.f;
                    Objects.requireNonNull(c7932nE32);
                    handler.post(new Runnable() { // from class: C12
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7932nE3.this.a.h.onBackPressed();
                        }
                    });
                }
            }
        });
        c5154f91.g = viewGroup;
        I5 i5 = this.g0;
        c5154f91.k = i5;
        c5154f91.l = c7932nE3;
        i5.b(c5154f91);
        viewGroup.addView(c5154f91.h);
        C4810e91 c4810e91 = new C4810e91(c5154f91);
        Callback callback3 = new Callback() { // from class: b91
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C5154f91 c5154f912 = C5154f91.this;
                c5154f912.m = (Tab) obj;
                c5154f912.h();
            }
        };
        C6166i6 c6166i6 = this.l;
        c5154f91.j = new C10452uc0(c6166i6, c4810e91, callback3);
        c5154f91.q = callback;
        c5154f91.r = callback2;
        Object obj = c6166i6.g;
        if (obj != null) {
            c5154f91.m = (Tab) obj;
            boolean z2 = c5154f91.n;
            boolean b = c5154f91.b();
            c5154f91.n = b;
            if (b != z2) {
                c5154f91.h();
            }
        } else {
            c5154f91.n = c5154f91.b();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            c5154f91.i = c1751Nm1;
            c1751Nm1.g.a(c5154f91);
        }
        c9897sy1.f(c5154f91.p);
        EI2.b("GestureNavigation.Type", c5154f91.b());
        this.T0 = c5154f91;
        this.c1 = new C8276oE3(this);
        this.E0.W0((Tab) c6166i6.g);
        boolean a = DeviceFormFactor.a(this.h);
        InterfaceC0079Ap3 interfaceC0079Ap32 = this.q0;
        if (a) {
            C0430Di c0430Di = this.i;
            C4128cA0 c4128cA0 = new C4128cA0((InterfaceC10590uz3) ((C8385oa2) this.U).g, ((InterfaceC10912vv3) this.m0.get()).b(false), this.h, c0430Di == null ? null : c0430Di.d, (ViewOnClickListenerC1069If3) interfaceC0079Ap32.get(), this.h0);
            this.G0 = c4128cA0;
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c4128cA0.b;
            Iterator it = abstractC11276wz3.a.iterator();
            while (it.hasNext()) {
                ((TabModel) it.next()).g(c4128cA0.d);
            }
            abstractC11276wz3.c(c4128cA0.e);
        }
        if (!DeviceFormFactor.a(this.h) && (AbstractC5177fD3.e(this.h) || AbstractC5177fD3.a())) {
            C9707sQ3 c9707sQ3 = this.x;
            View inflate = ((ViewStub) c9707sQ3.R.findViewById(R.id.bottom_controls_stub)).inflate();
            C3243Yy3 a2 = AbstractC3722az3.a();
            a aVar = c9707sQ3.R;
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.bottom_container_slot);
            C10501uk1 c10501uk1 = c9707sQ3.a;
            OX2 ox2 = c9707sQ3.A0;
            InterfaceC7697ma2 interfaceC7697ma2 = c9707sQ3.s;
            QB qb = c9707sQ3.g0;
            I5 i52 = c9707sQ3.f0;
            InterfaceC0079Ap3 interfaceC0079Ap33 = c9707sQ3.h0;
            InterfaceC10590uz3 interfaceC10590uz3 = c9707sQ3.u;
            TabContentManager tabContentManager = c9707sQ3.i0;
            CompositorViewHolder compositorViewHolder3 = c9707sQ3.U;
            Objects.requireNonNull(compositorViewHolder3);
            C5243fR c5243fR = new C5243fR(compositorViewHolder3);
            InterfaceC10912vv3 interfaceC10912vv3 = c9707sQ3.j0;
            InterfaceC7697ma2 interfaceC7697ma22 = c9707sQ3.e0;
            InterfaceC0408Dd2 interfaceC0408Dd2 = c9707sQ3.M;
            ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = c9707sQ3.k0;
            a2.getClass();
            C1933Ow3 c1933Ow3 = new C1933Ow3(aVar, viewGroup2, c10501uk1, ox2, interfaceC7697ma2, qb, i52, interfaceC0079Ap33, interfaceC10590uz3, tabContentManager, compositorViewHolder3, c5243fR, interfaceC10912vv3, interfaceC7697ma22, interfaceC0408Dd2, viewOnClickListenerC1069If3);
            c9707sQ3.I0 = c1933Ow3;
            c9707sQ3.t.p(new JB(c9707sQ3.R, c9707sQ3.S, c9707sQ3.F, compositorViewHolder3.l.n, c9707sQ3.V, c9707sQ3.W, (ScrollingBottomViewResourceFrameLayout) inflate, c1933Ow3, c9707sQ3.H0));
        }
        if (!SysUtils.isLowEndDevice()) {
            a aVar2 = this.h;
            this.d1.p(new GC0(aVar2, this.k, aVar2.getWindow().getDecorView(), this.l, new InterfaceC0079Ap3() { // from class: iE3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    C10333uE3 c10333uE3 = C10333uE3.this;
                    return ((InterfaceC10912vv3) c10333uE3.m0.get()).b(((AbstractC11276wz3) ((InterfaceC10590uz3) ((C8385oa2) c10333uE3.U).g)).o());
                }
            }, this.C, true));
        }
        this.a0.j(c4496dF.b(new Callback() { // from class: jE3
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // org.chromium.base.Callback
            public final void onResult(java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 862
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C6556jE3.onResult(java.lang.Object):void");
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }
        }));
        PwaBottomSheetController pwaBottomSheetController = new PwaBottomSheetController(this.h);
        this.S0 = pwaBottomSheetController;
        K14 k14 = PwaBottomSheetControllerProvider.a;
        PwaBottomSheetControllerProvider.a.a(pwaBottomSheetController, c10285u6.t);
        if (AbstractC1947Oz2.b()) {
            new C8372oY();
            C7340lY a3 = C8372oY.a();
            this.X0 = a3;
            a3.a.c();
            C7340lY c7340lY = this.X0;
            InterfaceC10590uz3 interfaceC10590uz32 = (InterfaceC10590uz3) ((C8385oa2) this.U).g;
            c7340lY.h = i5;
            C6996kY c6996kY = new C6996kY(c7340lY);
            c7340lY.i = c6996kY;
            i5.b(c6996kY);
            if (AbstractC8293oI0.a()) {
                C7928nE c7928nE = UN.a;
                z = N.M6bsIDpc("CommercePriceTracking", "implicit_subscriptions_enabled", false);
            } else {
                z = false;
            }
            if (z && c7340lY.g == null) {
                c7340lY.g = new C2511Ti1(interfaceC10590uz32, c7340lY.a);
            }
        }
        if (AbstractC5177fD3.e(this.h)) {
            this.Y0 = new Q04(this.h, (InterfaceC10590uz3) ((C8385oa2) this.U).g, (ViewOnClickListenerC1069If3) interfaceC0079Ap32.get());
        } else {
            this.Y0 = null;
        }
    }

    @Override // defpackage.C4559dR2
    public final C2516Tj1 j() {
        C0538Ed2 c0538Ed2 = new C0538Ed2();
        if (AbstractC5241fQ2.e(this.h) && this.r0 == 0) {
            c0538Ed2.a(((InterfaceC10318uB3) this.W.get()).k());
        } else {
            c0538Ed2 = ((C10154tj3) ((InterfaceC7408lj3) this.V.get())).w;
        }
        C8619pE3 c8619pE3 = new C8619pE3(this);
        return new C2516Tj1(this.h, (InterfaceC10590uz3) ((C8385oa2) this.U).g, (ZX1) ((C8385oa2) this.i0).g, new C3166Yj1(), new I53(), c0538Ed2, c8619pE3, this.W0, true);
    }

    @Override // defpackage.C4559dR2
    public final void n(InterfaceC1422Ky1 interfaceC1422Ky1) {
        super.n(interfaceC1422Ky1);
        C8276oE3 c8276oE3 = this.c1;
        if (c8276oE3 != null) {
            ((C9897sy1) interfaceC1422Ky1).e(c8276oE3);
        }
    }

    @Override // defpackage.C4559dR2
    public final void m(C9897sy1 c9897sy1) {
        super.m(c9897sy1);
        if (!DeviceFormFactor.a(this.h)) {
            CC cc = this.T;
            a aVar = this.h;
            ResourceManager resourceManager = ((CompositorViewHolder) this.o0.get()).l.n;
            C2913Wk3 c2913Wk3 = this.p0;
            Objects.requireNonNull(c2913Wk3);
            C6732jl3 c6732jl3 = new C6732jl3(aVar, resourceManager, cc, new InterfaceC0079Ap3() { // from class: kE3
                public /* synthetic */ C6900kE3() {
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return Integer.valueOf(C2913Wk3.this.B);
                }
            }, this.y, new Callback() { // from class: lE3
                public /* synthetic */ C7244lE3() {
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C9897sy1.this.N((Runnable) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            });
            this.H0 = c6732jl3;
            c9897sy1.f(c6732jl3.b);
            C9304rE3 c9304rE3 = new C9304rE3(this);
            this.I0 = c9304rE3;
            this.H0.a.h.add(c9304rE3);
            this.H0.a.h.add(c2913Wk3);
            C8385oa2 c8385oa2 = new C8385oa2();
            C9707sQ3 c9707sQ3 = this.x;
            c8385oa2.p(Boolean.valueOf(c9707sQ3.D.j() == null ? false : ((g) c9707sQ3.D.j()).M));
            this.N0 = new C9647sE3(c8385oa2);
            this.J0 = new C2992Xa2(this.h, this.H0, c8385oa2, this.y);
            if (this.x.D.j() != null) {
                ((g) this.x.D.j()).d(this.N0);
            }
        }
        this.W0 = c9897sy1;
    }

    @Override // defpackage.C4559dR2
    public final OX2 b() {
        ViewGroup viewGroup = (ViewGroup) this.h.findViewById(R.id.coordinator);
        return new OX2(this.h, new C8962qE3(this), viewGroup, viewGroup.getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f07080a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x00a2, code lost:            if (r7.containsAll(r4) != false) goto L609;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:            if (r3 != 0) goto L633;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a9  */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r() {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10333uE3.r():boolean");
    }
}
