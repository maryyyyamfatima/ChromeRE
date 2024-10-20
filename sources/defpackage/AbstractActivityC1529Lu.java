package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import com.android.chrome.R;
import java.util.List;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.webapps.WebappRegistry;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lu */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1529Lu extends ChromeActivity {
    public static final /* synthetic */ int h1 = 0;
    public C2439Su S0;
    public PC T0;
    public C0146Bd0 U0;
    public C0801Ge0 V0;
    public C2090Qc0 W0;
    public C3130Yc0 X0;
    public C4620dd0 Y0;
    public C3595ae0 Z0;
    public C3933bd0 a1;
    public C1705Nd0 b1;
    public C2485Td0 c1;
    public C10179tn4 d1;
    public C4595dY3 e1;
    public B84 f1;
    public boolean g1;

    public abstract PC Q1(Intent intent, int i);

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int l1() {
        return R.dimen.0_resource_name_obfuscated_res_0x7f08015e;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int m1() {
        return R.layout.0_resource_name_obfuscated_res_0x7f0e00b3;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int u1() {
        return R.layout.0_resource_name_obfuscated_res_0x7f0e00b6;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int h1() {
        PC pc = this.T0;
        if (pc.j().f()) {
            return pc.j().d();
        }
        return 0;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int i1() {
        return this.T0.a();
    }

    @Override // defpackage.LM
    public final InterfaceC5131f52 q0() {
        C0624Eu3 a = C0624Eu3.a();
        if (C4403cy2.e == null) {
            C4403cy2.e = new C4403cy2();
        }
        C2485Td0 c2485Td0 = new C2485Td0(this.D, a, C4403cy2.e);
        this.c1 = c2485Td0;
        return c2485Td0;
    }

    @Override // defpackage.LM
    public final void r0() {
        C2485Td0 c2485Td0 = this.c1;
        Cif k0 = k0();
        Intent intent = getIntent();
        c2485Td0.getClass();
        c2485Td0.k = AbstractC2281Ro1.p(0, intent, "androidx.browser.customtabs.extra.COLOR_SCHEME");
        c2485Td0.l = k0;
        c2485Td0.a();
        if (c2485Td0.k == 0) {
            c2485Td0.h.a.a(c2485Td0.i);
            c2485Td0.g.a.a(c2485Td0.j);
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intent intent2 = getIntent();
        super.onNewIntent(intent);
        setIntent(intent2);
        this.b1.a(Q1(intent, 1));
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final C4559dR2 Y0() {
        C2439Su c2439Su = new C2439Su(this, this.U, this.A0, this.a0, this.b0, this.c0, this.u0, this.W, k1(), this.H, this.D, this.s0, this, new InterfaceC0079Ap3() { // from class: xu
            public /* synthetic */ C11588xu() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Integer.valueOf(AbstractActivityC1529Lu.this.h1());
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, this.y, this, new InterfaceC7913nB() { // from class: Du
            public /* synthetic */ C0490Du() {
            }

            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                return AbstractActivityC1529Lu.this.P1();
            }
        }, new InterfaceC7913nB() { // from class: Eu
            public /* synthetic */ C0620Eu() {
            }

            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                AbstractActivityC1529Lu.this.getClass();
                return true;
            }
        }, this.X, (XU0) q1(), this.r0, this.f0, new InterfaceC0079Ap3() { // from class: Fu
            public /* synthetic */ C0750Fu() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return AbstractActivityC1529Lu.this.z();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, i1(), new InterfaceC0079Ap3() { // from class: Gu
            public /* synthetic */ C0880Gu() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                AbstractActivityC1529Lu.this.getClass();
                return Boolean.FALSE;
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new InterfaceC0079Ap3() { // from class: Hu
            public /* synthetic */ C1010Hu() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Boolean.valueOf(AbstractActivityC1529Lu.this.N);
            }
        }, this, this, this.F, new InterfaceC0079Ap3() { // from class: Iu
            public /* synthetic */ C1140Iu() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return AbstractActivityC1529Lu.this.V0;
            }
        }, new InterfaceC0079Ap3() { // from class: Ju
            public /* synthetic */ C1270Ju() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return AbstractActivityC1529Lu.this.W0;
            }
        }, new InterfaceC0079Ap3() { // from class: Ku
            public /* synthetic */ C1400Ku() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return AbstractActivityC1529Lu.this.T0;
            }
        }, new InterfaceC0079Ap3() { // from class: yu
            public /* synthetic */ C11931yu() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return (GC0) AbstractActivityC1529Lu.this.U0.w.get();
            }
        }, this.M0, new InterfaceC0079Ap3() { // from class: Cu
            public /* synthetic */ C0360Cu() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return AbstractActivityC1529Lu.this.X0;
            }
        });
        this.S0 = c2439Su;
        return c2439Su;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final boolean M0() {
        C3130Yc0 c3130Yc0 = this.X0;
        H71 h71 = c3130Yc0.h.a;
        G71 g71 = h71.a;
        boolean z = !TextUtils.isEmpty((g71 == null || !g71.a.equals(c3130Yc0.z)) ? null : h71.a.b);
        int i = c3130Yc0.s.c;
        if (i != 3 && i != 4 && !z) {
            if (!(c3130Yc0.l.e != null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public boolean N0(Intent intent) {
        return AbstractC2281Ro1.j(intent, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", false);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    /* renamed from: R1 */
    public C11156wf0 U0(C6592jM c6592jM) {
        C1659Mu c1659Mu = new C1659Mu(this.T0, this.c1, new C12274zu(this), this.H0.v, new C9123qj0());
        C12185zf0 e = C10712vM.e();
        e.getClass();
        C11156wf0 c11156wf0 = new C11156wf0(e.c, c6592jM, c1659Mu);
        this.U0 = (C0146Bd0) c11156wf0.o.get();
        this.V0 = (C0801Ge0) c11156wf0.L.get();
        this.W0 = (C2090Qc0) c11156wf0.w.get();
        this.X0 = (C3130Yc0) c11156wf0.y.get();
        this.Y0 = (C4620dd0) c11156wf0.d.get();
        this.Z0 = (C3595ae0) c11156wf0.N.get();
        this.a1 = (C3933bd0) c11156wf0.s.get();
        this.b1 = (C1705Nd0) c11156wf0.I.get();
        this.f1 = c11156wf0.c();
        C1441Lc0 c1441Lc0 = (C1441Lc0) c11156wf0.g.get();
        this.W0.p = new C0100Au(this, c1441Lc0);
        PC pc = this.T0;
        pc.getClass();
        if (pc instanceof C7062kj1) {
        }
        if (pc.L()) {
            this.d1 = (C10179tn4) c11156wf0.d0.get();
        }
        if (pc.K()) {
        }
        if (this.T0.J()) {
            this.e1 = (C4595dY3) c11156wf0.t0.get();
        }
        return c11156wf0;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll
    public void K0() {
        Intent intent = getIntent();
        C2485Td0 c2485Td0 = this.c1;
        PC Q1 = Q1(intent, (c2485Td0 == null || !c2485Td0.h()) ? 1 : 2);
        this.T0 = Q1;
        if (Q1 == null) {
            finishAndRemoveTask();
            return;
        }
        super.K0();
        In4 F = this.T0.F();
        if (F != null) {
            setTitle(F.f);
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void v() {
        super.v();
        if (this.T0.L()) {
            this.X0.d();
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LC
    public void l() {
        if (isTaskRoot()) {
            C10964w44.a(this, this.A0, this.f0);
        }
        if (!this.T0.L()) {
            this.X0.d();
        }
        super.l();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final AbstractC9561rz3 a1() {
        C3933bd0 c3933bd0 = this.a1;
        C5319ff0 c5319ff0 = new C5319ff0();
        c3933bd0.k = c5319ff0;
        return c5319ff0;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void c1() {
        C5319ff0 c5319ff0;
        C3933bd0 c3933bd0 = this.a1;
        if (c3933bd0 == null || (c5319ff0 = c3933bd0.k) == null) {
            return;
        }
        c5319ff0.b();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void b1() {
        this.a1.b();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final Pair Z0() {
        C3933bd0 c3933bd0 = this.a1;
        return Pair.create(c3933bd0.a(false), c3933bd0.a(true));
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void I() {
        super.I();
        C3933bd0 c3933bd0 = this.a1;
        if (c3933bd0.k == null) {
            c3933bd0.k = new C5319ff0();
        }
        c3933bd0.k.d(this.g0);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    /* renamed from: S1 */
    public final C0129Az3 s1() {
        return (C0129Az3) super.s1();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC12202zi
    public final boolean X() {
        if (this.Y0.b == null || !this.V0.m) {
            return false;
        }
        return super.X();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final Tab g1() {
        return this.Y0.b;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC0560Ei
    public final InterfaceC2379Si E() {
        boolean z = this.T0.i() == 2;
        C6166i6 c6166i6 = this.A0;
        C7507m02 c7507m02 = this.E;
        C0129Az3 s1 = s1();
        C9707sQ3 c9707sQ3 = this.H0.x;
        View decorView = getWindow().getDecorView();
        C8385oa2 c8385oa2 = this.b0;
        B84 b84 = this.f1;
        int C = this.T0.C();
        List r = this.T0.r();
        boolean G = this.T0.G();
        boolean Q = this.T0.Q();
        boolean R = this.T0.R();
        boolean P = this.T0.P();
        PC pc = this.T0;
        pc.getClass();
        return new C4963ed0(this, c6166i6, c7507m02, s1, c9707sQ3, decorView, c8385oa2, b84, C, r, G, Q, R, P, pc instanceof C7062kj1, z);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final boolean N1() {
        if (!super.N1()) {
            return false;
        }
        int i = this.Y0.c;
        return i == 4 || i == 3;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final boolean v1() {
        RenderFrameHost P0;
        if (this.H0.C.k()) {
            return true;
        }
        C2090Qc0 c2090Qc0 = this.W0;
        if (c2090Qc0.k.f) {
            FI2.a("CustomTabs.SystemBack");
            C4620dd0 c4620dd0 = c2090Qc0.g;
            if (c4620dd0.b != null) {
                InterfaceC3241Yy1 interfaceC3241Yy1 = c2090Qc0.m;
                if (((XU0) ((ZU0) interfaceC3241Yy1.get())).g()) {
                    ((XU0) ((ZU0) interfaceC3241Yy1.get())).f();
                    return true;
                }
                WebContents b = c4620dd0.b.b();
                if (b != null && (P0 = b.P0()) != null && P0.l()) {
                    return true;
                }
                C9707sQ3 c9707sQ3 = c2090Qc0.o;
                if (c9707sQ3 != null && c9707sQ3.Z.a()) {
                    return true;
                }
                C3130Yc0 c3130Yc0 = c2090Qc0.a;
                if (c3130Yc0.n.c().g().getCount() == 1) {
                    c2090Qc0.a(0);
                    return true;
                }
                c3130Yc0.a();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        PC pc = this.T0;
        if (pc != null && pc.M()) {
            this.g1 = true;
            overridePendingTransition(pc.c(), pc.d());
            this.g1 = false;
        } else {
            if (pc == null || !pc.G()) {
                return;
            }
            overridePendingTransition(R.anim.0_resource_name_obfuscated_res_0x7f02004e, R.anim.0_resource_name_obfuscated_res_0x7f02000d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:            if (r1.getBoolean("success", false) != false) goto L147;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T1() {
        /*
            r5 = this;
            Bu r0 = new Bu
            r0.<init>()
            PC r1 = r5.T0
            boolean r2 = r1.J()
            if (r2 != 0) goto L2c
            boolean r2 = r1.L()
            if (r2 == 0) goto L14
            goto L2c
        L14:
            boolean r2 = r1.H()
            if (r2 == 0) goto L28
            boolean r1 = r1.M()
            if (r1 == 0) goto L28
            Su r1 = r5.S0
            Gd0 r1 = r1.I0
            r1.b(r0)
            goto L7e
        L28:
            r0.run()
            goto L7e
        L2c:
            mM r1 = r5.T
            wf0 r1 = (defpackage.C11156wf0) r1
            tE2 r1 = r1.P
            java.lang.Object r1 = r1.get()
            XY3 r1 = (defpackage.XY3) r1
            boolean r2 = r1.d
            if (r2 != 0) goto L40
            r0.run()
            goto L7e
        L40:
            PC r2 = r1.b
            Xj4 r3 = r2.E()
            if (r3 == 0) goto L60
            yk4 r2 = defpackage.C11876yk4.a()
            r2.getClass()
            vk4 r4 = new vk4
            android.app.Activity r1 = r1.a
            r4.<init>()
            android.content.Context r1 = defpackage.V60.a
            Hk4 r2 = r2.a
            java.lang.String r3 = r3.a
            r2.a(r1, r3, r4)
            goto L78
        L60:
            androidx.browser.customtabs.CustomTabsSessionToken r2 = r2.u()
            java.lang.String r3 = "finishAndRemoveTask"
            r4 = 0
            org.chromium.chrome.browser.customtabs.CustomTabsConnection r1 = r1.c
            android.os.Bundle r1 = r1.t(r2, r3, r4)
            r2 = 0
            if (r1 == 0) goto L79
            java.lang.String r3 = "success"
            boolean r1 = r1.getBoolean(r3, r2)
            if (r1 == 0) goto L79
        L78:
            r2 = 1
        L79:
            if (r2 != 0) goto L7e
            r0.run()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractActivityC1529Lu.T1():void");
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC2783Vk3
    public final int K(Tab tab) {
        C3595ae0 c3595ae0 = this.Z0;
        boolean z = c3595ae0.c;
        PC pc = c3595ae0.a;
        int a = C0281Ce0.a(pc, z, tab);
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return C2913Wk3.C;
        }
        if (a == 2) {
            return pc.j().d();
        }
        return C2913Wk3.C;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void w1() {
        C10179tn4 c10179tn4 = this.d1;
        if (c10179tn4 != null) {
            final Dn4 dn4 = c10179tn4.i;
            dn4.getClass();
            C3637al0.b().a(new Runnable() { // from class: An4
                @Override // java.lang.Runnable
                public final void run() {
                    Dn4 dn42 = Dn4.this;
                    Activity activity = dn42.a;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                    WebappRegistry webappRegistry = Wn4.a;
                    String str = dn42.b;
                    C12237zn4 c = webappRegistry.c(str);
                    if (c != null || !dn42.c) {
                        dn42.a(c, false);
                    } else {
                        new Un4(webappRegistry, str, new Bn4(dn42)).c(AbstractC0185Bl.e);
                    }
                }
            });
        }
        super.w1();
    }

    @Override // androidx.appcompat.app.a, defpackage.AbstractActivityC6817k00, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean c = AbstractC10910vv1.c(keyEvent, this.V0.m, (XU0) q1(), this);
        return c != null ? c.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void L1(long j) {
        super.L1(j);
        EI2.n(j, "MobileStartup.IntentToCreationTime.CustomTabs");
        int i1 = i1();
        if (i1 == 3 || i1 == 4) {
            EI2.n(j, "MobileStartup.IntentToCreationTime.Webapp");
        }
        if (i1 == 4) {
            EI2.n(j, "MobileStartup.IntentToCreationTime.WebApk");
        }
    }

    @Override // androidx.appcompat.app.a, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.V0.m) {
            return AbstractC10910vv1.d(keyEvent, true, false, s1(), this, this.H0.x) || super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC9377rT1
    public boolean Y(int i, boolean z) {
        if (i == R.id.focus_url_bar || i == R.id.all_bookmarks_menu_id || i == R.id.add_to_reading_list_menu_id || i == R.id.help_id || i == R.id.recent_tabs_menu_id || i == R.id.new_incognito_tab_menu_id || i == R.id.new_tab_menu_id || i == R.id.open_history_menu_id) {
            return true;
        }
        return super.Y(i, z);
    }

    public final boolean U1() {
        C4595dY3 c4595dY3 = this.e1;
        if (c4595dY3 == null) {
            return false;
        }
        return c4595dY3.a.m;
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void U() {
        int[] n = this.T0.n();
        if (n != null) {
            N.MwmPuE$v("GsaExperiments", n, false);
        }
        super.U();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final boolean P1() {
        if (this.T0.S()) {
            return false;
        }
        return super.P1();
    }
}
