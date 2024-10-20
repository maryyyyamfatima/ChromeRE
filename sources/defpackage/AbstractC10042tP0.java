package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10042tP0 {
    public static void b() {
        O83.a.p("first_run_signin_complete", true);
    }

    public static void c(final Activity activity) {
        SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
        if (AbstractC10385uP0.a()) {
            Q83 q83 = O83.a;
            if (q83.e("first_run_signin_complete", false)) {
                return;
            }
            final String i = q83.i("first_run_signin_account_name", null);
            if (TextUtils.isEmpty(i) && q83.e("first_run_signin_setup", false)) {
                a(activity);
                b();
            } else if (!AbstractC10728vP0.a() || !a.n() || TextUtils.isEmpty(i)) {
                b();
            } else {
                final AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
                accountManagerFacadeProvider.a().g(new Callback() { // from class: qP0
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        final List list = (List) obj;
                        final String str = i;
                        final Activity activity2 = activity;
                        B4.b(AccountManagerFacade.this, list, new Q2() { // from class: rP0
                            @Override // defpackage.Q2
                            public final void a(boolean z, Account account) {
                                if (z) {
                                    AbstractC10042tP0.b();
                                    return;
                                }
                                Account d = B4.d(str, list);
                                if (d == null) {
                                    AbstractC10042tP0.b();
                                } else {
                                    AbstractC9966tA.a(C1202Jg1.a()).d(0, d, new C9699sP0(activity2, O83.a.e("first_run_signin_setup", false)));
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public static void a(Activity activity) {
        Bundle S0 = ManageSyncSettings.S0(true);
        String name = ManageSyncSettings.class.getName();
        Intent intent = new Intent();
        intent.setClass(activity, SettingsActivity.class);
        if (!(activity instanceof Activity)) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        intent.putExtra("show_fragment", name);
        intent.putExtra("show_fragment_args", S0);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            activity.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
