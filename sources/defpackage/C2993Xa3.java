package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.SigninFirstRunFragment;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xa3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2993Xa3 implements F4, InterfaceC9979tC2, InterfaceC9238r3 {
    public final Context a;
    public final ZX1 g;
    public final AccountManagerFacade h;
    public final InterfaceC0914Ha3 i;
    public final C9626sA2 j;
    public final PropertyModel k;
    public final C10322uC2 l;
    public C10610v3 m;
    public String n;
    public String o;

    /* JADX WARN: Type inference failed for: r10v1, types: [Ta3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Ra3] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Sa3] */
    public C2993Xa3(Context context, ZX1 zx1, InterfaceC0914Ha3 interfaceC0914Ha3, C9626sA2 c9626sA2) {
        this.a = context;
        this.g = zx1;
        this.i = interfaceC0914Ha3;
        this.j = c9626sA2;
        C10322uC2 b = C10322uC2.b(context);
        this.l = b;
        final ?? r8 = new Runnable() { // from class: Ra3
            @Override // java.lang.Runnable
            public final void run() {
                C2993Xa3 c2993Xa3 = C2993Xa3.this;
                if (c2993Xa3.b()) {
                    return;
                }
                c2993Xa3.m = new C10610v3(c2993Xa3.a, c2993Xa3, c2993Xa3.g);
            }
        };
        final ?? r9 = new Runnable() { // from class: Sa3
            @Override // java.lang.Runnable
            public final void run() {
                C2993Xa3 c2993Xa3 = C2993Xa3.this;
                if (c2993Xa3.b()) {
                    return;
                }
                PropertyModel propertyModel = c2993Xa3.k;
                boolean j = propertyModel.j(AbstractC4267cb3.j);
                InterfaceC0914Ha3 interfaceC0914Ha32 = c2993Xa3.i;
                if (!j) {
                    SigninFirstRunFragment signinFirstRunFragment = (SigninFirstRunFragment) interfaceC0914Ha32;
                    signinFirstRunFragment.getClass();
                    ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment)).T0(signinFirstRunFragment.j0);
                    signinFirstRunFragment.L0();
                    return;
                }
                if (c2993Xa3.n == null) {
                    SigninFirstRunFragment signinFirstRunFragment2 = (SigninFirstRunFragment) interfaceC0914Ha32;
                    signinFirstRunFragment2.getClass();
                    ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment2)).Z0(7);
                    AccountManagerFacadeProvider.getInstance().f(new C1563Ma3(signinFirstRunFragment2));
                    return;
                }
                SigninFirstRunFragment signinFirstRunFragment3 = (SigninFirstRunFragment) interfaceC0914Ha32;
                signinFirstRunFragment3.getClass();
                ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment3)).T0(signinFirstRunFragment3.j0);
                if (propertyModel.j(AbstractC4267cb3.c)) {
                    signinFirstRunFragment3.L0();
                    return;
                }
                ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment3)).Z0(TextUtils.equals(c2993Xa3.o, c2993Xa3.n) ? 8 : 9);
                C1202Jg1 a = C1202Jg1.a();
                Profile d = Profile.d();
                a.getClass();
                CoreAccountInfo b2 = C1202Jg1.b(d).b(0);
                if (b2 != null && b2.getEmail().equals(c2993Xa3.n)) {
                    signinFirstRunFragment3.L0();
                } else {
                    propertyModel.k(AbstractC4267cb3.f, true);
                    AbstractC9966tA.a(C1202Jg1.a()).s(B4.c(c2993Xa3.n), new C2863Wa3(c2993Xa3));
                }
            }
        };
        final ?? r10 = new Runnable() { // from class: Ta3
            @Override // java.lang.Runnable
            public final void run() {
                final C2993Xa3 c2993Xa3 = C2993Xa3.this;
                if (c2993Xa3.b()) {
                    return;
                }
                SigninFirstRunFragment signinFirstRunFragment = (SigninFirstRunFragment) c2993Xa3.i;
                signinFirstRunFragment.getClass();
                ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment)).Z0(10);
                ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment)).T0(signinFirstRunFragment.j0);
                if (US.a(C1202Jg1.a(), 0)) {
                    c2993Xa3.k.k(AbstractC4267cb3.g, true);
                    AbstractC9966tA.a(C1202Jg1.a()).w(4, new InterfaceC5642gb3() { // from class: Va3
                        @Override // defpackage.InterfaceC5642gb3
                        public final /* synthetic */ void b() {
                        }

                        @Override // defpackage.InterfaceC5642gb3
                        public final void a() {
                            ((SigninFirstRunFragment) C2993Xa3.this.i).L0();
                        }
                    }, false);
                } else {
                    signinFirstRunFragment.L0();
                }
            }
        };
        C4502dG0.b.getClass();
        boolean b2 = C4502dG0.b();
        SpannableString a = a(false);
        BD2 bd2 = new BD2(AbstractC4267cb3.l);
        bd2.e(AbstractC4267cb3.a, new View.OnClickListener() { // from class: Ya3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r8.run();
            }
        });
        bd2.e(AbstractC4267cb3.b, null);
        bd2.b(AbstractC4267cb3.c, false);
        bd2.e(AbstractC4267cb3.d, new View.OnClickListener() { // from class: Za3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9.run();
            }
        });
        bd2.e(AbstractC4267cb3.e, new View.OnClickListener() { // from class: ab3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r10.run();
            }
        });
        bd2.b(AbstractC4267cb3.h, false);
        bd2.e(AbstractC4267cb3.i, null);
        bd2.b(AbstractC4267cb3.j, b2);
        bd2.e(AbstractC4267cb3.k, a);
        this.k = bd2.a();
        b.a(this);
        AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        this.h = accountManagerFacadeProvider;
        accountManagerFacadeProvider.b(this);
        d(B4.e(accountManagerFacadeProvider.a()));
    }

    @Override // defpackage.F4
    public final void E() {
        this.h.a().g(new Callback() { // from class: Oa3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2993Xa3.this.d((List) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
    }

    @Override // defpackage.InterfaceC9238r3
    public final void s() {
        SigninFirstRunFragment signinFirstRunFragment = (SigninFirstRunFragment) this.i;
        signinFirstRunFragment.getClass();
        ((FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment)).Z0(7);
        AccountManagerFacadeProvider.getInstance().f(new C1563Ma3(signinFirstRunFragment));
    }

    public final boolean c() {
        C3924bb3 c3924bb3 = (C3924bb3) this.k.i(AbstractC4267cb3.i);
        return c3924bb3 != null && c3924bb3.a;
    }

    public final boolean b() {
        LD2 ld2 = AbstractC4267cb3.f;
        PropertyModel propertyModel = this.k;
        return propertyModel.j(ld2) || propertyModel.j(AbstractC4267cb3.g);
    }

    @Override // defpackage.InterfaceC9238r3
    public final void k(String str) {
        this.n = str;
        if (TextUtils.equals(str, str)) {
            this.k.o(AbstractC4267cb3.b, this.l.c(str));
        }
        C10610v3 c10610v3 = this.m;
        if (c10610v3 != null) {
            c10610v3.a();
        }
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        if (TextUtils.equals(this.n, str)) {
            this.k.o(AbstractC4267cb3.b, this.l.c(str));
        }
    }

    public final void d(List list) {
        boolean isEmpty = list.isEmpty();
        PropertyModel propertyModel = this.k;
        PD2 pd2 = AbstractC4267cb3.b;
        if (isEmpty) {
            this.o = null;
            this.n = null;
            propertyModel.o(pd2, null);
            C10610v3 c10610v3 = this.m;
            if (c10610v3 != null) {
                c10610v3.a();
            }
        } else {
            this.o = ((Account) list.get(0)).name;
            String str = this.n;
            if (str == null || B4.d(str, list) == null) {
                String str2 = this.o;
                this.n = str2;
                if (TextUtils.equals(str2, str2)) {
                    propertyModel.o(pd2, this.l.c(str2));
                }
            }
        }
        B4.b(this.h, list, new Q2() { // from class: Ua3
            @Override // defpackage.Q2
            public final void a(boolean z, Account account) {
                LD2 ld2 = AbstractC4267cb3.c;
                C2993Xa3 c2993Xa3 = C2993Xa3.this;
                PropertyModel propertyModel2 = c2993Xa3.k;
                propertyModel2.k(ld2, z);
                propertyModel2.o(AbstractC4267cb3.k, c2993Xa3.a(c2993Xa3.c()));
                int i = z ? R.drawable.f46860_resource_name_obfuscated_res_0x7f0901b6 : 0;
                C10322uC2 c10322uC2 = c2993Xa3.l;
                if (i == 0 && c10322uC2.c == null) {
                    return;
                }
                c10322uC2.c = i == 0 ? null : new C9636sC2(c10322uC2.a, i);
                c10322uC2.g.clear();
                D2.b().g(new C8265oC2(c10322uC2));
            }
        });
    }

    public final SpannableString a(boolean z) {
        Context context = this.a;
        String string = context.getString(R.string.f87080_resource_name_obfuscated_res_0x7f140a60);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8765pg3(new C11997z52(context, new Callback() { // from class: Pa3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2993Xa3 c2993Xa3 = C2993Xa3.this;
                int i = AbstractC3899bX.e(c2993Xa3.a) ? R.string.f74210_resource_name_obfuscated_res_0x7f1404dd : R.string.f74230_resource_name_obfuscated_res_0x7f1404df;
                SigninFirstRunFragment signinFirstRunFragment = (SigninFirstRunFragment) c2993Xa3.i;
                signinFirstRunFragment.getClass();
                FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(signinFirstRunFragment);
                CustomTabActivity.W1(firstRunActivity, LocalizationUtils.a(firstRunActivity.getString(i)));
            }
        }), "<TOS_LINK>", "</TOS_LINK>"));
        if (!z) {
            StringBuilder a = M41.a(string, " ");
            a.append(context.getString(R.string.f87070_resource_name_obfuscated_res_0x7f140a5f));
            string = a.toString();
            arrayList.add(new C8765pg3(new C11997z52(context, new Callback() { // from class: Qa3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    SigninFirstRunFragment signinFirstRunFragment = (SigninFirstRunFragment) C2993Xa3.this.i;
                    new EU0(signinFirstRunFragment.B0(), signinFirstRunFragment.c0, signinFirstRunFragment, signinFirstRunFragment.j0);
                }
            }), "<UMA_LINK>", "</UMA_LINK>"));
        }
        return AbstractC9108qg3.a(string, (C8765pg3[]) arrayList.toArray(new C8765pg3[0]));
    }
}
