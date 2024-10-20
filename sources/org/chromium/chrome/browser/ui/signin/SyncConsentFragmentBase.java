package org.chromium.chrome.browser.ui.signin;

import J.N;
import android.accounts.Account;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import com.android.chrome.R;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC8540p04;
import defpackage.AbstractC9108qg3;
import defpackage.B4;
import defpackage.C0140Bc;
import defpackage.C10322uC2;
import defpackage.C10610v3;
import defpackage.C11997z52;
import defpackage.C1202Jg1;
import defpackage.C3213Ys3;
import defpackage.C4502dG0;
import defpackage.C6073hq0;
import defpackage.C6674jc;
import defpackage.C6780jt3;
import defpackage.C7928nE;
import defpackage.C8560p40;
import defpackage.C8765pg3;
import defpackage.C8903q40;
import defpackage.C9636sC2;
import defpackage.C9925t30;
import defpackage.EI2;
import defpackage.F4;
import defpackage.FI2;
import defpackage.InterfaceC3562aY1;
import defpackage.InterfaceC5298fb3;
import defpackage.InterfaceC9238r3;
import defpackage.InterfaceC9979tC2;
import defpackage.T44;
import defpackage.UN;
import defpackage.V60;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC0139Bb3;
import defpackage.ViewTreeObserverOnScrollChangedListenerC0269Cb3;
import defpackage.ZX1;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial;
import org.chromium.chrome.browser.ui.signin.SigninScrollView;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class SyncConsentFragmentBase extends c implements InterfaceC9238r3, F4, InterfaceC5298fb3 {
    public static final /* synthetic */ int q0 = 0;
    public boolean c0;
    public SigninView d0;
    public C8903q40 e0;
    public String g0;
    public C10322uC2 h0;
    public boolean i0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public ZX1 n0;
    public C9925t30 o0;
    public C10610v3 p0;
    public final AccountManagerFacade b0 = AccountManagerFacadeProvider.getInstance();
    public final C3213Ys3 f0 = new InterfaceC9979tC2() { // from class: Ys3
        @Override // defpackage.InterfaceC9979tC2
        public final void u(String str) {
            int i = SyncConsentFragmentBase.q0;
            SyncConsentFragmentBase.this.S0(str);
        }
    };
    public boolean j0 = true;

    public abstract void M0(boolean z);

    public abstract void O0(String str, boolean z, Runnable runnable);

    public abstract void P0();

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void i() {
    }

    public static Bundle N0(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("SyncConsentFragmentBase.SigninFlowType", 0);
        bundle.putInt("SyncConsentFragmentBase.AccessPoint", i);
        bundle.putString("SyncConsentFragmentBase.AccountName", str);
        return bundle;
    }

    @Override // androidx.fragment.app.c
    public void f0(Context context) {
        super.f0(context);
        this.n0 = ((InterfaceC3562aY1) getActivity()).N();
    }

    @Override // androidx.fragment.app.c
    public void g0(Bundle bundle) {
        C10322uC2 b;
        super.g0(bundle);
        Bundle bundle2 = this.l;
        this.m0 = bundle2.getInt("SyncConsentFragmentBase.AccessPoint", 39);
        this.g0 = bundle2.getString("SyncConsentFragmentBase.AccountName", null);
        if (bundle2.containsKey("SyncConsentFragmentBase.ChildAccountStatus")) {
            this.c0 = bundle2.getBoolean("SyncConsentFragmentBase.ChildAccountStatus");
        } else {
            this.c0 = Profile.d().h();
        }
        int i = bundle2.getInt("SyncConsentFragmentBase.SigninFlowType", 0);
        if (bundle == null) {
            if (i == 1) {
                this.p0 = new C10610v3(B0(), this, this.n0);
            } else if (i == 2) {
                s();
            }
        }
        this.e0 = new C8903q40(N());
        if (this.c0) {
            Context B0 = B0();
            b = new C10322uC2(B0, B0.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08082b), new C9636sC2(B0, R.drawable.0_resource_name_obfuscated_res_0x7f0901b6));
        } else {
            b = C10322uC2.b(B0());
        }
        this.h0 = b;
        b.a(this.f0);
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.c(d).b(this);
        this.k0 = true;
        EI2.h(this.m0, 39, "Signin.SigninStartedAccessPoint");
        N.M3s_IHxy(this.m0);
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable e;
        boolean z = false;
        SigninView signinView = (SigninView) layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0280, viewGroup, false);
        this.d0 = signinView;
        signinView.h.setOnClickListener(new View.OnClickListener() { // from class: bt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncConsentFragmentBase syncConsentFragmentBase = SyncConsentFragmentBase.this;
                if (syncConsentFragmentBase.c0 || !syncConsentFragmentBase.L0()) {
                    return;
                }
                syncConsentFragmentBase.p0 = new C10610v3(syncConsentFragmentBase.B0(), syncConsentFragmentBase, syncConsentFragmentBase.n0);
            }
        });
        this.d0.q.setOnClickListener(new View.OnClickListener() { // from class: ct3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SyncConsentFragmentBase.q0;
                SyncConsentFragmentBase syncConsentFragmentBase = SyncConsentFragmentBase.this;
                syncConsentFragmentBase.getClass();
                FI2.a("Signin_Undo_Signin");
                syncConsentFragmentBase.k0 = false;
                syncConsentFragmentBase.P0();
            }
        });
        this.d0.p.setVisibility(8);
        this.d0.r.setVisibility(0);
        this.d0.r.setOnClickListener(new View.OnClickListener() { // from class: dt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SigninScrollView signinScrollView = SyncConsentFragmentBase.this.d0.a;
                signinScrollView.smoothScrollBy(0, signinScrollView.getHeight());
                FI2.a("Signin_MoreButton_Shown");
            }
        });
        SigninScrollView signinScrollView = this.d0.a;
        Runnable runnable = new Runnable() { // from class: et3
            @Override // java.lang.Runnable
            public final void run() {
                SyncConsentFragmentBase syncConsentFragmentBase = SyncConsentFragmentBase.this;
                syncConsentFragmentBase.d0.p.setVisibility(0);
                syncConsentFragmentBase.d0.r.setVisibility(8);
                SigninScrollView signinScrollView2 = syncConsentFragmentBase.d0.a;
                if (signinScrollView2.h == null) {
                    return;
                }
                signinScrollView2.h = null;
                signinScrollView2.getViewTreeObserver().removeOnGlobalLayoutListener(signinScrollView2.a);
                signinScrollView2.getViewTreeObserver().removeOnScrollChangedListener(signinScrollView2.g);
            }
        };
        Runnable runnable2 = signinScrollView.h;
        ViewTreeObserverOnScrollChangedListenerC0269Cb3 viewTreeObserverOnScrollChangedListenerC0269Cb3 = signinScrollView.g;
        ViewTreeObserverOnGlobalLayoutListenerC0139Bb3 viewTreeObserverOnGlobalLayoutListenerC0139Bb3 = signinScrollView.a;
        if (runnable2 != null) {
            signinScrollView.h = null;
            signinScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0139Bb3);
            signinScrollView.getViewTreeObserver().removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC0269Cb3);
        }
        signinScrollView.h = runnable;
        signinScrollView.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0139Bb3);
        signinScrollView.getViewTreeObserver().addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC0269Cb3);
        this.d0.o.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.c0) {
            e = AbstractC2884Wf.a(K(), R.drawable.0_resource_name_obfuscated_res_0x7f0901d5);
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("AllowSyncOffForChildAccounts")) {
                this.d0.q.setVisibility(8);
                this.d0.s.setVisibility(4);
            }
        } else {
            e = AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090201, R.color.0_resource_name_obfuscated_res_0x7f07012b, K());
        }
        this.d0.l.setImageDrawable(e);
        this.e0.b(this.d0.g, R.string.0_resource_name_obfuscated_res_0x7f140a7a);
        this.e0.b(this.d0.m, R.string.0_resource_name_obfuscated_res_0x7f140a79);
        this.e0.b(this.d0.n, R.string.0_resource_name_obfuscated_res_0x7f140a78);
        int i = this.m0;
        this.e0.b(this.d0.q, (i == 15 || i == 0) ? R.string.0_resource_name_obfuscated_res_0x7f1406d5 : R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        this.e0.b(this.d0.r, R.string.0_resource_name_obfuscated_res_0x7f14066a);
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        CoreAccountInfo b = C1202Jg1.b(d).b(0);
        if (FREMobileIdentityConsistencyFieldTrial.isEnabled() && this.m0 == 0 && b != null) {
            z = true;
        }
        this.l0 = z;
        if (z) {
            this.g0 = b.getEmail();
        }
        Q0(true);
        String str = this.g0;
        if (str != null) {
            S0(str);
        }
        return this.d0;
    }

    @Override // androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        boolean z = !this.c0;
        C4502dG0 c4502dG0 = C4502dG0.b;
        T44 t44 = new T44(z0(), z);
        c4502dG0.getClass();
        boolean c = C4502dG0.c(t44);
        this.j0 = c;
        this.d0.p.setEnabled(c);
    }

    @Override // defpackage.F4
    public final void E() {
        this.b0.a().g(new C6780jt3(this));
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        IdentityManager b = C1202Jg1.b(d);
        boolean z = false;
        CoreAccountInfo b2 = b.b(0);
        if (FREMobileIdentityConsistencyFieldTrial.isEnabled() && this.m0 == 0 && b2 != null) {
            z = true;
        }
        this.l0 = z;
        if (z) {
            this.g0 = b2.getEmail();
            this.b0.a().g(new C6780jt3(this));
        }
    }

    public final void Q0(boolean z) {
        if (z) {
            this.d0.h.setVisibility(this.l0 || (FREMobileIdentityConsistencyFieldTrial.isEnabled() && this.c0) ? 8 : 0);
            this.e0.b(this.d0.p, R.string.0_resource_name_obfuscated_res_0x7f140a4f);
            this.d0.p.setOnClickListener(new View.OnClickListener() { // from class: gt3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = SyncConsentFragmentBase.q0;
                    SyncConsentFragmentBase syncConsentFragmentBase = SyncConsentFragmentBase.this;
                    if (syncConsentFragmentBase.L0()) {
                        syncConsentFragmentBase.i0 = true;
                        syncConsentFragmentBase.k0 = false;
                        FI2.a("Signin_Signin_WithDefaultSyncSettings");
                        D2.a().b(syncConsentFragmentBase.g0).g(new C6436it3(syncConsentFragmentBase, view, false));
                    }
                }
            });
        } else {
            this.d0.h.setVisibility(8);
            this.e0.b(this.d0.p, R.string.0_resource_name_obfuscated_res_0x7f140a5a);
            this.d0.p.setOnClickListener(new View.OnClickListener() { // from class: ht3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = SyncConsentFragmentBase.q0;
                    SyncConsentFragmentBase syncConsentFragmentBase = SyncConsentFragmentBase.this;
                    if (syncConsentFragmentBase.L0()) {
                        syncConsentFragmentBase.s();
                    }
                }
            });
        }
        C8765pg3 c8765pg3 = new C8765pg3(z ? new C11997z52(K(), new Callback() { // from class: Zs3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                View view = (View) obj;
                int i = SyncConsentFragmentBase.q0;
                SyncConsentFragmentBase syncConsentFragmentBase = SyncConsentFragmentBase.this;
                if (syncConsentFragmentBase.L0()) {
                    syncConsentFragmentBase.i0 = true;
                    FI2.a("Signin_Signin_WithAdvancedSyncSettings");
                    D2.a().b(syncConsentFragmentBase.g0).g(new C6436it3(syncConsentFragmentBase, view, true));
                }
            }
        }) : null, "<LINK1>", "</LINK1>");
        C8903q40 c8903q40 = this.e0;
        TextView textView = this.d0.o;
        SpannableString a = AbstractC9108qg3.a(c8903q40.a.getText(R.string.0_resource_name_obfuscated_res_0x7f140a5c).toString(), c8765pg3);
        textView.setText(a);
        c8903q40.b.put(textView, new C8560p40(a.toString(), R.string.0_resource_name_obfuscated_res_0x7f140a5c));
    }

    public final void S0(String str) {
        if (TextUtils.equals(str, this.g0)) {
            C6073hq0 c = this.h0.c(this.g0);
            this.d0.i.setImageDrawable(c.b);
            String str2 = c.c;
            boolean isEmpty = TextUtils.isEmpty(str2);
            String str3 = c.a;
            if (!isEmpty) {
                this.e0.c(this.d0.j, str2);
                this.e0.c(this.d0.k, str3);
                this.d0.k.setVisibility(0);
            } else {
                this.e0.c(this.d0.j, str3);
                this.d0.k.setVisibility(8);
            }
        }
    }

    public final boolean L0() {
        if (!a0()) {
            return false;
        }
        h hVar = this.x;
        return ((hVar == null ? false : hVar.J()) || this.i0 || !this.j0) ? false : true;
    }

    @Override // defpackage.InterfaceC9238r3
    public final void s() {
        this.b0.f(new Callback() { // from class: ft3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Intent intent = (Intent) obj;
                int i = SyncConsentFragmentBase.q0;
                SyncConsentFragmentBase syncConsentFragmentBase = SyncConsentFragmentBase.this;
                if (intent != null) {
                    syncConsentFragmentBase.startActivityForResult(intent, 1);
                } else {
                    AbstractC0399Db3.a(syncConsentFragmentBase.getActivity());
                }
            }
        });
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1 || i2 != -1 || intent == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
            return;
        }
        C10610v3 c10610v3 = this.p0;
        if (c10610v3 != null) {
            c10610v3.a();
        }
        this.g0 = stringExtra;
    }

    @Override // defpackage.InterfaceC9238r3
    public final void k(String str) {
        this.g0 = str;
        S0(str);
        this.p0.a();
    }

    public void R0(List list) {
        if (a0() && this.j0) {
            if (list.isEmpty()) {
                this.g0 = null;
                Q0(false);
                return;
            }
            Q0(true);
            String str = ((Account) list.get(0)).name;
            if (this.l0) {
                return;
            }
            String str2 = this.g0;
            if (str2 != null && B4.d(str2, list) != null) {
                String str3 = this.g0;
                this.g0 = str3;
                S0(str3);
                return;
            }
            C9925t30 c9925t30 = this.o0;
            if (c9925t30 != null) {
                c9925t30.a(false);
                this.o0 = null;
            }
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("AllowSyncOffForChildAccounts") && this.c0) {
                P0();
                return;
            }
            if (this.g0 != null) {
                this.p0 = new C10610v3(B0(), this, this.n0);
            }
            this.g0 = str;
            S0(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.c
    public final void r0() {
        boolean z;
        this.f11484J = true;
        AccountManagerFacade accountManagerFacade = this.b0;
        accountManagerFacade.b(this);
        R0(B4.e(accountManagerFacade.a()));
        C0140Bc c0140Bc = this.d0.t;
        c0140Bc.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            z = ValueAnimator.areAnimatorsEnabled();
        } else {
            z = Settings.Global.getFloat(V60.a.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
        }
        if (z) {
            Animatable animatable = c0140Bc.b;
            C6674jc.c((Drawable) animatable, c0140Bc.c);
            animatable.start();
            c0140Bc.d = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.c
    public final void p0() {
        this.f11484J = true;
        this.b0.j(this);
        C0140Bc c0140Bc = this.d0.t;
        if (c0140Bc.d) {
            Animatable animatable = c0140Bc.b;
            C6674jc.d((Drawable) animatable, c0140Bc.c);
            animatable.stop();
            c0140Bc.d = false;
        }
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.c(d).f(this);
        this.h0.e(this.f0);
        C9925t30 c9925t30 = this.o0;
        if (c9925t30 != null) {
            c9925t30.a(true);
            this.o0 = null;
        }
        this.n0.b();
        if (this.k0) {
            FI2.a("Signin_Undo_Signin");
        }
    }
}
