package org.chromium.chrome.browser.app;

import J.N;
import android.app.Activity;
import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.chrome.R;
import defpackage.AL;
import defpackage.AX;
import defpackage.AbstractActivityC7416ll;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC0247Bx1;
import defpackage.AbstractC0653Fa2;
import defpackage.AbstractC0767Fx1;
import defpackage.AbstractC0825Gj;
import defpackage.AbstractC0913Ha2;
import defpackage.AbstractC10569uv3;
import defpackage.AbstractC10583uy1;
import defpackage.AbstractC10848vl;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC11682yA0;
import defpackage.AbstractC1171Ja0;
import defpackage.AbstractC12248zp3;
import defpackage.AbstractC1329Kf3;
import defpackage.AbstractC1558Lz3;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC1895Op0;
import defpackage.AbstractC2217Rb2;
import defpackage.AbstractC2976Wx1;
import defpackage.AbstractC3736b2;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5029eo0;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC6717jj0;
import defpackage.AbstractC7547m70;
import defpackage.AbstractC8293oI0;
import defpackage.AbstractC8540p04;
import defpackage.AbstractC9561rz3;
import defpackage.AbstractC9942t6;
import defpackage.B80;
import defpackage.BL;
import defpackage.BL1;
import defpackage.BV2;
import defpackage.C0117Ax1;
import defpackage.C0143Bc2;
import defpackage.C0519Dz3;
import defpackage.C0529Eb3;
import defpackage.C0538Ed2;
import defpackage.C0565Ej;
import defpackage.C0624Eu3;
import defpackage.C0637Ex1;
import defpackage.C0649Ez3;
import defpackage.C10021tL;
import defpackage.C10023tL1;
import defpackage.C10262u20;
import defpackage.C10285u6;
import defpackage.C10377uN2;
import defpackage.C10505ul;
import defpackage.C10709vL1;
import defpackage.C10712vM;
import defpackage.C1096Il0;
import defpackage.C11052wL1;
import defpackage.C11255wv3;
import defpackage.C11283x04;
import defpackage.C11321x70;
import defpackage.C11499xf0;
import defpackage.C11556xo3;
import defpackage.C11664y70;
import defpackage.C11691yC;
import defpackage.C1178Jb2;
import defpackage.C11814ya2;
import defpackage.C12008z71;
import defpackage.C12034zC;
import defpackage.C12157za2;
import defpackage.C12188zf3;
import defpackage.C12293zx1;
import defpackage.C1271Ju0;
import defpackage.C1492Lm1;
import defpackage.C1697Nb2;
import defpackage.C1751Nm1;
import defpackage.C1761No1;
import defpackage.C1881Om1;
import defpackage.C1910Os0;
import defpackage.C1948Oz3;
import defpackage.C20;
import defpackage.C2021Po1;
import defpackage.C2040Ps0;
import defpackage.C2703Uu3;
import defpackage.C2913Wk3;
import defpackage.C2925Wn0;
import defpackage.C3055Xn0;
import defpackage.C3159Yi;
import defpackage.C3185Yn0;
import defpackage.C3637al0;
import defpackage.C3655ao0;
import defpackage.C3823bH3;
import defpackage.C4187cM;
import defpackage.C4312cj0;
import defpackage.C4510dH3;
import defpackage.C4531dM;
import defpackage.C4559dR2;
import defpackage.C4685do0;
import defpackage.C4790e6;
import defpackage.C4874eM;
import defpackage.C4884eO;
import defpackage.C4998ej;
import defpackage.C5134f6;
import defpackage.C5218fM;
import defpackage.C5418fv3;
import defpackage.C5727gp4;
import defpackage.C5906hM;
import defpackage.C6166i6;
import defpackage.C6250iM;
import defpackage.C6592jM;
import defpackage.C6638jV0;
import defpackage.C7196l6;
import defpackage.C7432ln3;
import defpackage.C7478lv1;
import defpackage.C7540m6;
import defpackage.C7822mv1;
import defpackage.C7851n02;
import defpackage.C7928nE;
import defpackage.C8228o6;
import defpackage.C8385oa2;
import defpackage.C8571p6;
import defpackage.C8615pE;
import defpackage.C8655pM;
import defpackage.C8900q33;
import defpackage.C9537rv0;
import defpackage.C9626sA2;
import defpackage.C9707sQ3;
import defpackage.C9861ss;
import defpackage.C9897sy1;
import defpackage.C9919t20;
import defpackage.C9970tA3;
import defpackage.CC;
import defpackage.CL1;
import defpackage.ComponentCallbacksC10940w04;
import defpackage.DC;
import defpackage.DialogInterfaceOnClickListenerC11983z30;
import defpackage.E50;
import defpackage.EI2;
import defpackage.EL1;
import defpackage.EW0;
import defpackage.F20;
import defpackage.F70;
import defpackage.FB;
import defpackage.FF2;
import defpackage.FI2;
import defpackage.H5;
import defpackage.HW3;
import defpackage.Hi4;
import defpackage.I5;
import defpackage.I63;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0560Ei;
import defpackage.InterfaceC0809Gf3;
import defpackage.InterfaceC10551us3;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC10912vv3;
import defpackage.InterfaceC12202zi;
import defpackage.InterfaceC1422Ky1;
import defpackage.InterfaceC1528Lt3;
import defpackage.InterfaceC1631Mo1;
import defpackage.InterfaceC2379Si;
import defpackage.InterfaceC2783Vk3;
import defpackage.InterfaceC3897bW2;
import defpackage.InterfaceC3999bo0;
import defpackage.InterfaceC7458ls;
import defpackage.InterfaceC7624mM;
import defpackage.InterfaceC7679mX;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC7913nB;
import defpackage.InterfaceC8533oz3;
import defpackage.InterfaceC9377rT1;
import defpackage.J14;
import defpackage.J63;
import defpackage.JL1;
import defpackage.K14;
import defpackage.K63;
import defpackage.Kn4;
import defpackage.LD2;
import defpackage.MW0;
import defpackage.N60;
import defpackage.N70;
import defpackage.NW0;
import defpackage.O60;
import defpackage.O83;
import defpackage.P60;
import defpackage.P70;
import defpackage.PL;
import defpackage.Pj4;
import defpackage.Q50;
import defpackage.Q70;
import defpackage.Q83;
import defpackage.RB2;
import defpackage.RU0;
import defpackage.SU0;
import defpackage.TR;
import defpackage.UN;
import defpackage.VD2;
import defpackage.VK2;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.X1;
import defpackage.XO3;
import defpackage.XU0;
import defpackage.ZK1;
import defpackage.ZL;
import defpackage.ZU0;
import defpackage.ZX1;
import j$.util.function.Consumer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.BundleUtils;
import org.chromium.base.Callback;
import org.chromium.base.PowerMonitor;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.ChromeTabbedActivity2;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.compositor.CompositorView;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge;
import org.chromium.chrome.browser.keyboard_accessory.bar_component.e;
import org.chromium.chrome.browser.metrics.PageLoadMetrics;
import org.chromium.chrome.browser.metrics.UmaSessionStats;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.chrome.browser.ui.BottomContainer;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.accessibility.FontSizePrefs;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.content_capture.OnscreenContentProvider;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.policy.CombinedPolicyProvider;
import org.chromium.content.browser.ScreenOrientationProviderImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ChromeActivity extends AbstractActivityC7416ll implements InterfaceC10912vv3, InterfaceC7679mX, F70, InterfaceC0809Gf3, BV2, InterfaceC2783Vk3, InterfaceC0560Ei, InterfaceC12202zi, InterfaceC9377rT1, F20, InterfaceC8533oz3 {
    public static final /* synthetic */ int R0 = 0;
    public final C6166i6 A0;
    public boolean B0;
    public Bundle C0;
    public Configuration D0;
    public final C0538Ed2 E0;
    public boolean F0;
    public C5218fM G0;
    public C4559dR2 H0;
    public BottomContainer I0;
    public AbstractC0247Bx1 J0;
    public EW0 K0;
    public final ArrayList L0;
    public final C9861ss M0;
    public C4510dH3 N0;
    public C8900q33 O0;
    public ZL P0;
    public C11556xo3 Q0;
    public InterfaceC7624mM T;
    public final K63 U = new K63();
    public final C8385oa2 V = new C8385oa2();
    public final C0649Ez3 W;
    public final C11255wv3 X;
    public final C10709vL1 Y;
    public final DC Z;
    public final C0519Dz3 a0;
    public C8385oa2 b0;
    public final C8385oa2 c0;
    public AbstractC9561rz3 d0;
    public C4531dM e0;
    public C8385oa2 f0;
    public TabContentManager g0;
    public UmaSessionStats h0;
    public P60 i0;
    public boolean j0;
    public final C1761No1 k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public PL p0;
    public C6638jV0 q0;
    public final C8385oa2 r0;
    public final C8385oa2 s0;
    public final C1881Om1 t0;
    public final C8385oa2 u0;
    public ViewOnClickListenerC1069If3 v0;
    public long w0;
    public long x0;
    public boolean y0;
    public C8571p6 z0;

    public boolean A1() {
        return false;
    }

    public void G1() {
    }

    public void H1() {
    }

    public void I1() {
    }

    public int K(Tab tab) {
        return 0;
    }

    public void M() {
    }

    public boolean S0(Tab tab) {
        return false;
    }

    public abstract AbstractC0247Bx1 X0();

    public abstract Pair Z0();

    @Override // defpackage.BV2
    public final void a(int i) {
    }

    public abstract AbstractC9561rz3 a1();

    public abstract void b1();

    public abstract void c1();

    public int h1() {
        return 0;
    }

    public abstract int i1();

    public int l1() {
        return -1;
    }

    public int m1() {
        return -1;
    }

    @Override // defpackage.LC
    public final boolean o() {
        return true;
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        onGetDirectActions(cancellationSignal, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        onPerformDirectAction(str, bundle, cancellationSignal, Consumer.VivifiedWrapper.convert(consumer));
    }

    public void s(AbstractC2976Wx1 abstractC2976Wx1) {
    }

    public int u1() {
        return -1;
    }

    public abstract boolean v1();

    @Override // defpackage.AbstractActivityC7416ll, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStart() {
        C10505ul c10505ul = AbstractC10848vl.a;
        boolean b = c10505ul.b();
        C8385oa2 c8385oa2 = this.r0;
        if (b) {
            AbstractC4851eH1.d("ChromeActivity", "#onStart, num async tabs: " + c10505ul.a.size(), new Object[0]);
            c8385oa2.getClass();
            if (AbstractC12248zp3.a(c8385oa2)) {
                ((CompositorViewHolder) c8385oa2.g).u();
            }
        }
        super.onStart();
        if (!(Build.VERSION.SDK_INT < 29)) {
            F1();
        }
        if (this.j0) {
            this.j0 = false;
            PartnerBrowserCustomizations.b().c(getApplicationContext());
            PartnerBrowserCustomizations.b().g(new Runnable() { // from class: bM
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ChromeActivity.R0;
                    ChromeActivity chromeActivity = ChromeActivity.this;
                    chromeActivity.getClass();
                    if (PartnerBrowserCustomizations.isIncognitoDisabled()) {
                        chromeActivity.M();
                    }
                }
            });
        }
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2)) {
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) c8385oa2.g;
            CC cc = compositorViewHolder.t;
            if (cc != null) {
                cc.d(compositorViewHolder);
            }
            compositorViewHolder.v(null);
        }
        this.B0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [ZL, org.chromium.base.Callback] */
    @Override // defpackage.AbstractActivityC7416ll
    public void H0() {
        C8615pE c8615pE = CachedFeatureFlags.d;
        if (!c8615pE.d.get() && !c8615pE.c.getAndSet(true)) {
            O83.a.d("Chrome.Flags.CrashStreakBeforeCache");
            EI2.h(c8615pE.b.get(), 5, "Variations.SafeModeCachedFlags.WillCache");
        }
        boolean b = C9861ss.b();
        C0143Bc2 c0143Bc2 = this.l;
        if (b) {
            C9861ss c9861ss = this.M0;
            c0143Bc2.a(this, c9861ss.a);
            C4510dH3 c4510dH3 = new C4510dH3();
            this.N0 = c4510dH3;
            c9861ss.a(c4510dH3, 0);
            c9861ss.a(VrModuleProvider.b(), 1);
            if (AbstractC0825Gj.a() != null) {
                c9861ss.a(AbstractC0825Gj.a(), 2);
            }
            this.s0.m(new Callback() { // from class: YL
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ChromeActivity.this.M0.a((C9897sy1) obj, 3);
                }
            });
            ?? r0 = new Callback() { // from class: ZL
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i = ChromeActivity.R0;
                    ChromeActivity chromeActivity = ChromeActivity.this;
                    chromeActivity.getClass();
                    C8900q33 c8900q33 = new C8900q33((InterfaceC10590uz3) obj);
                    chromeActivity.O0 = c8900q33;
                    chromeActivity.M0.a(c8900q33, 5);
                    chromeActivity.W.n(chromeActivity.P0);
                }
            };
            this.P0 = r0;
            this.W.m(r0);
            this.Z.m(new Callback() { // from class: aM
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i = ChromeActivity.R0;
                    ChromeActivity chromeActivity = ChromeActivity.this;
                    chromeActivity.getClass();
                    chromeActivity.M0.a(new MU0(((CC) obj).z), 7);
                }
            });
            return;
        }
        c0143Bc2.a(this, new C6250iM(this));
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void E0() {
        C8615pE c8615pE = CachedFeatureFlags.d;
        if (c8615pE.d.get()) {
            return;
        }
        if (c8615pE.c.getAndSet(false)) {
            Q83 q83 = O83.a;
            int f = q83.f(0, "Chrome.Flags.CrashStreakBeforeCache") - 1;
            q83.q(f >= 0 ? f : 0, "Chrome.Flags.CrashStreakBeforeCache");
            EI2.h(c8615pE.b.get(), 5, "Variations.SafeModeCachedFlags.Pause");
        }
    }

    public final void M1(boolean z, boolean z2) {
        C7851n02 c7851n02 = C7851n02.i;
        boolean z3 = !(this instanceof ChromeTabbedActivity2);
        Tab g1 = g1();
        if (z3) {
            boolean z4 = c7851n02.a;
            if (z) {
                if (z4) {
                    Q83 q83 = O83.a;
                    if (q83.h("Chrome.MultiWindow.StartTime") == 0) {
                        FI2.a("Android.MultiWindowMode.Enter");
                        q83.s(System.currentTimeMillis(), "Chrome.MultiWindow.StartTime");
                    }
                } else {
                    FI2.a("Android.MultiWindowMode.Enter");
                }
            } else if (z4) {
                Q83 q832 = O83.a;
                long h = q832.h("Chrome.MultiWindow.StartTime");
                if (h > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    FI2.a("Android.MultiWindowMode.Exit");
                    EI2.j(currentTimeMillis - h, "Android.MultiWindowMode.TotalDuration");
                    q832.s(0L, "Chrome.MultiWindow.StartTime");
                }
            } else {
                FI2.a("Android.MultiWindowMode.Exit");
            }
        } else {
            c7851n02.getClass();
            if (z2) {
                FI2.a("Android.MultiWindowMode.MultiInstance.Enter");
            } else if (z) {
                FI2.a("Android.MultiWindowMode.Enter-SecondInstance");
            } else {
                FI2.a("Android.MultiWindowMode.Exit-SecondInstance");
            }
        }
        if (g1 == null || g1.isIncognito() || g1.b() == null) {
            return;
        }
        N.MCnWTXic(g1.b(), "Android.MultiWindowChangeActivity", "ActivityType", !z ? 1 : 0);
    }

    public ChromeActivity() {
        C0649Ez3 c0649Ez3 = new C0649Ez3();
        this.W = c0649Ez3;
        this.X = new C11255wv3();
        C10709vL1 c10709vL1 = new C10709vL1();
        this.Y = c10709vL1;
        this.Z = new DC();
        this.a0 = new C0519Dz3(c0649Ez3);
        this.b0 = new C8385oa2();
        this.c0 = new C8385oa2();
        this.f0 = new C8385oa2();
        this.r0 = new C8385oa2();
        this.s0 = new C8385oa2();
        this.t0 = new C1881Om1();
        this.u0 = new C8385oa2();
        this.A0 = new C6166i6();
        this.E0 = new C0538Ed2();
        this.L0 = new ArrayList();
        this.M0 = new C9861ss();
        this.k0 = new C1761No1(this, W0());
        c10709vL1.p(new C11052wL1());
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final C10285u6 v0() {
        return new TR(this, this.r0, this.y, this.Y, this.F);
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final boolean G0(String str) {
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = this.v0;
        if (viewOnClickListenerC1069If3 != null) {
            C12188zf3 a = C12188zf3.a(str, null, 1, 45);
            a.i = false;
            a.j = 8000;
            viewOnClickListenerC1069If3.c(a);
        }
        return true;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final long y0() {
        return this.G;
    }

    public C4559dR2 Y0() {
        return new C4559dR2(this, null, this.U, this.A0, this.a0, this.b0, this.c0, this.u0, this.W, new C0538Ed2(), new C0538Ed2(), new C0538Ed2(), new C0538Ed2(), new InterfaceC0079Ap3() { // from class: HL
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                int i = ChromeActivity.R0;
                return null;
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, (CC) this.Z.g, this.H, new C1271Ju0(), this.D, this.s0, this, new InterfaceC0079Ap3() { // from class: IL
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Integer.valueOf(ChromeActivity.this.h1());
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, this.y, this, new InterfaceC7913nB() { // from class: JL
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                return ChromeActivity.this.P1();
            }
        }, new InterfaceC7913nB() { // from class: LL
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                ChromeActivity.this.getClass();
                return true;
            }
        }, this.X, (XU0) q1(), this.r0, this.f0, new BL(this), i1(), new InterfaceC0079Ap3() { // from class: ML
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Boolean.valueOf(ChromeActivity.this.A1());
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new InterfaceC0079Ap3() { // from class: NL
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Boolean.valueOf(ChromeActivity.this.N);
            }
        }, this, this, this.F, this.E0, new C8385oa2(), false, this.M0);
    }

    public InterfaceC7624mM U0(C6592jM c6592jM) {
        C10712vM.e().getClass();
        return new C11499xf0();
    }

    @Override // defpackage.AbstractActivityC7416ll
    public void J0() {
        TraceEvent i = TraceEvent.i("ChromeActivity.performPostInflationStartup", null);
        try {
            super.J0();
            Intent intent = getIntent();
            if (this.I == null) {
                VrModuleProvider.b().o(this, intent);
            }
            if ((intent.getFlags() & 1048576) != 0) {
                r1().a.c = true;
            } else {
                AbstractC0247Bx1 r1 = r1();
                C0117Ax1 c0117Ax1 = r1.a;
                Activity activity = AbstractC0247Bx1.j;
                c0117Ax1.b = activity != r1.h && (activity instanceof ChromeActivity);
                c0117Ax1.a = true;
            }
            BottomContainer bottomContainer = (BottomContainer) findViewById(R.id.bottom_container);
            this.I0 = bottomContainer;
            ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = new ViewOnClickListenerC1069If3(this, bottomContainer, this.H);
            this.v0 = viewOnClickListenerC1069If3;
            C10285u6 c10285u6 = this.H;
            K14 k14 = AbstractC1329Kf3.a;
            AbstractC1329Kf3.a.a(viewOnClickListenerC1069If3, c10285u6.t);
            CombinedPolicyProvider.a().f.add(this);
            this.y0 = true;
            C10285u6 c10285u62 = this.H;
            C8385oa2 c8385oa2 = this.r0;
            c10285u62.l = ((CompositorViewHolder) c8385oa2.g).l;
            c10285u62.o = c10285u62.m.isTouchExplorationEnabled();
            c10285u62.x();
            c10285u62.p = new C5727gp4(c10285u62);
            y1();
            AbstractC11276wz3 abstractC11276wz3 = this.d0.b;
            TabContentManager tabContentManager = new TabContentManager(this, (E50) c8385oa2.g, true ^ SysUtils.isLowEndDevice(), abstractC11276wz3 != null ? new C4187cM(abstractC11276wz3) : null);
            this.g0 = tabContentManager;
            new C5418fv3(tabContentManager, (XU0) q1(), s1());
            this.f0.p(tabContentManager);
            if (!isFinishing()) {
                k1().f((B80) findViewById(R.id.control_container), this.A0, s1(), l1());
            }
            BottomContainer bottomContainer2 = this.I0;
            CC k1 = k1();
            C0565Ej c0565Ej = this.H.n;
            C8385oa2 c8385oa22 = ((C11052wL1) this.Y.g).a.j;
            bottomContainer2.g = k1;
            k1.d(bottomContainer2);
            bottomContainer2.h = c0565Ej;
            bottomContainer2.i = c8385oa22;
            FB fb = bottomContainer2.a;
            c0565Ej.m(fb);
            ((C8385oa2) bottomContainer2.i).m(fb);
            bottomContainer2.setTranslationY(bottomContainer2.j);
            this.U.p(new J63(this.H0.C, this.D, this.A0, this.W, this.a0, new I63(), z1()));
            C8385oa2 c8385oa23 = this.b0;
            C4559dR2 c4559dR2 = this.H0;
            Objects.requireNonNull(c4559dR2);
            this.c0.p(new C2703Uu3(this, c8385oa23, new AL(c4559dR2), new BL(this), z1()));
            if (this.B0) {
                CompositorViewHolder compositorViewHolder = (CompositorViewHolder) c8385oa2.g;
                CC cc = compositorViewHolder.t;
                if (cc != null) {
                    cc.d(compositorViewHolder);
                }
                compositorViewHolder.v(null);
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

    public final void d1() {
        TraceEvent i = TraceEvent.i("ChromeActivity.doLayoutInflation", null);
        try {
            C7432ln3 e = C7432ln3.e();
            try {
                TraceEvent.b("setContentView(R.layout.main)", null);
                setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e017b);
                TraceEvent.c("setContentView(R.layout.main)");
                if (m1() != -1) {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.control_container_stub);
                    viewStub.setLayoutResource(m1());
                    TraceEvent.b("toolbarContainerStub.inflate", null);
                    viewStub.inflate();
                    TraceEvent.c("toolbarContainerStub.inflate");
                }
                B80 b80 = (B80) findViewById(R.id.control_container);
                if (b80 == null) {
                    AbstractC8540p04.i(findViewById(R.id.omnibox_results_container_stub));
                }
                int u1 = u1();
                if (u1 != -1 && b80 != null) {
                    ((ToolbarControlContainer) b80).c(u1);
                }
                e.close();
                F0();
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
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

    /* JADX WARN: Type inference failed for: r13v0, types: [QL] */
    /* JADX WARN: Type inference failed for: r14v2, types: [RL] */
    /* JADX WARN: Type inference failed for: r1v1, types: [SL] */
    /* JADX WARN: Type inference failed for: r1v3, types: [TL] */
    /* JADX WARN: Type inference failed for: r1v5, types: [UL] */
    @Override // defpackage.AbstractActivityC7416ll
    public void K0() {
        J14 j14 = this.H.t;
        K63 k63 = this.U;
        k63.q(j14);
        J14 j142 = this.H.t;
        C0649Ez3 c0649Ez3 = this.W;
        c0649Ez3.q(j142);
        this.X.q(this.H.t);
        J14 j143 = this.H.t;
        C10709vL1 c10709vL1 = this.Y;
        c10709vL1.q(j143);
        this.t0.q(this.H.t);
        J14 j144 = this.H.t;
        DC dc = this.Z;
        dc.q(j144);
        dc.p(new CC(this));
        this.D0 = getResources().getConfiguration();
        this.H0 = Y0();
        this.Q0 = new C11556xo3(this, this.D, this.A0);
        C4559dR2 c4559dR2 = this.H0;
        Objects.requireNonNull(c4559dR2);
        AL al = new AL(c4559dR2);
        k1();
        CC k1 = k1();
        CC k12 = k1();
        ZU0 q1 = q1();
        I5 i5 = this.D;
        BL bl = new BL(this);
        C6166i6 c6166i6 = this.A0;
        C10285u6 c10285u6 = this.H;
        C8385oa2 c8385oa2 = this.r0;
        ?? r13 = new InterfaceC0079Ap3() { // from class: QL
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeActivity.this.n1();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        };
        ?? r14 = new InterfaceC0079Ap3() { // from class: RL
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Boolean.valueOf(ChromeActivity.this.z1());
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        };
        C2913Wk3 c2913Wk3 = this.H0.p0;
        ScreenOrientationProviderImpl.getInstance();
        this.T = U0(new C6592jM(this, al, c0649Ez3, k1, k12, (XU0) q1, i5, bl, c6166i6, c10285u6, c8385oa2, this, r13, r14, c2913Wk3, new InterfaceC0079Ap3() { // from class: SL
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                int i = ChromeActivity.R0;
                return new C7549m72(ChromeActivity.this.getApplicationContext());
            }
        }, this.f0, new InterfaceC0079Ap3() { // from class: TL
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeActivity.this.z0;
            }
        }, this, this, this.y, k1(), new InterfaceC0079Ap3() { // from class: UL
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ChromeActivity.this.I;
            }
        }, ((C11052wL1) c10709vL1.g).a.j, k63, this, i1()));
        AbstractC9561rz3 a1 = a1();
        this.d0 = a1;
        this.V.p(a1);
        this.a0.m(new Callback() { // from class: DL
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Profile profile = (Profile) obj;
                ChromeActivity chromeActivity = ChromeActivity.this;
                BookmarkBridge bookmarkBridge = (BookmarkBridge) chromeActivity.b0.g;
                if (bookmarkBridge != null) {
                    bookmarkBridge.c();
                }
                chromeActivity.b0.p(profile == null ? null : new BookmarkBridge(profile));
            }
        });
        super.K0();
        VrModuleProvider.b().e(this, this.I);
        this.j0 = !PartnerBrowserCustomizations.b().d;
        AX e = AX.e();
        if (!e.g("disable-fullscreen")) {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(R.dimen.0_resource_name_obfuscated_res_0x7f08081e, typedValue, true);
            e.b("top-controls-show-threshold", typedValue.coerceToString().toString());
            getResources().getValue(R.dimen.0_resource_name_obfuscated_res_0x7f08081d, typedValue, true);
            e.b("top-controls-hide-threshold", typedValue.coerceToString().toString());
        }
        getWindow().setBackgroundDrawable(j1());
    }

    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [u70] */
    public final void x1(C9897sy1 c9897sy1, View view, ViewGroup viewGroup, B80 b80) {
        ?? r5;
        Q70 n70;
        C10285u6 c10285u6 = this.H;
        K14 k14 = AbstractC10583uy1.a;
        AbstractC10583uy1.a.a(c9897sy1, c10285u6.t);
        this.s0.p(c9897sy1);
        c9897sy1.q.a(this);
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.r0.g;
        compositorViewHolder.k = c9897sy1;
        compositorViewHolder.t();
        compositorViewHolder.setFocusable(false);
        ResourceManager resourceManager = compositorViewHolder.l.n;
        C9537rv0 a = resourceManager != null ? resourceManager.a() : null;
        if (a != null && compositorViewHolder.w != null) {
            a.e(R.id.control_container);
        }
        compositorViewHolder.w = b80;
        if (a != null && b80 != null) {
            a.d(R.id.control_container, ((ToolbarControlContainer) b80).i.g);
        }
        CC cc = (CC) this.Z.g;
        compositorViewHolder.t = cc;
        cc.d(compositorViewHolder);
        compositorViewHolder.t();
        compositorViewHolder.V = view;
        C1751Nm1 c1751Nm1 = (C1751Nm1) this.t0.g;
        C1751Nm1 c1751Nm12 = compositorViewHolder.x;
        if (c1751Nm12 != null) {
            c1751Nm12.g.d(compositorViewHolder);
        }
        compositorViewHolder.x = c1751Nm1;
        if (c1751Nm1 != null) {
            c1751Nm1.g.a(compositorViewHolder);
            compositorViewHolder.p();
        }
        C8385oa2 c8385oa2 = ((C11052wL1) this.Y.g).a.j;
        compositorViewHolder.y = c8385oa2;
        c8385oa2.m(compositorViewHolder.N);
        compositorViewHolder.U = this.H0.v;
        InterfaceC10590uz3 s1 = s1();
        compositorViewHolder.k.B(s1, this, compositorViewHolder.w, compositorViewHolder.l.n.a(), compositorViewHolder.U);
        compositorViewHolder.s = s1;
        ((AbstractC11276wz3) s1).c(new C20(compositorViewHolder));
        InterfaceC10590uz3 interfaceC10590uz3 = compositorViewHolder.s;
        if (interfaceC10590uz3 != null) {
            compositorViewHolder.x(((AbstractC11276wz3) interfaceC10590uz3).h());
        }
        compositorViewHolder.i = true;
        InterfaceC10551us3 y = c9897sy1.y();
        if (b80 != null && C1096Il0.c().e && y != null) {
            ToolbarControlContainer toolbarControlContainer = (ToolbarControlContainer) b80;
            toolbarControlContainer.j = new XO3(toolbarControlContainer, toolbarControlContainer.getContext(), y);
        }
        C6166i6 c6166i6 = this.A0;
        c6166i6.i = c9897sy1;
        c9897sy1.e(c6166i6.j);
        C8385oa2 c8385oa22 = this.u0;
        c8385oa22.getClass();
        if (AbstractC12248zp3.a(c8385oa22)) {
            final ContextualSearchManager contextualSearchManager = (ContextualSearchManager) c8385oa22.g;
            m mVar = this.H0.C;
            float dimension = l1() == -1 ? 0.0f : getResources().getDimension(l1());
            C9707sQ3 c9707sQ3 = this.H0.x;
            int i1 = i1();
            C2021Po1 c2021Po1 = this.F;
            contextualSearchManager.getClass();
            contextualSearchManager.w = N.MGz$jbPy(contextualSearchManager);
            contextualSearchManager.x = viewGroup;
            viewGroup.getViewTreeObserver().addOnGlobalFocusChangeListener(contextualSearchManager.i);
            contextualSearchManager.V = c9897sy1;
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("ContextualSearchThinWebViewImplementation")) {
                n70 = new P70(contextualSearchManager.g, contextualSearchManager.o, mVar, new InterfaceC0079Ap3() { // from class: u70
                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        Tab tab = (Tab) ContextualSearchManager.this.U.get();
                        return Integer.valueOf((tab == null || tab.a() == null) ? 0 : tab.a().getHeight());
                    }
                }, c2021Po1);
                r5 = 0;
            } else {
                Activity activity = contextualSearchManager.g;
                C9897sy1 c9897sy12 = contextualSearchManager.V;
                r5 = 0;
                n70 = new N70(activity, c9897sy12, c9897sy12.z, contextualSearchManager.o, compositorViewHolder, dimension, c9707sQ3, i1, contextualSearchManager.U);
            }
            n70.r0(contextualSearchManager);
            contextualSearchManager.v = n70;
            contextualSearchManager.t.e = n70;
            if (n70 instanceof InterfaceC3897bW2) {
                contextualSearchManager.V.f((InterfaceC3897bW2) n70);
            }
            contextualSearchManager.y = new VK2();
            contextualSearchManager.B = r5;
            contextualSearchManager.E = r5;
            contextualSearchManager.H = true;
            contextualSearchManager.u.c(Integer.valueOf((int) r5));
            InterfaceC10590uz3 interfaceC10590uz32 = contextualSearchManager.p;
            contextualSearchManager.z = new C11321x70(contextualSearchManager, interfaceC10590uz32);
            contextualSearchManager.A = new C11664y70(contextualSearchManager, interfaceC10590uz32);
            C10021tL.f().a(contextualSearchManager);
        }
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void A0() {
        HashMap hashMap = C8655pM.a().b;
        C0649Ez3 c0649Ez3 = this.W;
        hashMap.put(this, c0649Ez3);
        this.z0 = new C8571p6(c0649Ez3);
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final View z0() {
        View findViewById = findViewById(R.id.control_container);
        return findViewById != null ? findViewById : super.z0();
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void P0() {
        this.w0 = SystemClock.elapsedRealtime();
        TraceEvent i = TraceEvent.i("ChromeActivity.triggerLayoutInflation", null);
        boolean z = true;
        try {
            SelectionPopupControllerImpl.N = true;
            if (!SysUtils.isLowEndDevice()) {
                getWindow().addFlags(16777216);
                this.S = true;
            }
            if (AbstractC9942t6.b() == R.style.f103730_resource_name_obfuscated_res_0x7f1504b2) {
                setTheme(R.style.f103730_resource_name_obfuscated_res_0x7f1504b2);
            }
            Pj4 a = Pj4.a();
            int m1 = m1();
            a.getClass();
            Object obj = ThreadUtils.a;
            if (a.d == null || a.c != m1) {
                z = false;
            }
            if (!z) {
                a.d = null;
                d1();
            } else {
                View view = new View(this);
                setContentView(view);
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                ViewGroup viewGroup2 = a.d;
                a.d = null;
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeView(childAt);
                        viewGroup.addView(childAt);
                    }
                }
                viewGroup.removeView(view);
                F0();
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

    /* JADX WARN: Type inference failed for: r11v0, types: [CL] */
    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public void I() {
        TraceEvent.b("ChromeActivity:CompositorInitialization", null);
        TabContentManager tabContentManager = this.g0;
        Context context = tabContentManager.j;
        tabContentManager.f = N.MtRahKHu(tabContentManager, tabContentManager.c, TabContentManager.c(R.integer.0_resource_name_obfuscated_res_0x7f0c0009, context, "approximation-thumbnails"), context.getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c000a), context.getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c000c), !DeviceFormFactor.a(context), AbstractC5177fD3.b(context), tabContentManager.d());
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.r0.g;
        C10285u6 c10285u6 = this.H;
        TabContentManager tabContentManager2 = this.g0;
        CompositorView compositorView = compositorViewHolder.l;
        boolean isLowEndDevice = SysUtils.isLowEndDevice();
        compositorView.o = c10285u6;
        c10285u6.y.a(compositorView);
        compositorView.e(c10285u6.x);
        compositorView.p = tabContentManager2;
        compositorView.k = N.M1onz6N$(compositorView, isLowEndDevice, c10285u6, tabContentManager2);
        compositorView.i = isLowEndDevice;
        compositorView.g.h(compositorView.b());
        compositorView.setVisibility(0);
        compositorView.n = (ResourceManager) N.MKvVEaSX(compositorView.k, compositorView);
        N.M_Nkznfe(compositorView.k, compositorView);
        if (compositorViewHolder.w != null) {
            compositorViewHolder.l.n.a().d(R.id.control_container, ((ToolbarControlContainer) compositorViewHolder.w).i.g);
        }
        C0565Ej c0565Ej = c10285u6.n;
        compositorViewHolder.M = c0565Ej;
        c0565Ej.m(compositorViewHolder.N);
        if (AbstractC7547m70.a()) {
            this.u0.p(new ContextualSearchManager(this, this, this.H0.E, this.A0, (XU0) q1(), k1(), this.H, (InterfaceC10590uz3) this.W.g, new InterfaceC0079Ap3() { // from class: CL
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    int i = ChromeActivity.R0;
                    return Long.valueOf(ChromeActivity.this.K);
                }
            }));
        }
        TraceEvent.c("ChromeActivity:CompositorInitialization");
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void F0() {
        Object c1751Nm1;
        this.x0 = SystemClock.elapsedRealtime();
        this.H0.p0.j();
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().getRootView();
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) findViewById(R.id.compositor_view_holder);
        C8385oa2 c8385oa2 = this.r0;
        c8385oa2.p(compositorViewHolder);
        CompositorView compositorView = ((CompositorViewHolder) c8385oa2.g).l;
        if (compositorView.g == null) {
            Object obj = ThreadUtils.a;
            compositorView.c();
        }
        compositorView.q = viewGroup;
        viewGroup.setFitsSystemWindows(false);
        if (Build.VERSION.SDK_INT < 28) {
            c1751Nm1 = new C1751Nm1(this);
        } else {
            int i = C1751Nm1.h;
            c1751Nm1 = new C1492Lm1(this);
        }
        C1881Om1 c1881Om1 = this.t0;
        c1881Om1.p(c1751Nm1);
        viewGroup.addView((View) c1881Om1.g, 0);
        super.F0();
    }

    public final void y1() {
        if (this.d0.d) {
            return;
        }
        b1();
        AbstractC11276wz3 abstractC11276wz3 = this.d0.b;
        if (abstractC11276wz3 == null) {
            return;
        }
        this.W.p(abstractC11276wz3);
        C6166i6 c6166i6 = this.A0;
        c6166i6.k = abstractC11276wz3;
        c6166i6.l = new C4790e6(c6166i6, abstractC11276wz3);
        C5134f6 c5134f6 = new C5134f6(c6166i6);
        c6166i6.m = c5134f6;
        ((AbstractC11276wz3) c6166i6.k).c(c5134f6);
        C2913Wk3 c2913Wk3 = this.H0.p0;
        c2913Wk3.q = abstractC11276wz3;
        abstractC11276wz3.c(c2913Wk3.k);
        final Pair Z0 = Z0();
        this.X.p(new InterfaceC10912vv3() { // from class: OL
            @Override // defpackage.InterfaceC10912vv3
            public final AbstractC10569uv3 b(boolean z) {
                int i = ChromeActivity.R0;
                Pair pair = Z0;
                return (AbstractC10569uv3) (z ? pair.second : pair.first);
            }
        });
        C1697Nb2 c1697Nb2 = (C1697Nb2) AbstractC2217Rb2.b.put(this, new C1697Nb2(abstractC11276wz3));
        if (c1697Nb2 != null) {
            c1697Nb2.a();
        } else {
            ApplicationStatus.e(new C1178Jb2(), this);
        }
        C4531dM c4531dM = this.e0;
        if (c4531dM != null) {
            c4531dM.destroy();
        }
        this.e0 = new C4531dM(this, abstractC11276wz3);
    }

    public final AbstractC0247Bx1 r1() {
        if (this.J0 == null) {
            this.J0 = X0();
        }
        return this.J0;
    }

    public InterfaceC2379Si E() {
        return new C3159Yi(this, this.A0, this.E, s1(), this.H0.x, getWindow().getDecorView(), null, null, this.b0, null);
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public void v() {
        C1761No1.f = AX.e().g("enable-test-intents");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    @Override // defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.app.ChromeActivity.f():void");
    }

    public boolean N1() {
        return g1() == null || !g1().e();
    }

    public final void F1() {
        D1();
        Tab g1 = g1();
        if (g1 != null) {
            if (g1.isHidden()) {
                g1.show(3);
            } else {
                g1.C();
            }
        }
        VrModuleProvider.b().y(this);
        C7851n02.i.getClass();
        if (g1 == null || g1.isIncognito() || g1.b() == null) {
            return;
        }
        N.MCnWTXic(g1.b(), "Android.MultiWindowState", "WindowState", C7851n02.p(this) ? 1 : 0);
    }

    public final void E1() {
        VrModuleProvider.b().v(this);
        Tab g1 = g1();
        AbstractC11276wz3 abstractC11276wz3 = this.d0.b;
        if (abstractC11276wz3 == null || abstractC11276wz3.k || g1 == null) {
            return;
        }
        g1.hide(1);
    }

    @Override // defpackage.AbstractActivityC7416ll, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 29) {
            if (z) {
                F1();
            } else if (ApplicationStatus.c(this) == 5) {
                E1();
            }
        }
        Clipboard.getInstance().d(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Lt3, PL] */
    public final void V0() {
        if (this.B0 && this.i0 == null && g1() != null) {
            AbstractC1658Mt3 b = AbstractC1658Mt3.b();
            if (b == 0 || !b.k()) {
                if (b == 0 || !b.h()) {
                    P60.a(2);
                } else {
                    int[] MVqF80Hk = N.MVqF80Hk(((SyncServiceImpl) b).c);
                    HashSet hashSet = new HashSet();
                    for (int i : MVqF80Hk) {
                        hashSet.add(Integer.valueOf(i));
                    }
                    if (!hashSet.contains(10)) {
                        P60.a(3);
                    } else if (b.f() != 1 && b.f() != 4) {
                        P60.a(4);
                    } else {
                        P60.a(5);
                    }
                }
                if (this.p0 != null || b == 0) {
                    return;
                }
                ?? r1 = new InterfaceC1528Lt3() { // from class: PL
                    @Override // defpackage.InterfaceC1528Lt3
                    public final void B() {
                        int i2 = ChromeActivity.R0;
                        ChromeActivity.this.V0();
                    }
                };
                this.p0 = r1;
                b.a(r1);
                return;
            }
            C8385oa2 c8385oa2 = this.u0;
            c8385oa2.getClass();
            this.i0 = AppHooks.get().k().b(this.A0, this.W, AbstractC12248zp3.a(c8385oa2) ? new C4874eM(this) : null);
            PL pl = this.p0;
            if (pl != null) {
                b.l(pl);
                this.p0 = null;
            }
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public void c() {
        int b;
        int i;
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("FixedUmaSessionResumeOrder");
        if (!M09VlOh_) {
            super.c();
            C1();
        } else {
            N.Mo4XXQLk(i1());
            C1();
            super.c();
        }
        FI2.a("MobileComeToForeground");
        AbstractC0247Bx1 r1 = r1();
        int i2 = 4;
        if (AbstractC0247Bx1.i) {
            if (r1.a.b && (b = r1.b()) != 0) {
                EI2.h(b, 17, "MobileStartup.LaunchCause");
            }
        } else {
            r1.getClass();
            AbstractC0247Bx1.i = true;
            C0117Ax1 c0117Ax1 = r1.a;
            if (c0117Ax1.a) {
                i = r1.a();
            } else {
                if (!c0117Ax1.c) {
                    C12293zx1 c12293zx1 = r1.g;
                    if (c12293zx1.b) {
                        i = 5;
                    } else if (c12293zx1.a) {
                        i = 4;
                    }
                }
                i = 3;
            }
            EI2.h(i, 17, "MobileStartup.LaunchCause");
        }
        r1.a = new C0117Ax1();
        r1.g = new C12293zx1();
        Tab g1 = g1();
        if (g1 != null) {
            WebContents b2 = g1.b();
            ArrayList arrayList = AbstractC0767Fx1.a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0637Ex1 c0637Ex1 = (C0637Ex1) it.next();
                Kn4 kn4 = c0637Ex1.d;
                int d = kn4 == null ? 0 : kn4.d();
                boolean z = c0637Ex1.b;
                String str = c0637Ex1.a;
                int i3 = c0637Ex1.c;
                N.M7MirFey(z, str, i3, d, b2);
                if (kn4 != null && kn4.j()) {
                    N.MSgrvMWU(kn4.m(), kn4.e().i, kn4.e().n, i3);
                }
            }
            arrayList.clear();
            if (b2 != null) {
                b2.w0();
            }
        }
        if (!M09VlOh_) {
            N.Mo4XXQLk(i1());
        }
        C7851n02.i.getClass();
        N.MJuAVRUC(C7851n02.p(this));
        boolean h = this.z.h();
        boolean z2 = h == C0624Eu3.a().b;
        if (h) {
            i2 = z2 ? 1 : 2;
        } else if (z2) {
            i2 = 3;
        }
        N.MHUxYCwI(i2);
        if (Build.VERSION.SDK_INT >= 31) {
            e1();
        }
        C6638jV0 c6638jV0 = this.q0;
        if (c6638jV0 != null) {
            c6638jV0.g(0);
        }
        VrModuleProvider.b().t(this);
        CL1 cl1 = ((C11052wL1) this.Y.g).a;
        if (cl1.a1()) {
            cl1.d1();
            cl1.e1();
        }
    }

    public final void e1() {
        if (this.q0 == null) {
            this.q0 = new C6638jV0(this, this.A0, (XU0) q1());
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        r1().g.a = true;
        if (m()) {
            return;
        }
        e1();
        this.q0.c();
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        if (z) {
            e1();
            C6638jV0 c6638jV0 = this.q0;
            final WebContents f = c6638jV0.f();
            if (f == null) {
                return;
            }
            f.p1(true);
            final Tab tab = (Tab) c6638jV0.e.g;
            InfoBarContainer.c(tab).e(true);
            LinkedList linkedList = c6638jV0.a;
            linkedList.add(new Runnable() { // from class: cV0
                @Override // java.lang.Runnable
                public final void run() {
                    WebContents.this.p1(false);
                    InfoBarContainer.c(tab).e(false);
                }
            });
            c6638jV0.b();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            linkedList.add(new Runnable() { // from class: dV0
                @Override // java.lang.Runnable
                public final void run() {
                    EI2.g("Media.VideoPersistence.Duration", SystemClock.elapsedRealtime() - elapsedRealtime, 7000L, 36000000L, 50);
                }
            });
            return;
        }
        C6638jV0 c6638jV02 = this.q0;
        if (c6638jV02 != null) {
            c6638jV02.g(0);
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public void e() {
        FI2.a("MobileGoToBackground");
        Tab g1 = g1();
        if (g1 != null) {
            this.g0.a(g1);
        }
        ((C11052wL1) this.Y.g).a.d1();
        VrModuleProvider.b().u();
        B1();
        super.e();
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public void g() {
        EW0 ew0;
        if (NW0.c(this).e() && !SysUtils.isLowEndDevice() && (ew0 = this.K0) != null) {
            int i = ew0.a - 1;
            ew0.a = i;
            MW0 mw0 = ew0.b;
            if (mw0 != null && i == 0 && mw0.g != null) {
                mw0.e.unbindService(mw0.c);
                mw0.g = null;
                mw0.b.removeCallbacksAndMessages(null);
            }
        }
        if (this.p0 != null) {
            AbstractC1658Mt3 b = AbstractC1658Mt3.b();
            if (b != null) {
                b.l(this.p0);
            }
            this.p0 = null;
        }
        P60 p60 = this.i0;
        if (p60 != null) {
            p60.b();
            N60 n60 = p60.d;
            if (n60 != null) {
                n60.destroy();
                p60.d = null;
            }
            O60 o60 = p60.e;
            if (o60 != null) {
                o60.a();
                p60.e = null;
            }
            C4874eM c4874eM = p60.c;
            if (c4874eM != null) {
                ContextualSearchManager contextualSearchManager = (ContextualSearchManager) c4874eM.a.u0.g;
                contextualSearchManager.a.d(contextualSearchManager.T);
                contextualSearchManager.T = null;
            }
        }
        super.g();
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onNewIntent(Intent intent) {
        VrModuleProvider.b().o(this, intent);
        super.onNewIntent(intent);
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public void y(Intent intent) {
        C6638jV0 c6638jV0 = this.q0;
        if (c6638jV0 != null) {
            c6638jV0.g(0);
        }
        AbstractC0247Bx1 r1 = r1();
        C0117Ax1 c0117Ax1 = r1.a;
        Activity activity = AbstractC0247Bx1.j;
        c0117Ax1.b = activity != r1.h && (activity instanceof ChromeActivity);
        c0117Ax1.a = true;
        C1761No1 c1761No1 = this.k0;
        if (c1761No1.x(intent, false)) {
            return;
        }
        VrModuleProvider.b().G(this, intent);
        c1761No1.u(intent);
    }

    public final boolean z1() {
        return i1() == 1 || i1() == 2;
    }

    public void w1() {
        final String simpleName = getClass().getSimpleName();
        C3637al0.b().a(new Runnable() { // from class: EL
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                int i2 = ChromeActivity.R0;
                ChromeActivity chromeActivity = ChromeActivity.this;
                if (chromeActivity.m()) {
                    return;
                }
                if (chromeActivity.H0.x != null) {
                    EI2.n(chromeActivity.x0 - chromeActivity.w0, "MobileStartup.ToolbarInflationTime." + simpleName);
                    chromeActivity.H0.x.D.k();
                }
                C7851n02.i.getClass();
                if (C7851n02.p(chromeActivity)) {
                    chromeActivity.M1(true, true);
                }
                long k = C1761No1.k(chromeActivity.getIntent());
                if (k != -1) {
                    chromeActivity.L1(chromeActivity.G - k);
                }
                AbstractC1895Op0 b = AbstractC1895Op0.b(chromeActivity);
                float f = b.c.x;
                float f2 = b.d;
                int i3 = (int) ((f / f2) + 0.5f);
                int i4 = (int) ((r3.y / f2) + 0.5f);
                int min = Math.min(i3, i4);
                int max = Math.max(i3, i4);
                EI2.i(min, 100, 1000, 92, "Android.DeviceSize.SmallestDisplaySize2");
                EI2.i(max, 200, 2000, 92, "Android.DeviceSize.LargestDisplaySize2");
                try {
                    i = chromeActivity.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                EI2.b("Android.PlayServices.Installed", i > 0);
                EI2.m(i, "Android.PlayServices.Version");
                Profile d = Profile.d();
                Object obj = ThreadUtils.a;
                if (FontSizePrefs.c == null) {
                    FontSizePrefs.c = new FontSizePrefs(d);
                }
                EI2.m((int) (FontSizePrefs.c.a() * 100.0f), "Accessibility.Android.UserFontSizePref.OnStartup");
            }
        });
        C3637al0.b().a(new Runnable() { // from class: FL
            @Override // java.lang.Runnable
            public final void run() {
                int i = ChromeActivity.R0;
                ChromeActivity chromeActivity = ChromeActivity.this;
                if (chromeActivity.m()) {
                    return;
                }
                C1202Jg1 a = C1202Jg1.a();
                Profile d = Profile.d();
                a.getClass();
                if (C1202Jg1.c(d).q()) {
                    C4502dG0 c4502dG0 = C4502dG0.b;
                    T44 t44 = new T44(chromeActivity, false);
                    c4502dG0.getClass();
                    C4502dG0.c(t44);
                }
            }
        });
        if (SysUtils.isLowEndDevice() || m()) {
            return;
        }
        C3637al0.b().a(new Runnable() { // from class: GL
            @Override // java.lang.Runnable
            public final void run() {
                int i = ChromeActivity.R0;
                ChromeActivity chromeActivity = ChromeActivity.this;
                chromeActivity.getClass();
                if (!NW0.c(chromeActivity).e()) {
                    P60.a(1);
                    return;
                }
                if (chromeActivity.K0 == null) {
                    chromeActivity.K0 = new EW0(V60.a, AppHooks.get().k());
                }
                EW0 ew0 = chromeActivity.K0;
                MW0 mw0 = ew0.b;
                if (mw0 != null) {
                    mw0.a();
                }
                ew0.a++;
                chromeActivity.V0();
            }
        });
    }

    public void L1(long j) {
        EI2.n(j, "MobileStartup.IntentToCreationTime");
    }

    public final C1948Oz3 t1() {
        C4559dR2 c4559dR2 = this.H0;
        if (c4559dR2 == null) {
            return null;
        }
        return (C1948Oz3) c4559dR2.a.g;
    }

    @Override // defpackage.AbstractActivityC7416ll, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStop() {
        CompositorViewHolder compositorViewHolder;
        CC cc;
        super.onStop();
        if (Build.VERSION.SDK_INT < 29) {
            if (!hasWindowFocus()) {
                E1();
            }
        } else {
            E1();
        }
        this.j0 = true;
        C8385oa2 c8385oa2 = this.r0;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2) && (cc = (compositorViewHolder = (CompositorViewHolder) c8385oa2.g).t) != null) {
            cc.g(compositorViewHolder);
        }
        this.B0 = false;
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        Tab g1 = g1();
        boolean A1 = A1();
        String str = null;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("TranslateAssistContent")) {
                if (A1) {
                    HW3.a(3);
                } else if (g1 == null) {
                    HW3.a(1);
                } else if (g1.isIncognito()) {
                    HW3.a(2);
                } else {
                    try {
                        JSONObject put = new JSONObject().put("@type", "WebPage").put("url", g1.getUrl().i());
                        if (!N.Mx5ZGJOG(g1.b(), false)) {
                            HW3.a(4);
                            str = put.toString();
                        } else {
                            String Mkdg1mTW = N.Mkdg1mTW(g1.b());
                            if (TextUtils.isEmpty(Mkdg1mTW)) {
                                HW3.a(5);
                                str = put.toString();
                            } else {
                                String Mijf24vV = N.Mijf24vV(g1.b());
                                if (TextUtils.isEmpty(Mijf24vV)) {
                                    HW3.a(6);
                                    str = put.toString();
                                } else {
                                    String MMKf4EpW = N.MMKf4EpW();
                                    put.put("inLanguage", Mijf24vV);
                                    if (Mijf24vV.equals(Mkdg1mTW)) {
                                        if (!TextUtils.isEmpty(MMKf4EpW)) {
                                            put.put("workTranslation", new JSONObject().put("inLanguage", MMKf4EpW));
                                        }
                                        HW3.a(8);
                                    } else {
                                        put.put("translationOfWork", new JSONObject().put("inLanguage", Mkdg1mTW));
                                        HW3.a(9);
                                    }
                                    str = put.toString();
                                }
                            }
                        }
                    } catch (JSONException unused) {
                        HW3.a(7);
                    }
                }
                if (g1 != null || g1.isIncognito() || A1) {
                    return;
                }
                assistContent.setWebUri(Uri.parse(g1.getUrl().i()));
                if (str != null) {
                    assistContent.setStructuredData(str);
                    return;
                }
                return;
            }
        }
        HW3.a(0);
        if (g1 != null) {
        }
    }

    public void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, j$.util.function.Consumer consumer) {
        boolean z;
        C4685do0 c4685do0 = this.H0.F;
        if (c4685do0 == null) {
            return;
        }
        C3655ao0 c3655ao0 = c4685do0.p;
        if (c3655ao0 != null && c4685do0.o) {
            if (((Boolean) c3655ao0.b.get()).booleanValue()) {
                C2925Wn0 c2925Wn0 = new C2925Wn0(consumer);
                Iterator it = c3655ao0.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((InterfaceC3999bo0) it.next()).a(str, bundle, c2925Wn0)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Map map = AbstractC5029eo0.a;
                    EI2.h(0, 14, "Android.DirectAction.Perform");
                    return;
                } else {
                    Integer num = (Integer) AbstractC5029eo0.a.get(str);
                    if (num == null) {
                        num = 1;
                    }
                    EI2.h(num.intValue(), 14, "Android.DirectAction.Perform");
                    return;
                }
            }
            return;
        }
        consumer.accept(Bundle.EMPTY);
    }

    public void onGetDirectActions(CancellationSignal cancellationSignal, j$.util.function.Consumer consumer) {
        C4685do0 c4685do0 = this.H0.F;
        if (c4685do0 == null) {
            return;
        }
        C3655ao0 c3655ao0 = c4685do0.p;
        if (c3655ao0 != null && c4685do0.o) {
            C3185Yn0 c3185Yn0 = new C3185Yn0(c3655ao0, consumer);
            if (((Boolean) c3655ao0.b.get()).booleanValue()) {
                Iterator it = c3655ao0.a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3999bo0) it.next()).b(c3185Yn0);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C3055Xn0 c3055Xn0 : c3185Yn0.b.values()) {
                String str = c3055Xn0.a;
                List list = c3055Xn0.b;
                if (list == null) {
                    list = Collections.emptyList();
                }
                List list2 = c3055Xn0.c;
                if (list2 == null) {
                    list2 = Collections.emptyList();
                }
                c3185Yn0.c.getClass();
                if (list == null) {
                    list = Collections.emptyList();
                }
                if (list2 == null) {
                    list2 = Collections.emptyList();
                }
                arrayList.addAll(new C0529Eb3(str, list, list2).a());
            }
            c3185Yn0.a.accept(arrayList);
            FI2.a("Android.DirectAction.List");
            return;
        }
        consumer.accept(Collections.emptyList());
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LM, defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VrModuleProvider.b().H(bundle);
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        C8385oa2 c8385oa2 = this.u0;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2)) {
            ContextualSearchManager contextualSearchManager = (ContextualSearchManager) c8385oa2.g;
            if (contextualSearchManager.H) {
                contextualSearchManager.i(0);
                ((XU0) contextualSearchManager.n).k(contextualSearchManager.j);
                contextualSearchManager.x.getViewTreeObserver().removeOnGlobalFocusChangeListener(contextualSearchManager.i);
                N.MP0VGkxv(contextualSearchManager.w, contextualSearchManager);
                C11321x70 c11321x70 = contextualSearchManager.z;
                if (c11321x70 != null) {
                    c11321x70.a();
                }
                C11664y70 c11664y70 = contextualSearchManager.A;
                if (c11664y70 != null) {
                    c11664y70.destroy();
                }
                contextualSearchManager.z = null;
                contextualSearchManager.A = null;
                VK2 vk2 = contextualSearchManager.y;
                vk2.b = null;
                vk2.c = null;
                contextualSearchManager.u.a(0);
                C10021tL f = C10021tL.f();
                if (f.c == null) {
                    f.c = new C12157za2();
                }
                f.c.d(contextualSearchManager);
                Q70 q70 = contextualSearchManager.v;
                if (q70 != null) {
                    q70.destroy();
                }
                contextualSearchManager.v = null;
            }
            c8385oa2.p(null);
        }
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = this.v0;
        if (viewOnClickListenerC1069If3 != null) {
            AbstractC1329Kf3.a.b(viewOnClickListenerC1069If3);
        }
        C4531dM c4531dM = this.e0;
        if (c4531dM != null) {
            c4531dM.destroy();
            this.e0 = null;
        }
        Object obj = this.s0.g;
        if (obj != null) {
            AbstractC10583uy1.a.b((ZK1) obj);
        }
        C8385oa2 c8385oa22 = this.r0;
        c8385oa22.getClass();
        if (AbstractC12248zp3.a(c8385oa22)) {
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) c8385oa22.g;
            C9897sy1 c9897sy1 = compositorViewHolder.k;
            if (c9897sy1 != null) {
                c9897sy1.q.d(this);
            }
            compositorViewHolder.x(null);
            C0565Ej c0565Ej = compositorViewHolder.M;
            C10262u20 c10262u20 = compositorViewHolder.N;
            if (c0565Ej != null && c10262u20 != null) {
                c0565Ej.n(c10262u20);
            }
            InterfaceC7697ma2 interfaceC7697ma2 = compositorViewHolder.y;
            if (interfaceC7697ma2 != null && c10262u20 != null) {
                ((C8385oa2) interfaceC7697ma2).n(c10262u20);
            }
            CompositorView compositorView = compositorViewHolder.l;
            compositorView.g.g();
            C9919t20 c9919t20 = compositorView.y;
            if (c9919t20 != null) {
                c9919t20.c.getContext().getApplicationContext().unregisterReceiver(c9919t20);
            }
            long j = compositorView.k;
            if (j != 0) {
                N.MsBICFNS(j, compositorView);
            }
            compositorView.k = 0L;
            C9897sy1 c9897sy12 = compositorViewHolder.k;
            if (c9897sy12 != null) {
                c9897sy12.i();
            }
            C1751Nm1 c1751Nm1 = compositorViewHolder.x;
            if (c1751Nm1 != null) {
                c1751Nm1.g.d(compositorViewHolder);
                compositorViewHolder.x = null;
            }
            OnscreenContentProvider onscreenContentProvider = compositorViewHolder.P;
            if (onscreenContentProvider != null) {
                long j2 = onscreenContentProvider.a;
                if (j2 != 0) {
                    N.Mcvkj$M_(j2);
                    onscreenContentProvider.a = 0L;
                }
            }
            Q50 q50 = compositorViewHolder.D;
            if (q50 != null) {
                q50.g.d(compositorViewHolder);
            }
            c8385oa22.p(null);
        }
        G1();
        if (this.y0) {
            CombinedPolicyProvider.a().f.remove(this);
            this.y0 = false;
        }
        TabContentManager tabContentManager = this.g0;
        if (tabContentManager != null) {
            HashSet hashSet = tabContentManager.a;
            if (hashSet != null) {
                hashSet.clear();
            }
            long j3 = tabContentManager.f;
            if (j3 != 0) {
                N.MKivVmLp(j3);
                tabContentManager.f = 0L;
            }
            this.g0 = null;
        }
        if (this.f0 != null) {
            this.f0 = null;
        }
        C10709vL1 c10709vL1 = this.Y;
        c10709vL1.getClass();
        if (AbstractC12248zp3.a(c10709vL1)) {
            C11052wL1 c11052wL1 = (C11052wL1) c10709vL1.g;
            Iterator it = c11052wL1.g.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                }
                ManualFillingComponentBridge manualFillingComponentBridge = ((C10023tL1) c11814ya2.next()).a;
                long j4 = manualFillingComponentBridge.e;
                if (j4 != 0) {
                    N.MVOJP_9v(j4, manualFillingComponentBridge);
                }
            }
            CL1 cl1 = c11052wL1.a;
            if (cl1.a1()) {
                cl1.d1();
                cl1.o.findViewById(android.R.id.content).removeOnLayoutChangeListener(cl1);
                cl1.p.a();
                HashMap hashMap = cl1.k.a;
                for (JL1 jl1 : hashMap.values()) {
                    WebContents webContents = jl1.a;
                    if (webContents != null) {
                        webContents.P(jl1.g);
                    }
                    jl1.e = null;
                    jl1.b.clear();
                    jl1.f = false;
                }
                hashMap.clear();
                HashSet hashSet2 = cl1.l;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    ((Tab) it2.next()).w(cl1.w);
                }
                hashSet2.clear();
                ((XU0) cl1.o.q1()).k(cl1.x);
                ((m) cl1.r).o(cl1.y);
                cl1.v.p(Boolean.FALSE);
                C9861ss c9861ss = cl1.u;
                int i = 0;
                while (true) {
                    InterfaceC7458ls[] interfaceC7458lsArr = c9861ss.b;
                    if (i >= interfaceC7458lsArr.length) {
                        break;
                    }
                    if (interfaceC7458lsArr[i] == cl1) {
                        c9861ss.d(i);
                        break;
                    }
                    i++;
                }
                cl1.u = null;
                cl1.h = null;
                cl1.o = null;
            }
        }
        c10709vL1.s();
        DC dc = this.Z;
        dc.getClass();
        if (AbstractC12248zp3.a(dc)) {
            CC cc = (CC) dc.g;
            cc.A = null;
            XU0 xu0 = cc.z;
            xu0.x = null;
            xu0.l(null);
            RU0 ru0 = xu0.v;
            if (ru0 != null) {
                ru0.destroy();
            }
            SU0 su0 = xu0.w;
            if (su0 != null) {
                su0.destroy();
            }
            C11691yC c11691yC = cc.x;
            if (c11691yC != null) {
                c11691yC.destroy();
            }
            cc.g.j.removeCallbacksAndMessages(null);
            C12034zC c12034zC = cc.k;
            if (c12034zC != null) {
                c12034zC.destroy();
            }
            VrModuleProvider.g(cc);
        }
        dc.s();
        C8571p6 c8571p6 = this.z0;
        if (c8571p6 != null) {
            c8571p6.g = false;
            C7196l6 c7196l6 = c8571p6.d;
            if (c7196l6 != null) {
                c7196l6.destroy();
                c8571p6.d = null;
            }
            C8228o6 c8228o6 = c8571p6.e;
            if (c8228o6 != null) {
                Object obj2 = ThreadUtils.a;
                C12157za2 c12157za2 = PageLoadMetrics.a;
                if (c12157za2 != null) {
                    c12157za2.d(c8228o6);
                }
                c8571p6.e = null;
            }
            C7540m6 c7540m6 = c8571p6.f;
            if (c7540m6 != null) {
                Object obj3 = ThreadUtils.a;
                C12157za2 c12157za22 = UmaUtils.a;
                if (c12157za22 != null) {
                    c12157za22.d(c7540m6);
                }
                c8571p6.f = null;
            }
            this.z0 = null;
        }
        c1();
        C8385oa2 c8385oa23 = this.b0;
        if (c8385oa23 != null) {
            BookmarkBridge bookmarkBridge = (BookmarkBridge) c8385oa23.g;
            if (bookmarkBridge != null) {
                bookmarkBridge.c();
            }
            this.b0 = null;
        }
        K63 k63 = this.U;
        if (k63 != null) {
            k63.s();
        }
        C0649Ez3 c0649Ez3 = this.W;
        if (c0649Ez3 != null) {
            c0649Ez3.s();
        }
        BottomContainer bottomContainer = this.I0;
        if (bottomContainer != null) {
            ((CC) bottomContainer.g).g(bottomContainer);
            C0565Ej c0565Ej2 = bottomContainer.h;
            FB fb = bottomContainer.a;
            c0565Ej2.n(fb);
            ((C8385oa2) bottomContainer.i).n(fb);
            this.I0 = null;
        }
        C5218fM c5218fM = this.G0;
        if (c5218fM != null) {
            this.H.i.a.remove(c5218fM);
            this.G0 = null;
        }
        C4510dH3 c4510dH3 = this.N0;
        if (c4510dH3 != null) {
            C3823bH3.r.n(c4510dH3.g);
            this.N0 = null;
        }
        C8900q33 c8900q33 = this.O0;
        if (c8900q33 != null) {
            Tab tab = c8900q33.i;
            if (tab != null) {
                tab.w(c8900q33);
            }
            c8900q33.i = null;
            SelectionPopupControllerImpl selectionPopupControllerImpl = c8900q33.h;
            if (selectionPopupControllerImpl != null) {
                selectionPopupControllerImpl.s.n(c8900q33.g);
                c8900q33.h = null;
            }
            this.O0 = null;
        }
        C11556xo3 c11556xo3 = this.Q0;
        if (c11556xo3 != null) {
            c11556xo3.g.c(c11556xo3);
            c11556xo3.a.a();
            this.Q0 = null;
        }
        C6166i6 c6166i6 = this.A0;
        InterfaceC1422Ky1 interfaceC1422Ky1 = c6166i6.i;
        if (interfaceC1422Ky1 != null) {
            ((C9897sy1) interfaceC1422Ky1).L(c6166i6.j);
        }
        c6166i6.i = null;
        C4790e6 c4790e6 = c6166i6.l;
        if (c4790e6 != null) {
            c4790e6.a();
        }
        C5134f6 c5134f6 = c6166i6.m;
        if (c5134f6 != null) {
            ((AbstractC11276wz3) c6166i6.k).s(c5134f6);
            c6166i6.m = null;
        }
        c6166i6.k = null;
        C8655pM.a().b.remove(this);
        this.T = null;
        super.onDestroy();
    }

    @Override // defpackage.InterfaceC0809Gf3
    public final ViewOnClickListenerC1069If3 z() {
        C4559dR2 c4559dR2 = this.H0;
        m mVar = c4559dR2 == null ? null : c4559dR2.C;
        if (c4559dR2 != null && mVar != null && mVar.n() && !mVar.m()) {
            return this.H0.D;
        }
        return this.v0;
    }

    @Override // defpackage.LM
    public ZX1 p0() {
        return new ZX1(new C4998ej(this));
    }

    public Drawable j1() {
        return new ColorDrawable(getColor(R.color.0_resource_name_obfuscated_res_0x7f0708d8));
    }

    public void T0() {
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.0_resource_name_obfuscated_res_0x7f0708d8)));
    }

    public final void D1() {
        if (!this.o0 && this.n0 && hasWindowFocus()) {
            if (Build.VERSION.SDK_INT >= 24) {
                T0();
            } else {
                new Handler().post(new Runnable() { // from class: KL
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ChromeActivity.R0;
                        ChromeActivity chromeActivity = ChromeActivity.this;
                        chromeActivity.getClass();
                        boolean z = true;
                        try {
                            Field field = Settings.Secure.class.getField("ACCESSIBILITY_DISPLAY_MAGNIFICATION_ENABLED");
                            field.setAccessible(true);
                            if (field.getType() == String.class) {
                                if (Settings.Secure.getInt(chromeActivity.getContentResolver(), (String) field.get(null)) == 1) {
                                    z = false;
                                }
                            }
                        } catch (Settings.SettingNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
                        }
                        if (z) {
                            chromeActivity.getWindow().setBackgroundDrawable(null);
                        }
                    }
                });
            }
            this.o0 = true;
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public void l() {
        InterfaceC7697ma2 interfaceC7697ma2;
        boolean z = true;
        this.n0 = true;
        AbstractC0913Ha2.a();
        D1();
        DownloadManagerService i = DownloadManagerService.i();
        C2040Ps0 c2040Ps0 = new C2040Ps0();
        if (!i.r) {
            i.n = new C1910Os0(c2040Ps0);
            Q83 q83 = O83.a;
            q83.m("ResumptionAttemptLeft");
            DownloadManagerService i2 = DownloadManagerService.i();
            N.MQ35Y$D$(i2.l(), i2, ProfileKey.a());
            String i3 = q83.i("Chrome.DownloadInterstitial.PendingRemoval", "");
            if (!TextUtils.isEmpty(i3)) {
                String[] split = i3.split(",");
                OfflineContentAggregatorBridge a = AbstractC0653Fa2.a();
                String str = split[0];
                String str2 = split[1];
                if (str == null) {
                    str = "";
                }
                String str3 = str2 != null ? str2 : "";
                long j = a.a;
                if (j != 0) {
                    N.MGbhWq61(j, a, str, str3);
                }
                q83.n("Chrome.DownloadInterstitial.PendingRemoval");
            }
            i.r = true;
        }
        VrModuleProvider.e();
        VrModuleProvider.b().D();
        PowerMonitor.a();
        if (this.I == null && getIntent() != null) {
            VrModuleProvider.b().G(this, getIntent());
        }
        Boolean bool = BundleUtils.a;
        super.l();
        C11052wL1 c11052wL1 = (C11052wL1) this.Y.g;
        C10285u6 c10285u6 = this.H;
        m mVar = this.H0.C;
        C4884eO c4884eO = (C4884eO) ((H5) c10285u6.g);
        ViewStub viewStub = (ViewStub) findViewById(R.id.keyboard_accessory_sheet_stub);
        ViewStub viewStub2 = (ViewStub) findViewById(R.id.keyboard_accessory_stub);
        c11052wL1.getClass();
        if (viewStub2 != null && viewStub != null) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("AutofillKeyboardAccessory")) {
                viewStub2.setLayoutResource(R.layout.0_resource_name_obfuscated_res_0x7f0e014d);
            } else {
                viewStub2.setLayoutResource(R.layout.0_resource_name_obfuscated_res_0x7f0e0149);
            }
            viewStub.setLayoutResource(R.layout.0_resource_name_obfuscated_res_0x7f0e014e);
            final CL1 cl1 = c11052wL1.a;
            e eVar = new e(cl1, viewStub2);
            X1 x1 = new X1(viewStub);
            DialogInterfaceOnClickListenerC11983z30 dialogInterfaceOnClickListenerC11983z30 = new DialogInterfaceOnClickListenerC11983z30(c10285u6.j);
            cl1.getClass();
            cl1.o = (ChromeActivity) c10285u6.k().get();
            cl1.h = c10285u6;
            cl1.m = eVar;
            cl1.r = mVar;
            cl1.s = c4884eO;
            cl1.t = dialogInterfaceOnClickListenerC11983z30;
            PropertyModel propertyModel = cl1.g;
            LD2 ld2 = EL1.b;
            int i4 = c10285u6.i.g;
            if (i4 != 0 && i4 != 2) {
                z = false;
            }
            propertyModel.k(ld2, z);
            propertyModel.a(new VD2() { // from class: xL1
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                @Override // defpackage.VD2
                public final void d(defpackage.WD2 r14, java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 630
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C11395xL1.d(WD2, java.lang.Object):void");
                }
            });
            cl1.n = x1;
            C7822mv1 c7822mv1 = cl1.m.b.b;
            c7822mv1.getClass();
            x1.a.a.o(AbstractC3736b2.f, new C7478lv1(c7822mv1));
            cl1.n.a.a.m(AbstractC3736b2.d, cl1.o.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a2) * 3);
            WindowAndroid windowAndroid = cl1.h;
            if (windowAndroid == null) {
                K14 k14 = C1881Om1.k;
                interfaceC7697ma2 = null;
            } else {
                interfaceC7697ma2 = (InterfaceC7697ma2) C1881Om1.k.e(windowAndroid.t);
            }
            cl1.i = interfaceC7697ma2;
            cl1.o.findViewById(android.R.id.content).addOnLayoutChangeListener(cl1);
            cl1.u = this.M0;
            cl1.v.p(Boolean.valueOf(cl1.f1()));
            if (C9861ss.b()) {
                cl1.u.a(cl1, 6);
            }
            cl1.p = new BL1(cl1, cl1.o.s1());
            ((XU0) cl1.o.q1()).a(cl1.x);
            ((m) cl1.r).a(cl1.y);
            Tab tab = (Tab) cl1.o.A0.g;
            if (tab != null && cl1.l.add(tab)) {
                tab.v(cl1.w);
            }
            cl1.e1();
        }
        this.E0.a(new C9970tA3(new C10377uN2(s1()), AbstractC10848vl.a));
        AbstractC1895Op0 abstractC1895Op0 = this.H.i;
        C5218fM c5218fM = new C5218fM(this);
        this.G0 = c5218fM;
        abstractC1895Op0.a.put(c5218fM, null);
    }

    @Override // defpackage.InterfaceC0560Ei
    public boolean O(int i, Bundle bundle) {
        this.C0 = bundle;
        C10709vL1 c10709vL1 = this.Y;
        c10709vL1.getClass();
        if (AbstractC12248zp3.a(c10709vL1)) {
            CL1 cl1 = ((C11052wL1) c10709vL1.g).a;
            if (cl1.a1()) {
                cl1.d1();
                cl1.Y0();
            }
        }
        return Y(i, true);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || !O(menuItem.getItemId(), null)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public boolean X() {
        if (m()) {
            return false;
        }
        int c = ApplicationStatus.c(this);
        C7851n02.i.getClass();
        boolean p = C7851n02.p(this);
        if (c != 3) {
            return p && c == 4;
        }
        return true;
    }

    public InterfaceC1631Mo1 W0() {
        return new C5906hM(this);
    }

    public InterfaceC10590uz3 s1() {
        AbstractC9561rz3 abstractC9561rz3 = this.d0;
        if (abstractC9561rz3.d) {
            return abstractC9561rz3.b;
        }
        throw new IllegalStateException("Attempting to access TabModelSelector before initialization");
    }

    public AbstractC10569uv3 b(boolean z) {
        if (!this.d0.d) {
            throw new IllegalStateException("Attempting to access TabCreator before initialization");
        }
        return ((InterfaceC10912vv3) this.X.g).b(z);
    }

    public AbstractC10569uv3 n1() {
        return b(((AbstractC11276wz3) s1()).o());
    }

    public final TabModel o1() {
        InterfaceC10590uz3 s1 = s1();
        if (s1 == null) {
            return AbstractC11682yA0.a;
        }
        return ((AbstractC11276wz3) s1).g();
    }

    public Tab g1() {
        if (this.d0.d) {
            return AbstractC1558Lz3.a(o1());
        }
        return null;
    }

    public final WebContents p1() {
        Tab a;
        if (this.d0.d && (a = AbstractC1558Lz3.a(o1())) != null) {
            return a.b();
        }
        return null;
    }

    public final CC k1() {
        DC dc = this.Z;
        dc.getClass();
        if (!AbstractC12248zp3.a(dc) && m()) {
            throw new IllegalStateException();
        }
        return (CC) dc.g;
    }

    public final ZU0 q1() {
        return k1().z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    @Override // defpackage.AbstractActivityC7416ll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I0(android.content.res.Configuration r9) {
        /*
            r8 = this;
            android.content.res.Configuration r0 = r8.D0
            if (r0 == 0) goto L9f
            Ed2 r0 = r8.E0
            java.lang.Object r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2c
            int r0 = defpackage.AbstractActivityC7416ll.x0(r8)
            r3 = 600(0x258, float:8.41E-43)
            if (r0 < r3) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            android.content.res.Configuration r4 = r8.D0
            int r4 = r4.smallestScreenWidthDp
            if (r4 < r3) goto L21
            r3 = r2
            goto L22
        L21:
            r3 = r1
        L22:
            if (r3 == r0) goto L26
            r0 = r2
            goto L27
        L26:
            r0 = r1
        L27:
            if (r0 == 0) goto L2c
            r8.J1()
        L2c:
            android.content.res.Configuration r0 = r8.D0
            int r3 = r0.uiMode
            int r4 = r9.uiMode
            if (r3 != r4) goto L35
            goto L48
        L35:
            r5 = r3 & 15
            r6 = 7
            if (r5 != r6) goto L3c
            r5 = r2
            goto L3d
        L3c:
            r5 = r1
        L3d:
            r7 = r4 & 15
            if (r7 != r6) goto L43
            r6 = r2
            goto L44
        L43:
            r6 = r1
        L44:
            if (r5 != r6) goto L48
            r5 = r2
            goto L49
        L48:
            r5 = r1
        L49:
            if (r5 == 0) goto L5a
            r3 = r3 & 48
            r4 = r4 & 48
            if (r3 == r4) goto L53
            r3 = r2
            goto L54
        L53:
            r3 = r1
        L54:
            if (r3 != 0) goto L5a
            r8.recreate()
            return
        L5a:
            int r3 = r9.densityDpi
            int r0 = r0.densityDpi
            if (r3 == r0) goto L74
            li4 r0 = org.chromium.chrome.browser.vr.VrModuleProvider.b()
            android.content.res.Configuration r3 = r8.D0
            int r3 = r3.densityDpi
            int r4 = r9.densityDpi
            boolean r0 = r0.A(r3, r4)
            if (r0 != 0) goto L74
            r8.recreate()
            return
        L74:
            int r0 = r9.orientation
            android.content.res.Configuration r3 = r8.D0
            int r3 = r3.orientation
            if (r0 == r3) goto L9f
            r3 = 2
            if (r0 != r3) goto L80
            r1 = r2
        L80:
            org.chromium.chrome.browser.tab.Tab r0 = r8.g1()
            if (r0 == 0) goto L9f
            boolean r3 = r0.isIncognito()
            if (r3 != 0) goto L9f
            org.chromium.content_public.browser.WebContents r3 = r0.b()
            if (r3 != 0) goto L93
            goto L9f
        L93:
            org.chromium.content_public.browser.WebContents r0 = r0.b()
            r1 = r1 ^ r2
            java.lang.String r2 = "Android.ScreenRotation"
            java.lang.String r3 = "TargetDeviceOrientation"
            J.N.MCnWTXic(r0, r2, r3, r1)
        L9f:
            r8.D0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.app.ChromeActivity.I0(android.content.res.Configuration):void");
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.n0) {
            M1(z, false);
            if (!z && ApplicationStatus.c(this) == 3) {
                B1();
                C1();
                C7851n02.i.getClass();
                N.MJuAVRUC(C7851n02.p(this));
            }
        }
        VrModuleProvider.b().B(z);
        super.onMultiWindowModeChanged(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (C10712vM.f(i)) {
            View findViewById = findViewById(R.id.control_container);
            try {
                B80 b80 = (B80) findViewById;
                if (b80 != null) {
                    ((ToolbarControlContainer) b80).i.g.j.b();
                }
            } catch (ClassCastException e) {
                AbstractC4851eH1.a("ChromeActivity", "crbug.com/1236981", e);
                if (Build.VERSION.SDK_INT >= 29) {
                    findViewById.getSourceLayoutResId();
                }
            }
        }
    }

    @Override // defpackage.F70
    public void i(String str) {
        AbstractC10569uv3 b;
        Tab g1 = g1();
        if (g1 == null || (b = b(g1.isIncognito())) == null) {
            return;
        }
        b.b(0, g1(), new LoadUrlParams(str, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Y(int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.app.ChromeActivity.Y(int, boolean):boolean");
    }

    public final void O1(String str, String str2, Profile profile) {
        String string;
        boolean isIncognito = o1().isIncognito();
        if (TextUtils.isEmpty(str)) {
            string = getString(R.string.0_resource_name_obfuscated_res_0x7f1404e8);
        } else if (str.startsWith("chrome-native://bookmarks/")) {
            string = getString(R.string.0_resource_name_obfuscated_res_0x7f1404e4);
        } else if (str.equals("chrome://history/")) {
            string = getString(R.string.0_resource_name_obfuscated_res_0x7f1404e9);
        } else if (N.M$l72hrq(str)) {
            string = getString(R.string.0_resource_name_obfuscated_res_0x7f1404f3);
        } else if (isIncognito) {
            string = getString(R.string.0_resource_name_obfuscated_res_0x7f1404ea);
        } else if (str.equals("chrome-native://newtab/")) {
            string = getString(R.string.0_resource_name_obfuscated_res_0x7f1404ec);
        } else {
            string = getString(R.string.0_resource_name_obfuscated_res_0x7f1404f6);
        }
        C12008z71.a().d(this, string, str, profile);
        FI2.a(str2);
    }

    public final void C1() {
        if (this.h0 == null) {
            this.h0 = new UmaSessionStats(this);
        }
        UmaSessionStats.a();
        UmaSessionStats umaSessionStats = this.h0;
        InterfaceC10590uz3 s1 = s1();
        C10285u6 c10285u6 = this.H;
        if (UmaSessionStats.f == 0) {
            umaSessionStats.getClass();
            UmaSessionStats.f = N.MU4tSmY3();
        }
        umaSessionStats.a = s1;
        int i = 0;
        if (s1 != null) {
            ComponentCallbacksC10940w04 componentCallbacksC10940w04 = new ComponentCallbacksC10940w04(umaSessionStats);
            umaSessionStats.d = componentCallbacksC10940w04;
            Context context = umaSessionStats.c;
            context.registerComponentCallbacks(componentCallbacksC10940w04);
            umaSessionStats.e = context.getResources().getConfiguration().keyboard != 1;
            umaSessionStats.b = new C11283x04(umaSessionStats, umaSessionStats.a);
        }
        N.M950EFso(UmaSessionStats.f, umaSessionStats);
        C9626sA2 g = C9626sA2.g();
        g.b.p("in_metrics_sample", N.MGJFzlge());
        N.MmqfIJ4g(AbstractC1171Ja0.a(g));
        UmaSessionStats.a();
        Object obj = AbstractC6717jj0.a;
        try {
            new C4312cj0().c(AbstractC0185Bl.e);
        } catch (RejectedExecutionException unused) {
        }
        if (c10285u6 != null) {
            if (!c10285u6.hasPermission("android.permission.RECORD_AUDIO")) {
                i = c10285u6.canRequestPermission("android.permission.RECORD_AUDIO") ? 1 : 2;
            }
            EI2.h(i, 3, "VoiceInteraction.AudioPermissionEvent.SessionStart");
        }
    }

    public final void B1() {
        UmaSessionStats umaSessionStats = this.h0;
        if (umaSessionStats == null) {
            return;
        }
        if (umaSessionStats.a != null) {
            umaSessionStats.c.unregisterComponentCallbacks(umaSessionStats.d);
            umaSessionStats.b.destroy();
            umaSessionStats.a = null;
        }
        N.MAKAEiev(UmaSessionStats.f, umaSessionStats);
    }

    public final void K1() {
        if (!this.n0) {
            this.l0 = true;
            return;
        }
        this.l0 = false;
        if (this.m0) {
            return;
        }
        this.m0 = true;
        w1();
        RB2 a = RB2.a();
        a.getClass();
        ThreadUtils.a();
        if (!a.c) {
            a.c = true;
            a.b();
        }
        final C3637al0 b = C3637al0.b();
        b.getClass();
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: Zk0
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                C3637al0 c3637al0 = C3637al0.this;
                LinkedList linkedList = c3637al0.a;
                Runnable runnable = (Runnable) linkedList.poll();
                if (runnable != null) {
                    runnable.run();
                }
                if (linkedList.isEmpty()) {
                    if (C3637al0.b == c3637al0) {
                        C3637al0.b = null;
                    }
                    return false;
                }
                new Handler().post(new RunnableC12082zL2());
                return true;
            }
        });
    }

    @Override // android.app.Activity
    public final void onAttachFragment(Fragment fragment) {
        C4559dR2 c4559dR2 = this.H0;
        if (c4559dR2 == null) {
            return;
        }
        c4559dR2.getClass();
        if (fragment instanceof FF2) {
            ((FF2) fragment).a(c4559dR2.k);
        }
    }

    public static ChromeActivity f1(WebContents webContents) {
        Activity a = AbstractC9942t6.a(webContents);
        if (a instanceof ChromeActivity) {
            return (ChromeActivity) a;
        }
        return null;
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public final boolean C(int i, int i2, Intent intent) {
        return super.C(i, i2, intent) || VrModuleProvider.b().x(i, i2);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (!VrModuleProvider.b().d()) {
            VrModuleProvider.d().getClass();
            if (!Hi4.b(intent)) {
                VrModuleProvider.b().R(new Runnable() { // from class: XL
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChromeActivity.R0(ChromeActivity.this, intent, bundle);
                    }
                });
                return;
            }
        }
        if (VrModuleProvider.b().a()) {
            VrModuleProvider.d().e(intent);
        }
        super.startActivity(intent, bundle);
    }

    public static /* synthetic */ void R0(ChromeActivity chromeActivity, Intent intent, Bundle bundle) {
        chromeActivity.getClass();
        if (!VrModuleProvider.b().d()) {
            throw new IllegalStateException("Still in VR after having exited VR.");
        }
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void startActivityForResult(final Intent intent, final int i, final Bundle bundle) {
        if (!VrModuleProvider.b().d()) {
            VrModuleProvider.d().getClass();
            if (!Hi4.b(intent)) {
                VrModuleProvider.b().R(new Runnable() { // from class: WL
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChromeActivity.Q0(ChromeActivity.this, intent, i, bundle);
                    }
                });
                return;
            }
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public static /* synthetic */ void Q0(ChromeActivity chromeActivity, Intent intent, int i, Bundle bundle) {
        chromeActivity.getClass();
        if (!VrModuleProvider.b().d()) {
            throw new IllegalStateException("Still in VR after having exited VR.");
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final boolean startActivityIfNeeded(Intent intent, int i) {
        return startActivityIfNeeded(intent, i, null);
    }

    @Override // android.app.Activity
    public final boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        if (VrModuleProvider.b().a()) {
            VrModuleProvider.d().getClass();
            if (!Hi4.b(intent)) {
                return false;
            }
        }
        return super.startActivityIfNeeded(intent, i, bundle);
    }

    public boolean P1() {
        return u1() != -1;
    }

    @Override // defpackage.LM, defpackage.InterfaceC4787e52
    public final void R() {
        C0538Ed2 c0538Ed2 = this.E0;
        if (c0538Ed2.get() != null) {
            ((C9970tA3) c0538Ed2.get()).a();
        }
        super.R();
    }

    public final void J1() {
        C0538Ed2 c0538Ed2 = this.E0;
        if (c0538Ed2.get() == null || this.F0) {
            return;
        }
        ((C9970tA3) c0538Ed2.get()).a();
        this.F0 = true;
        if (isFinishing()) {
            return;
        }
        recreate();
    }
}
