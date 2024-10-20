package org.chromium.chrome.browser;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.AR;
import defpackage.AX;
import defpackage.AX1;
import defpackage.AbstractC0247Bx1;
import defpackage.AbstractC10569uv3;
import defpackage.AbstractC10848vl;
import defpackage.AbstractC10910vv1;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC12248zp3;
import defpackage.AbstractC1558Lz3;
import defpackage.AbstractC1868Oj3;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC2599Ua;
import defpackage.AbstractC2976Wx1;
import defpackage.AbstractC3722az3;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC5241fQ2;
import defpackage.AbstractC5777gy1;
import defpackage.AbstractC6265iP;
import defpackage.AbstractC6295iV;
import defpackage.AbstractC9561rz3;
import defpackage.BR;
import defpackage.BV0;
import defpackage.BX1;
import defpackage.C0054Ak3;
import defpackage.C0437Dj1;
import defpackage.C0507Dx1;
import defpackage.C0538Ed2;
import defpackage.C0649Ez3;
import defpackage.C10021tL;
import defpackage.C10154tj3;
import defpackage.C10285u6;
import defpackage.C10294u72;
import defpackage.C10333uE3;
import defpackage.C10505ul;
import defpackage.C10648v91;
import defpackage.C10712vM;
import defpackage.C1096Il0;
import defpackage.C11047wK1;
import defpackage.C11187wk1;
import defpackage.C11255wv3;
import defpackage.C11390xK1;
import defpackage.C11418xQ;
import defpackage.C11510xh;
import defpackage.C11766yR;
import defpackage.C11832yd2;
import defpackage.C11867yj1;
import defpackage.C12109zR;
import defpackage.C12157za2;
import defpackage.C12196zh;
import defpackage.C1587Mf2;
import defpackage.C1663Mu3;
import defpackage.C1695Nb0;
import defpackage.C1761No1;
import defpackage.C1948Oz3;
import defpackage.C2313Ru3;
import defpackage.C2504Th;
import defpackage.C2764Vh;
import defpackage.C3243Yy3;
import defpackage.C3395a22;
import defpackage.C3637al0;
import defpackage.C3854bO;
import defpackage.C4030bt1;
import defpackage.C4146cD3;
import defpackage.C4212cR;
import defpackage.C4270cc0;
import defpackage.C4496dF;
import defpackage.C4505dG3;
import defpackage.C4559dR2;
import defpackage.C4752dz3;
import defpackage.C4897eQ2;
import defpackage.C5243fR;
import defpackage.C5352fk3;
import defpackage.C5696gk3;
import defpackage.C5795h12;
import defpackage.C6166i6;
import defpackage.C6275iR;
import defpackage.C6434it1;
import defpackage.C6463iy1;
import defpackage.C6895kD3;
import defpackage.C7495ly1;
import defpackage.C7507m02;
import defpackage.C7851n02;
import defpackage.C7884n6;
import defpackage.C7928nE;
import defpackage.C7993nR;
import defpackage.C8201o12;
import defpackage.C8332oQ;
import defpackage.C8385oa2;
import defpackage.C8571p6;
import defpackage.C9130qk1;
import defpackage.C9468rj3;
import defpackage.C9472rk1;
import defpackage.C9608s72;
import defpackage.C9707sQ3;
import defpackage.C9861ss;
import defpackage.C9897sy1;
import defpackage.CC;
import defpackage.DQ;
import defpackage.DR;
import defpackage.ED3;
import defpackage.EI2;
import defpackage.ER;
import defpackage.FD3;
import defpackage.FI2;
import defpackage.FR0;
import defpackage.G1;
import defpackage.G10;
import defpackage.GD3;
import defpackage.HR;
import defpackage.I5;
import defpackage.I53;
import defpackage.IC;
import defpackage.ID3;
import defpackage.IF1;
import defpackage.IR;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0408Dd2;
import defpackage.InterfaceC0809Gf3;
import defpackage.InterfaceC10318uB3;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC10912vv3;
import defpackage.InterfaceC1422Ky1;
import defpackage.InterfaceC1631Mo1;
import defpackage.InterfaceC2379Si;
import defpackage.InterfaceC7408lj3;
import defpackage.InterfaceC7913nB;
import defpackage.InterfaceC8184ny2;
import defpackage.J04;
import defpackage.JD3;
import defpackage.JF1;
import defpackage.K63;
import defpackage.LA1;
import defpackage.LU3;
import defpackage.LZ1;
import defpackage.M41;
import defpackage.Mm4;
import defpackage.NH2;
import defpackage.O83;
import defpackage.OX2;
import defpackage.PH2;
import defpackage.Q32;
import defpackage.Q83;
import defpackage.QF3;
import defpackage.QH2;
import defpackage.R20;
import defpackage.R32;
import defpackage.RH2;
import defpackage.SQ;
import defpackage.T34;
import defpackage.U04;
import defpackage.UB3;
import defpackage.UN;
import defpackage.UZ1;
import defpackage.V60;
import defpackage.V71;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.WindowOnFrameMetricsAvailableListenerC9724sU0;
import defpackage.XU0;
import defpackage.YR;
import defpackage.ZN3;
import defpackage.ZR;
import defpackage.ZU0;
import defpackage.ZX1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.incognito.IncognitoTabLauncher;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.metrics.AndroidSessionDurationsServiceState;
import org.chromium.chrome.browser.preferences.PrefChangeRegistrar;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeTabbedActivity extends ChromeActivity implements G1 {
    public static final I53 M1 = new I53();
    public static final C11766yR N1 = new C11766yR();
    public final C0538Ed2 A1;
    public final C8385oa2 B1;
    public C4496dF C1;
    public ID3 D1;
    public final C2764Vh E1;
    public C9608s72 F1;
    public C4897eQ2 G1;
    public QH2 H1;
    public UB3 I1;
    public BX1 J1;
    public int K1;
    public final C12109zR L1;
    public final C11390xK1 S0;
    public LZ1 T0;
    public J04 U0;
    public AbstractC5777gy1 V0;
    public ViewGroup W0;
    public ToolbarControlContainer X0;
    public JD3 Y0;
    public AbstractC11276wz3 Z0;
    public DR a1;
    public BR b1;
    public V71 c1;
    public IC d1;
    public C4752dz3 e1;
    public boolean f1;
    public Boolean g1;
    public LocaleManager h1;
    public C12196zh i1;
    public DQ j1;
    public CompositorViewHolder k1;
    public C1587Mf2 l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public C3854bO p1;
    public Boolean q1;
    public C6434it1 r1;
    public long t1;
    public boolean u1;
    public boolean v1;
    public final C0538Ed2 x1;
    public final C0538Ed2 y1;
    public final C0538Ed2 z1;
    public final C0538Ed2 s1 = new C0538Ed2();
    public final C5696gk3 w1 = new C5696gk3();

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int i1() {
        return 0;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int l1() {
        return R.dimen.f30110_resource_name_obfuscated_res_0x7f080154;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int m1() {
        return R.layout.f56730_resource_name_obfuscated_res_0x7f0e00a9;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public int D0(Intent intent, Bundle bundle) {
        if (bundle != null && AbstractC10848vl.a.b()) {
            return 0;
        }
        if (getClass().equals(ChromeTabbedActivity.class) && "android.intent.action.MAIN".equals(intent.getAction())) {
            return new C0507Dx1(this, intent).f();
        }
        int c2 = c2(intent, 1);
        if (c2 != 0) {
            return c2;
        }
        return 0;
    }

    public final void b2() {
        C4496dF c4496dF;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ReengagementNotification") && (c4496dF = this.C1) != null) {
            new C11832yd2(this.a0, c4496dF.b(new Callback() { // from class: QQ
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Profile profile = (Profile) obj;
                    I53 i53 = ChromeTabbedActivity.M1;
                    if (profile == null) {
                        return;
                    }
                    LU3.a(profile).notifyEvent("started_from_main_intent");
                }
            }));
        }
        this.p1.getClass();
        long g = O83.a.g(-1L, "ChromeTabbedActivity.BackgroundTimeMs");
        long currentTimeMillis = g != -1 ? System.currentTimeMillis() - g : -1L;
        C11390xK1 c11390xK1 = this.S0;
        c11390xK1.getClass();
        FI2.a("MobileStartup.MainIntentReceived");
        if (currentTimeMillis >= 86400000) {
            FI2.a("MobileStartup.MainIntentReceived.After24Hours");
        } else if (currentTimeMillis >= 43200000) {
            FI2.a("MobileStartup.MainIntentReceived.After12Hours");
        } else if (currentTimeMillis >= 21600000) {
            FI2.a("MobileStartup.MainIntentReceived.After6Hours");
        } else if (currentTimeMillis >= 3600000) {
            FI2.a("MobileStartup.MainIntentReceived.After1Hour");
        }
        c11390xK1.a(true);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Preload extends ChromeTabbedActivity {
        public IR O1;

        @Override // org.chromium.chrome.browser.ChromeTabbedActivity, org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC10912vv3
        public final /* bridge */ /* synthetic */ AbstractC10569uv3 b(boolean z) {
            return b(z);
        }

        @Override // org.chromium.chrome.browser.ChromeTabbedActivity, org.chromium.chrome.browser.app.ChromeActivity
        public final /* bridge */ /* synthetic */ AbstractC10569uv3 n1() {
            return n1();
        }

        @Override // defpackage.AbstractActivityC6817k00, defpackage.JA1
        public final LA1 Z() {
            if (this.O1 == null) {
                this.O1 = new IR();
            }
            return this.O1;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [tQ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [uQ] */
    /* JADX WARN: Type inference failed for: r6v0, types: [vQ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [wQ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [yQ] */
    public ChromeTabbedActivity() {
        C0538Ed2 c0538Ed2 = new C0538Ed2();
        this.x1 = c0538Ed2;
        this.y1 = new C0538Ed2();
        this.z1 = new C0538Ed2();
        this.A1 = new C0538Ed2();
        this.B1 = new C8385oa2();
        this.C1 = new C4496dF();
        this.L1 = new C12109zR(this);
        this.S0 = new C11390xK1();
        this.E1 = new C2764Vh(this.D, new InterfaceC0079Ap3() { // from class: tQ
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                I53 i53 = ChromeTabbedActivity.M1;
                return ChromeTabbedActivity.this.findViewById(android.R.id.content);
            }
        }, new InterfaceC0079Ap3() { // from class: uQ
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeTabbedActivity.this.getIntent();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new InterfaceC0079Ap3() { // from class: vQ
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                I53 i53 = ChromeTabbedActivity.M1;
                ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                if (chromeTabbedActivity.q1 == null) {
                    chromeTabbedActivity.q1 = Boolean.valueOf(chromeTabbedActivity.k0.x(chromeTabbedActivity.getIntent(), true));
                }
                return Boolean.valueOf(chromeTabbedActivity.q1.booleanValue());
            }
        }, new InterfaceC0079Ap3() { // from class: wQ
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Boolean.valueOf(ChromeTabbedActivity.this.L);
            }
        }, new C11418xQ(this), new InterfaceC0079Ap3() { // from class: yQ
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                I53 i53 = ChromeTabbedActivity.M1;
                return Boolean.valueOf(ChromeTabbedActivity.this.B0());
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new C9472rk1(c0538Ed2, this.W));
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll
    public final void H0() {
        LZ1 lz1;
        super.H0();
        C8385oa2 c8385oa2 = this.V;
        C7507m02 c7507m02 = this.E;
        I5 i5 = this.D;
        C8385oa2 c8385oa22 = this.y;
        if (Build.VERSION.SDK_INT < 24) {
            lz1 = null;
        } else if (C7851n02.r()) {
            lz1 = new UZ1(this, c8385oa2, c7507m02, i5, c8385oa22, this);
        } else {
            lz1 = new LZ1(this, c8385oa2, c7507m02, i5, this);
        }
        this.T0 = lz1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x006b, code lost:            if (defpackage.ED3.a().j.size() != 0) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x007a, code lost:            if (defpackage.ED3.a().j.size() == 0) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:            if (defpackage.C7851n02.f() == 0) goto L36;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006e  */
    @Override // org.chromium.chrome.browser.app.ChromeActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b1() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.b1():void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int c2(Intent intent, int i) {
        ?? r0;
        if (!getClass().equals(ChromeTabbedActivity.class) || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getComponent() == null || !"com.google.android.apps.chrome.Main".equals(intent.getComponent().getClassName())) {
            return 0;
        }
        C0507Dx1 c0507Dx1 = new C0507Dx1(this, intent);
        if (C0507Dx1.g(c0507Dx1.b)) {
            c0507Dx1.h();
            r0 = 1;
        } else {
            r0 = 0;
        }
        if (i == 1) {
            EI2.b("Android.MainActivity.ExplicitMainViewIntentDispatched.OnCreate", r0);
        } else if (i == 2) {
            EI2.b("Android.MainActivity.ExplicitMainViewIntentDispatched.OnNewIntent", r0);
        }
        if (r0 == 0) {
            int c = C1761No1.c(intent);
            EI2.h(c, 16, "Android.MainActivity.UndispatchedExplicitMainViewIntentSource");
            if (c == 5 && (getApplicationInfo().flags & 2) != 0 && !AX.e().g("dont-crash-on-view-main-intents")) {
                String intent2 = intent.toString();
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    StringBuilder a = M41.a(intent2, ", extras.keySet = [");
                    a.append(TextUtils.join(", ", extras.keySet()));
                    a.append("]");
                    intent2 = a.toString();
                }
                throw new IllegalStateException(String.format(null, "VIEW intent sent to .Main activity alias was not dispatched. PLEASE report the following info to crbug.com/789732: \"%s\". Use --%s flag to disable this check.", intent2, "dont-crash-on-view-main-intents"));
            }
        }
        return r0;
    }

    public final void a2() {
        TraceEvent i = TraceEvent.i("ChromeTabbedActivity.initializeCompositorContent", null);
        try {
            x1(this.V0, findViewById(R.id.url_bar), this.W0, this.X0);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void l() {
        TraceEvent i = TraceEvent.i("ChromeTabbedActivity.finishNativeInitialization", null);
        try {
            super.l();
            this.k1 = (CompositorViewHolder) this.r0.g;
            this.l1 = this.V0.Q;
            C1948Oz3 t1 = t1();
            t1.b.a(this.k1);
            C1948Oz3 t12 = t1();
            t12.b.a(this.l1);
            C10021tL.f().a(this.V0);
            if (this.L) {
                C10021tL.f().a(this.k1);
            }
            C9608s72 c9608s72 = new C9608s72(this.H, new C10294u72(this, N()));
            this.F1 = c9608s72;
            C9608s72.h.a(c9608s72, this.H.t);
            this.F1.a();
            if (C9861ss.b()) {
                Z1();
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void u() {
        TraceEvent i = TraceEvent.i("ChromeTabbedActivity.startNativeInitialization", null);
        try {
            TraceEvent i2 = TraceEvent.i("ChromeTabbedActivity.setupCompositorContentPostNative", null);
            try {
                if (!(this.V0 != null)) {
                    if (this.L) {
                        l2();
                    } else {
                        k2();
                    }
                }
                this.V0.U = C1096Il0.b();
                if (i2 != null) {
                    i2.close();
                }
                C7928nE c7928nE = UN.a;
                if (!N.M09VlOh_("SplitCompositorTask") || (DeviceFormFactor.isTablet() && !N.M6bsIDpc("SplitCompositorTask", "enable_on_tablet", false))) {
                    a2();
                } else {
                    PostTask.c(AbstractC5103f04.a, this.C1.c(new Runnable() { // from class: GQ
                        @Override // java.lang.Runnable
                        public final void run() {
                            I53 i53 = ChromeTabbedActivity.M1;
                            ChromeTabbedActivity.this.a2();
                        }
                    }));
                }
                QF3 qf3 = AbstractC5103f04.a;
                PostTask.c(qf3, this.C1.c(new Runnable() { // from class: HQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                        chromeTabbedActivity.getClass();
                        TraceEvent i3 = TraceEvent.i("ChromeTabbedActivity.refreshSignIn", null);
                        try {
                            AbstractC10042tP0.c(chromeTabbedActivity);
                            if (i3 != null) {
                                i3.close();
                            }
                        } catch (Throwable th) {
                            if (i3 != null) {
                                try {
                                    i3.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                }));
                PostTask.b(qf3, this.C1.c(new Runnable() { // from class: IQ
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v0, types: [WQ] */
                    /* JADX WARN: Type inference failed for: r6v0, types: [TQ] */
                    /* JADX WARN: Type inference failed for: r7v0, types: [UQ] */
                    /* JADX WARN: Type inference failed for: r8v0, types: [VQ] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        final ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                        chromeTabbedActivity.getClass();
                        TraceEvent i3 = TraceEvent.i("ChromeTabbedActivity.initializeToolbarManager", null);
                        try {
                            J04 j04 = chromeTabbedActivity.U0;
                            ((AbstractC11276wz3) j04.a).j(false).g(j04.g);
                            chromeTabbedActivity.H0.x.g(chromeTabbedActivity.V0, new View.OnClickListener() { // from class: TQ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Profile profile;
                                    I53 i532 = ChromeTabbedActivity.M1;
                                    ChromeTabbedActivity chromeTabbedActivity2 = ChromeTabbedActivity.this;
                                    chromeTabbedActivity2.getClass();
                                    C7928nE c7928nE2 = UN.a;
                                    if (N.M09VlOh_("ToolbarIphAndroid") && (profile = (Profile) chromeTabbedActivity2.a0.g) != null) {
                                        LU3.a(profile).notifyEvent("tab_switcher_button_clicked");
                                    }
                                    if (((XU0) chromeTabbedActivity2.q1()).g()) {
                                        return;
                                    }
                                    if (!chromeTabbedActivity2.A1() || AbstractC5241fQ2.d(chromeTabbedActivity2)) {
                                        chromeTabbedActivity2.n2(4, 0);
                                        return;
                                    }
                                    if (chromeTabbedActivity2.o1().getCount() != 0) {
                                        chromeTabbedActivity2.V0.d0(1, false);
                                        Tab g1 = chromeTabbedActivity2.g1();
                                        WebContents b = g1 != null ? g1.b() : null;
                                        if (b != null) {
                                            WebContentsAccessibilityImpl.k(b).E(true);
                                        }
                                    }
                                }
                            }, new View.OnClickListener() { // from class: UQ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    I53 i532 = ChromeTabbedActivity.M1;
                                    ChromeTabbedActivity chromeTabbedActivity2 = ChromeTabbedActivity.this;
                                    ((AbstractC11276wz3) chromeTabbedActivity2.s1()).j(false).l();
                                    chromeTabbedActivity2.n1().e();
                                    chromeTabbedActivity2.h1.c(chromeTabbedActivity2, null);
                                    if (((AbstractC11276wz3) chromeTabbedActivity2.s1()).o()) {
                                        FI2.a("MobileToolbarStackViewNewIncognitoTab");
                                    } else {
                                        FI2.a("MobileToolbarStackViewNewTab");
                                    }
                                    FI2.a("MobileTopToolbarNewTabButton");
                                    FI2.a("MobileNewTabOpened");
                                    AbstractC5241fQ2.g("Chrome.StartSurface.OpenNewTabPageCount");
                                }
                            }, new View.OnClickListener() { // from class: VQ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    I53 i532 = ChromeTabbedActivity.M1;
                                    ChromeTabbedActivity chromeTabbedActivity2 = ChromeTabbedActivity.this;
                                    ((C2703Uu3) chromeTabbedActivity2.c0.g).a(0, chromeTabbedActivity2.g1(), false);
                                }
                            }, null, new InterfaceC0079Ap3() { // from class: WQ
                                @Override // defpackage.InterfaceC0079Ap3
                                public final /* synthetic */ boolean i() {
                                    return AbstractC12248zp3.a(this);
                                }

                                @Override // defpackage.InterfaceC0079Ap3
                                public final Object get() {
                                    I53 i532 = ChromeTabbedActivity.M1;
                                    ChromeTabbedActivity chromeTabbedActivity2 = ChromeTabbedActivity.this;
                                    if ((!chromeTabbedActivity2.L && AbstractC5241fQ2.k(chromeTabbedActivity2)) && !chromeTabbedActivity2.Z0.o()) {
                                        C1998Pj3.b(chromeTabbedActivity2.g1());
                                        chromeTabbedActivity2.n2(6, 0);
                                        return Boolean.TRUE;
                                    }
                                    return Boolean.FALSE;
                                }
                            });
                            chromeTabbedActivity.B0();
                            if (i3 != null) {
                                i3.close();
                            }
                        } catch (Throwable th) {
                            if (i3 != null) {
                                try {
                                    i3.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                }), 0L);
                PostTask.b(qf3, this.C1.c(new Runnable() { // from class: JQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                        chromeTabbedActivity.getClass();
                        TraceEvent i3 = TraceEvent.i("ChromeTabbedActivity.maybeCreateIncognitoTabSnapshotController", null);
                        try {
                            if (!AX.e().g("enable-incognito-snapshots-in-android-recents")) {
                                new C0702Fk1(chromeTabbedActivity, chromeTabbedActivity.getWindow(), chromeTabbedActivity.V0, chromeTabbedActivity.Z0);
                            }
                            chromeTabbedActivity.f1 = true;
                            chromeTabbedActivity.d2();
                            chromeTabbedActivity.Z0.q();
                            if (!AbstractC11530xk1.b()) {
                                AbstractC11524xj1.a();
                                AbstractC2560Ts0.a.a();
                            }
                            if (i3 != null) {
                                i3.close();
                            }
                        } catch (Throwable th) {
                            if (i3 != null) {
                                try {
                                    i3.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                }), 0L);
                PostTask.b(qf3, this.C1.c(new Runnable() { // from class: KQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        ChromeTabbedActivity.this.d2();
                    }
                }), 0L);
                PostTask.b(qf3, this.C1.c(new Runnable() { // from class: LQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                        chromeTabbedActivity.getClass();
                        TraceEvent i3 = TraceEvent.i("ChromeTabbedActivity.maybeGetFeedAppLifecycleAndMaybeCreatePageViewObserver", null);
                        try {
                            WK0 a = WK0.a();
                            if (!a.a) {
                                a.a = true;
                                N.MEQNDUUr();
                                HashSet hashSet = a.c;
                                if (hashSet != null) {
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((C12075zK0) ((InterfaceC2678Up3) it.next())).e();
                                    }
                                }
                            }
                            C10964w44.a(chromeTabbedActivity, chromeTabbedActivity.A0, chromeTabbedActivity.f0);
                            if (i3 != null) {
                                i3.close();
                            }
                        } catch (Throwable th) {
                            if (i3 != null) {
                                try {
                                    i3.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                }), 0L);
                PostTask.b(qf3, this.C1.c(new Runnable() { // from class: MQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                        chromeTabbedActivity.getClass();
                        TraceEvent i3 = TraceEvent.i("ChromeTabbedActivity.initJourneyManager", null);
                        try {
                            C7928nE c7928nE2 = UN.a;
                            if (N.M09VlOh_("TabEngagementReportingAndroid")) {
                                chromeTabbedActivity.s1();
                                new C1267Jt1();
                            }
                            if (i3 != null) {
                                i3.close();
                            }
                        } catch (Throwable th) {
                            if (i3 != null) {
                                try {
                                    i3.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                }), 0L);
                PostTask.b(qf3, this.C1.c(new Runnable() { // from class: NQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChromeTabbedActivity.this.l();
                    }
                }), 0L);
                C10021tL.f().a(this);
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                if (i2 != null) {
                    try {
                        i2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }

    public final void j2(boolean z) {
        if (z) {
            C8571p6 c8571p6 = this.z0;
            c8571p6.c = ".Tabbed";
            c8571p6.g = true;
        } else {
            C8571p6 c8571p62 = this.z0;
            if (c8571p62.g) {
                c8571p62.c = null;
                c8571p62.g = false;
            }
        }
        C5352fk3.f = z;
    }

    public static void R1(ChromeTabbedActivity chromeTabbedActivity) {
        if (chromeTabbedActivity.L && chromeTabbedActivity.V0 != null && chromeTabbedActivity.Y0.d) {
            boolean h = AbstractC5177fD3.h(chromeTabbedActivity);
            boolean G = chromeTabbedActivity.V0.G(2);
            boolean z = ((AbstractC11276wz3) chromeTabbedActivity.s1()).n() != 0 && (((AbstractC11276wz3) chromeTabbedActivity.s1()).o() || ((AbstractC11276wz3) chromeTabbedActivity.s1()).j(false).getCount() != 0);
            if (!h || G || z) {
                return;
            }
            chromeTabbedActivity.V0.d0(2, false);
        }
    }

    public final void k2() {
        if (this.L) {
            return;
        }
        TraceEvent i = TraceEvent.i("ChromeTabbedActivity.setupCompositorContentPreNativeForPhone", null);
        try {
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.r0.g;
            if (AbstractC5177fD3.b(this)) {
                U1(compositorViewHolder, compositorViewHolder);
            }
            ViewGroup viewGroup = this.W0;
            C0538Ed2 c0538Ed2 = this.z1;
            C0538Ed2 c0538Ed22 = this.A1;
            C8385oa2 c8385oa2 = this.f0;
            C4559dR2 c4559dR2 = this.H0;
            Objects.requireNonNull(c4559dR2);
            C6463iy1 c6463iy1 = new C6463iy1(compositorViewHolder, viewGroup, c0538Ed2, c0538Ed22, c8385oa2, new SQ(c4559dR2), this.r1);
            this.V0 = c6463iy1;
            this.y1.a(c6463iy1);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [lR] */
    public final void l2() {
        if (this.L) {
            TraceEvent i = TraceEvent.i("ChromeTabbedActivity.setupCompositorContentPreNativeForTablet", null);
            try {
                CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.r0.g;
                if (AbstractC5177fD3.b(this) && !CachedFeatureFlags.b(AbstractC6265iP.d.b("GridTabSwitcherForTablets:delay_creation"), false)) {
                    T1();
                }
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.grid_tab_switcher_view_holder);
                ViewGroup viewGroup2 = this.W0;
                C0538Ed2 c0538Ed2 = this.z1;
                C0538Ed2 c0538Ed22 = this.A1;
                C8385oa2 c8385oa2 = this.f0;
                C4559dR2 c4559dR2 = this.H0;
                Objects.requireNonNull(c4559dR2);
                C7495ly1 c7495ly1 = new C7495ly1(compositorViewHolder, viewGroup2, c0538Ed2, c0538Ed22, c8385oa2, new SQ(c4559dR2), this.r1, viewGroup, this.H0.E, this.D, new Callable() { // from class: lR
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        return ChromeTabbedActivity.this.T1();
                    }
                });
                this.V0 = c7495ly1;
                this.y1.a(c7495ly1);
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && !this.L) {
            this.B.removeCallbacks(this.j1);
            this.j1 = null;
            if (keyEvent.getEventTime() - keyEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
                m mVar = this.H0.C;
                if (mVar != null && (mVar.h() instanceof C3395a22) && mVar.n()) {
                    return true;
                }
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final int u1() {
        return this.L ? R.layout.f61630_resource_name_obfuscated_res_0x7f0e02c7 : R.layout.f61620_resource_name_obfuscated_res_0x7f0e02c6;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [mR] */
    public final void U1(CompositorViewHolder compositorViewHolder, ViewGroup viewGroup) {
        boolean e = AbstractC5241fQ2.e(this);
        K63 k63 = this.U;
        C11255wv3 c11255wv3 = this.X;
        if (!e) {
            if (AbstractC5177fD3.b(this)) {
                C4559dR2 c4559dR2 = this.H0;
                OX2 ox2 = c4559dR2.E;
                m mVar = c4559dR2.C;
                C0538Ed2 c0538Ed2 = this.z1;
                C8385oa2 c8385oa2 = this.B1;
                boolean z = this.M;
                C10285u6 c10285u6 = this.H;
                Objects.requireNonNull(compositorViewHolder);
                C5243fR c5243fR = new C5243fR(compositorViewHolder);
                InterfaceC10590uz3 s1 = s1();
                CC k1 = k1();
                ViewOnClickListenerC1069If3 z2 = z();
                final C9707sQ3 c9707sQ3 = this.H0.x;
                Objects.requireNonNull(c9707sQ3);
                ?? r15 = new InterfaceC0079Ap3() { // from class: mR
                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        return C9707sQ3.this.D.j();
                    }
                };
                TabContentManager tabContentManager = this.g0;
                ZX1 N = N();
                I5 i5 = this.D;
                InterfaceC10912vv3 interfaceC10912vv3 = (InterfaceC10912vv3) c11255wv3.g;
                C7507m02 c7507m02 = this.E;
                C6434it1 c6434it1 = this.r1;
                C9707sQ3 c9707sQ32 = this.H0.x;
                Objects.requireNonNull(c9707sQ32);
                new C10154tj3(this, ox2, mVar, c0538Ed2, c8385oa2, z, c10285u6, viewGroup, c5243fR, (AbstractC11276wz3) s1, k1, z2, k63, r15, tabContentManager, N, this, i5, interfaceC10912vv3, this, c7507m02, c6434it1, new C7993nR(c9707sQ32), new C4270cc0(), this.M0);
                return;
            }
            return;
        }
        C0538Ed2 c0538Ed22 = this.A1;
        C3243Yy3 a = AbstractC3722az3.a();
        I5 i52 = this.D;
        InterfaceC10590uz3 s12 = s1();
        TabContentManager tabContentManager2 = this.g0;
        CC k12 = k1();
        InterfaceC10912vv3 interfaceC10912vv32 = (InterfaceC10912vv3) c11255wv3.g;
        C7507m02 c7507m022 = this.E;
        OX2 ox22 = this.H0.E;
        Objects.requireNonNull(compositorViewHolder);
        C5243fR c5243fR2 = new C5243fR(compositorViewHolder);
        ViewOnClickListenerC1069If3 z3 = z();
        ZX1 N2 = N();
        a.getClass();
        c0538Ed22.a(C3243Yy3.a(this, i52, s12, tabContentManager2, k12, interfaceC10912vv32, this, viewGroup, k63, c7507m022, ox22, viewGroup, c5243fR2, z3, N2));
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void I() {
        try {
            TraceEvent.b("ChromeTabbedActivity.initializeCompositor", null);
            super.I();
            LocaleManager localeManager = LocaleManager.getInstance();
            this.h1 = localeManager;
            localeManager.a.f = M1;
            localeManager.c(this, null);
            this.Y0.d(this.g0);
            this.c1 = new V71(this.Z0.j(false));
            if (AbstractC5177fD3.h(this)) {
                this.Z0.c(new AR(this));
            }
            this.b1 = new BR(this, this.Z0);
        } finally {
            TraceEvent.c("ChromeTabbedActivity.initializeCompositor");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d A[Catch: all -> 0x0159, TryCatch #0 {all -> 0x0159, blocks: (B:3:0x0003, B:6:0x0023, B:8:0x003b, B:9:0x005c, B:12:0x006b, B:15:0x0071, B:16:0x007f, B:18:0x0087, B:19:0x008d, B:21:0x0093, B:22:0x009c, B:24:0x00ae, B:27:0x00b5, B:29:0x00bf, B:37:0x00d7, B:39:0x00db, B:41:0x00e1, B:45:0x00ed, B:49:0x00fa, B:51:0x0129, B:53:0x012d, B:55:0x0135, B:59:0x0144, B:62:0x014c, B:64:0x0150, B:65:0x0153, B:72:0x0106, B:75:0x0126, B:78:0x00c7, B:86:0x0057, B:88:0x001e), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Type inference failed for: r2v13, types: [PQ, java.lang.Object] */
    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.v():void");
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public final void y(Intent intent) {
        try {
            TraceEvent.b("ChromeTabbedActivity.onNewIntentWithNative", null);
            super.y(intent);
            if (AbstractC2281Ro1.g(intent)) {
                b2();
            }
            if (AX.e().g("enable-test-intents")) {
                Y1(intent);
            }
        } finally {
            TraceEvent.c("ChromeTabbedActivity.onNewIntentWithNative");
        }
    }

    public final ViewGroup T1() {
        ViewGroup viewGroup;
        long uptimeMillis = SystemClock.uptimeMillis();
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.r0.g;
        if (AbstractC5177fD3.i(this)) {
            viewGroup = (ViewGroup) ((ViewStub) findViewById(R.id.grid_tab_switcher_view_holder_stub)).inflate();
            C9707sQ3 c9707sQ3 = this.H0.x;
            c9707sQ3.getClass();
            ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.fullscreen_tab_switcher_toolbar_stub);
            C4146cD3 c4146cD3 = c9707sQ3.k.b;
            if (c4146cD3 != null) {
                c4146cD3.b = viewStub;
            }
        } else {
            viewGroup = compositorViewHolder;
        }
        U1(compositorViewHolder, viewGroup);
        if (AbstractC5241fQ2.e(this)) {
            C0538Ed2 c0538Ed2 = this.A1;
            c0538Ed2.getClass();
            if (AbstractC12248zp3.a(c0538Ed2)) {
                ((InterfaceC10318uB3) c0538Ed2.get()).h().M(this.G);
                EI2.n(SystemClock.uptimeMillis() - uptimeMillis, "Android.TabSwitcher.CreationTime");
                return viewGroup;
            }
        }
        C0538Ed2 c0538Ed22 = this.z1;
        c0538Ed22.getClass();
        if (AbstractC12248zp3.a(c0538Ed22)) {
            InterfaceC7408lj3 interfaceC7408lj3 = (InterfaceC7408lj3) c0538Ed22.get();
            ((C10154tj3) interfaceC7408lj3).c.g.M(this.G);
        }
        EI2.n(SystemClock.uptimeMillis() - uptimeMillis, "Android.TabSwitcher.CreationTime");
        return viewGroup;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.addFlags(268435456);
        if (c2(intent2, 2) != 0) {
            moveTaskToBack(true);
            return;
        }
        this.t1 = SystemClock.uptimeMillis();
        super.onNewIntent(intent);
        if (!AbstractC5241fQ2.d(this) || o1().getCount() <= 0 || this.L || m2() || A1()) {
            return;
        }
        C0538Ed2 c0538Ed2 = this.z1;
        if (c0538Ed2.get() != null) {
            ((C10154tj3) ((InterfaceC7408lj3) c0538Ed2.get())).c.A(0, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:            if (r0 == false) goto L25;     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0 A[Catch: RuntimeException -> 0x00cb, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00cb, blocks: (B:61:0x00c0, B:67:0x00b9, B:55:0x009f, B:63:0x00ac), top: B:54:0x009f, inners: #0 }] */
    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.c():void");
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public final void e() {
        this.Z0.f();
        try {
            N.M6wmuchs();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        IF1 if1 = this.h1.a;
        if1.getClass();
        if1.d = new WeakReference(null);
        IF1 if12 = this.h1.a;
        JF1 jf1 = if12.l;
        if (jf1 != null) {
            V60.a.unregisterReceiver(jf1);
            if12.l = null;
        }
        N.MnSIHeV3();
        AbstractC1868Oj3.a.i = false;
        super.e();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public final void g() {
        super.g();
        g2();
        this.o1 = false;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public final void f() {
        C11390xK1 c11390xK1 = this.S0;
        c11390xK1.getClass();
        if (!C11390xK1.c) {
            C11390xK1.c = true;
            ApplicationStatus.d(new C11047wK1());
        }
        if (!C11390xK1.b) {
            ThreadUtils.b().postDelayed(c11390xK1.a, 10000L);
        }
        super.f();
        if (!this.n1 && !this.v1) {
            i2();
        }
        if (AbstractC5177fD3.a() || O83.a.e("Chrome.ConditionalTabStrip.OptOut", false)) {
            this.p1.getClass();
            Q83 q83 = O83.a;
            long g = q83.g(-1L, "ChromeTabbedActivity.BackgroundTimeMs");
            long c = R20.a.c() + g;
            if (g == -1 || System.currentTimeMillis() > c) {
                long g2 = q83.g(-1L, "Chrome.ConditionalTabStrip.LastShownTimeStamp");
                int a = R20.a();
                if (q83.e("Chrome.ConditionalTabStrip.OptOut", false)) {
                    EI2.h(4, 5, "TabStrip.UserStatus");
                } else if (g2 == -1) {
                    EI2.h(0, 5, "TabStrip.UserStatus");
                } else if (a == 2) {
                    EI2.h(1, 5, "TabStrip.UserStatus");
                } else if (a == 1) {
                    EI2.h(2, 5, "TabStrip.UserStatus");
                } else if (a == 0) {
                    EI2.h(3, 5, "TabStrip.UserStatus");
                }
                int f = q83.f(0, "Chrome.ConditionalTabStrip.ContinuousDismissCounter");
                if (f != -1) {
                    if (R20.a() == 1) {
                        q83.q(0, "Chrome.ConditionalTabStrip.ContinuousDismissCounter");
                    } else if (R20.a() == 0) {
                        int i = f + 1;
                        q83.q(i < R20.b.c() ? i : -1, "Chrome.ConditionalTabStrip.ContinuousDismissCounter");
                    }
                }
                q83.q(2, "Chrome.ConditionalTabStrip.FeatureStatus");
            }
        }
        Bundle bundle = this.I;
        if (bundle != null && bundle.getBoolean("is_incognito_selected", false)) {
            Profile f2 = o1().b().f(true);
            long j = bundle.getLong("incognito_session_startup_time", -1L);
            if (j != -1) {
                N.MG2ZhetJ(f2, new AndroidSessionDurationsServiceState(j, bundle.getLong("incognito_session_last_reported_duration", -1L)));
            }
        }
        this.I = null;
        AbstractC5241fQ2.l();
        new PrefChangeRegistrar().a("ntp_snippets.list_visible", new InterfaceC8184ny2() { // from class: YP2
            @Override // defpackage.InterfaceC8184ny2
            public final void c() {
                AbstractC5241fQ2.l();
            }
        });
        this.p1.getClass();
        Q83 q832 = O83.a;
        long g3 = q832.g(-1L, "ChromeTabbedActivity.BackgroundTimeMs");
        long currentTimeMillis = g3 != -1 ? System.currentTimeMillis() - g3 : -1L;
        if (RH2.c()) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C7928nE c7928nE = UN.a;
            if (currentTimeMillis > ((int) timeUnit.toMillis(N.M37SqSAy("ReadLater", "session_length", RH2.a)))) {
                q832.m("enhanced_bookmark_last_used_url");
            }
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC10912vv3
    /* renamed from: X1, reason: merged with bridge method [inline-methods] */
    public final C8332oQ b(boolean z) {
        return (C8332oQ) super.b(z);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    /* renamed from: V1, reason: merged with bridge method [inline-methods] */
    public final C8332oQ n1() {
        return (C8332oQ) super.n1();
    }

    public final void Y1(Intent intent) {
        if ("com.google.android.apps.chrome.ACTION_CLOSE_TABS".equals(intent.getAction())) {
            ((AbstractC11276wz3) s1()).d(false);
            return;
        }
        String action = intent.getAction();
        Object obj = ThreadUtils.a;
        if (!"org.chromium.base.ACTION_LOW_MEMORY".equals(action)) {
            if (!"org.chromium.base.ACTION_TRIM_MEMORY".equals(action)) {
                if (!"org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL".equals(action)) {
                    if ("org.chromium.base.ACTION_TRIM_MEMORY_MODERATE".equals(action)) {
                        getApplication().onTrimMemory(60);
                        onTrimMemory(60);
                        return;
                    }
                    return;
                }
                getApplication().onTrimMemory(15);
                onTrimMemory(15);
                return;
            }
            getApplication().onTrimMemory(80);
            onTrimMemory(80);
            return;
        }
        getApplication().onLowMemory();
        onLowMemory();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i2() {
        /*
            r8 = this;
            boolean r0 = r8.o1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r8.o1 = r0
            boolean r1 = r8.A1()
            boolean r2 = r8.m2()
            r3 = 0
            r4 = 5
            Vh r5 = r8.E1
            if (r2 == 0) goto L86
            if (r1 != 0) goto L86
            org.chromium.chrome.browser.tabmodel.TabModel r1 = r8.o1()
            if (r1 == 0) goto L2b
            org.chromium.chrome.browser.tabmodel.TabModel r1 = r8.o1()
            int r1 = r1.getCount()
            java.lang.String r2 = "Tabs.TabCountOnStartScreenShown"
            defpackage.EI2.e(r1, r2)
        L2b:
            boolean r1 = defpackage.AbstractC5241fQ2.e(r8)
            if (r1 == 0) goto L4c
            Ed2 r1 = r8.A1
            r1.getClass()
            boolean r2 = defpackage.AbstractC12248zp3.a(r1)
            if (r2 == 0) goto L4c
            java.lang.Object r1 = r1.get()
            uB3 r1 = (defpackage.InterfaceC10318uB3) r1
            qB3 r1 = r1.h()
            long r6 = r8.G
            r1.M(r6)
            goto L68
        L4c:
            Ed2 r1 = r8.z1
            r1.getClass()
            boolean r2 = defpackage.AbstractC12248zp3.a(r1)
            if (r2 == 0) goto L68
            java.lang.Object r1 = r1.get()
            lj3 r1 = (defpackage.InterfaceC7408lj3) r1
            long r6 = r8.G
            tj3 r1 = (defpackage.C10154tj3) r1
            Fj3 r1 = r1.c
            qB3 r1 = r1.g
            r1.M(r6)
        L68:
            r8.u1 = r0
            r8.j2(r3)
            r8.n2(r4, r3)
            boolean r1 = r8.u1
            if (r1 == 0) goto L7b
            boolean r1 = r8.B0()
            if (r1 != 0) goto L7b
            goto L7c
        L7b:
            r0 = r3
        L7c:
            boolean r1 = r5.l
            if (r1 == 0) goto L83
            r5.a(r3, r0)
        L83:
            r5.l = r3
            return
        L86:
            org.chromium.chrome.browser.tab.Tab r2 = r8.g1()
            if (r2 != 0) goto L96
            if (r1 != 0) goto L96
            r8.u1 = r0
            r8.j2(r3)
            r8.n2(r4, r3)
        L96:
            android.content.Intent r1 = r8.getIntent()
            boolean r1 = defpackage.AbstractC2281Ro1.g(r1)
            if (r1 == 0) goto Lab
            boolean r1 = r8.A1()
            if (r1 == 0) goto Lab
            java.lang.String r1 = "MobileStartup.UserEnteredTabSwitcher"
            defpackage.FI2.a(r1)
        Lab:
            boolean r1 = r8.u1
            if (r1 == 0) goto Lb6
            boolean r1 = r8.B0()
            if (r1 != 0) goto Lb6
            goto Lb7
        Lb6:
            r0 = r3
        Lb7:
            boolean r1 = r5.l
            if (r1 == 0) goto Lbe
            r5.a(r3, r0)
        Lbe:
            r5.l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.i2():void");
    }

    @Override // defpackage.G1
    public final void D(boolean z) {
        d2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:            if (r4 == false) goto L25;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d2() {
        /*
            r5 = this;
            boolean r0 = r5.f1
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = defpackage.C1096Il0.a(r5)
            boolean r1 = r5.A1()
            if (r1 == 0) goto L6d
            java.lang.Boolean r1 = r5.g1
            if (r1 == 0) goto L1d
            boolean r1 = r1.booleanValue()
            boolean r2 = defpackage.C1096Il0.a(r5)
            if (r1 == r2) goto L6d
        L1d:
            Ed2 r1 = r5.z1
            java.lang.Object r2 = r1.get()
            r3 = 1
            if (r2 == 0) goto L51
            java.lang.Object r1 = r1.get()
            lj3 r1 = (defpackage.InterfaceC7408lj3) r1
            tj3 r1 = (defpackage.C10154tj3) r1
            Fj3 r1 = r1.c
            int r1 = r1.w
            if (r1 != r3) goto L51
            org.chromium.chrome.browser.tabmodel.TabModel r1 = r5.o1()
            boolean r1 = r1.isIncognito()
            boolean r2 = r5.L
            r4 = 0
            if (r1 != 0) goto L4f
            if (r2 != 0) goto L4b
            boolean r1 = defpackage.AbstractC5241fQ2.k(r5)
            if (r1 == 0) goto L4b
            r1 = r3
            goto L4c
        L4b:
            r1 = r4
        L4c:
            if (r1 == 0) goto L4f
            r4 = r3
        L4f:
            if (r4 != 0) goto L6d
        L51:
            gy1 r1 = r5.V0
            r1.d0(r3, r3)
            uz3 r1 = r5.s1()
            wz3 r1 = (defpackage.AbstractC11276wz3) r1
            org.chromium.chrome.browser.tabmodel.TabModel r1 = r1.g()
            int r1 = r1.getCount()
            if (r1 != 0) goto L6d
            oQ r1 = r5.n1()
            r1.e()
        L6d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.g1 = r0
            tL r0 = defpackage.C10021tL.f()
            boolean r0 = r0.c()
            if (r0 == 0) goto L88
            java.lang.Boolean r0 = r5.g1
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "Accessibility.Android.TabSwitcherPreferenceEnabled"
            defpackage.EI2.b(r1, r0)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.d2():void");
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll
    public final void K0() {
        this.r1 = new C6434it1(this);
        super.K0();
        if (!b.n.f()) {
            j2(true);
        }
        k0().i(10);
        C11187wk1.a().a.add(this.L1);
        this.w1.q(this.H.t);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [YQ] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aR] */
    /* JADX WARN: Type inference failed for: r1v8, types: [bR] */
    /* JADX WARN: Type inference failed for: r2v5, types: [dR] */
    /* JADX WARN: Type inference failed for: r2v9, types: [eR] */
    /* JADX WARN: Type inference failed for: r3v0, types: [XQ] */
    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final C4559dR2 Y0() {
        return new C10333uE3(this, new Callback() { // from class: XQ
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C9018qQ c9018qQ = ChromeTabbedActivity.this.e1.s;
                if (c9018qQ == null || c9018qQ.g == null) {
                    return;
                }
                c9018qQ.j(!booleanValue);
            }
        }, this.U, this.A0, this.a0, this.b0, this.c0, this.u0, this.W, this.z1, this.A1, this.s1, this.y1, this.B1, k1(), this.H, this.r1, this.D, this.s0, this, new InterfaceC0079Ap3() { // from class: YQ
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                ChromeTabbedActivity.this.getClass();
                return 0;
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, this.y, this, new InterfaceC7913nB() { // from class: aR
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                return ChromeTabbedActivity.this.P1();
            }
        }, new InterfaceC7913nB() { // from class: bR
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                ChromeTabbedActivity.this.getClass();
                return true;
            }
        }, this.X, (XU0) q1(), this.r0, this.f0, new C4212cR(this), new C11418xQ(this), new InterfaceC0079Ap3() { // from class: dR
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Boolean.valueOf(ChromeTabbedActivity.this.N);
            }
        }, this, this, new C8385oa2(), this.F, this.t0, new BV0() { // from class: eR
            @Override // defpackage.BV0
            public final Object apply(Object obj) {
                return Boolean.valueOf(ChromeTabbedActivity.this.S0((Tab) obj));
            }
        }, this.E0, C1761No1.o(getIntent().getExtras()), this.M0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [FQ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [EQ] */
    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll
    public final void J0() {
        super.J0();
        FR0 a = FR0.a();
        a.a.getClass();
        a.b("ChromeTabbedActivity");
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) s1();
        abstractC11276wz3.g.a(new C0437Dj1(abstractC11276wz3));
        abstractC11276wz3.g.a(new C11867yj1());
        if (isFinishing()) {
            return;
        }
        getWindow().setSoftInputMode(19);
        this.W0 = (ViewGroup) findViewById(android.R.id.content);
        this.X0 = (ToolbarControlContainer) findViewById(R.id.control_container);
        this.U0 = new J04(this, this.Z0, new InterfaceC0809Gf3() { // from class: EQ
            @Override // defpackage.InterfaceC0809Gf3
            public final ViewOnClickListenerC1069If3 z() {
                return ChromeTabbedActivity.this.z();
            }
        }, this.y1, AbstractC5177fD3.e(this) ? new InterfaceC0079Ap3() { // from class: CQ
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
            @Override // defpackage.InterfaceC0079Ap3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object get() {
                /*
                    r5 = this;
                    I53 r0 = org.chromium.chrome.browser.ChromeTabbedActivity.M1
                    org.chromium.chrome.browser.ChromeTabbedActivity r0 = org.chromium.chrome.browser.ChromeTabbedActivity.this
                    r0.getClass()
                    boolean r1 = defpackage.AbstractC5241fQ2.e(r0)
                    dR2 r2 = r0.H0
                    sQ3 r2 = r2.x
                    Ow3 r2 = r2.I0
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L26
                    Fv3 r2 = r2.z
                    if (r2 == 0) goto L21
                    boolean r2 = r2.c()
                    if (r2 == 0) goto L21
                    r2 = r3
                    goto L22
                L21:
                    r2 = r4
                L22:
                    if (r2 == 0) goto L26
                    r2 = r3
                    goto L27
                L26:
                    r2 = r4
                L27:
                    if (r1 == 0) goto L36
                    Ed2 r0 = r0.A1
                    java.lang.Object r0 = r0.get()
                    uB3 r0 = (defpackage.InterfaceC10318uB3) r0
                    Ap3 r0 = r0.m()
                    goto L5a
                L36:
                    Ed2 r0 = r0.z1
                    if (r0 == 0) goto L59
                    boolean r1 = defpackage.AbstractC12248zp3.a(r0)
                    if (r1 != 0) goto L41
                    goto L59
                L41:
                    java.lang.Object r0 = r0.get()
                    lj3 r0 = (defpackage.InterfaceC7408lj3) r0
                    tj3 r0 = (defpackage.C10154tj3) r0
                    org.chromium.chrome.browser.tasks.tab_management.n r1 = r0.A
                    if (r1 == 0) goto L52
                    Ap3 r0 = r1.m()
                    goto L5a
                L52:
                    oj3 r1 = new oj3
                    r1.<init>()
                    r0 = r1
                    goto L5a
                L59:
                    r0 = 0
                L5a:
                    if (r0 == 0) goto L6d
                    if (r2 != 0) goto L6c
                    java.lang.Object r0 = r0.get()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L6b
                    goto L6c
                L6b:
                    r3 = r4
                L6c:
                    r2 = r3
                L6d:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.CQ.get():java.lang.Object");
            }
        } : null);
        this.p1 = new C3854bO();
        new C6895kD3(this.D, abstractC11276wz3);
        C8385oa2 c8385oa2 = this.s0;
        boolean z = this.L;
        if (DeviceFormFactor.a(this) && UN.T.a()) {
            new U04(abstractC11276wz3, c8385oa2, z);
        }
        boolean m2 = m2();
        if (m2) {
            AbstractC1868Oj3.a.i = true;
        }
        if (UN.f11473J.a()) {
            C5352fk3 c5352fk3 = new C5352fk3(this.H, this.G, k1(), (AbstractC11276wz3) s1(), m2, new InterfaceC0079Ap3() { // from class: FQ
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    I53 i53 = ChromeTabbedActivity.M1;
                    C9707sQ3 c9707sQ3 = ChromeTabbedActivity.this.H0.x;
                    if (c9707sQ3 == null) {
                        return null;
                    }
                    return c9707sQ3.Y;
                }
            });
            this.w1.p(c5352fk3);
            C8571p6 c8571p6 = this.z0;
            c8571p6.getClass();
            c5352fk3.d.a(new C7884n6(c8571p6));
        }
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void w0() {
        super.w0();
        if (AbstractC5241fQ2.d(this) && B0() && !this.M) {
            TraceEvent i = TraceEvent.i("ChromeTabbedActivity.prepareToShowStartPagePreNative", null);
            try {
                k2();
                CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.r0.g;
                compositorViewHolder.k = this.V0;
                compositorViewHolder.t();
                if (m2()) {
                    this.V0.R(this.Z0);
                    this.g1 = Boolean.valueOf(C1096Il0.a(this));
                    i2();
                }
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final AbstractC9561rz3 a1() {
        LZ1 lz1 = this.T0;
        JD3 jd3 = new JD3(lz1 != null && lz1.l());
        this.Y0 = jd3;
        return jd3;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final AbstractC0247Bx1 X0() {
        return new FD3(this);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [sR] */
    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC0560Ei
    public final InterfaceC2379Si E() {
        return new GD3(this, this.A0, this.E, (AbstractC11276wz3) s1(), this.H0.x, getWindow().getDecorView(), this.y1, AbstractC5241fQ2.d(this) ? this.z1 : null, this.b0, new Mm4() { // from class: sR
            @Override // defpackage.Mm4
            public final void a() {
                I53 i53 = ChromeTabbedActivity.M1;
                ChromeTabbedActivity.this.b(false).f(2, S32.b());
            }
        }, N(), z(), this.H0.u);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [qR] */
    /* JADX WARN: Type inference failed for: r1v8, types: [rR] */
    /* JADX WARN: Type inference failed for: r6v0, types: [pR] */
    public static ID3 Q1(final ChromeTabbedActivity chromeTabbedActivity) {
        ChromeTabbedActivity chromeTabbedActivity2;
        if (chromeTabbedActivity.D1 == null) {
            C10333uE3 c10333uE3 = (C10333uE3) chromeTabbedActivity.H0;
            if (c10333uE3.V0 == null) {
                c10333uE3.V0 = new G10(new IC[0]);
            }
            G10 g10 = c10333uE3.V0;
            K63 k63 = chromeTabbedActivity.U;
            C4559dR2 c4559dR2 = chromeTabbedActivity.H0;
            InterfaceC0079Ap3 interfaceC0079Ap3 = c4559dR2.B0;
            final C10333uE3 c10333uE32 = (C10333uE3) c4559dR2;
            ?? r6 = new Runnable() { // from class: pR
                @Override // java.lang.Runnable
                public final void run() {
                    final CH2 ch2 = C10333uE3.this.L0;
                    ch2.getClass();
                    C7928nE c7928nE = UN.a;
                    if (N.M09VlOh_("ReadLater")) {
                        View view = ch2.c;
                        C12180ze1 c12180ze1 = new C12180ze1(view.getContext().getResources(), "IPH_ReadLaterAppMenuBookmarkThisPage", R.string.f84210_resource_name_obfuscated_res_0x7f140939, R.string.f84210_resource_name_obfuscated_res_0x7f140939);
                        c12180ze1.h = view;
                        c12180ze1.i = new Runnable() { // from class: zH2
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((C1340Ki) CH2.this.b).h(Integer.valueOf(R.id.bookmark_this_page_id));
                            }
                        };
                        c12180ze1.k = new AH2(ch2);
                        ch2.a.a(c12180ze1.a());
                    }
                }
            };
            m mVar = c4559dR2.C;
            CC k1 = chromeTabbedActivity.k1();
            ZU0 q1 = chromeTabbedActivity.q1();
            C0649Ez3 c0649Ez3 = chromeTabbedActivity.W;
            C8385oa2 c8385oa2 = chromeTabbedActivity.r0;
            C8385oa2 c8385oa22 = chromeTabbedActivity.y;
            C4212cR c4212cR = new C4212cR(chromeTabbedActivity);
            CC k12 = chromeTabbedActivity.k1();
            C6166i6 c6166i6 = chromeTabbedActivity.A0;
            I5 i5 = chromeTabbedActivity.D;
            C10285u6 c10285u6 = chromeTabbedActivity.H;
            ?? r1 = new InterfaceC0079Ap3() { // from class: qR
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return Long.valueOf(ChromeTabbedActivity.this.K);
                }
            };
            ?? r12 = new InterfaceC7913nB() { // from class: rR
                @Override // defpackage.InterfaceC7913nB
                public final boolean a() {
                    return ChromeTabbedActivity.this.M;
                }
            };
            C6434it1 c6434it1 = chromeTabbedActivity.r1;
            C9707sQ3 c9707sQ3 = chromeTabbedActivity.H0.x;
            Objects.requireNonNull(c9707sQ3);
            XU0 xu0 = (XU0) q1;
            chromeTabbedActivity2 = chromeTabbedActivity;
            chromeTabbedActivity2.D1 = new ID3(chromeTabbedActivity, g10, k63, interfaceC0079Ap3, r6, mVar, chromeTabbedActivity, k1, xu0, chromeTabbedActivity, c0649Ez3, c8385oa2, c8385oa22, c4212cR, k12, c6166i6, i5, c10285u6, r1, r12, c6434it1, new C7993nR(c9707sQ3), new C4270cc0());
        } else {
            chromeTabbedActivity2 = chromeTabbedActivity;
        }
        return chromeTabbedActivity2.D1;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final Pair Z0() {
        ER er = AbstractC5241fQ2.d(this) ? new ER(this) : null;
        C10285u6 c10285u6 = this.H;
        InterfaceC0079Ap3 interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: oR
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeTabbedActivity.Q1(ChromeTabbedActivity.this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        };
        C10505ul c10505ul = AbstractC10848vl.a;
        C0649Ez3 c0649Ez3 = this.W;
        C8385oa2 c8385oa2 = this.r0;
        return Pair.create(new C8332oQ(this, c10285u6, interfaceC0079Ap3, false, er, c10505ul, c0649Ez3, c8385oa2), new C8332oQ(this, c10285u6, new InterfaceC0079Ap3() { // from class: oR
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeTabbedActivity.Q1(ChromeTabbedActivity.this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, true, er, c10505ul, c0649Ez3, c8385oa2));
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void w1() {
        super.w1();
        C3637al0.b().a(new Runnable() { // from class: RQ
            /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r11 = this;
                    I53 r0 = org.chromium.chrome.browser.ChromeTabbedActivity.M1
                    org.chromium.chrome.browser.ChromeTabbedActivity r0 = org.chromium.chrome.browser.ChromeTabbedActivity.this
                    java.lang.String r1 = "activity"
                    java.lang.Object r1 = r0.getSystemService(r1)
                    android.app.ActivityManager r1 = (android.app.ActivityManager) r1
                    java.lang.String r2 = "MemoryAndroid.DeviceMemoryClass"
                    int r1 = r1.getMemoryClass()
                    defpackage.EI2.m(r1, r2)
                    org.chromium.chrome.browser.LauncherShortcutActivity.a(r0)
                    wz3 r1 = r0.Z0
                    u6 r2 = r0.H
                    dV1 r2 = defpackage.AbstractC5609gV1.a(r2)
                    AX r3 = defpackage.AX.e()
                    java.lang.String r4 = "force-enable-chrome-survey"
                    boolean r3 = r3.g(r4)
                    r4 = 0
                    java.lang.String r5 = "ChromeSurveyNextAndroid"
                    if (r3 != 0) goto L3a
                    nE r3 = defpackage.UN.a
                    boolean r3 = J.N.M09VlOh_(r5)
                    if (r3 == 0) goto L38
                    goto L3a
                L38:
                    r3 = r4
                    goto L3b
                L3a:
                    r3 = 1
                L3b:
                    if (r3 == 0) goto L83
                    AX r3 = defpackage.AX.e()
                    java.lang.String r6 = "survey_override_site_id"
                    boolean r7 = r3.g(r6)
                    java.lang.String r8 = "site-id"
                    if (r7 == 0) goto L50
                    java.lang.String r3 = r3.f(r6)
                    goto L56
                L50:
                    nE r3 = defpackage.UN.a
                    java.lang.String r3 = J.N.MMltG$kc(r5, r8)
                L56:
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L5d
                    goto L83
                L5d:
                    fQ r3 = new fQ
                    gQ r7 = new gQ
                    AX r9 = defpackage.AX.e()
                    boolean r10 = r9.g(r6)
                    if (r10 == 0) goto L70
                    java.lang.String r5 = r9.f(r6)
                    goto L76
                L70:
                    nE r6 = defpackage.UN.a
                    java.lang.String r5 = J.N.MMltG$kc(r5, r8)
                L76:
                    I5 r6 = r0.D
                    r7.<init>(r5, r6, r0, r2)
                    r3.<init>(r7, r1)
                    xl r1 = defpackage.AbstractC0185Bl.e
                    r3.c(r1)
                L83:
                    Ed2 r1 = r0.z1
                    java.lang.Object r2 = r1.get()
                    if (r2 == 0) goto Ld1
                    gy1 r2 = r0.W1()
                    int r2 = r2.o()
                    r3 = 2
                    if (r2 == r3) goto Lc2
                    gy1 r2 = r0.W1()
                    Wx1 r2 = r2.s
                    if (r2 == 0) goto La3
                    int r2 = r2.m()
                    goto La4
                La3:
                    r2 = r4
                La4:
                    if (r2 == r3) goto La7
                    goto Lc2
                La7:
                    gy1 r1 = r0.W1()
                    Wx1 r1 = r1.s
                    if (r1 == 0) goto Lb3
                    int r4 = r1.m()
                Lb3:
                    if (r4 != r3) goto Ld1
                    gy1 r1 = r0.W1()
                    FR r2 = new FR
                    r2.<init>(r0)
                    r1.e(r2)
                    goto Ld1
                Lc2:
                    java.lang.Object r1 = r1.get()
                    lj3 r1 = (defpackage.InterfaceC7408lj3) r1
                    boolean r2 = r0.u1
                    long r3 = r0.G
                    tj3 r1 = (defpackage.C10154tj3) r1
                    r1.g(r3, r2)
                Ld1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RQ.run():void");
            }
        });
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void L1(long j) {
        super.L1(j);
        EI2.g("MobileStartup.IntentToCreationTime.TabbedMode", j, 1L, 30000L, 50);
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final boolean C0(Intent intent) {
        boolean z;
        boolean z2;
        this.K1 = 0;
        Bundle bundle = this.I;
        int p = AbstractC2281Ro1.p(-1, intent, "org.chromium.chrome.browser.window_id");
        if (!AbstractC2281Ro1.h(intent)) {
            p = -1;
        }
        if (bundle != null && bundle.containsKey("window_index")) {
            this.K1 = bundle.getInt("window_index", 0);
        } else if (this.T0 != null) {
            this.K1 = this.T0.h(p, getTaskId(), AbstractC2281Ro1.j(intent, "com.android.chrome.prefer_new", false));
        }
        if (this.K1 == -1) {
            AbstractC4851eH1.d("ChromeTabbedActivity", "Window ID not allocated. Finishing the activity", new Object[0]);
            ZN3.b(R.string.f76890_resource_name_obfuscated_res_0x7f140611, 1, this).d();
            return false;
        }
        LZ1 lz1 = this.T0;
        if (lz1 != null) {
            int taskId = getTaskId();
            lz1.m = taskId;
            int i = LZ1.s;
            boolean z3 = (i == 0 || i == taskId) ? false : true;
            if (lz1.l() && LZ1.s != 0) {
                Iterator<ActivityManager.AppTask> it = ((ActivityManager) lz1.h.getSystemService("activity")).getAppTasks().iterator();
                while (it.hasNext()) {
                    ActivityManager.RecentTaskInfo d = AbstractC2599Ua.d(it.next());
                    if (d != null && d.id == LZ1.s) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z3 && z) {
                LZ1.s = 0;
                z2 = false;
            } else {
                if (!z) {
                    LZ1.s = 0;
                }
                z2 = true;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC7679mX
    public final void M() {
        ((AbstractC11276wz3) s1()).j(true).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC9377rT1
    public final boolean Y(int i, boolean z) {
        Profile b;
        Tab g1 = g1();
        boolean z2 = false;
        byte b2 = g1 != null && T34.k(g1.getUrl());
        OTRProfileID oTRProfileID = null;
        if (i == R.id.new_tab_menu_id) {
            ((AbstractC11276wz3) s1()).j(false).l();
            FI2.a("MobileMenuNewTab");
            FI2.a("MobileNewTabOpened");
            AbstractC5241fQ2.g("Chrome.StartSurface.OpenNewTabPageCount");
            e2(false);
            if (z) {
                FI2.a("MobileMenuNewTab.AppMenu");
            }
            b(false).e();
            this.h1.c(this, null);
        } else if (i == R.id.new_incognito_tab_menu_id) {
            if (N.M$3vpOHw()) {
                ((AbstractC11276wz3) s1()).j(false).l();
                FI2.a("MobileMenuNewIncognitoTab");
                FI2.a("MobileNewTabOpened");
                AbstractC5241fQ2.g("Chrome.StartSurface.OpenNewTabPageCount");
                e2(true);
                if (z) {
                    FI2.a("MobileMenuNewIncognitoTab.AppMenu");
                }
                b(true).e();
                LU3.a(Profile.d()).notifyEvent("app_menu_new_incognito_tab_clicked");
            }
        } else if (i == R.id.all_bookmarks_menu_id) {
            ((CompositorViewHolder) this.r0.g).q(new Runnable() { // from class: zQ
                @Override // java.lang.Runnable
                public final void run() {
                    I53 i53 = ChromeTabbedActivity.M1;
                    ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                    WA.f(chromeTabbedActivity, null, chromeTabbedActivity.o1().isIncognito());
                }
            });
            if (b2 != false) {
                R32.a(6);
            }
            EI2.h(o1().isIncognito() ? 1 : 0, 6, "Bookmarks.OpenBookmarkManager.PerProfileType");
            FI2.a("MobileMenuAllBookmarks");
        } else if (i == R.id.recent_tabs_menu_id) {
            LoadUrlParams loadUrlParams = new LoadUrlParams("chrome-native://recent-tabs/", 2);
            boolean A1 = A1();
            if (A1 && !this.L && AbstractC5241fQ2.d(this)) {
                AbstractC5241fQ2.b(loadUrlParams, false, Boolean.valueOf(o1().isIncognito()), null);
            } else if (g1 != null) {
                g1.d(loadUrlParams);
            } else {
                b(o1().isIncognito()).b(2, null, loadUrlParams);
            }
            if (A1) {
                this.V0.d0(1, true);
            }
            if (b2 != false) {
                R32.a(4);
            }
            FI2.a("MobileMenuRecentTabs");
            AbstractC5241fQ2.g("Chrome.StartSurface.OpenRecentTabCount");
        } else if (i == R.id.close_tab) {
            o1().k(g1, true, true);
            FI2.a("MobileTabClosed");
        } else {
            C8385oa2 c8385oa2 = this.y;
            if (i == R.id.close_all_tabs_menu_id) {
                AbstractC6295iV.a(this, c8385oa2, new Runnable() { // from class: AQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        ((AbstractC11276wz3) ChromeTabbedActivity.this.s1()).d(false);
                    }
                }, false);
                FI2.a("MobileMenuCloseAllTabs");
            } else if (i == R.id.close_all_incognito_tabs_menu_id) {
                AbstractC6295iV.a(this, c8385oa2, new Runnable() { // from class: BQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                        ((AbstractC11276wz3) ChromeTabbedActivity.this.s1()).j(true).j();
                    }
                }, true);
                FI2.a("MobileMenuCloseAllIncognitoTabs");
            } else if (i == R.id.focus_url_bar) {
                if (!A1() && (!this.L || o1().getCount() != 0)) {
                    z2 = true;
                }
                if (z2) {
                    this.H0.x.k(11, true);
                }
            } else if (i == R.id.downloads_menu_id) {
                if (g1 != null && g1.b() != null && (b = Profile.b(g1.b())) != null) {
                    oTRProfileID = b.a;
                }
                DownloadUtils.showDownloadManager(this, g1, oTRProfileID, 9, false);
                if (b2 != false) {
                    R32.a(7);
                }
                FI2.a("MobileMenuDownloadManager");
            } else if (i == R.id.open_recently_closed_tab) {
                TabModel g = this.Z0.g();
                if (!g.isIncognito()) {
                    g.a();
                }
                FI2.a("MobileTabClosedUndoShortCut");
            } else if (i == R.id.enter_vr_id) {
                VrModuleProvider.b().f();
            } else {
                return super.Y(i, z);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    @Override // org.chromium.chrome.browser.app.ChromeActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v1() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.v1():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [jR] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gR] */
    /* JADX WARN: Type inference failed for: r5v0, types: [hR] */
    public final void Z1() {
        C4897eQ2 c4897eQ2 = this.G1;
        C0538Ed2 c0538Ed2 = this.y1;
        C0649Ez3 c0649Ez3 = this.W;
        C9861ss c9861ss = this.M0;
        if (c4897eQ2 == null) {
            C4897eQ2 c4897eQ22 = new C4897eQ2(c0538Ed2, c0649Ez3, new Runnable() { // from class: gR
                @Override // java.lang.Runnable
                public final void run() {
                    I53 i53 = ChromeTabbedActivity.M1;
                    ChromeTabbedActivity.this.f2();
                }
            });
            this.G1 = c4897eQ22;
            c9861ss.a(c4897eQ22, 15);
        }
        if (this.H1 == null && !this.L) {
            QH2 qh2 = new QH2(c0649Ez3);
            this.H1 = qh2;
            c9861ss.a(qh2, 16);
        }
        if (this.I1 == null && !this.L) {
            UB3 ub3 = new UB3(c0538Ed2, this.z1, new Runnable() { // from class: hR
                @Override // java.lang.Runnable
                public final void run() {
                    ChromeTabbedActivity.this.V0.d0(1, true);
                }
            });
            this.I1 = ub3;
            c9861ss.a(ub3, 10);
        }
        if (this.J1 == null) {
            BX1 bx1 = new BX1(c0649Ez3, new C6275iR(this), new Callback() { // from class: jR
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    I53 i53 = ChromeTabbedActivity.M1;
                    ChromeTabbedActivity.this.h2((Tab) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            });
            this.J1 = bx1;
            c9861ss.a(bx1, 17);
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final boolean S0(Tab tab) {
        if (!tab.isInitialized()) {
            return false;
        }
        int launchType = tab.getLaunchType();
        return launchType == 0 || launchType == 1 || launchType == 18 || launchType == 4 || launchType == 16 || launchType == 5 || launchType == 14 || launchType == 17 || (launchType == 3 && C1695Nb0.m(tab).q != -1);
    }

    public final void h2(final Tab tab) {
        AbstractC4851eH1.d("ChromeTabbedActivity", "sendToBackground(): " + tab, new Object[0]);
        moveTaskToBack(true);
        if (tab != null) {
            this.B.postDelayed(new Runnable() { // from class: vR
                @Override // java.lang.Runnable
                public final void run() {
                    I53 i53 = ChromeTabbedActivity.M1;
                    ChromeTabbedActivity chromeTabbedActivity = ChromeTabbedActivity.this;
                    chromeTabbedActivity.getClass();
                    C7928nE c7928nE = UN.a;
                    boolean M09VlOh_ = N.M09VlOh_("MostRecentTabOnBackgroundCloseTab");
                    TabModel o1 = chromeTabbedActivity.o1();
                    Tab tab2 = tab;
                    Tab c = o1.c(tab2.getId(), M09VlOh_);
                    chromeTabbedActivity.o1().d(tab2, c, true, false);
                    if (c != null || chromeTabbedActivity.m()) {
                        return;
                    }
                    chromeTabbedActivity.n2(5, 0);
                }
            }, 500L);
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, android.app.Activity
    public final boolean moveTaskToBack(boolean z) {
        try {
            return super.moveTaskToBack(z);
        } catch (NullPointerException unused) {
            finish();
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void S1(ChromeTabbedActivity chromeTabbedActivity, LoadUrlParams loadUrlParams, String str, boolean z, Intent intent) {
        String str2;
        if (chromeTabbedActivity.f1 && !T34.j(loadUrlParams.a)) {
            chromeTabbedActivity.W1().d0(1, false);
            C9707sQ3 c9707sQ3 = chromeTabbedActivity.H0.x;
            if (c9707sQ3.s0) {
                c9707sQ3.k.b();
            }
        }
        if (AbstractC2281Ro1.h(intent)) {
            boolean j = AbstractC2281Ro1.j(intent, "com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", false);
            Integer num = (Integer) AbstractC2281Ro1.t(intent, "org.chromium.chrome.browser.tab_launch_type");
            if (num == null) {
                if (AbstractC2281Ro1.j(intent, "com.android.chrome.invoked_from_shortcut", false)) {
                    num = 7;
                } else if (AbstractC2281Ro1.j(intent, "com.android.chrome.invoked_from_app_widget", false)) {
                    num = 15;
                } else if (IncognitoTabLauncher.a(intent)) {
                    num = 10;
                } else {
                    num = 0;
                }
            }
            C8332oQ b = chromeTabbedActivity.b(j);
            Tab i = b.i(loadUrlParams, num.intValue(), null, intent);
            List list = (List) AbstractC2281Ro1.t(intent, "org.chromium.chrome.browser.additional_urls");
            boolean j2 = AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.open_additional_urls_in_tab_group", false);
            if (list != null) {
                Tab tab = j2 ? i : null;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (tab == null) {
                        str2 = (String) list.get(i2);
                    } else {
                        str2 = (String) list.get((list.size() - i2) - 1);
                    }
                    LoadUrlParams loadUrlParams2 = new LoadUrlParams(loadUrlParams.a, 0);
                    loadUrlParams2.b = loadUrlParams.b;
                    loadUrlParams2.c = loadUrlParams.c;
                    loadUrlParams2.d = loadUrlParams.d;
                    loadUrlParams2.e = loadUrlParams.e;
                    if (loadUrlParams.f != null) {
                        loadUrlParams2.f = new HashMap(loadUrlParams.f);
                    }
                    loadUrlParams2.g = loadUrlParams.g;
                    loadUrlParams2.h = loadUrlParams.h;
                    loadUrlParams2.i = loadUrlParams.i;
                    loadUrlParams2.j = loadUrlParams.j;
                    loadUrlParams2.k = loadUrlParams.k;
                    loadUrlParams2.l = loadUrlParams.l;
                    loadUrlParams2.m = loadUrlParams.m;
                    loadUrlParams2.n = loadUrlParams.n;
                    loadUrlParams2.o = loadUrlParams.o;
                    loadUrlParams2.p = loadUrlParams.p;
                    loadUrlParams2.q = loadUrlParams.q;
                    loadUrlParams2.r = loadUrlParams.r;
                    loadUrlParams2.s = loadUrlParams.s;
                    loadUrlParams2.a = str2;
                    b.b(3, tab, loadUrlParams2);
                }
                return;
            }
            return;
        }
        if (NH2.W0()) {
            if ((AbstractC2281Ro1.m("org.chromium.chrome.browser.dom_distiller.EXTRA_READER_MODE_PARENT", -1, intent.getExtras()) != -1) != false) {
                Bundle extras = intent.getExtras();
                int m = AbstractC2281Ro1.m("org.chromium.chrome.browser.dom_distiller.EXTRA_READER_MODE_PARENT", -1, extras);
                extras.remove("org.chromium.chrome.browser.dom_distiller.EXTRA_READER_MODE_PARENT");
                if (m != -1 && chromeTabbedActivity.Z0 != null) {
                    chromeTabbedActivity.n1().i(new LoadUrlParams(loadUrlParams.a, 0), 0, chromeTabbedActivity.Z0.m(m), null);
                    return;
                }
            }
        }
        C8332oQ b2 = chromeTabbedActivity.b(false);
        boolean equals = TextUtils.equals(str, b2.a.getPackageName());
        if (z || equals) {
            b2.i(loadUrlParams, !equals ? 1 : 0, null, intent);
            return;
        }
        if (str == null) {
            str = "com.google.android.apps.chrome.unknown_app";
        }
        for (int i3 = 0; i3 < b2.d.getCount(); i3++) {
            Tab tabAt = b2.d.getTabAt(i3);
            C1663Mu3 c1663Mu3 = (C1663Mu3) tabAt.F().b(C1663Mu3.class);
            if (str.equals(c1663Mu3 != null ? c1663Mu3.g : null)) {
                C1663Mu3.e(b2.h(loadUrlParams, 1, null, i3, intent)).g = str;
                b2.d.k(tabAt, false, false);
                return;
            }
        }
        C1663Mu3.e(b2.i(loadUrlParams, 1, null, intent)).g = str;
    }

    public final void n2(int i, int i2) {
        AbstractC5777gy1 abstractC5777gy1;
        Boolean bool = this.g1;
        if (bool != null && bool.booleanValue() && (abstractC5777gy1 = this.V0) != null) {
            abstractC5777gy1.d0(2, false);
        } else {
            C0538Ed2 c0538Ed2 = this.z1;
            if (c0538Ed2.get() != null) {
                if (AbstractC5241fQ2.j(this) || !C10648v91.d()) {
                    i = 4;
                }
                ((C10154tj3) ((InterfaceC7408lj3) c0538Ed2.get())).c.A(i, i2);
            }
        }
        if (this.V0 == null) {
            return;
        }
        boolean A1 = A1();
        C8385oa2 c8385oa2 = this.r0;
        if (A1) {
            if (this.n0) {
                ((CompositorViewHolder) c8385oa2.g).q(new Runnable() { // from class: wR
                    @Override // java.lang.Runnable
                    public final void run() {
                        I53 i53 = ChromeTabbedActivity.M1;
                    }
                });
                return;
            }
            return;
        }
        if (g1() == null) {
            this.V0.d0(2, false);
            return;
        }
        ((CompositorViewHolder) c8385oa2.g).q(new Runnable() { // from class: xR
            @Override // java.lang.Runnable
            public final void run() {
                ChromeTabbedActivity.this.V0.d0(2, true);
            }
        });
        Tab g1 = g1();
        WebContents b = g1 != null ? g1.b() : null;
        if (b != null) {
            WebContentsAccessibilityImpl.k(b).E(false);
        }
        TabModel o1 = o1();
        int count = o1.getCount();
        if (count == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < count; i7++) {
            Integer num = C1695Nb0.m(o1.getTabAt(i7)).x;
            if (num != null) {
                if (num.intValue() == 2 || num.intValue() == 12 || num.intValue() == 5 || num.intValue() == 7 || num.intValue() == 15 || num.intValue() == 17) {
                    i3++;
                } else if (num.intValue() == 4 || num.intValue() == 16) {
                    i4++;
                } else if (num.intValue() == 1 || num.intValue() == 10) {
                    i5++;
                }
            }
            i6++;
        }
        EI2.e(i3, "Tabs.Tasks.TabCreated.Count.FromManuallyCreated");
        EI2.e(i4, "Tabs.Tasks.TabCreated.Count.FromTargetBlank");
        EI2.e(i5, "Tabs.Tasks.TabCreated.Count.FromExternalApp");
        EI2.e(i6, "Tabs.Tasks.TabCreated.Count.FromOthers");
        EI2.l((i3 * 100) / count, "Tabs.Tasks.TabCreated.Percent.FromManuallyCreated");
        EI2.l((i4 * 100) / count, "Tabs.Tasks.TabCreated.Percent.FromTargetBlank");
        EI2.l((i5 * 100) / count, "Tabs.Tasks.TabCreated.Percent.FromExternalApp");
        EI2.l((i6 * 100) / count, "Tabs.Tasks.TabCreated.Percent.FromOthers");
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LM, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        byte[] encoded;
        byte[] bArr;
        super.onSaveInstanceState(bundle);
        YR b = ZR.a.b(false);
        if (b != null && (encoded = b.a.getEncoded()) != null && (bArr = b.b) != null) {
            bundle.putByteArray("org.chromium.content.browser.crypto.CipherFactory.KEY", encoded);
            bundle.putByteArray("org.chromium.content.browser.crypto.CipherFactory.IV", bArr);
        }
        bundle.putInt("window_index", ED3.a().a(this));
        Boolean valueOf = Boolean.valueOf(o1().isIncognito());
        bundle.putBoolean("is_incognito_selected", valueOf.booleanValue());
        if (valueOf.booleanValue() && ProfileManager.b) {
            AndroidSessionDurationsServiceState androidSessionDurationsServiceState = (AndroidSessionDurationsServiceState) N.M2YjxH3n(o1().b());
            bundle.putLong("incognito_session_startup_time", androidSessionDurationsServiceState.getSessionStartTime());
            bundle.putLong("incognito_session_last_reported_duration", androidSessionDurationsServiceState.getLastReportedDuration());
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void G1() {
        C8201o12 c8201o12;
        R32 r32;
        Q32 q32;
        AppBarLayout appBarLayout;
        ArrayList arrayList;
        QH2 qh2 = this.H1;
        if (qh2 != null) {
            PH2 ph2 = qh2.i;
            if (ph2 != null) {
                ph2.a();
                qh2.i = null;
            }
            this.H1 = null;
        }
        UB3 ub3 = this.I1;
        if (ub3 != null) {
            InterfaceC0408Dd2 interfaceC0408Dd2 = ub3.a;
            if (interfaceC0408Dd2.i()) {
                ((C9897sy1) ((InterfaceC1422Ky1) interfaceC0408Dd2.get())).L(ub3);
            }
            InterfaceC0408Dd2 interfaceC0408Dd22 = ub3.g;
            if (interfaceC0408Dd22.i()) {
                ((C10154tj3) ((InterfaceC7408lj3) interfaceC0408Dd22.get())).c.l.d(ub3);
            }
            this.I1 = null;
        }
        BX1 bx1 = this.J1;
        if (bx1 != null) {
            AX1 ax1 = bx1.k;
            if (ax1 != null) {
                ax1.a();
            }
            this.J1 = null;
        }
        C9608s72 c9608s72 = this.F1;
        if (c9608s72 != null) {
            C9608s72.h.b(c9608s72);
            this.F1 = null;
        }
        C4496dF c4496dF = this.C1;
        if (c4496dF != null) {
            c4496dF.a();
            this.C1 = null;
        }
        DR dr = this.a1;
        if (dr != null) {
            dr.destroy();
            this.a1 = null;
        }
        V71 v71 = this.c1;
        if (v71 != null) {
            v71.a.i(v71);
        }
        BR br = this.b1;
        if (br != null) {
            br.a();
        }
        J04 j04 = this.U0;
        if (j04 != null) {
            TabModel j = ((AbstractC11276wz3) j04.a).j(false);
            if (j != null) {
                j.i(j04.g);
            }
            C4496dF c4496dF2 = j04.j;
            if (c4496dF2 != null) {
                c4496dF2.a();
                j04.j = null;
            }
            this.U0 = null;
        }
        C12196zh c12196zh = this.i1;
        if (c12196zh != null) {
            C11510xh c11510xh = c12196zh.b;
            if (c11510xh != null) {
                c11510xh.destroy();
            }
            this.i1 = null;
        }
        C0538Ed2 c0538Ed2 = this.z1;
        if (c0538Ed2.get() != null) {
            C10154tj3 c10154tj3 = (C10154tj3) ((InterfaceC7408lj3) c0538Ed2.get());
            c10154tj3.f();
            C9468rj3 c9468rj3 = c10154tj3.K;
            if (c9468rj3 != null) {
                C4505dG3 c4505dG3 = c10154tj3.y;
                if (c4505dG3 != null && (appBarLayout = c4505dG3.b.F) != null && (arrayList = appBarLayout.m) != null) {
                    arrayList.remove(c9468rj3);
                }
                c10154tj3.K = null;
            }
        }
        C5696gk3 c5696gk3 = this.w1;
        if (c5696gk3 != null) {
            c5696gk3.s();
        }
        C6434it1 c6434it1 = this.r1;
        if (c6434it1 != null) {
            if (C6434it1.c) {
                C4030bt1 c4030bt1 = c6434it1.a;
                c4030bt1.h.getClass();
                ApplicationStatus.h(c4030bt1);
                c4030bt1.a();
                WindowOnFrameMetricsAvailableListenerC9724sU0 windowOnFrameMetricsAvailableListenerC9724sU0 = c4030bt1.a;
                windowOnFrameMetricsAvailableListenerC9724sU0.b.set(false);
                c4030bt1.c();
                Activity activity = (Activity) c4030bt1.j.get();
                if (activity != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC9724sU0);
                }
                c4030bt1.i.a = true;
            }
            this.r1 = null;
        }
        C11187wk1.a().a.remove(this.L1);
        if (t1() != null) {
            t1().b.d(this.k1);
            t1().b.d(this.l1);
        }
        if (this.L) {
            C10021tL f = C10021tL.f();
            CompositorViewHolder compositorViewHolder = this.k1;
            if (f.c == null) {
                f.c = new C12157za2();
            }
            f.c.d(compositorViewHolder);
        }
        C10021tL f2 = C10021tL.f();
        if (f2.c == null) {
            f2.c = new C12157za2();
        }
        f2.c.d(this);
        C10021tL f3 = C10021tL.f();
        AbstractC5777gy1 abstractC5777gy1 = this.V0;
        if (f3.c == null) {
            f3.c = new C12157za2();
        }
        f3.c.d(abstractC5777gy1);
        ID3 id3 = this.D1;
        if (id3 != null && (c8201o12 = id3.x) != null && (r32 = c8201o12.o) != null && (q32 = r32.e) != null) {
            ((AbstractC11276wz3) r32.a).s(q32);
        }
        C2764Vh c2764Vh = this.E1;
        C2504Th c2504Th = c2764Vh.b;
        I5 i5 = c2764Vh.a;
        i5.c(c2504Th);
        i5.c(c2764Vh.c);
        C9130qk1 c9130qk1 = c2764Vh.j;
        c9130qk1.b.c(c9130qk1.g);
        c9130qk1.j.a();
        C8385oa2 c8385oa2 = (C8385oa2) c9130qk1.a;
        c8385oa2.n(c9130qk1.i);
        Object obj = c8385oa2.g;
        if (obj != null) {
            ((AbstractC11276wz3) ((InterfaceC10590uz3) obj)).s(c9130qk1.h);
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void c1() {
        JD3 jd3 = this.Y0;
        if (jd3 != null) {
            jd3.b();
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC6817k00, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (!C10712vM.f(i)) {
            return;
        }
        C5795h12 c5795h12 = C5795h12.b;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = c5795h12.a;
            if (i2 < arrayList.size()) {
                Tab tab = (Tab) ((WeakReference) arrayList.get(i2)).get();
                if (tab != null) {
                    tab.A();
                }
                i2++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override // androidx.appcompat.app.a, defpackage.AbstractActivityC6817k00, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean c = AbstractC10910vv1.c(keyEvent, this.f1, (XU0) q1(), this);
        return c != null ? c.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [DQ] */
    @Override // androidx.appcompat.app.a, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1) {
            if (i != 4 || this.L || ((XU0) q1()).g()) {
                return AbstractC10910vv1.d(keyEvent, !A1() && (!this.L || o1().getCount() != 0), true, (AbstractC11276wz3) s1(), this, this.H0.x) || super.onKeyDown(i, keyEvent);
            }
            if (this.j1 == null) {
                this.j1 = new Runnable() { // from class: DQ
                    /* JADX WARN: Type inference failed for: r3v4, types: [eE3] */
                    /* JADX WARN: Type inference failed for: r5v0, types: [dE3] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Tab tab;
                        I53 i53 = ChromeTabbedActivity.M1;
                        final C10333uE3 c10333uE3 = (C10333uE3) ChromeTabbedActivity.this.H0;
                        if (c10333uE3.h == null || (tab = (Tab) c10333uE3.l.g) == null || tab.b() == null || !tab.isUserInteractable()) {
                            return;
                        }
                        C3395a22 c3395a22 = new C3395a22(c10333uE3.h.getWindow().getDecorView().findViewById(android.R.id.content), c10333uE3.h, new InterfaceC0079Ap3() { // from class: dE3
                            @Override // defpackage.InterfaceC0079Ap3
                            public final /* synthetic */ boolean i() {
                                return AbstractC12248zp3.a(this);
                            }

                            @Override // defpackage.InterfaceC0079Ap3
                            public final Object get() {
                                return C10333uE3.this.C;
                            }
                        }, Profile.b(tab.b()));
                        c10333uE3.U0 = c3395a22;
                        c3395a22.o = new C10676vE3(tab, new InterfaceC11646y40() { // from class: eE3
                            @Override // defpackage.InterfaceC11646y40
                            public final void accept(Object obj) {
                                Tab tab2 = (Tab) obj;
                                C10333uE3 c10333uE32 = C10333uE3.this;
                                a aVar = c10333uE32.h;
                                C8385oa2 c8385oa2 = (C8385oa2) c10333uE32.U;
                                c8385oa2.getClass();
                                Y81.a(aVar, tab2, AbstractC12248zp3.a(c8385oa2) && ((AbstractC11276wz3) ((InterfaceC10590uz3) ((C8385oa2) c10333uE32.U).g)).o());
                            }
                        }, c10333uE3.h.getResources().getString(R.string.f86760_resource_name_obfuscated_res_0x7f140a40));
                        if (!c10333uE3.U0.i()) {
                            c10333uE3.U0 = null;
                        } else {
                            c10333uE3.C.a(new C7588mE3(c10333uE3));
                        }
                    }
                };
            }
            this.B.postDelayed(this.j1, ViewConfiguration.getLongPressTimeout());
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        list.addAll(AbstractC10910vv1.b(this));
    }

    public final AbstractC5777gy1 W1() {
        return (AbstractC5777gy1) ((CompositorViewHolder) this.r0.g).k;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [uR] */
    /* JADX WARN: Type inference failed for: r4v0, types: [OQ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ZQ] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kR] */
    /* JADX WARN: Type inference failed for: r9v0, types: [tR] */
    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.LM
    public final ZX1 p0() {
        ZX1 p0 = super.p0();
        this.e1 = new C4752dz3(this, this.D, p0, new InterfaceC0079Ap3() { // from class: OQ
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                I53 i53 = ChromeTabbedActivity.M1;
                C10333uE3 c10333uE3 = (C10333uE3) ChromeTabbedActivity.this.H0;
                if (c10333uE3.V0 == null) {
                    c10333uE3.V0 = new G10(new IC[0]);
                }
                return c10333uE3.V0;
            }
        }, new InterfaceC0079Ap3() { // from class: ZQ
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeTabbedActivity.this.t1();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new InterfaceC0079Ap3() { // from class: kR
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeTabbedActivity.this.H0.x;
            }
        }, this.u0, this.W, new InterfaceC0079Ap3() { // from class: tR
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeTabbedActivity.this.k1();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new InterfaceC0079Ap3() { // from class: uR
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeTabbedActivity.this.q1();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, this.M0);
        return p0;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC12202zi
    public final boolean X() {
        if (!this.f1) {
            return false;
        }
        Tab g1 = g1();
        if (g1 != null) {
            C2313Ru3 a = C2313Ru3.a(g1);
            Object obj = Boolean.FALSE;
            if (a.a.containsKey("isTabModalDialogShowing")) {
                obj = a.b("isTabModalDialogShowing");
            }
            if (((Boolean) obj).booleanValue()) {
                return false;
            }
        }
        return super.X();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final boolean A1() {
        AbstractC5777gy1 abstractC5777gy1 = this.V0;
        return abstractC5777gy1 != null && abstractC5777gy1.G(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:            if (r1 <= 0) goto L116;     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.m2():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f2() {
        /*
            r3 = this;
            org.chromium.chrome.browser.tab.Tab r0 = r3.g1()
            boolean r1 = r0.isIncognito()
            r2 = 0
            if (r1 == 0) goto L10
            wz3 r1 = r3.Z0
            r1.t(r2)
        L10:
            Pj3 r1 = defpackage.C1998Pj3.a(r0)
            if (r1 != 0) goto L18
            r1 = r2
            goto L1a
        L18:
            boolean r1 = r1.a
        L1a:
            if (r1 != 0) goto L2e
            Pj3 r1 = defpackage.C1998Pj3.a(r0)
            if (r1 != 0) goto L24
            r1 = r2
            goto L26
        L24:
            boolean r1 = r1.g
        L26:
            if (r1 == 0) goto L29
            goto L2e
        L29:
            r1 = 7
            r3.n2(r1, r2)
            goto L37
        L2e:
            r1 = 6
            r3.n2(r1, r2)
            java.lang.String r1 = "FromTab"
            defpackage.AbstractC5241fQ2.h(r1)
        L37:
            boolean r1 = r0.p()
            if (r1 == 0) goto L3e
            return
        L3e:
            boolean r1 = r0.isIncognito()
            if (r1 != 0) goto L56
            Pj3 r1 = defpackage.C1998Pj3.a(r0)
            if (r1 != 0) goto L4b
            goto L4d
        L4b:
            boolean r2 = r1.a
        L4d:
            if (r2 != 0) goto L62
            int r1 = r0.getLaunchType()
            r2 = 3
            if (r1 == r2) goto L62
        L56:
            gy1 r1 = r3.W1()
            GR r2 = new GR
            r2.<init>(r3, r0)
            r1.e(r2)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ChromeTabbedActivity.f2():void");
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final InterfaceC1631Mo1 W0() {
        return new HR(this);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.BV2
    public final void s(AbstractC2976Wx1 abstractC2976Wx1) {
        abstractC2976Wx1.getClass();
        if (abstractC2976Wx1 instanceof C0054Ak3) {
            return;
        }
        this.Z0.getClass();
    }

    public final void g2() {
        this.Y0.f();
        boolean z = false;
        Tab a = AbstractC1558Lz3.a(this.Z0.j(false));
        Q83 q83 = O83.a;
        if (a != null && N.M$l72hrq(a.getUrl().i())) {
            z = true;
        }
        q83.p("Chrome.StartSurface.IsLastVisitedTabSRP", z);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void H1() {
        this.X0.setVisibility(4);
        if (this.d1 == null) {
            this.d1 = new IC();
            C10333uE3 c10333uE3 = (C10333uE3) this.H0;
            if (c10333uE3.V0 == null) {
                c10333uE3.V0 = new G10(new IC[0]);
            }
            G10 g10 = c10333uE3.V0;
            IC ic = this.d1;
            g10.i.add(ic);
            ic.m(g10.j);
        }
        this.d1.p(2);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void I1() {
        this.X0.setVisibility(0);
        IC ic = this.d1;
        if (ic != null) {
            ic.p(3);
        }
    }

    @Override // defpackage.LM
    public final void o0() {
        super.o0();
        if (AbstractC3722az3.a() != null) {
            AbstractC3722az3.a().getClass();
            setTheme(R.style.f107030_resource_name_obfuscated_res_0x7f1505fc);
        }
    }

    @Override // defpackage.LM
    public final boolean t0() {
        return UN.t.a();
    }

    public final void e2(boolean z) {
        if (Build.VERSION.SDK_INT < 25) {
            return;
        }
        ((ShortcutManager) getSystemService(ShortcutManager.class)).reportShortcutUsed(z ? "new-incognito-tab-shortcut" : "new-tab-shortcut");
    }
}
