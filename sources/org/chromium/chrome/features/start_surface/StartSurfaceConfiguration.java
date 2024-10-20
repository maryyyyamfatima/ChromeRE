package org.chromium.chrome.features.start_surface;

import android.text.TextUtils;
import defpackage.AbstractC4851eH1;
import defpackage.C0202Bo1;
import defpackage.C7569mB;
import defpackage.C8807pn3;
import defpackage.EI2;
import defpackage.UN;
import org.chromium.base.SysUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class StartSurfaceConfiguration {
    public static final C8807pn3 a = new C8807pn3("StartSurfaceAndroid", "start_surface_variation", "");
    public static final C7569mB b = new C7569mB("StartSurfaceAndroid", "exclude_mv_tiles", false);
    public static final C7569mB c = new C7569mB("StartSurfaceAndroid", "exclude_query_tiles", true);
    public static final C7569mB d = new C7569mB("StartSurfaceAndroid", "hide_switch_when_no_incognito_tabs", false);
    public static final C7569mB e = new C7569mB("StartSurfaceAndroid", "show_last_active_tab_only", false);
    public static final C7569mB f = new C7569mB("StartSurfaceAndroid", "open_ntp_instead_of_start", false);
    public static final C7569mB g = new C7569mB("StartSurfaceAndroid", "tab_count_button_on_start_surface", false);
    public static final C7569mB h = new C7569mB("StartSurfaceAndroid", "show_tabs_in_mru_order", false);
    public static final C7569mB i = new C7569mB("StartSurfaceAndroid", "support_accessibility", true);
    public static final C7569mB j = new C7569mB("StartSurfaceAndroid", "warm_up_renderer", false);
    public static final C0202Bo1 k = new C0202Bo1(1000, "StartSurfaceAndroid", "spare_renderer_delay_ms");
    public static final C7569mB l = new C7569mB("StartSurfaceAndroid", "check_sync_before_show_start_at_startup", false);
    public static final C8807pn3 m = new C8807pn3("StartSurfaceAndroid", "behavioural_targeting", "");
    public static final C0202Bo1 n = new C0202Bo1(Integer.MAX_VALUE, "StartSurfaceAndroid", "user_clicks_threshold");
    public static final C0202Bo1 o = new C0202Bo1(7, "StartSurfaceAndroid", "num_days_keep_show_start_at_startup");
    public static final C0202Bo1 p = new C0202Bo1(7, "StartSurfaceAndroid", "num_days_user_click_below_threshold");
    public static final C0202Bo1 q = new C0202Bo1(Integer.MAX_VALUE, "StartSurfaceAndroid", "signin_promo_NTP_count_limit");
    public static final C0202Bo1 r = new C0202Bo1(-1, "StartSurfaceAndroid", "signin_promo_NTP_since_first_time_shown_limit_hours");
    public static final C0202Bo1 s = new C0202Bo1(-1, "StartSurfaceAndroid", "signin_promo_NTP_reset_after_hours");
    public static final C7569mB t = new C7569mB("StartSurfaceAndroid", "is_doodle_supported", false);
    public static final C7569mB u = new C7569mB("StartSurfaceAndroid", "hide_start_when_last_visited_tab_is_srp", false);

    public static boolean a() {
        return UN.L.a() && !SysUtils.isLowEndDevice();
    }

    public static void b(long j2, String str, boolean z) {
        if (j2 < 0) {
            return;
        }
        Object[] objArr = new Object[2];
        StringBuilder sb = new StringBuilder("Startup.Android.");
        sb.append(str);
        sb.append(z ? ".Instant" : ".NoInstant");
        objArr[0] = sb.toString();
        objArr[1] = Long.valueOf(j2);
        AbstractC4851eH1.d("StartSurfaceConfig", "Recorded %s = %d ms", objArr);
        StringBuilder sb2 = new StringBuilder("Startup.Android.");
        sb2.append(str);
        sb2.append(z ? ".Instant" : ".NoInstant");
        EI2.n(j2, sb2.toString());
    }

    public static boolean isBehaviouralTargetingEnabled() {
        return !TextUtils.isEmpty(m.c());
    }
}
