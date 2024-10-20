package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.HashMap;
import org.chromium.base.LocaleUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.browsing_data.BrowsingDataBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pM */
/* loaded from: classes.dex */
public final class C8655pM {
    public static C8655pM f;
    public final C2977Wx2 a = new C2977Wx2();
    public final HashMap b = new HashMap();
    public final C4807e84 c = AppHooks.get().s();
    public boolean d;
    public boolean e;

    public static C8655pM a() {
        Object obj = ThreadUtils.a;
        if (f == null) {
            f = new C8655pM();
        }
        return f;
    }

    public static void b() {
        int i;
        String defaultLocaleListString = LocaleUtils.getDefaultLocaleListString();
        Q83 q83 = O83.a;
        String i2 = q83.i("locale", null);
        boolean z = C6132i01.d.c;
        if (TextUtils.isEmpty(i2) || TextUtils.isEmpty(defaultLocaleListString)) {
            i = 5;
        } else if (TextUtils.equals(i2, defaultLocaleListString)) {
            i = 0;
        } else {
            String[] split = i2.split(",");
            String[] split2 = defaultLocaleListString.split(",");
            if (z) {
                i = TextUtils.equals(split[0], split2[0]) ? 2 : 1;
            } else {
                i = TextUtils.equals(split[0], split2[0]) ? 4 : 3;
            }
        }
        EI2.h(i, 6, "LanguageUsage.UI.Android.IsLocaleUpdated");
        if (TextUtils.equals(i2, defaultLocaleListString)) {
            return;
        }
        q83.t("locale", defaultLocaleListString);
        N.Mo7FLW6m(defaultLocaleListString);
        if (i2 != null) {
            BrowsingDataBridge.b().a(null, new int[]{1}, 4);
        }
    }
}
