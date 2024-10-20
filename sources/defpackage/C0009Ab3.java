package defpackage;

import J.N;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.SyncConsentFragment;
import org.chromium.chrome.browser.ui.signin.PersonalizedSigninPromoView;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ab3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0009Ab3 {
    public C6073hq0 a;
    public ViewTreeObserverOnPreDrawListenerC2771Vi1 b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final C3083Xs3 i;

    public static void f(Context context, PersonalizedSigninPromoView personalizedSigninPromoView, int i) {
        ViewGroup.LayoutParams layoutParams = personalizedSigninPromoView.g.getLayoutParams();
        layoutParams.height = context.getResources().getDimensionPixelSize(i);
        layoutParams.width = context.getResources().getDimensionPixelSize(i);
        personalizedSigninPromoView.g.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(int r12) {
        /*
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 20
            if (r12 == r0) goto La4
            r0 = 9
            if (r12 == r0) goto L8d
            r0 = 16
            if (r12 == r0) goto L8c
            if (r12 == r3) goto L12
            return r2
        L12:
            Bo1 r12 = org.chromium.chrome.features.start_surface.StartSurfaceConfiguration.q
            int r12 = r12.c()
            Bo1 r0 = org.chromium.chrome.features.start_surface.StartSurfaceConfiguration.r
            int r0 = r0.c()
            long r4 = (long) r0
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 * r6
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L2a
            goto L41
        L2a:
            long r8 = java.lang.System.currentTimeMillis()
            Q83 r0 = defpackage.O83.a
            java.lang.String r10 = "Chrome.SigninPromoNTP.FirstShownTime"
            long r10 = r0.g(r6, r10)
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L41
            long r8 = r8 - r10
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L41
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 != 0) goto L8b
            Q83 r0 = defpackage.O83.a
            java.lang.String r3 = b(r3)
            int r3 = r0.f(r2, r3)
            if (r3 < r12) goto L51
            goto L8b
        L51:
            java.lang.String r12 = "ntp.personalized_signin_promo_dismissed"
            boolean r12 = r0.e(r12, r2)
            if (r12 == 0) goto L5a
            goto L8b
        L5a:
            nE r12 = defpackage.UN.a
            java.lang.String r12 = "ForceDisableExtendedSyncPromos"
            boolean r12 = J.N.M09VlOh_(r12)
            if (r12 == 0) goto L65
            goto L8b
        L65:
            android.accounts.Account r12 = c()
            if (r12 != 0) goto L6c
            goto L8c
        L6c:
            C2 r0 = defpackage.D2.a()
            java.lang.String r12 = r12.name
            MC2 r12 = r0.b(r12)
            boolean r0 = r12.d()
            if (r0 == 0) goto L8b
            java.lang.Object r12 = r12.b
            org.chromium.components.signin.base.AccountInfo r12 = (org.chromium.components.signin.base.AccountInfo) r12
            org.chromium.components.signin.base.AccountCapabilities r12 = r12.g
            java.lang.String r0 = "accountcapabilities/gi2tklldmfya"
            int r12 = r12.getCapabilityByName(r0)
            if (r12 != r1) goto L8b
            goto L8c
        L8b:
            r1 = r2
        L8c:
            return r1
        L8d:
            Q83 r12 = defpackage.O83.a
            java.lang.String r4 = "signin_promo_bookmarks_declined"
            boolean r4 = r12.e(r4, r2)
            java.lang.String r0 = b(r0)
            int r12 = r12.f(r2, r0)
            if (r12 >= r3) goto La2
            if (r4 != 0) goto La2
            goto La3
        La2:
            r1 = r2
        La3:
            return r1
        La4:
            Q83 r12 = defpackage.O83.a
            java.lang.String r4 = "settings_personalized_signin_promo_dismissed"
            boolean r4 = r12.e(r4, r2)
            java.lang.String r0 = b(r0)
            int r12 = r12.f(r2, r0)
            if (r12 >= r3) goto Lb9
            if (r4 != 0) goto Lb9
            goto Lba
        Lb9:
            r1 = r2
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0009Ab3.a(int):boolean");
    }

    public static Account c() {
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        Account a2 = CoreAccountInfo.a(C1202Jg1.b(d).b(0));
        AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        if (a2 != null) {
            return a2;
        }
        List e = B4.e(accountManagerFacadeProvider.a());
        if (e.isEmpty()) {
            return null;
        }
        return (Account) e.get(0);
    }

    public static String b(int i) {
        if (i == 3) {
            return AbstractC6265iP.o.b("Settings");
        }
        if (i == 9) {
            return AbstractC6265iP.o.b("Bookmarks");
        }
        if (i == 20) {
            return AbstractC6265iP.o.b("Ntp");
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unexpected value for access point: ", i));
    }

    public C0009Ab3(int i, C3083Xs3 c3083Xs3) {
        this.c = i;
        this.i = c3083Xs3;
        if (i == 3) {
            this.d = "Signin_Impression_FromSettings";
            this.e = "settings_personalized_signin_promo_dismissed";
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("SyncAndroidPromosWithAlternativeTitle")) {
                this.f = R.string.f88590_resource_name_obfuscated_res_0x7f140afa;
            } else {
                this.f = R.string.f88680_resource_name_obfuscated_res_0x7f140b03;
            }
            if (N.M09VlOh_("SyncAndroidPromosWithTitle")) {
                this.g = R.string.f88640_resource_name_obfuscated_res_0x7f140aff;
                this.h = R.string.f88640_resource_name_obfuscated_res_0x7f140aff;
                return;
            } else {
                this.g = R.string.f87300_resource_name_obfuscated_res_0x7f140a76;
                this.h = R.string.f87310_resource_name_obfuscated_res_0x7f140a77;
                return;
            }
        }
        if (i == 9) {
            this.d = "Signin_Impression_FromBookmarkManager";
            this.e = "signin_promo_bookmarks_declined";
            this.f = R.string.f88650_resource_name_obfuscated_res_0x7f140b00;
            C7928nE c7928nE2 = UN.a;
            if (N.M09VlOh_("SyncAndroidPromosWithTitle")) {
                this.g = R.string.f88610_resource_name_obfuscated_res_0x7f140afc;
                this.h = R.string.f88610_resource_name_obfuscated_res_0x7f140afc;
                return;
            } else {
                this.g = R.string.f87240_resource_name_obfuscated_res_0x7f140a70;
                this.h = R.string.f87250_resource_name_obfuscated_res_0x7f140a71;
                return;
            }
        }
        if (i == 16) {
            this.d = "Signin_Impression_FromRecentTabs";
            this.e = null;
            C7928nE c7928nE3 = UN.a;
            if (N.M09VlOh_("SyncAndroidPromosWithAlternativeTitle")) {
                this.f = R.string.f88580_resource_name_obfuscated_res_0x7f140af9;
            } else {
                this.f = R.string.f88670_resource_name_obfuscated_res_0x7f140b02;
            }
            if (N.M09VlOh_("SyncAndroidPromosWithTitle")) {
                this.g = R.string.f88630_resource_name_obfuscated_res_0x7f140afe;
                this.h = R.string.f88630_resource_name_obfuscated_res_0x7f140afe;
                return;
            } else {
                this.g = R.string.f87280_resource_name_obfuscated_res_0x7f140a74;
                this.h = R.string.f87290_resource_name_obfuscated_res_0x7f140a75;
                return;
            }
        }
        if (i != 20) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Unexpected value for access point: ", i));
        }
        this.d = "Signin_Impression_FromNTPContentSuggestions";
        this.e = "ntp.personalized_signin_promo_dismissed";
        C7928nE c7928nE4 = UN.a;
        if (N.M09VlOh_("SyncAndroidPromosWithAlternativeTitle")) {
            this.f = R.string.f88570_resource_name_obfuscated_res_0x7f140af8;
        } else {
            this.f = R.string.f88660_resource_name_obfuscated_res_0x7f140b01;
        }
        if (N.M09VlOh_("SyncAndroidPromosWithTitle")) {
            this.g = R.string.f88620_resource_name_obfuscated_res_0x7f140afd;
            this.h = R.string.f88620_resource_name_obfuscated_res_0x7f140afd;
        } else {
            this.g = R.string.f87260_resource_name_obfuscated_res_0x7f140a72;
            this.h = R.string.f87270_resource_name_obfuscated_res_0x7f140a73;
        }
    }

    public final void g(C10322uC2 c10322uC2, PersonalizedSigninPromoView personalizedSigninPromoView, InterfaceC12164zb3 interfaceC12164zb3) {
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.b(d);
        Account c = c();
        if (c == null) {
            h(personalizedSigninPromoView, null, interfaceC12164zb3);
        } else {
            h(personalizedSigninPromoView, c10322uC2.c(c.name), interfaceC12164zb3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ub3] */
    public final void h(PersonalizedSigninPromoView personalizedSigninPromoView, C6073hq0 c6073hq0, final InterfaceC12164zb3 interfaceC12164zb3) {
        ViewTreeObserverOnPreDrawListenerC2771Vi1 viewTreeObserverOnPreDrawListenerC2771Vi1 = this.b;
        if (viewTreeObserverOnPreDrawListenerC2771Vi1 != null) {
            viewTreeObserverOnPreDrawListenerC2771Vi1.a(null);
            this.b = null;
        }
        ViewTreeObserverOnPreDrawListenerC2771Vi1 viewTreeObserverOnPreDrawListenerC2771Vi12 = new ViewTreeObserverOnPreDrawListenerC2771Vi1(personalizedSigninPromoView);
        this.b = viewTreeObserverOnPreDrawListenerC2771Vi12;
        viewTreeObserverOnPreDrawListenerC2771Vi12.a(new C12175zd2(new InterfaceC2641Ui1() { // from class: ub3
            @Override // defpackage.InterfaceC2641Ui1
            public final void a() {
                FI2.a(C0009Ab3.this.d);
            }
        }));
        this.a = c6073hq0;
        int i = this.f;
        if (c6073hq0 == null) {
            final Context context = personalizedSigninPromoView.getContext();
            personalizedSigninPromoView.g.setImageResource(R.drawable.f45610_resource_name_obfuscated_res_0x7f09011e);
            f(context, personalizedSigninPromoView, R.dimen.f40290_resource_name_obfuscated_res_0x7f080733);
            personalizedSigninPromoView.a.setVisibility(8);
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("SyncAndroidPromosWithTitle")) {
                personalizedSigninPromoView.i.setVisibility(0);
                personalizedSigninPromoView.i.setText(i);
            }
            personalizedSigninPromoView.j.setText(this.h);
            if (N.M09VlOh_("SyncAndroidPromosWithSingleButton")) {
                personalizedSigninPromoView.k.setText(R.string.f88600_resource_name_obfuscated_res_0x7f140afb);
            } else {
                personalizedSigninPromoView.k.setText(R.string.f88690_resource_name_obfuscated_res_0x7f140b04);
            }
            personalizedSigninPromoView.k.setOnClickListener(new View.OnClickListener() { // from class: wb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0009Ab3 c0009Ab3 = C0009Ab3.this;
                    c0009Ab3.e("Continued");
                    c0009Ab3.i.getClass();
                    int i2 = SyncConsentFragment.s0;
                    Bundle bundle = new Bundle();
                    bundle.putInt("SyncConsentFragmentBase.SigninFlowType", 2);
                    bundle.putInt("SyncConsentFragmentBase.AccessPoint", c0009Ab3.c);
                    bundle.putInt("SyncConsentFragment.PersonalizedPromoAction", 3);
                    C3083Xs3.c(context, bundle);
                }
            });
            personalizedSigninPromoView.l.setVisibility(8);
        } else {
            final Context context2 = personalizedSigninPromoView.getContext();
            personalizedSigninPromoView.g.setImageDrawable(this.a.b);
            f(context2, personalizedSigninPromoView, R.dimen.f40280_resource_name_obfuscated_res_0x7f080732);
            C7928nE c7928nE2 = UN.a;
            if (!N.M09VlOh_("SyncAndroidPromosWithIllustration")) {
                personalizedSigninPromoView.a.setVisibility(8);
            }
            if (N.M09VlOh_("SyncAndroidPromosWithTitle")) {
                personalizedSigninPromoView.i.setVisibility(0);
                personalizedSigninPromoView.i.setText(i);
            }
            personalizedSigninPromoView.j.setText(this.g);
            personalizedSigninPromoView.k.setOnClickListener(new View.OnClickListener() { // from class: xb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0009Ab3 c0009Ab3 = C0009Ab3.this;
                    c0009Ab3.e("Continued");
                    String str = c0009Ab3.a.a;
                    c0009Ab3.i.getClass();
                    int i2 = SyncConsentFragment.s0;
                    Bundle N0 = SyncConsentFragmentBase.N0(c0009Ab3.c, str);
                    N0.putInt("SyncConsentFragment.PersonalizedPromoAction", 1);
                    C3083Xs3.c(context2, N0);
                }
            });
            if (N.M09VlOh_("SyncAndroidPromosWithSingleButton")) {
                personalizedSigninPromoView.k.setText(R.string.f88600_resource_name_obfuscated_res_0x7f140afb);
                personalizedSigninPromoView.l.setVisibility(8);
            } else if (US.a(C1202Jg1.a(), 0)) {
                personalizedSigninPromoView.k.setText(R.string.f88690_resource_name_obfuscated_res_0x7f140b04);
                personalizedSigninPromoView.l.setVisibility(8);
            } else {
                ButtonCompat buttonCompat = personalizedSigninPromoView.k;
                Object[] objArr = new Object[1];
                C6073hq0 c6073hq02 = this.a;
                String str = c6073hq02.d;
                if (str == null && (str = c6073hq02.c) == null) {
                    str = c6073hq02.a;
                }
                objArr[0] = str;
                buttonCompat.setText(context2.getString(R.string.f87230_resource_name_obfuscated_res_0x7f140a6f, objArr));
                personalizedSigninPromoView.l.setText(R.string.f87220_resource_name_obfuscated_res_0x7f140a6e);
                personalizedSigninPromoView.l.setOnClickListener(new View.OnClickListener() { // from class: yb3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C0009Ab3 c0009Ab3 = C0009Ab3.this;
                        c0009Ab3.e("Continued");
                        String str2 = c0009Ab3.a.a;
                        c0009Ab3.i.getClass();
                        int i2 = SyncConsentFragment.s0;
                        Bundle bundle = new Bundle();
                        bundle.putInt("SyncConsentFragmentBase.SigninFlowType", 1);
                        bundle.putInt("SyncConsentFragmentBase.AccessPoint", c0009Ab3.c);
                        bundle.putString("SyncConsentFragmentBase.AccountName", str2);
                        bundle.putInt("SyncConsentFragment.PersonalizedPromoAction", 2);
                        C3083Xs3.c(context2, bundle);
                    }
                });
                personalizedSigninPromoView.l.setVisibility(0);
            }
        }
        if (interfaceC12164zb3 == null) {
            personalizedSigninPromoView.h.setVisibility(8);
        } else {
            personalizedSigninPromoView.h.setVisibility(0);
            personalizedSigninPromoView.h.setOnClickListener(new View.OnClickListener() { // from class: vb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0009Ab3 c0009Ab3 = C0009Ab3.this;
                    c0009Ab3.getClass();
                    O83.a.p(c0009Ab3.e, true);
                    c0009Ab3.e("Dismissed");
                    interfaceC12164zb3.onDismiss();
                }
            });
        }
    }

    public final void d() {
        int i = this.c;
        if (i != 16) {
            O83.a.d(b(i));
        }
        Q83 q83 = O83.a;
        q83.d("Chrome.SyncPromo.TotalShowCount");
        e("Shown");
        if (i == 20) {
            long currentTimeMillis = System.currentTimeMillis();
            if (q83.h("Chrome.SigninPromoNTP.FirstShownTime") == 0) {
                q83.s(currentTimeMillis, "Chrome.SigninPromoNTP.FirstShownTime");
            }
            q83.s(currentTimeMillis, "Chrome.SigninPromoNTP.LastShownTime");
        }
    }

    public final void e(String str) {
        String str2;
        int i = this.c;
        if (i == 3) {
            str2 = "Settings";
        } else if (i == 9) {
            str2 = "Bookmarks";
        } else if (i == 16) {
            str2 = "RecentTabs";
        } else {
            if (i != 20) {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Unexpected value for access point", i));
            }
            str2 = "Ntp";
        }
        EI2.h(O83.a.f(0, "Chrome.SyncPromo.TotalShowCount"), 100, IR0.a("Signin.SyncPromo.", str, ".Count.", str2));
    }
}
