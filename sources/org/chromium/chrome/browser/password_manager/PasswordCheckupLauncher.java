package org.chromium.chrome.browser.password_manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.AbstractC0193Bm2;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC1872Ok2;
import defpackage.AbstractC3017Xf2;
import defpackage.C1202Jg1;
import defpackage.C1861Oi1;
import defpackage.C2392Sk2;
import defpackage.C8385oa2;
import defpackage.C9926t31;
import defpackage.I53;
import defpackage.U44;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordCheckupLauncher {
    public static void launchCheckupInAccountWithActivity(String str, Activity activity) {
        C9926t31 j = AppHooks.get().j();
        boolean z = false;
        if (j != null && activity != null) {
            if (j.a.a(new U44())) {
                Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 525).putExtra("extra.screen.screenFlavor", "3");
                C1202Jg1 a = C1202Jg1.a();
                Profile d = Profile.d();
                a.getClass();
                Intent putExtra2 = putExtra.putExtra("extra.accountName", CoreAccountInfo.b(C1202Jg1.b(d).b(1)));
                if (!AbstractC3017Xf2.b(putExtra2, 0).isEmpty()) {
                    activity.startActivityForResult(putExtra2, 0);
                    z = true;
                }
            }
        }
        if (z) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setPackage(activity.getPackageName());
        activity.startActivity(intent);
    }

    public static void launchCheckupInAccountWithWindowAndroid(String str, WindowAndroid windowAndroid) {
        if (windowAndroid.j.get() == null) {
            return;
        }
        launchCheckupInAccountWithActivity(str, (Activity) windowAndroid.k().get());
    }

    public static void launchLocalCheckup(WindowAndroid windowAndroid, int i) {
        if (windowAndroid.j.get() == null) {
            return;
        }
        boolean a = AbstractC0193Bm2.a();
        C1861Oi1 c1861Oi1 = windowAndroid.j;
        if (a) {
            Context context = (Context) c1861Oi1.get();
            AbstractC1658Mt3 b = AbstractC1658Mt3.b();
            C8385oa2 c8385oa2 = new C8385oa2();
            c8385oa2.p(windowAndroid.s());
            AbstractC0193Bm2.j(context, i, b, c8385oa2);
            return;
        }
        ((C2392Sk2) AbstractC1872Ok2.b(new I53())).b((Context) c1861Oi1.get(), i);
    }
}
