package org.chromium.chrome.browser.toolbar.top;

import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC1738Nj3;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC3593ad4;
import defpackage.AbstractC6265iP;
import defpackage.C10226tv3;
import defpackage.C10501uk1;
import defpackage.C1096Il0;
import defpackage.C11037wI1;
import defpackage.C11832yd2;
import defpackage.C12066zI1;
import defpackage.C1349Kj3;
import defpackage.C1479Lj3;
import defpackage.C1608Mj3;
import defpackage.C3803bD3;
import defpackage.C3809bF;
import defpackage.C4146cD3;
import defpackage.C4496dF;
import defpackage.C6373ij;
import defpackage.C6621jR3;
import defpackage.C7173l20;
import defpackage.C8385oa2;
import defpackage.C8610pD;
import defpackage.C9780se2;
import defpackage.C9897sy1;
import defpackage.CC;
import defpackage.DO3;
import defpackage.FD2;
import defpackage.FP3;
import defpackage.GP3;
import defpackage.GS3;
import defpackage.HP3;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC8953qD;
import defpackage.InterfaceC9295rD;
import defpackage.JP3;
import defpackage.KH;
import defpackage.KP3;
import defpackage.LD2;
import defpackage.LS1;
import defpackage.LS3;
import defpackage.MD2;
import defpackage.ND2;
import defpackage.PD2;
import defpackage.Q44;
import defpackage.QS1;
import defpackage.RJ3;
import defpackage.TD2;
import defpackage.TS1;
import defpackage.UD2;
import defpackage.UN;
import defpackage.VB3;
import defpackage.VS1;
import defpackage.WB3;
import defpackage.WD2;
import defpackage.XB3;
import defpackage.YB3;
import defpackage.YO3;
import defpackage.Yc4;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.chrome.browser.toolbar.NewTabButton;
import org.chromium.chrome.browser.toolbar.TabSwitcherButtonView;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.e;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class e implements DO3 {
    public final d a;
    public final C4146cD3 b;
    public final c c;
    public C9780se2 d;
    public final LS1 e;
    public InterfaceC7697ma2 f;
    public InterfaceC7697ma2 g;
    public ToolbarControlContainer h;
    public final InterfaceC0079Ap3 i;
    public GS3 j;

    /* JADX WARN: Type inference failed for: r3v0, types: [wS3] */
    public e(ToolbarControlContainer toolbarControlContainer, ViewStub viewStub, d dVar, final LocationBarModel locationBarModel, C6621jR3 c6621jR3, Q44 q44, List list, RJ3 rj3, C6373ij c6373ij, LS1 ls1, LS1 ls12, C8385oa2 c8385oa2, InterfaceC7697ma2 interfaceC7697ma2, C8385oa2 c8385oa22, C8385oa2 c8385oa23, FP3 fp3, GP3 gp3, HP3 hp3, C8385oa2 c8385oa24, JP3 jp3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, KH kh, KP3 kp3, KH kh2, boolean z6, InterfaceC7697ma2 interfaceC7697ma22, C3809bF c3809bF) {
        this.h = toolbarControlContainer;
        this.a = dVar;
        this.e = ls1;
        this.d = new C9780se2(list, q44, dVar, new InterfaceC0079Ap3() { // from class: wS3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return locationBarModel.a();
            }
        });
        this.i = hp3;
        this.g = interfaceC7697ma2;
        boolean z7 = dVar instanceof ToolbarPhone;
        if (z7 && z4) {
            this.c = new c(viewStub, q44, c8385oa23, c6373ij, ls12, gp3, z, z5, jp3, interfaceC7697ma22, c3809bF);
        } else if (z7 || UN.A.a()) {
            this.b = new C4146cD3(viewStub, ls12, z, z2, z3, jp3);
        }
        toolbarControlContainer.h = this;
        YO3 yo3 = (YO3) toolbarControlContainer.i.g;
        yo3.q = this;
        yo3.r = dVar.j();
        if (toolbarControlContainer.findViewById(R.id.toolbar) instanceof ToolbarTablet) {
            Drawable mutate = AbstractC2884Wf.a(toolbarControlContainer.getContext(), R.drawable.0_resource_name_obfuscated).mutate();
            mutate.setTint(AbstractC11746yN.a(toolbarControlContainer.getContext(), z6));
            mutate.setTintMode(PorterDuff.Mode.MULTIPLY);
            toolbarControlContainer.setBackground(mutate);
        }
        dVar.n(locationBarModel, c6621jR3, ls1, c8385oa24, kh, kp3, kh2);
        dVar.r = rj3;
        rj3.j.a(dVar);
        dVar.r.i.a(dVar);
        this.f = c8385oa2;
        new C11832yd2(c8385oa2, new Callback() { // from class: xS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                e.this.a.t = (InterfaceViewOnTouchListenerC0040Ai) obj;
            }
        });
        c8385oa22.m(new Callback() { // from class: yS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                e.this.a.t(((Boolean) obj).booleanValue());
            }
        });
        dVar.a = fp3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r7 = this;
            org.chromium.chrome.browser.toolbar.top.c r0 = r7.c
            android.view.ViewStub r1 = r0.b
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131232771(0x7f080803, float:1.808166E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131232582(0x7f080746, float:1.8081277E38)
            int r1 = r1.getDimensionPixelOffset(r3)
            int r1 = r1 + r2
            Mj3 r0 = r0.a
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L25
            r2 = r4
            goto L26
        L25:
            r2 = r3
        L26:
            LD2 r5 = defpackage.AbstractC1738Nj3.h
            org.chromium.ui.modelutil.PropertyModel r6 = r0.a
            if (r2 == 0) goto L34
            boolean r2 = r6.j(r5)
            if (r2 != 0) goto L34
            r2 = r4
            goto L35
        L34:
            r2 = r3
        L35:
            if (r2 != 0) goto L5a
            boolean r2 = r6.j(r5)
            if (r2 == 0) goto L4b
            MD2 r2 = defpackage.AbstractC1738Nj3.w
            float r2 = r6.g(r2)
            float r2 = -r2
            float r1 = (float) r1
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L4b
            r1 = r4
            goto L4c
        L4b:
            r1 = r3
        L4c:
            if (r1 != 0) goto L5a
            int r1 = r0.o
            if (r1 != 0) goto L54
            r1 = r4
            goto L55
        L54:
            r1 = r3
        L55:
            if (r1 == 0) goto L58
            goto L5a
        L58:
            r1 = r3
            goto L5b
        L5a:
            r1 = r4
        L5b:
            int r0 = r0.o
            if (r0 != r4) goto L60
            r3 = r4
        L60:
            org.chromium.chrome.browser.toolbar.top.d r0 = r7.a
            r0.y(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.toolbar.top.e.h():void");
    }

    public final void a() {
        C1479Lj3 c1479Lj3;
        C1349Kj3 c1349Kj3;
        C3803bD3 c3803bD3;
        GS3 gs3 = this.j;
        if (gs3 != null) {
            C7173l20 c7173l20 = gs3.g;
            c7173l20.b.d(c7173l20.e);
            c7173l20.d.n(c7173l20.f);
            LS3 ls3 = gs3.h;
            ls3.e.a();
            ((C9897sy1) ls3.b).L(ls3.c);
            ((CC) ls3.f).g(ls3.g);
            gs3.a.c();
            this.j = null;
        }
        this.a.e();
        C4146cD3 c4146cD3 = this.b;
        if (c4146cD3 != null) {
            TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = c4146cD3.j;
            if (tabSwitcherModeTopToolbar != null) {
                C10501uk1 c10501uk1 = tabSwitcherModeTopToolbar.j;
                if (c10501uk1 != null) {
                    c10501uk1.a.d(tabSwitcherModeTopToolbar);
                    tabSwitcherModeTopToolbar.j = null;
                }
                NewTabButton newTabButton = tabSwitcherModeTopToolbar.n;
                if (newTabButton != null) {
                    C10501uk1 c10501uk12 = newTabButton.l;
                    if (c10501uk12 != null) {
                        c10501uk12.a.d(newTabButton);
                        newTabButton.l = null;
                    }
                    tabSwitcherModeTopToolbar.n = null;
                }
                ToggleTabStackButton toggleTabStackButton = tabSwitcherModeTopToolbar.o;
                if (toggleTabStackButton != null) {
                    C10226tv3 c10226tv3 = toggleTabStackButton.t;
                    if (c10226tv3 != null) {
                        c10226tv3.a.d(toggleTabStackButton);
                    }
                    tabSwitcherModeTopToolbar.o = null;
                }
                IncognitoToggleTabLayout incognitoToggleTabLayout = tabSwitcherModeTopToolbar.l;
                if (incognitoToggleTabLayout != null) {
                    InterfaceC10590uz3 interfaceC10590uz3 = incognitoToggleTabLayout.g0;
                    if (interfaceC10590uz3 != null) {
                        ((AbstractC11276wz3) interfaceC10590uz3).s(incognitoToggleTabLayout.i0);
                    }
                    C10226tv3 c10226tv32 = incognitoToggleTabLayout.h0;
                    if (c10226tv32 != null) {
                        c10226tv32.a.d(incognitoToggleTabLayout);
                    }
                    tabSwitcherModeTopToolbar.l = null;
                }
                c4146cD3.j = null;
            }
            InterfaceC10590uz3 interfaceC10590uz32 = c4146cD3.f;
            if (interfaceC10590uz32 != null && (c3803bD3 = c4146cD3.m) != null) {
                ((AbstractC11276wz3) interfaceC10590uz32).g.d(c3803bD3);
            }
            LS1 ls1 = c4146cD3.h;
            if (ls1 != null) {
                ls1.a();
                c4146cD3.h = null;
            }
        } else {
            c cVar = this.c;
            if (cVar != null) {
                C1608Mj3 c1608Mj3 = cVar.a;
                InterfaceC10590uz3 interfaceC10590uz33 = c1608Mj3.m;
                if (interfaceC10590uz33 != null && (c1349Kj3 = c1608Mj3.i) != null) {
                    ((AbstractC11276wz3) interfaceC10590uz33).s(c1349Kj3);
                }
                InterfaceC10590uz3 interfaceC10590uz34 = c1608Mj3.m;
                if (interfaceC10590uz34 != null && (c1479Lj3 = c1608Mj3.j) != null) {
                    ((AbstractC11276wz3) interfaceC10590uz34).g.d(c1479Lj3);
                }
                LogoView logoView = c1608Mj3.t;
                if (logoView != null) {
                    ObjectAnimator objectAnimator = logoView.i;
                    if (objectAnimator != null) {
                        objectAnimator.end();
                        logoView.i = null;
                    }
                    logoView.q.b();
                    c1608Mj3.t = null;
                }
                C12066zI1 c12066zI1 = c1608Mj3.s;
                if (c12066zI1 != null) {
                    C11037wI1 c11037wI1 = c12066zI1.e;
                    if (c11037wI1 != null) {
                        c11037wI1.a();
                        c12066zI1.e = null;
                    }
                    C4496dF c4496dF = c12066zI1.d;
                    if (c4496dF != null) {
                        c4496dF.a();
                        c12066zI1.d = null;
                    }
                    c1608Mj3.s = null;
                }
                C4496dF c4496dF2 = c1608Mj3.q;
                if (c4496dF2 != null) {
                    c4496dF2.a();
                    c1608Mj3.q = null;
                }
                XB3 xb3 = cVar.f;
                if (xb3 != null) {
                    RJ3 rj3 = xb3.b;
                    if (rj3 != null) {
                        rj3.j.d(xb3.c);
                        xb3.b = null;
                    }
                    C10226tv3 c10226tv33 = xb3.d;
                    if (c10226tv33 != null) {
                        c10226tv33.a.d(xb3.e);
                        xb3.d = null;
                    }
                }
                LS1 ls12 = cVar.l;
                if (ls12 != null) {
                    ls12.a();
                    cVar.l = null;
                }
                C4496dF c4496dF3 = cVar.m;
                if (c4496dF3 != null) {
                    c4496dF3.a();
                    cVar.m = null;
                }
                cVar.f = null;
                cVar.g = null;
                cVar.h = null;
                cVar.i = null;
                cVar.j = null;
                cVar.k = null;
            }
        }
        C9780se2 c9780se2 = this.d;
        if (c9780se2 != null) {
            HashMap hashMap = c9780se2.b;
            for (Map.Entry entry : hashMap.entrySet()) {
                ((InterfaceC9295rD) entry.getKey()).d((InterfaceC8953qD) entry.getValue());
            }
            hashMap.clear();
            this.d = null;
        }
        if (this.f != null) {
            this.f = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        if (this.h != null) {
            this.h = null;
        }
    }

    public final void f() {
        this.a.X();
        this.d.a();
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar;
        this.a.Q(z, z2, z3, this.e);
        C4146cD3 c4146cD3 = this.b;
        if (c4146cD3 != null) {
            if (!z) {
                TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar2 = c4146cD3.j;
                if (tabSwitcherModeTopToolbar2 != null) {
                    tabSwitcherModeTopToolbar2.f(z);
                    return;
                }
                return;
            }
            boolean z4 = c4146cD3.o;
            ViewStub viewStub = c4146cD3.a;
            if (!z4) {
                if (c4146cD3.j == null) {
                    TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar3 = (TabSwitcherModeTopToolbar) viewStub.inflate();
                    c4146cD3.j = tabSwitcherModeTopToolbar3;
                    c4146cD3.a(tabSwitcherModeTopToolbar3, false);
                    c4146cD3.c();
                    c4146cD3.d();
                }
            } else {
                if (!C1096Il0.a(viewStub.getContext())) {
                    if (c4146cD3.l == null) {
                        TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar4 = (TabSwitcherModeTopToolbar) c4146cD3.b.inflate();
                        c4146cD3.l = tabSwitcherModeTopToolbar4;
                        c4146cD3.a(tabSwitcherModeTopToolbar4, true);
                    }
                    tabSwitcherModeTopToolbar = c4146cD3.l;
                } else {
                    if (c4146cD3.k == null) {
                        TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar5 = (TabSwitcherModeTopToolbar) viewStub.inflate();
                        c4146cD3.k = tabSwitcherModeTopToolbar5;
                        c4146cD3.a(tabSwitcherModeTopToolbar5, false);
                    }
                    tabSwitcherModeTopToolbar = c4146cD3.k;
                }
                if (c4146cD3.j != tabSwitcherModeTopToolbar) {
                    c4146cD3.j = tabSwitcherModeTopToolbar;
                    c4146cD3.c();
                    c4146cD3.d();
                }
            }
            c4146cD3.j.f(z);
        }
    }

    public final void d(C10226tv3 c10226tv3) {
        this.a.P(c10226tv3);
        C4146cD3 c4146cD3 = this.b;
        if (c4146cD3 != null) {
            c4146cD3.e = c10226tv3;
            TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = c4146cD3.j;
            if (tabSwitcherModeTopToolbar != null) {
                tabSwitcherModeTopToolbar.h = c10226tv3;
                ToggleTabStackButton toggleTabStackButton = tabSwitcherModeTopToolbar.o;
                if (toggleTabStackButton != null) {
                    toggleTabStackButton.t = c10226tv3;
                    c10226tv3.a(toggleTabStackButton);
                }
                IncognitoToggleTabLayout incognitoToggleTabLayout = tabSwitcherModeTopToolbar.l;
                if (incognitoToggleTabLayout != null) {
                    incognitoToggleTabLayout.h0 = c10226tv3;
                    c10226tv3.a(incognitoToggleTabLayout);
                }
            }
        }
        c cVar = this.c;
        if (cVar != null) {
            XB3 xb3 = cVar.f;
            if (xb3 != null) {
                xb3.d = c10226tv3;
                xb3.a.k(YB3.e, true);
                WB3 wb3 = new WB3(xb3);
                xb3.e = wb3;
                xb3.d.a(wb3);
            } else {
                cVar.h = c10226tv3;
            }
            cVar.a.n = c10226tv3;
        }
    }

    public final void c(boolean z) {
        this.a.D(z);
    }

    public final void b() {
        this.a.f();
    }

    public final void g(int i, boolean z) {
        c cVar = this.c;
        if (cVar == null || this.a.j == null) {
            return;
        }
        C1608Mj3 c1608Mj3 = cVar.a;
        if (z) {
            if (!(cVar.e != null)) {
                ViewStub viewStub = cVar.b;
                viewStub.setLayoutResource(R.layout.0_resource_name_obfuscated_res_0x7f0e0285);
                StartSurfaceToolbarView startSurfaceToolbarView = (StartSurfaceToolbarView) viewStub.inflate();
                cVar.e = startSurfaceToolbarView;
                LS1 ls1 = cVar.l;
                MenuButton menuButton = (MenuButton) startSurfaceToolbarView.findViewById(R.id.menu_button_wrapper);
                ls1.e = menuButton;
                UD2 ud2 = ls1.f;
                if (ud2 != null) {
                    ud2.b();
                }
                ls1.f = UD2.a(ls1.b, menuButton, new VS1());
                LS1 ls12 = cVar.l;
                PropertyModel propertyModel = cVar.c;
                ls12.d(propertyModel.j(AbstractC1738Nj3.l));
                UD2.a(propertyModel, cVar.e, new TD2() { // from class: org.chromium.chrome.browser.toolbar.top.b
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        PropertyModel propertyModel2 = (PropertyModel) wd2;
                        StartSurfaceToolbarView startSurfaceToolbarView2 = (StartSurfaceToolbarView) obj;
                        FD2 fd2 = (FD2) obj2;
                        LD2 ld2 = AbstractC1738Nj3.k;
                        if (fd2 == ld2) {
                            propertyModel2.j(ld2);
                            startSurfaceToolbarView2.g.d();
                            return;
                        }
                        LD2 ld22 = AbstractC1738Nj3.o;
                        if (fd2 == ld22) {
                            boolean j = propertyModel2.j(ld22);
                            startSurfaceToolbarView2.a.setClickable(j);
                            startSurfaceToolbarView2.k.setClickable(j);
                            return;
                        }
                        LD2 ld23 = AbstractC1738Nj3.q;
                        if (fd2 == ld23) {
                            boolean j2 = propertyModel2.j(ld23);
                            NewTabButton newTabButton = startSurfaceToolbarView2.g;
                            if (newTabButton.n == j2) {
                                return;
                            }
                            newTabButton.n = j2;
                            newTabButton.d();
                            newTabButton.invalidate();
                            return;
                        }
                        LD2 ld24 = AbstractC1738Nj3.v;
                        if (fd2 != ld24) {
                            LD2 ld25 = AbstractC1738Nj3.u;
                            if (fd2 == ld25) {
                                propertyModel2.j(ld25);
                                ((RelativeLayout.LayoutParams) startSurfaceToolbarView2.l.getLayoutParams()).removeRule(16);
                                return;
                            }
                            PD2 pd2 = AbstractC1738Nj3.d;
                            if (fd2 != pd2) {
                                ND2 nd2 = AbstractC1738Nj3.f;
                                if (fd2 != nd2) {
                                    PD2 pd22 = AbstractC1738Nj3.e;
                                    if (fd2 != pd22) {
                                        LD2 ld26 = AbstractC1738Nj3.g;
                                        if (fd2 != ld26) {
                                            PD2 pd23 = AbstractC1738Nj3.a;
                                            if (fd2 == pd23) {
                                                C10501uk1 c10501uk1 = (C10501uk1) propertyModel2.i(pd23);
                                                NewTabButton newTabButton2 = startSurfaceToolbarView2.g;
                                                newTabButton2.l = c10501uk1;
                                                c10501uk1.a(newTabButton2);
                                                return;
                                            }
                                            LD2 ld27 = AbstractC1738Nj3.j;
                                            if (fd2 != ld27) {
                                                LD2 ld28 = AbstractC1738Nj3.h;
                                                if (fd2 == ld28) {
                                                    boolean j3 = propertyModel2.j(ld28);
                                                    if (j3 == startSurfaceToolbarView2.n) {
                                                        return;
                                                    }
                                                    startSurfaceToolbarView2.n = j3;
                                                    startSurfaceToolbarView2.setVisibility(j3 ? 0 : 8);
                                                    return;
                                                }
                                                LD2 ld29 = AbstractC1738Nj3.i;
                                                if (fd2 != ld29) {
                                                    LD2 ld210 = AbstractC1738Nj3.l;
                                                    if (fd2 == ld210) {
                                                        boolean j4 = propertyModel2.j(ld210);
                                                        int dimensionPixelOffset = startSurfaceToolbarView2.getContext().getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080747);
                                                        startSurfaceToolbarView2.l.setPadding(dimensionPixelOffset, 0, j4 ? dimensionPixelOffset : startSurfaceToolbarView2.getContext().getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080748), 0);
                                                        return;
                                                    }
                                                    PD2 pd24 = AbstractC1738Nj3.b;
                                                    if (fd2 == pd24) {
                                                        View.OnClickListener onClickListener = (View.OnClickListener) propertyModel2.i(pd24);
                                                        startSurfaceToolbarView2.a.setOnClickListener(onClickListener);
                                                        startSurfaceToolbarView2.g.setOnClickListener(onClickListener);
                                                        return;
                                                    }
                                                    LD2 ld211 = AbstractC1738Nj3.c;
                                                    if (fd2 == ld211) {
                                                        boolean j5 = propertyModel2.j(ld211);
                                                        startSurfaceToolbarView2.g.setEnabled(j5);
                                                        if (startSurfaceToolbarView2.a.getVisibility() == 0) {
                                                            startSurfaceToolbarView2.a.setEnabled(j5);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    LD2 ld212 = AbstractC1738Nj3.p;
                                                    if (fd2 == ld212) {
                                                        boolean j6 = propertyModel2.j(ld212);
                                                        NewTabButton newTabButton3 = startSurfaceToolbarView2.g;
                                                        if (newTabButton3 == null) {
                                                            return;
                                                        }
                                                        if (j6) {
                                                            AbstractC3593ad4.b(newTabButton3, new Yc4(1));
                                                            return;
                                                        } else {
                                                            AbstractC3593ad4.a(newTabButton3);
                                                            return;
                                                        }
                                                    }
                                                    LD2 ld213 = AbstractC1738Nj3.m;
                                                    if (fd2 != ld213) {
                                                        LD2 ld214 = AbstractC1738Nj3.n;
                                                        if (fd2 != ld214) {
                                                            MD2 md2 = AbstractC1738Nj3.w;
                                                            if (fd2 == md2) {
                                                                startSurfaceToolbarView2.setTranslationY(propertyModel2.g(md2));
                                                                return;
                                                            }
                                                            LD2 ld215 = AbstractC1738Nj3.r;
                                                            if (fd2 == ld215) {
                                                                startSurfaceToolbarView2.j.setVisibility(propertyModel2.j(ld215) ? 0 : 8);
                                                                return;
                                                            }
                                                            PD2 pd25 = AbstractC1738Nj3.s;
                                                            if (fd2 == pd25) {
                                                                C10226tv3 c10226tv3 = (C10226tv3) propertyModel2.i(pd25);
                                                                IncognitoToggleTabLayout incognitoToggleTabLayout = startSurfaceToolbarView2.k;
                                                                if (incognitoToggleTabLayout != null) {
                                                                    incognitoToggleTabLayout.h0 = c10226tv3;
                                                                    c10226tv3.a(incognitoToggleTabLayout);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            PD2 pd26 = AbstractC1738Nj3.t;
                                                            if (fd2 == pd26) {
                                                                InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) propertyModel2.i(pd26);
                                                                IncognitoToggleTabLayout incognitoToggleTabLayout2 = startSurfaceToolbarView2.k;
                                                                if (incognitoToggleTabLayout2 != null) {
                                                                    incognitoToggleTabLayout2.y(interfaceC10590uz3);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        startSurfaceToolbarView2.h = propertyModel2.j(ld214);
                                                        startSurfaceToolbarView2.a();
                                                        return;
                                                    }
                                                    startSurfaceToolbarView2.o = propertyModel2.j(ld213);
                                                    startSurfaceToolbarView2.a();
                                                    return;
                                                }
                                                startSurfaceToolbarView2.i.setVisibility(propertyModel2.j(ld29) ? 0 : 8);
                                                return;
                                            }
                                            startSurfaceToolbarView2.b(propertyModel2.j(ld27));
                                            return;
                                        }
                                        startSurfaceToolbarView2.l.setVisibility(propertyModel2.j(ld26) ? 0 : 8);
                                        return;
                                    }
                                    startSurfaceToolbarView2.l.setImageDrawable((Drawable) propertyModel2.i(pd22));
                                    return;
                                }
                                startSurfaceToolbarView2.l.setContentDescription(startSurfaceToolbarView2.getContext().getResources().getString(propertyModel2.h(nd2)));
                                return;
                            }
                            startSurfaceToolbarView2.l.setOnClickListener((View.OnClickListener) propertyModel2.i(pd2));
                            return;
                        }
                        startSurfaceToolbarView2.k.setVisibility(Boolean.valueOf(propertyModel2.j(ld24)).booleanValue() ? 0 : 8);
                    }
                });
                LogoView logoView = (LogoView) cVar.e.findViewById(R.id.logo);
                c1608Mj3.t = logoView;
                c1608Mj3.s = new C12066zI1(c1608Mj3.k, c1608Mj3.l, logoView);
                if (CachedFeatureFlags.b(AbstractC6265iP.d.b("StartSurfaceAndroid:tab_count_button_on_start_surface"), false)) {
                    TabSwitcherButtonView tabSwitcherButtonView = (TabSwitcherButtonView) cVar.e.findViewById(R.id.start_tab_switcher_button);
                    cVar.g = tabSwitcherButtonView;
                    View.OnLongClickListener onLongClickListener = cVar.k;
                    if (onLongClickListener != null) {
                        tabSwitcherButtonView.setOnLongClickListener(onLongClickListener);
                        cVar.k = null;
                    }
                    XB3 xb3 = new XB3(cVar.g);
                    cVar.f = xb3;
                    RJ3 rj3 = cVar.i;
                    xb3.b = rj3;
                    VB3 vb3 = new VB3(xb3);
                    xb3.c = vb3;
                    rj3.j.a(vb3);
                    xb3.a.o(YB3.d, xb3.b.h);
                    C10226tv3 c10226tv3 = cVar.h;
                    if (c10226tv3 != null) {
                        XB3 xb32 = cVar.f;
                        xb32.d = c10226tv3;
                        xb32.a.k(YB3.e, true);
                        WB3 wb3 = new WB3(xb32);
                        xb32.e = wb3;
                        xb32.d.a(wb3);
                        cVar.h = null;
                    }
                    View.OnClickListener onClickListener = cVar.j;
                    if (onClickListener != null) {
                        cVar.f.a.o(YB3.b, onClickListener);
                        cVar.j = null;
                    }
                }
            }
        }
        c1608Mj3.o = i;
        c1608Mj3.c();
        boolean z2 = c1608Mj3.d && c1608Mj3.o == 1;
        LD2 ld2 = AbstractC1738Nj3.r;
        PropertyModel propertyModel2 = c1608Mj3.a;
        propertyModel2.k(ld2, z2);
        propertyModel2.k(AbstractC1738Nj3.u, z2);
        c1608Mj3.b();
        c1608Mj3.e();
        c1608Mj3.a((C8610pD) c1608Mj3.e.get());
        boolean z3 = c1608Mj3.o == 2;
        LS1 ls13 = c1608Mj3.h;
        ls13.c(z3);
        propertyModel2.k(AbstractC1738Nj3.h, z);
        propertyModel2.k(AbstractC1738Nj3.o, z);
        QS1 qs1 = ls13.c;
        if (qs1 != null) {
            qs1.g.k(TS1.d, z);
        }
        float f = c1608Mj3.r;
        int i2 = c1608Mj3.o;
        MD2 md2 = AbstractC1738Nj3.w;
        if (i2 == 1 && !propertyModel2.j(AbstractC1738Nj3.j)) {
            c1608Mj3.r = f;
            propertyModel2.l(md2, f);
        } else {
            propertyModel2.l(md2, 0.0f);
        }
        h();
    }
}
