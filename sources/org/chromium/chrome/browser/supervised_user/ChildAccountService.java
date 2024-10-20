package org.chromium.chrome.browser.supervised_user;

import J.N;
import android.app.Activity;
import defpackage.AbstractC5103f04;
import defpackage.B4;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChildAccountService {
    public static void reauthenticateChildAccount(WindowAndroid windowAndroid, String str, final long j) {
        Object obj = ThreadUtils.a;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: jJ
                @Override // java.lang.Runnable
                public final void run() {
                    N.MN7OOxaa(j);
                }
            });
        } else {
            AccountManagerFacadeProvider.getInstance().g(B4.c(str), activity, new Callback() { // from class: kJ
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    if (((Boolean) obj2).booleanValue()) {
                        return;
                    }
                    N.MN7OOxaa(j);
                }
            });
        }
    }
}
