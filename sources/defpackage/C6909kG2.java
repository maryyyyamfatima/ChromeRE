package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.android.chrome.R;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kG2 */
/* loaded from: classes.dex */
public final class C6909kG2 {
    public final Activity a;
    public final B84 b;
    public final CustomTabsConnection c;
    public final CustomTabsSessionToken d;
    public final FU e;
    public final PC f;
    public final C10776vY3 g;
    public boolean h;
    public boolean i;

    public static boolean a(C6909kG2 c6909kG2, GURL gurl) {
        c6909kG2.getClass();
        if (gurl.k()) {
            return false;
        }
        boolean z = c6909kG2.i;
        MC2 h = c6909kG2.b.h(gurl.i());
        boolean z2 = !h.d() || ((Boolean) h.b).booleanValue();
        c6909kG2.i = z2;
        return z && z2;
    }

    public static void b(C6909kG2 c6909kG2, Tab tab, int i, String str, int i2) {
        String str2;
        String str3;
        c6909kG2.getClass();
        WebContents b = tab.b();
        c6909kG2.g.getClass();
        EI2.h(i, 4, "TrustedWebActivity.QualityEnforcementViolation");
        if (b != null) {
            N.MCnWTXic(b, "TrustedWebActivity.QualityEnforcementViolation", "ViolationType", i);
        }
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("TrustedWebActivityQualityEnforcementWarning");
        boolean z = false;
        FU fu = c6909kG2.e;
        String str4 = "";
        if (M09VlOh_) {
            String string = (i == 0 || i == 1) ? V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140b69, Integer.valueOf(i2), str) : i != 2 ? i != 3 ? "" : V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140b68, str) : V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6a, str);
            Context context = V60.a;
            context.getPackageManager();
            if (!((fu.a == null || V60.a.getPackageManager().getInstallerPackageName(fu.a) == null) ? false : true)) {
                ZN3.c(context, string, 1).d();
            }
            if (tab.b() != null) {
                if (i == 3) {
                    String str5 = fu.a;
                    str2 = str5;
                    str3 = (String) AbstractC4983eg2.b(V60.a.getPackageManager(), str5).get(0);
                } else {
                    str2 = null;
                    str3 = null;
                }
                N.M05FuTNz(tab.b().O(), i, str, i2, str2, str3);
            }
        }
        if (N.M09VlOh_("TrustedWebActivityQualityEnforcement")) {
            Bundle bundle = new Bundle();
            if (i == 0 || i == 1) {
                str4 = i2 + " on " + str;
            } else if (i == 2) {
                str4 = AbstractC4809e90.a("Page unavailable offline: ", str);
            } else if (i == 3) {
                str4 = AbstractC4809e90.a("Digital asset links verification failed on ", str);
            }
            bundle.putString("crash_reason", str4);
            Bundle t = c6909kG2.c.t(c6909kG2.d, "quality_enforcement.crash", bundle);
            boolean z2 = t != null && t.getBoolean("success");
            if (i == 3) {
                if (fu.a != null) {
                    z = V60.a.getPackageManager().getInstallerPackageName(fu.a) != null;
                }
                if (!z) {
                    return;
                }
            }
            if (N.M09VlOh_("TrustedWebActivityQualityEnforcementForced") || z2) {
                EI2.h(i, 4, "TrustedWebActivity.QualityEnforcementViolation.Crashed");
                c6909kG2.a.finish();
            }
        }
    }

    public C6909kG2(Activity activity, C2468Sz3 c2468Sz3, PC pc, CustomTabsConnection customTabsConnection, B84 b84, FU fu, C10776vY3 c10776vY3) {
        C6565jG2 c6565jG2 = new C6565jG2(this);
        this.a = activity;
        this.b = b84;
        this.d = pc.u();
        this.f = pc;
        this.c = customTabsConnection;
        this.e = fu;
        this.g = c10776vY3;
        this.i = true;
        c2468Sz3.d(c6565jG2);
    }
}
