package defpackage;

import android.content.Context;
import android.os.Build;
import org.chromium.base.SysUtils;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fD3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5177fD3 {
    public static final C7569mB a = new C7569mB("TabToGTSAnimation", "skip-slow-zooming", true);
    public static final C2550Tq0 b = new C2550Tq0("TabGridLayoutAndroid", "thumbnail_aspect_ratio", 0.85d);
    public static final C7569mB c = new C7569mB("TabGridLayoutAndroid", "enable_search_term_chip", false);
    public static final C7569mB d = new C7569mB("TabGridLayoutAndroid", "enable_search_term_chip_adaptive_icon", false);
    public static final C7569mB e = new C7569mB("TabGroupsContinuationAndroid", "enable_launch_bug_fix", false);
    public static final C7569mB f = new C7569mB("TabGroupsContinuationAndroid", "enable_launch_polish", false);
    public static final C0202Bo1 g = new C0202Bo1(23, "TabToGTSAnimation", "zooming-min-sdk-version");
    public static final C0202Bo1 h = new C0202Bo1(2048, "TabToGTSAnimation", "zooming-min-memory-mb");
    public static final C7569mB i = new C7569mB("TabGridLayoutAndroid", "enable_tab_group_auto_creation", true);
    public static final C7569mB j = new C7569mB("TabGridLayoutAndroid", "show_open_in_tab_group_menu_item_first", false);
    public static final C7569mB k = new C7569mB("TabGroupsContinuationAndroid", "enable_tab_group_sharing", false);
    public static final C7569mB l = new C7569mB("GridTabSwitcherForTablets", "enable_launch_polish", false);
    public static final C7569mB m = new C7569mB("GridTabSwitcherForTablets", "delay_creation", false);
    public static final C2550Tq0 n = new C2550Tq0("TabStripImprovements", "min_tab_width", 190.0d);

    public static boolean b(Context context) {
        if (DeviceFormFactor.a(context)) {
            return h(context);
        }
        return (AbstractC3722az3.a() != null) || e(context) || AbstractC5241fQ2.d(context);
    }

    public static boolean h(Context context) {
        return DeviceFormFactor.a(context) && UN.A.a();
    }

    public static boolean j(Context context) {
        return DeviceFormFactor.a(context) && UN.A.a() && UN.T.a() && UN.S.a();
    }

    public static boolean i(Context context) {
        return DeviceFormFactor.a(context) && l.c();
    }

    public static boolean e(Context context) {
        if (DeviceFormFactor.a(context)) {
            return j(context);
        }
        if (C1096Il0.a(context) || !UN.Q.a()) {
            return false;
        }
        return AbstractC3722az3.a() != null;
    }

    public static boolean d(Context context) {
        return e(context) && UN.R.a();
    }

    public static boolean a() {
        if (UN.p.a()) {
            return (AbstractC3722az3.a() != null) && !O83.a.e("Chrome.ConditionalTabStrip.OptOut", false);
        }
        return false;
    }

    public static boolean f() {
        return Double.compare(1.0d, b.c()) != 0;
    }

    public static boolean g() {
        C0202Bo1 c0202Bo1 = g;
        c0202Bo1.c();
        C0202Bo1 c0202Bo12 = h;
        c0202Bo12.c();
        return UN.U.a() && Build.VERSION.SDK_INT >= c0202Bo1.c() && SysUtils.amountOfPhysicalMemoryKB() / 1024 >= c0202Bo12.c();
    }

    public static boolean k(Context context, boolean z) {
        return (C1096Il0.a(context) || !UN.E.a() || z || SysUtils.isLowEndDevice()) ? false : true;
    }

    public static boolean c() {
        return f.c();
    }
}
