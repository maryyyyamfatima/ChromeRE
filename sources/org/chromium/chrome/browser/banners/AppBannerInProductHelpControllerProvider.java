package org.chromium.chrome.browser.banners;

import android.view.View;
import com.android.chrome.R;
import defpackage.C1190Je;
import defpackage.C12180ze1;
import defpackage.K14;
import defpackage.KU3;
import defpackage.LU3;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AppBannerInProductHelpControllerProvider {
    public static final K14 a = new K14(C1190Je.class);

    public static String showInProductHelp(WebContents webContents) {
        KU3 a2 = LU3.a(Profile.b(webContents));
        if (!a2.wouldTriggerHelpUI("IPH_PwaInstallAvailableFeature")) {
            return "Trigger state: " + a2.getTriggerState("IPH_PwaInstallAvailableFeature");
        }
        if (webContents.s() != 2) {
            return "Not visible";
        }
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            return "No window";
        }
        final C1190Je c1190Je = (C1190Je) a.e(Q0.t);
        if (c1190Je == null) {
            return "No controller";
        }
        C12180ze1 c12180ze1 = new C12180ze1(c1190Je.a.getResources(), "IPH_PwaInstallAvailableFeature", R.string.0_resource_name_obfuscated_res_0x7f140564, R.string.0_resource_name_obfuscated_res_0x7f140564);
        c12180ze1.h = (View) c1190Je.h.get();
        c12180ze1.i = new Runnable() { // from class: He
            @Override // java.lang.Runnable
            public final void run() {
                C1190Je c1190Je2 = C1190Je.this;
                ((C1340Ki) c1190Je2.g).h(Integer.valueOf(c1190Je2.j));
            }
        };
        c12180ze1.k = new Runnable() { // from class: Ie
            @Override // java.lang.Runnable
            public final void run() {
                ((C1340Ki) C1190Je.this.g).h(null);
            }
        };
        c1190Je.i.a(c12180ze1.a());
        return "";
    }
}
