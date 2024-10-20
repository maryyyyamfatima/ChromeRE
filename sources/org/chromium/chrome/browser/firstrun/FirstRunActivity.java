package org.chromium.chrome.browser.firstrun;

import J.N;
import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.c;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.AbstractActivityC4890eP0;
import defpackage.AbstractC10385uP0;
import defpackage.AbstractC11008wC2;
import defpackage.AbstractC1171Ja0;
import defpackage.AbstractC12248zp3;
import defpackage.C0538Ed2;
import defpackage.C3516aP0;
import defpackage.C4998ej;
import defpackage.C5922hP0;
import defpackage.C7984nP0;
import defpackage.C8490os;
import defpackage.C8671pP0;
import defpackage.C9626sA2;
import defpackage.EI2;
import defpackage.FR0;
import defpackage.IG3;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC7640mP0;
import defpackage.InterfaceC7913nB;
import defpackage.InterfaceC8146ns;
import defpackage.InterfaceC8328oP0;
import defpackage.O83;
import defpackage.Q83;
import defpackage.ViewTreeObserverOnPreDrawListenerC3860bP0;
import defpackage.YO0;
import defpackage.ZO0;
import defpackage.ZX1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Random;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;
import org.chromium.chrome.browser.metrics.UmaSessionStats;
import org.chromium.chrome.browser.signin.SigninFirstRunFragment;
import org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FirstRunActivity extends AbstractActivityC4890eP0 implements InterfaceC8328oP0 {
    public static final /* synthetic */ int m0 = 0;
    public boolean b0;
    public YO0 d0;
    public Bundle e0;
    public boolean f0;
    public boolean g0;
    public long h0;
    public ViewPager2 k0;
    public C8671pP0 l0;
    public final BitSet a0 = new BitSet(12);
    public final C0538Ed2 c0 = new C0538Ed2();
    public final ArrayList i0 = new ArrayList();
    public final ArrayList j0 = new ArrayList();

    @Override // defpackage.AbstractActivityC7416ll
    public final Bundle O0(Bundle bundle) {
        return null;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void H0() {
        C8490os.a(this, this.l, new InterfaceC8146ns() { // from class: SO0
            @Override // defpackage.InterfaceC8146ns
            public final boolean onBackPressed() {
                FirstRunActivity firstRunActivity = FirstRunActivity.this;
                if (firstRunActivity.b0) {
                    firstRunActivity.d0.f(firstRunActivity.e0);
                    int i = firstRunActivity.k0.i;
                    do {
                        i--;
                        if (i <= 0) {
                            break;
                        }
                    } while (!((C7984nP0) firstRunActivity.i0.get(i)).b.a());
                    if (i >= 0) {
                        firstRunActivity.a1(i);
                        return true;
                    }
                    firstRunActivity.finish();
                    AbstractActivityC4890eP0.Q0(firstRunActivity.getIntent(), false);
                    return true;
                }
                firstRunActivity.finish();
                AbstractActivityC4890eP0.Q0(firstRunActivity.getIntent(), false);
                return true;
            }
        });
    }

    public final void Y0() {
        if (this.e0 != null) {
            if (this.l0 == null) {
                X0();
            }
            boolean z = this.b0;
            ArrayList arrayList = this.i0;
            if (!z && V0()) {
                this.d0.f(this.e0);
                InterfaceC7913nB interfaceC7913nB = new InterfaceC7913nB() { // from class: UO0
                    @Override // defpackage.InterfaceC7913nB
                    public final boolean a() {
                        return FirstRunActivity.this.e0.getBoolean("ShowSearchEnginePage");
                    }
                };
                InterfaceC7913nB interfaceC7913nB2 = new InterfaceC7913nB() { // from class: VO0
                    @Override // defpackage.InterfaceC7913nB
                    public final boolean a() {
                        return FirstRunActivity.this.e0.getBoolean("ShowSyncConsent");
                    }
                };
                boolean a = interfaceC7913nB.a();
                ArrayList arrayList2 = this.j0;
                if (a) {
                    arrayList.add(new C7984nP0(DefaultSearchEngineFirstRunFragment.class, interfaceC7913nB));
                    arrayList2.add(6);
                }
                arrayList.add(new C7984nP0(SyncConsentFirstRunFragment.class, interfaceC7913nB2));
                arrayList2.add(3);
                C8671pP0 c8671pP0 = this.l0;
                if (c8671pP0 != null) {
                    c8671pP0.t();
                }
                this.b0 = true;
            }
            if (!V0()) {
                return;
            }
            while (!((C7984nP0) arrayList.get(this.k0.i)).b.a() && U0()) {
            }
        }
    }

    public final void X0() {
        C7984nP0 c7984nP0;
        InterfaceC7913nB interfaceC7913nB = new InterfaceC7913nB() { // from class: TO0
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                int i = FirstRunActivity.m0;
                return !O83.a.e("skip_welcome_page", false);
            }
        };
        boolean isEnabled = FREMobileIdentityConsistencyFieldTrial.isEnabled();
        ArrayList arrayList = this.i0;
        if (isEnabled) {
            arrayList.add(new C7984nP0(SigninFirstRunFragment.class, interfaceC7913nB));
        } else {
            boolean z = false;
            if (this.g0 && !O83.a.e("skip_welcome_page", false)) {
                z = true;
            }
            if (z) {
                c7984nP0 = new C7984nP0(TosAndUmaFirstRunFragmentWithEnterpriseSupport.class, interfaceC7913nB);
            } else {
                c7984nP0 = new C7984nP0(ToSAndUMAFirstRunFragment.class, interfaceC7913nB);
            }
            arrayList.add(c7984nP0);
        }
        this.j0.add(1);
        C8671pP0 c8671pP0 = new C8671pP0(this, arrayList);
        this.l0 = c8671pP0;
        this.k0.c(c8671pP0);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [WO0] */
    @Override // defpackage.AbstractActivityC4890eP0, defpackage.AbstractActivityC7416ll
    public final void P0() {
        Object obj = FREMobileIdentityConsistencyFieldTrial.a;
        synchronized (obj) {
            Q83 q83 = O83.a;
            if (q83.i("Chrome.FirstRun.FieldTrialEnabled", null) == null) {
                int nextInt = new Random().nextInt(100);
                String str = "Default";
                if (nextInt < 10) {
                    str = "Enabled6";
                    int nextInt2 = new Random().nextInt(100);
                    int i = nextInt2 < 0 ? nextInt2 / 0 : -1;
                    synchronized (obj) {
                        q83.q(i, "Chrome.FirstRun.VariationFieldTrialGroup");
                    }
                } else if (nextInt < 20) {
                    str = "Disabled6";
                } else if (nextInt < 30) {
                    str = "OldFreWithUmaDialog6";
                }
                synchronized (obj) {
                    q83.t("Chrome.FirstRun.FieldTrialEnabled", str);
                }
            }
        }
        super.P0();
        if (getIntent() != null) {
            this.f0 = getIntent().getBooleanExtra("Extra.ComingFromChromeIcon", false);
            this.g0 = getIntent().getBooleanExtra("Extra.FreChromeLaunchIntentIsCct", false);
            this.h0 = getIntent().getLongExtra("Extra.FreIntentCreationElapsedRealtimeMs", 0L);
        }
        EI2.n(SystemClock.elapsedRealtime() - this.h0, "MobileFre.FromLaunch.TriggerLayoutInflation");
        setFinishOnTouchOutside(true);
        setContentView(W0());
        if (FREMobileIdentityConsistencyFieldTrial.isEnabled() && this.l0 == null) {
            X0();
        } else {
            View findViewById = findViewById(R.id.content);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC3860bP0(findViewById, new InterfaceC0079Ap3() { // from class: WO0
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return Boolean.valueOf(FirstRunActivity.this.i0.size() > 0);
                }
            }));
        }
        YO0 yo0 = new YO0(this, this, this.Z);
        this.d0 = yo0;
        AccountManagerFacadeProvider.getInstance().a().g(new C5922hP0(yo0));
        AbstractC10385uP0.a = true;
        Z0(0);
        F0();
        EI2.n(SystemClock.elapsedRealtime() - this.h0, "MobileFre.FromLaunch.ActivityInflated");
    }

    @Override // defpackage.LM
    public final ZX1 p0() {
        return new ZX1(new C4998ej(this));
    }

    public View W0() {
        ViewPager2 viewPager2 = new ViewPager2(this);
        this.k0 = viewPager2;
        viewPager2.t = false;
        viewPager2.v.e();
        this.k0.setId(com.android.chrome.R.id.fre_pager);
        ViewPager2 viewPager22 = this.k0;
        viewPager22.getClass();
        viewPager22.u = 3;
        viewPager22.o.requestLayout();
        return this.k0;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void J0() {
        super.J0();
        FR0 a = FR0.a();
        a.a.getClass();
        a.b("FirstRunActivity");
    }

    @Override // defpackage.AbstractActivityC4890eP0, defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void l() {
        super.l();
        IG3.a().i(new ZO0(this));
    }

    @Override // defpackage.AbstractActivityC4890eP0
    public final void R0(boolean z) {
        super.R0(z);
        EI2.n(SystemClock.elapsedRealtime() - this.h0, "MobileFre.FromLaunch.PoliciesLoaded");
        Y0();
    }

    public final boolean V0() {
        C0538Ed2 c0538Ed2 = this.c0;
        c0538Ed2.getClass();
        if (AbstractC12248zp3.a(c0538Ed2)) {
            return (this.e0 != null) && this.W.get() != null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.VS0
    public final void j0(c cVar) {
        if (cVar instanceof InterfaceC7640mP0) {
            final InterfaceC7640mP0 interfaceC7640mP0 = (InterfaceC7640mP0) cVar;
            C0538Ed2 c0538Ed2 = this.c0;
            c0538Ed2.getClass();
            if (AbstractC12248zp3.a(c0538Ed2)) {
                interfaceC7640mP0.a();
            } else {
                c0538Ed2.j(new Callback() { // from class: RO0
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        int i = FirstRunActivity.m0;
                        InterfaceC7640mP0.this.a();
                    }
                });
            }
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(new Bundle());
    }

    @Override // defpackage.AbstractActivityC7416ll, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStart() {
        super.onStart();
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if ((activity instanceof FirstRunActivity) && activity != this) {
                if (activity.getTaskId() == getTaskId()) {
                    activity.finish();
                } else {
                    activity.finishAndRemoveTask();
                }
            }
        }
    }

    public final boolean U0() {
        this.d0.f(this.e0);
        int i = this.k0.i + 1;
        while (i < this.l0.q() && !((C7984nP0) this.i0.get(i)).b.a()) {
            i++;
        }
        if (!a1(i)) {
            return false;
        }
        Z0(((Integer) this.j0.get(i)).intValue());
        return true;
    }

    public final boolean a1(int i) {
        if (i >= this.l0.q()) {
            EI2.k(SystemClock.elapsedRealtime() - this.h0, "MobileFre.FromLaunch.FreCompleted");
            if (!N.Mfrb03wj()) {
                N.MSb7o$8Q();
            }
            O83.a.p("first_run_flow", true);
            if (!S0()) {
                finish();
            } else {
                ApplicationStatus.f(new C3516aP0(this));
            }
            return false;
        }
        ViewPager2 viewPager2 = this.k0;
        int i2 = viewPager2.i;
        viewPager2.d(i, false);
        ArrayList arrayList = this.l0.s;
        InterfaceC7640mP0 interfaceC7640mP0 = i < arrayList.size() ? (InterfaceC7640mP0) arrayList.get(i) : null;
        if (interfaceC7640mP0 != null) {
            interfaceC7640mP0.e();
            if (i2 > i) {
                interfaceC7640mP0.reset();
            }
        }
        return true;
    }

    public final void Z0(int i) {
        BitSet bitSet = this.a0;
        if (bitSet.get(i)) {
            return;
        }
        bitSet.set(i);
        if (this.f0) {
            EI2.h(i, 12, "MobileFre.Progress.MainIntent");
        } else {
            EI2.h(i, 12, "MobileFre.Progress.ViewIntent");
        }
    }

    @Override // defpackage.InterfaceC8328oP0
    public boolean h() {
        return !getResources().getConfiguration().isLayoutSizeAtLeast(3);
    }

    public final void T0(boolean z) {
        N.M76Za3Tu(false);
        EI2.k(SystemClock.elapsedRealtime() - this.h0, "MobileFre.FromLaunch.TosAccepted");
        C9626sA2 g = C9626sA2.g();
        g.b.p("Chrome.Privacy.UsageAndCrashReportingPermittedByUser", z);
        N.MmqfIJ4g(AbstractC1171Ja0.a(g));
        N.Mh1r7OJ$(z);
        UmaSessionStats.a();
        Q83 q83 = O83.a;
        q83.p("first_run_tos_accepted", true);
        N.MSb7o$8Q();
        q83.p("skip_welcome_page", true);
        if (this.T) {
            AbstractC11008wC2.a();
        }
    }
}
