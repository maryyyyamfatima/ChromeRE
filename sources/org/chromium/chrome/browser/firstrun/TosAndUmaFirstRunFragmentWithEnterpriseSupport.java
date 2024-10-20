package org.chromium.chrome.browser.firstrun;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractActivityC4890eP0;
import defpackage.AbstractC7296lP0;
import defpackage.C0154Be3;
import defpackage.C0538Ed2;
import defpackage.C10021tL;
import defpackage.EI2;
import defpackage.InterfaceC3467aF1;
import defpackage.WS3;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.enterprise.util.EnterpriseInfo;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;
import org.chromium.chrome.browser.firstrun.TosAndUmaFirstRunFragmentWithEnterpriseSupport;
import org.chromium.components.policy.PolicyService;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TosAndUmaFirstRunFragmentWithEnterpriseSupport extends ToSAndUMAFirstRunFragment implements InterfaceC3467aF1 {
    public static final /* synthetic */ int v0 = 0;
    public boolean m0;
    public View n0;
    public View o0;
    public LoadingView p0;
    public TextView q0;
    public C0154Be3 r0;
    public final C0538Ed2 s0 = new C0538Ed2();
    public Handler t0;
    public long u0;

    @Override // androidx.fragment.app.c
    public final void j0() {
        LoadingView loadingView = this.p0;
        if (loadingView != null) {
            loadingView.b();
            this.p0 = null;
        }
        C0154Be3 c0154Be3 = this.r0;
        if (c0154Be3 != null) {
            c0154Be3.a();
            this.r0 = null;
        }
        Handler handler = this.t0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.t0 = null;
        }
        this.f11484J = true;
    }

    @Override // org.chromium.chrome.browser.firstrun.ToSAndUMAFirstRunFragment, androidx.fragment.app.c
    public final void f0(Context context) {
        super.f0(context);
        C0154Be3 c0154Be3 = new C0154Be3(((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).W, EnterpriseInfo.b(), new WS3(this));
        this.r0 = c0154Be3;
        c0154Be3.j(new Callback() { // from class: VS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                TosAndUmaFirstRunFragmentWithEnterpriseSupport tosAndUmaFirstRunFragmentWithEnterpriseSupport = TosAndUmaFirstRunFragmentWithEnterpriseSupport.this;
                if (tosAndUmaFirstRunFragmentWithEnterpriseSupport.m0) {
                    tosAndUmaFirstRunFragmentWithEnterpriseSupport.p0.c();
                }
            }
        });
    }

    @Override // org.chromium.chrome.browser.firstrun.ToSAndUMAFirstRunFragment, androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        super.v0(view, bundle);
        this.n0 = view.findViewById(R.id.fre_bottom_group);
        this.o0 = view.findViewById(R.id.loading_view_container);
        this.p0 = (LoadingView) view.findViewById(R.id.progress_spinner_large);
        this.q0 = (TextView) view.findViewById(R.id.privacy_disclaimer);
        this.m0 = true;
        this.u0 = SystemClock.elapsedRealtime();
        if (this.r0.get() == null) {
            this.p0.a(this);
            this.p0.e();
            this.n0.setVisibility(8);
            O0(false);
            return;
        }
        if (this.r0.get().booleanValue()) {
            this.n0.setVisibility(8);
            O0(false);
            R0(false);
        }
    }

    @Override // org.chromium.chrome.browser.firstrun.ToSAndUMAFirstRunFragment, defpackage.InterfaceC7640mP0
    public final void a() {
        super.a();
        C0154Be3 c0154Be3 = this.r0;
        if (c0154Be3 == null || c0154Be3.get() != null) {
            return;
        }
        this.s0.a((PolicyService) N.MXHPjU6q());
    }

    @Override // org.chromium.chrome.browser.firstrun.ToSAndUMAFirstRunFragment
    public final boolean L0() {
        return (!super.L0() || this.r0.get() == null || this.r0.get().booleanValue()) ? false : true;
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void P() {
        this.o0.setVisibility(0);
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void n() {
        EI2.n(SystemClock.elapsedRealtime() - this.u0, "MobileFre.CctTos.LoadingDuration");
        boolean isAccessibilityFocused = this.o0.isAccessibilityFocused();
        this.o0.setVisibility(8);
        if (this.r0.get().booleanValue()) {
            R0(isAccessibilityFocused);
            return;
        }
        this.n0.setVisibility(0);
        O0(true);
        if (isAccessibilityFocused) {
            this.h0.sendAccessibilityEvent(8);
        }
    }

    public final void R0(boolean z) {
        this.q0.setVisibility(0);
        if (z) {
            this.q0.sendAccessibilityEvent(8);
        } else {
            TextView textView = this.q0;
            textView.announceForAccessibility(textView.getText());
        }
        Runnable runnable = new Runnable() { // from class: US3
            @Override // java.lang.Runnable
            public final void run() {
                int i = TosAndUmaFirstRunFragmentWithEnterpriseSupport.v0;
                TosAndUmaFirstRunFragmentWithEnterpriseSupport tosAndUmaFirstRunFragmentWithEnterpriseSupport = TosAndUmaFirstRunFragmentWithEnterpriseSupport.this;
                tosAndUmaFirstRunFragmentWithEnterpriseSupport.getClass();
                FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(tosAndUmaFirstRunFragmentWithEnterpriseSupport);
                firstRunActivity.getClass();
                O83.a.p("Chrome.FirstRun.SkippedByPolicy", true);
                if (!firstRunActivity.S0()) {
                    firstRunActivity.finish();
                } else {
                    ApplicationStatus.f(new C3516aP0(firstRunActivity));
                }
            }
        };
        Handler handler = new Handler(ThreadUtils.c());
        this.t0 = handler;
        handler.postDelayed(runnable, C10021tL.f().d() ? 2000 : 1000);
    }
}
