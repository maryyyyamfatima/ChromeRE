package org.chromium.chrome.browser.firstrun;

import J.N;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import defpackage.AbstractActivityC4890eP0;
import defpackage.AbstractC1171Ja0;
import defpackage.C0154Be3;
import defpackage.C10021tL;
import defpackage.C4478dB1;
import defpackage.C4821eB1;
import defpackage.C5922hP0;
import defpackage.C8490os;
import defpackage.C9626sA2;
import defpackage.EI2;
import defpackage.InterfaceC3467aF1;
import defpackage.InterfaceC8146ns;
import defpackage.O83;
import defpackage.Q83;
import defpackage.XA1;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.enterprise.util.EnterpriseInfo;
import org.chromium.chrome.browser.firstrun.LightweightFirstRunActivity;
import org.chromium.chrome.browser.metrics.UmaSessionStats;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LightweightFirstRunActivity extends AbstractActivityC4890eP0 implements InterfaceC3467aF1 {
    public static final /* synthetic */ int n0 = 0;
    public final C0154Be3 a0;
    public TextView b0;
    public Button c0;
    public LoadingView d0;
    public View e0;
    public View f0;
    public View g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public long k0;
    public Handler l0;
    public XA1 m0;

    public LightweightFirstRunActivity() {
        C0154Be3 c0154Be3 = new C0154Be3(this.W, EnterpriseInfo.b(), new C4821eB1(this));
        this.a0 = c0154Be3;
        c0154Be3.j(new Callback() { // from class: VA1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                LightweightFirstRunActivity lightweightFirstRunActivity = LightweightFirstRunActivity.this;
                if (lightweightFirstRunActivity.h0) {
                    lightweightFirstRunActivity.d0.c();
                }
            }
        });
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void H0() {
        C8490os.a(this, this.l, new InterfaceC8146ns() { // from class: WA1
            @Override // defpackage.InterfaceC8146ns
            public final boolean onBackPressed() {
                int i = LightweightFirstRunActivity.n0;
                LightweightFirstRunActivity lightweightFirstRunActivity = LightweightFirstRunActivity.this;
                lightweightFirstRunActivity.finish();
                AbstractActivityC4890eP0.Q0(lightweightFirstRunActivity.getIntent(), false);
                return true;
            }
        });
    }

    @Override // defpackage.AbstractActivityC4890eP0, defpackage.AbstractActivityC7416ll
    public final void P0() {
        super.P0();
        setFinishOnTouchOutside(true);
        AccountManagerFacadeProvider.getInstance().a().g(new C5922hP0(new C4478dB1(this, this, this.Z)));
        F0();
    }

    public final void T0(boolean z) {
        int i = z ? 0 : 8;
        this.b0.setVisibility(i);
        this.f0.setVisibility(i);
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void P() {
        this.e0.setVisibility(0);
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void n() {
        EI2.n(SystemClock.elapsedRealtime() - this.k0, "MobileFre.Lightweight.LoadingDuration");
        if (this.a0.get().booleanValue()) {
            U0();
            return;
        }
        boolean isAccessibilityFocused = this.e0.isAccessibilityFocused();
        this.e0.setVisibility(8);
        T0(true);
        if (isAccessibilityFocused) {
            this.b0.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.AbstractActivityC4890eP0, defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void l() {
        super.l();
        this.i0 = true;
        if (this.j0) {
            C9626sA2 g = C9626sA2.g();
            g.b.p("Chrome.Privacy.UsageAndCrashReportingPermittedByUser", false);
            N.MmqfIJ4g(AbstractC1171Ja0.a(g));
            N.Mh1r7OJ$(false);
            UmaSessionStats.a();
            Q83 q83 = O83.a;
            q83.p("first_run_tos_accepted", true);
            N.MSb7o$8Q();
            q83.p("lightweight_first_run_flow", true);
            finish();
            S0();
        }
    }

    @Override // defpackage.AbstractActivityC4890eP0, defpackage.AbstractActivityC7416ll, defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        XA1 xa1;
        super.onDestroy();
        this.d0.b();
        C0154Be3 c0154Be3 = this.a0;
        if (c0154Be3 != null) {
            c0154Be3.a();
        }
        Handler handler = this.l0;
        if (handler == null || (xa1 = this.m0) == null) {
            return;
        }
        handler.removeCallbacks(xa1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [XA1] */
    public final void U0() {
        this.e0.setVisibility(8);
        this.g0.setVisibility(0);
        this.g0.sendAccessibilityEvent(8);
        this.m0 = new Runnable() { // from class: XA1
            @Override // java.lang.Runnable
            public final void run() {
                int i = LightweightFirstRunActivity.n0;
                LightweightFirstRunActivity lightweightFirstRunActivity = LightweightFirstRunActivity.this;
                lightweightFirstRunActivity.getClass();
                O83.a.p("Chrome.FirstRun.SkippedByPolicy", true);
                lightweightFirstRunActivity.finish();
                lightweightFirstRunActivity.S0();
                lightweightFirstRunActivity.m0 = null;
            }
        };
        Handler handler = new Handler(ThreadUtils.c());
        this.l0 = handler;
        handler.postDelayed(this.m0, C10021tL.f().d() ? 2000 : 1000);
    }
}
