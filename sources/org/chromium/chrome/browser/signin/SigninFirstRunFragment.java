package org.chromium.chrome.browser.signin;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import com.android.chrome.R;
import defpackage.AbstractActivityC4890eP0;
import defpackage.AbstractC4267cb3;
import defpackage.AbstractC7296lP0;
import defpackage.C0154Be3;
import defpackage.C1044Ia3;
import defpackage.C2993Xa3;
import defpackage.C9626sA2;
import defpackage.DU0;
import defpackage.EI2;
import defpackage.InterfaceC0024Ae3;
import defpackage.InterfaceC0914Ha3;
import defpackage.InterfaceC3562aY1;
import defpackage.InterfaceC7640mP0;
import defpackage.LD2;
import defpackage.ZX1;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.enterprise.util.EnterpriseInfo;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;
import org.chromium.chrome.browser.signin.SigninFirstRunFragment;
import org.chromium.chrome.browser.ui.signin.fre.SigninFirstRunView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SigninFirstRunFragment extends c implements InterfaceC7640mP0, InterfaceC0914Ha3, DU0 {
    public static final /* synthetic */ int k0 = 0;
    public FrameLayout b0;
    public ZX1 c0;
    public C0154Be3 d0;
    public C1044Ia3 e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;

    @Override // androidx.fragment.app.c
    public final void f0(Context context) {
        super.f0(context);
        ((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).W.j(new Callback() { // from class: Ja3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                SigninFirstRunFragment signinFirstRunFragment = SigninFirstRunFragment.this;
                signinFirstRunFragment.f0 = 1;
                signinFirstRunFragment.N0();
            }
        });
        ((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).Z.j(new Callback() { // from class: Ka3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                SigninFirstRunFragment signinFirstRunFragment = SigninFirstRunFragment.this;
                signinFirstRunFragment.f0 = 2;
                signinFirstRunFragment.N0();
            }
        });
        if (((FirstRunActivity) AbstractC7296lP0.a(this)).g0) {
            C0154Be3 c0154Be3 = new C0154Be3(((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).W, EnterpriseInfo.b(), (InterfaceC0024Ae3) null);
            this.d0 = c0154Be3;
            c0154Be3.j(new Callback() { // from class: La3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i = SigninFirstRunFragment.k0;
                    final SigninFirstRunFragment signinFirstRunFragment = SigninFirstRunFragment.this;
                    signinFirstRunFragment.getClass();
                    if (!((Boolean) obj).booleanValue() || signinFirstRunFragment.g0) {
                        return;
                    }
                    signinFirstRunFragment.g0 = true;
                    new Handler().postDelayed(new Runnable() { // from class: Na3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = SigninFirstRunFragment.k0;
                            SigninFirstRunFragment signinFirstRunFragment2 = SigninFirstRunFragment.this;
                            signinFirstRunFragment2.getClass();
                            ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment2)).T0(false);
                            FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment2);
                            firstRunActivity.getClass();
                            O83.a.p("Chrome.FirstRun.SkippedByPolicy", true);
                            if (!firstRunActivity.S0()) {
                                firstRunActivity.finish();
                            } else {
                                ApplicationStatus.f(new C3516aP0(firstRunActivity));
                            }
                        }
                    }, C10021tL.f().d() ? 2000 : 1000);
                }
            });
        }
        this.c0 = ((InterfaceC3562aY1) getActivity()).N();
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.j0 = false;
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.b0 = frameLayout;
        frameLayout.addView(M0(layoutInflater, N().getConfiguration()));
        return this.b0;
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1 || i2 != -1 || intent == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
            return;
        }
        this.e0.a.k(stringExtra);
    }

    @Override // defpackage.InterfaceC7640mP0
    public final void a() {
        if (this.h0 || AbstractC7296lP0.a(this) == null) {
            return;
        }
        this.h0 = true;
        this.f0 = 0;
        FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(this);
        firstRunActivity.getClass();
        EI2.n(SystemClock.elapsedRealtime() - firstRunActivity.h0, "MobileFre.FromLaunch.NativeInitialized");
        N0();
    }

    @Override // defpackage.InterfaceC7640mP0
    public final void reset() {
        C1044Ia3 c1044Ia3 = this.e0;
        if (c1044Ia3 != null) {
            LD2 ld2 = AbstractC4267cb3.f;
            PropertyModel propertyModel = c1044Ia3.a.k;
            propertyModel.k(ld2, false);
            propertyModel.k(AbstractC4267cb3.g, false);
        }
    }

    public final void L0() {
        ((FirstRunActivity) AbstractC7296lP0.a(this)).U0();
    }

    @Override // defpackage.DU0
    public final void o(boolean z) {
        this.j0 = z;
    }

    public final void O0(C1044Ia3 c1044Ia3) {
        C1044Ia3 c1044Ia32 = this.e0;
        if (c1044Ia32 != null) {
            C2993Xa3 c2993Xa3 = c1044Ia32.a;
            c2993Xa3.l.e(c2993Xa3);
            c2993Xa3.h.j(c2993Xa3);
        }
        this.e0 = c1044Ia3;
        if (c1044Ia3 == null || !this.i0) {
            return;
        }
        c1044Ia3.a(((Boolean) ((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).W.get()).booleanValue());
    }

    public final void N0() {
        if (AbstractC7296lP0.a(this) == null || this.e0 == null || !this.h0 || ((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).Z.get() == null || ((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).W.get() == null || this.i0) {
            return;
        }
        this.i0 = true;
        this.j0 = true ^ this.e0.a.c();
        this.e0.a(((Boolean) ((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).W.get()).booleanValue());
        FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(this);
        firstRunActivity.getClass();
        EI2.n(SystemClock.elapsedRealtime() - firstRunActivity.h0, "MobileFre.FromLaunch.NativePolicyAndChildStatusLoaded");
        EI2.h(this.f0, 3, "MobileFre.SlowestLoadPoint");
    }

    public final SigninFirstRunView M0(LayoutInflater layoutInflater, Configuration configuration) {
        SigninFirstRunView signinFirstRunView = (SigninFirstRunView) layoutInflater.inflate(AbstractC7296lP0.a(this).h() && configuration.orientation == 2 && configuration.screenWidthDp >= 600 ? R.layout.0_resource_name_obfuscated_res_0x7f0e027d : R.layout.0_resource_name_obfuscated_res_0x7f0e027e, (ViewGroup) null, false);
        O0(new C1044Ia3(B0(), signinFirstRunView, this.c0, this, C9626sA2.g()));
        N0();
        return signinFirstRunView;
    }

    @Override // defpackage.InterfaceC7640mP0
    public final void e() {
        View view = this.L;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.title).sendAccessibilityEvent(8);
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        this.b0.removeAllViews();
        this.b0.addView(M0((LayoutInflater) getActivity().getSystemService("layout_inflater"), configuration));
    }

    @Override // androidx.fragment.app.c
    public final void k0() {
        this.f11484J = true;
        O0(null);
    }

    @Override // androidx.fragment.app.c
    public final void l0() {
        this.f11484J = true;
        this.b0 = null;
        C0154Be3 c0154Be3 = this.d0;
        if (c0154Be3 != null) {
            c0154Be3.a();
            this.d0 = null;
        }
    }
}
