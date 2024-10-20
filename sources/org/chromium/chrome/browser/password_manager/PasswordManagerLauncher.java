package org.chromium.chrome.browser.password_manager;

import J.N;
import android.app.Activity;
import defpackage.AbstractC0193Bm2;
import defpackage.AbstractC1658Mt3;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.I53;
import defpackage.InterfaceC7697ma2;
import defpackage.UN;
import java.lang.ref.WeakReference;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordManagerLauncher {
    public static void a(Activity activity, int i, InterfaceC7697ma2 interfaceC7697ma2) {
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b.h()) {
            if (AbstractC0193Bm2.e(b) && !N.Mlf1N2n$(((SyncServiceImpl) b).c)) {
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("PasswordScriptsFetching") || N.M09VlOh_("PasswordDomainCapabilitiesFetching")) {
                    N.MVksKGki();
                }
            }
        }
        AbstractC0193Bm2.k(activity, i, new I53(), b, interfaceC7697ma2);
    }

    public static void showPasswordSettings(WebContents webContents, int i) {
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            return;
        }
        WeakReference k = Q0.k();
        C8385oa2 c8385oa2 = new C8385oa2();
        c8385oa2.p(Q0.s());
        a((Activity) k.get(), i, c8385oa2);
    }
}
