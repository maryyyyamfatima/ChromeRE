package defpackage;

import J.N;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import com.android.chrome.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import com.google.android.gms.credential.manager.invocationparams.IssueType;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.prefs.PrefService;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bm2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0193Bm2 {
    public static C9240r31 d() {
        Context context;
        if (AbstractC11537xl2.a == null) {
            AbstractC11537xl2.a = new C11880yl2();
        }
        AbstractC11537xl2.a.getClass();
        C9240r31 c9240r31 = (AbstractC4676dm2.a() && e(AbstractC1658Mt3.b()) && (context = V60.a) != null) ? new C9240r31(new C0448Dl2(context)) : null;
        if (c9240r31 != null) {
            return c9240r31;
        }
        AbstractC9583s31.a().getClass();
        if (!AbstractC4676dm2.a()) {
            throw new C11194wl2("Backend version is not supported.", 4);
        }
        AbstractC9583s31.a().getClass();
        throw new C11194wl2("Can not instantiate backend client.", 3);
    }

    public static O21 c() {
        Object obj = ThreadUtils.a;
        if (L21.a == null) {
            L21.a = new C11475xb0();
        }
        L21.a.getClass();
        Context context = V60.a;
        O21 o21 = (context != null && AbstractC4676dm2.a() && l()) ? new O21(new C10103tb0(context)) : null;
        if (o21 != null) {
            return o21;
        }
        AbstractC9583s31.a().getClass();
        if (!AbstractC4676dm2.a()) {
            throw new C11132wb0("Backend version is not supported.", 4);
        }
        AbstractC9583s31.a().getClass();
        throw new C11132wb0("Can not instantiate backend client.", 3);
    }

    public static void h(int i, String str) {
        if (i != 0) {
            if (i == 1) {
                EI2.h(0, 4, str);
                return;
            }
            if (i == 2) {
                EI2.h(1, 4, str);
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    EI2.h(2, 4, str);
                    return;
                } else {
                    if (i != 5) {
                        return;
                    }
                    EI2.h(3, 4, str);
                    return;
                }
            }
        }
        throw new AssertionError(AbstractC9076qb1.a("Unexpected state for metrics recording: ", i));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [rm2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [qm2] */
    public static void k(Context context, int i, SettingsLauncher settingsLauncher, AbstractC1658Mt3 abstractC1658Mt3, InterfaceC7697ma2 interfaceC7697ma2) {
        EI2.h(i, 14, "PasswordManager.ManagePasswordsReferrer");
        if (a()) {
            final SE1 a = SE1.a(interfaceC7697ma2, context);
            try {
                O21 c = c();
                a.c();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                String b = CoreAccountInfo.b(abstractC1658Mt3.c());
                final ?? r9 = new Callback() { // from class: qm2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "PasswordManager.CredentialManager.Account.GetIntent.Latency");
                        EI2.b("PasswordManager.CredentialManager.Account.GetIntent.Success", true);
                        AbstractC0193Bm2.g(a, (PendingIntent) obj, "PasswordManager.CredentialManager.Account.Launch.Success", "PasswordManager.ModalLoadingDialog.CredentialManager.Outcome");
                    }
                };
                final ?? r1 = new Callback() { // from class: rm2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        int intValue = ((Integer) obj).intValue();
                        EI2.b("PasswordManager.CredentialManager.Account.GetIntent.Success", false);
                        EI2.h(intValue, 6, "PasswordManager.CredentialManager.Account.GetIntent.Error");
                        SE1 se1 = SE1.this;
                        AbstractC0193Bm2.h(se1.a.l, "PasswordManager.ModalLoadingDialog.CredentialManager.Outcome");
                        se1.b();
                    }
                };
                if (b != null) {
                    final CredentialManagerAccount credentialManagerAccount = new CredentialManagerAccount(b);
                    final CallerInfo callerInfo = new CallerInfo("chrome", "android", i != 0 ? i != 10 ? i != 3 ? i != 4 ? i != 6 ? i != 7 ? null : "touch_to_fill" : "passwords_accessory_sheet" : "password_generation_confirmation" : "password_dropdown" : "chrome_safety_check" : "chrome_settings", "");
                    C10103tb0 c10103tb0 = (C10103tb0) c.a;
                    c10103tb0.getClass();
                    C5531gF3 c5531gF3 = new C5531gF3();
                    c5531gF3.d = 26701;
                    c5531gF3.c = new Feature[]{JI0.a};
                    c5531gF3.a = new InterfaceC5565gM2() { // from class: qb0
                        @Override // defpackage.InterfaceC5565gM2
                        public final void accept(Object obj, Object obj2) {
                            InterfaceC7358lb1 interfaceC7358lb1 = (InterfaceC7358lb1) ((C10446ub0) obj).m();
                            BinderC4019br2 binderC4019br2 = new BinderC4019br2((C6905kF3) obj2);
                            CredentialManagerInvocationParams credentialManagerInvocationParams = new CredentialManagerInvocationParams(CredentialManagerAccount.this, callerInfo);
                            C6670jb1 c6670jb1 = (C6670jb1) interfaceC7358lb1;
                            Parcel a2 = c6670jb1.a();
                            AbstractC11786yV.c(a2, binderC4019br2);
                            AbstractC11786yV.b(a2, credentialManagerInvocationParams);
                            c6670jb1.h(1, a2);
                        }
                    };
                    AF3 b2 = c10103tb0.b(0, c5531gF3.a());
                    InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: M21
                        @Override // defpackage.InterfaceC7371ld2
                        public final void a(Object obj) {
                            r9.onResult((PendingIntent) obj);
                        }
                    };
                    b2.getClass();
                    b2.f(AbstractC10681vF3.a, interfaceC7371ld2);
                    b2.c(new InterfaceC2872Wc2() { // from class: N21
                        @Override // defpackage.InterfaceC2872Wc2
                        public final void c(Exception exc) {
                            r1.onResult(2);
                        }
                    });
                    return;
                }
                r1.onResult(1);
                return;
            } catch (C11132wb0 e) {
                if (e.a != 4) {
                    return;
                }
                i(interfaceC7697ma2, context);
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("manage-passwords-referrer", i);
        context.startActivity(settingsLauncher.a(context, "org.chromium.chrome.browser.password_manager.settings.PasswordSettings", bundle));
    }

    public static void g(SE1 se1, PendingIntent pendingIntent, String str, String str2) {
        WE1 we1 = se1.a;
        int i = we1.l;
        if (i == 4 || i == 5) {
            h(i, str2);
            return;
        }
        boolean z = false;
        if (i != 1) {
            if (we1.e()) {
                h(i, str2);
                try {
                    pendingIntent.send();
                    z = true;
                } catch (PendingIntent.CanceledException unused) {
                }
                EI2.b(str, z);
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC10857vm2(se1), 300L);
                return;
            }
            se1.a.h.a(new C0063Am2(str2, i, pendingIntent, str, se1));
            return;
        }
        h(i, str2);
        se1.b();
        try {
            pendingIntent.send();
            z = true;
        } catch (PendingIntent.CanceledException unused2) {
        }
        EI2.b(str, z);
    }

    public static boolean a() {
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        PrefService a = R44.a(Profile.d());
        if (!l() || b == null || !e(b) || a.a("unenrolled_from_google_mobile_services_due_to_errors")) {
            return false;
        }
        AbstractC9583s31.a().getClass();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sm2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [tm2] */
    public static void j(Context context, int i, AbstractC1658Mt3 abstractC1658Mt3, InterfaceC7697ma2 interfaceC7697ma2) {
        AbstractC9095qe2 abstractC9095qe2;
        if (e(abstractC1658Mt3)) {
            abstractC9095qe2 = new C3242Yy2(CoreAccountInfo.b(abstractC1658Mt3.c()));
        } else {
            abstractC9095qe2 = C5785h.a;
        }
        final SE1 a = SE1.a(interfaceC7697ma2, context);
        try {
            C9240r31 d = d();
            a.c();
            final C0578El2 c0578El2 = new C0578El2(2);
            final ?? r1 = new Callback() { // from class: sm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C0578El2.this.b(C5785h.a);
                    AbstractC0193Bm2.g(a, (PendingIntent) obj, "PasswordManager.PasswordCheckup.Launch.Success", "PasswordManager.ModalLoadingDialog.PasswordCheckup.Outcome");
                }
            };
            final ?? r2 = new Callback() { // from class: tm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C0578El2.this.b(new C3242Yy2((Exception) obj));
                    SE1 se1 = a;
                    AbstractC0193Bm2.h(se1.a.l, "PasswordManager.ModalLoadingDialog.PasswordCheckup.Outcome");
                    se1.b();
                }
            };
            final CredentialManagerAccount a2 = C9240r31.a(abstractC9095qe2);
            final CallerInfo callerInfo = new CallerInfo("chrome", "android", C9240r31.b(i), "");
            C0448Dl2 c0448Dl2 = (C0448Dl2) d.a;
            c0448Dl2.getClass();
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.d = 26750;
            c5531gF3.c = new Feature[]{JI0.b};
            c5531gF3.a = new InterfaceC5565gM2() { // from class: zl2
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    InterfaceC0932He1 interfaceC0932He1 = (InterfaceC0932He1) ((C0708Fl2) obj).m();
                    BinderC4019br2 binderC4019br2 = new BinderC4019br2((C6905kF3) obj2);
                    CredentialManagerInvocationParams credentialManagerInvocationParams = new CredentialManagerInvocationParams(CredentialManagerAccount.this, callerInfo);
                    C0672Fe1 c0672Fe1 = (C0672Fe1) interfaceC0932He1;
                    Parcel a3 = c0672Fe1.a();
                    AbstractC11786yV.c(a3, binderC4019br2);
                    AbstractC11786yV.b(a3, credentialManagerInvocationParams);
                    c0672Fe1.h(1, a3);
                }
            };
            AF3 b = c0448Dl2.b(0, c5531gF3.a());
            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: l31
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    r1.onResult((PendingIntent) obj);
                }
            };
            b.getClass();
            b.f(AbstractC10681vF3.a, interfaceC7371ld2);
            b.c(new InterfaceC2872Wc2() { // from class: m31
                @Override // defpackage.InterfaceC2872Wc2
                public final void c(Exception exc) {
                    r2.onResult(exc);
                }
            });
        } catch (C11194wl2 e) {
            if (e.a != 4) {
                return;
            }
            i(interfaceC7697ma2, context);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [wm2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [xm2] */
    public static void b(AbstractC9095qe2 abstractC9095qe2, final Callback callback, final Callback callback2) {
        final C0578El2 c0578El2 = new C0578El2(1);
        try {
            C9240r31 d = d();
            final ?? r3 = new Callback() { // from class: wm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C0578El2.this.b(C5785h.a);
                    callback.onResult((Integer) obj);
                }
            };
            final ?? r8 = new Callback() { // from class: xm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Exception exc = (Exception) obj;
                    C0578El2.this.b(new C3242Yy2(exc));
                    callback2.onResult(exc);
                }
            };
            final CredentialManagerAccount a = C9240r31.a(abstractC9095qe2);
            final CallerInfo callerInfo = new CallerInfo("chrome", "android", C9240r31.b(1), "");
            C0448Dl2 c0448Dl2 = (C0448Dl2) d.a;
            c0448Dl2.getClass();
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.d = 26752;
            c5531gF3.c = new Feature[]{JI0.b};
            c5531gF3.a = new InterfaceC5565gM2() { // from class: Al2
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    InterfaceC0932He1 interfaceC0932He1 = (InterfaceC0932He1) ((C0708Fl2) obj).m();
                    BinderC1112Io1 binderC1112Io1 = new BinderC1112Io1((C6905kF3) obj2);
                    IssueType issueType = new IssueType(0);
                    CredentialManagerInvocationParams credentialManagerInvocationParams = new CredentialManagerInvocationParams(CredentialManagerAccount.this, callerInfo);
                    C0672Fe1 c0672Fe1 = (C0672Fe1) interfaceC0932He1;
                    Parcel a2 = c0672Fe1.a();
                    AbstractC11786yV.c(a2, binderC1112Io1);
                    AbstractC11786yV.b(a2, issueType);
                    AbstractC11786yV.b(a2, credentialManagerInvocationParams);
                    c0672Fe1.h(3, a2);
                }
            };
            AF3 b = c0448Dl2.b(0, c5531gF3.a());
            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: n31
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    r3.onResult((Integer) obj);
                }
            };
            b.getClass();
            b.f(AbstractC10681vF3.a, interfaceC7371ld2);
            b.c(new InterfaceC2872Wc2() { // from class: o31
                @Override // defpackage.InterfaceC2872Wc2
                public final void c(Exception exc) {
                    r8.onResult(exc);
                }
            });
        } catch (Exception e) {
            callback2.onResult(e);
        }
    }

    public static boolean e(AbstractC1658Mt3 abstractC1658Mt3) {
        return abstractC1658Mt3 != null && N.MRz7OWfN(((SyncServiceImpl) abstractC1658Mt3).c) && abstractC1658Mt3.e().contains(3);
    }

    public static boolean l() {
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("UnifiedPasswordManagerAndroid")) {
            return false;
        }
        int M37SqSAy = N.M37SqSAy("UnifiedPasswordManagerAndroid", "stage", 0);
        return M37SqSAy == 0 || !(M37SqSAy == 1 || M37SqSAy == 2 || M37SqSAy != 3);
    }

    public static void f(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("market://details?id=com.google.android.gms&referrer=chrome_upm"));
        intent.putExtra("callerId", context.getPackageName());
        context.startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [um2] */
    public static void i(InterfaceC7697ma2 interfaceC7697ma2, final Context context) {
        ZX1 zx1 = (ZX1) ((C8385oa2) interfaceC7697ma2).g;
        if (zx1 == null) {
            return;
        }
        final C3142Ye2 c3142Ye2 = new C3142Ye2(context, new Callback() { // from class: um2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    AbstractC0193Bm2.f(context);
                }
            }
        }, zx1);
        C2998Xb3 c2998Xb3 = new C2998Xb3(zx1, new Callback() { // from class: Xe2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C3142Ye2 c3142Ye22 = C3142Ye2.this;
                c3142Ye22.getClass();
                c3142Ye22.a.onResult(Boolean.valueOf(((Integer) obj).intValue() == 1));
            }
        });
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = c2998Xb3;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.f;
        String string = context.getResources().getString(R.string.f80650_resource_name_obfuscated_res_0x7f1407cd);
        GD2 gd22 = new GD2();
        gd22.a = string;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.j;
        String string2 = context.getResources().getString(R.string.f80670_resource_name_obfuscated_res_0x7f1407cf);
        GD2 gd23 = new GD2();
        gd23.a = string2;
        e.put(pd22, gd23);
        PD2 pd23 = AbstractC4249cY1.n;
        String string3 = context.getResources().getString(R.string.f80660_resource_name_obfuscated_res_0x7f1407ce);
        GD2 gd24 = new GD2();
        gd24.a = string3;
        e.put(pd23, gd24);
        ID2 id2 = AbstractC4249cY1.v;
        DD2 dd2 = new DD2();
        dd2.a = 1;
        e.put(id2, dd2);
        zx1.l(new PropertyModel(e), 1, false);
    }
}
