package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.chrome.browser.ShortcutHelper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class Nn4 {
    public static Mn4 a(Intent intent) {
        String str;
        String w = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_id");
        String w2 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_url");
        if (w == null || w2 == null) {
            AbstractC4851eH1.a("WebappInfo", IR0.a("Incomplete data provided: ", w, ", ", w2), new Object[0]);
            return null;
        }
        long q = AbstractC2281Ro1.q(intent, "org.chromium.chrome.browser.theme_color", 2147483648L);
        boolean z = q != 2147483648L;
        int i = z ? (int) q : -1;
        String w3 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_icon");
        String w4 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_scope");
        if (TextUtils.isEmpty(w4)) {
            w4 = ShortcutHelper.b(w2);
        }
        int p = AbstractC2281Ro1.p(3, intent, "org.chromium.chrome.browser.webapp_display_mode");
        int p2 = AbstractC2281Ro1.p(0, intent, "org.chromium.content_public.common.orientation");
        int p3 = AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.webapp_source");
        if (p3 >= 17) {
            p3 = 0;
        }
        long q2 = AbstractC2281Ro1.q(intent, "org.chromium.chrome.browser.background_color", 2147483648L);
        Integer valueOf = q2 != 2147483648L ? Integer.valueOf((int) q2) : null;
        boolean j = AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.is_icon_generated", false);
        boolean j2 = AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.webapp_icon_adaptive", false);
        boolean j3 = AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.webapk_force_navigation", false);
        String w5 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_name");
        String str2 = (w5 == null && (w5 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_title")) == null) ? "" : w5;
        String w6 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_short_name");
        if (w6 == null) {
            String w7 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_title");
            str = w7 != null ? w7 : "";
        } else {
            str = w6;
        }
        return new Mn4(intent, i, z, null, new In4(w, w2, w4, new Jn4(w3), str2, str, p, p2, p3, valueOf, V60.a.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0708c7, null), j, j2, j3), null);
    }
}
