package org.chromium.chrome.browser.signin;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC1558Lz3;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC7459ls0;
import defpackage.AbstractC9763sb3;
import defpackage.B4;
import defpackage.C0649Ez3;
import defpackage.C10106tb3;
import defpackage.C1202Jg1;
import defpackage.C3083Xs3;
import defpackage.C4085c3;
import defpackage.C8385oa2;
import defpackage.C8465on4;
import defpackage.C8808pn4;
import defpackage.InterfaceC10590uz3;
import defpackage.QB;
import defpackage.UB;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.sync.settings.AccountManagementFragment;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SigninBridge {
    public static void openAccountManagementScreen(WindowAndroid windowAndroid, int i) {
        Object obj = ThreadUtils.a;
        Context context = (Context) windowAndroid.j.get();
        if (context != null) {
            int i2 = AccountManagementFragment.o0;
            Bundle bundle = new Bundle();
            bundle.putInt("ShowGAIAServiceType", i);
            String name = AccountManagementFragment.class.getName();
            Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
            if (!(context instanceof Activity)) {
                a.addFlags(268435456);
                a.addFlags(67108864);
            }
            a.putExtra("show_fragment", name);
            a.putExtra("show_fragment_args", bundle);
            ComponentName componentName = AbstractC2281Ro1.a;
            try {
                context.startActivity(a, null);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public static void openAccountPickerBottomSheet(WindowAndroid windowAndroid, String str) {
        Object obj = ThreadUtils.a;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        if (!C1202Jg1.c(d).n()) {
            AbstractC9763sb3.a(7);
            return;
        }
        if (B4.e(AccountManagerFacadeProvider.getInstance().a()).isEmpty()) {
            AbstractC9763sb3.a(0);
            return;
        }
        if (C10106tb3.b.a.f(0, "Chrome.AccountPickerBottomSheet.ConsecutiveActiveDismissalCount") >= 3) {
            AbstractC9763sb3.a(16);
            return;
        }
        QB a2 = UB.a(windowAndroid);
        if (a2 == null) {
            return;
        }
        new C4085c3(windowAndroid, a2, new C8465on4(AbstractC1558Lz3.a(((AbstractC11276wz3) ((InterfaceC10590uz3) ((C8385oa2) C0649Ez3.u(windowAndroid)).g)).j(false)), new C8808pn4(), str));
    }

    public static void launchSigninActivity(WindowAndroid windowAndroid, int i) {
        Context context = (Context) windowAndroid.j.get();
        if (context != null) {
            C3083Xs3.a().getClass();
            C3083Xs3.b(context, i);
        }
    }
}
