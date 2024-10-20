package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fQ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5241fQ2 {
    public static final C0202Bo1 a = new C0202Bo1(-1, "TabSwitcherOnReturn", "tab_switcher_on_return_time_ms");
    public static boolean b;

    public static void l() {
        O83.a.p("Chrome.Feed.ArticlesListVisible", N.MpwNAobK() && AbstractC8650pL.a("ntp_snippets.list_visible"));
    }

    public static void g(String str) {
        String c = CachedFeatureFlags.c(AbstractC6265iP.d.b("StartSurfaceAndroid:behavioural_targeting"), "");
        if (TextUtils.isEmpty(c)) {
            return;
        }
        if (TextUtils.equals("all", c) || TextUtils.equals(a(c), str)) {
            Q83 q83 = O83.a;
            q83.q(q83.f(0, str) + 1, str);
        }
    }

    public static String f(int i) {
        return Y5.a(new StringBuilder("."), i == 0 ? "0" : i <= 2 ? "1~2" : i <= 5 ? "3~5" : i <= 10 ? "6~10" : i <= 20 ? "11~20" : "20+", "thumbnails");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:            if (defpackage.T34.j(r0) == false) goto L13;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.chrome.browser.tab.Tab c(org.chromium.content_public.browser.LoadUrlParams r4, java.lang.String r5, byte[] r6, boolean r7, java.lang.Boolean r8, org.chromium.chrome.browser.tab.Tab r9) {
        /*
            java.lang.String r0 = r4.a
            android.app.Activity r1 = org.chromium.base.ApplicationStatus.c
            r2 = 0
            if (r1 == 0) goto L20
            boolean r3 = d(r1)
            if (r3 == 0) goto L20
            boolean r3 = r1 instanceof org.chromium.chrome.browser.app.ChromeActivity
            if (r3 != 0) goto L12
            goto L20
        L12:
            org.chromium.chrome.browser.app.ChromeActivity r1 = (org.chromium.chrome.browser.app.ChromeActivity) r1
            boolean r3 = r1.A1()
            if (r3 != 0) goto L21
            boolean r3 = defpackage.T34.j(r0)
            if (r3 != 0) goto L21
        L20:
            r1 = r2
        L21:
            if (r1 != 0) goto L24
            return r2
        L24:
            if (r8 != 0) goto L2f
            org.chromium.chrome.browser.tabmodel.TabModel r8 = r1.o1()
            boolean r8 = r8.isIncognito()
            goto L33
        L2f:
            boolean r8 = r8.booleanValue()
        L33:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L51
            if (r6 == 0) goto L51
            int r2 = r6.length
            if (r2 == 0) goto L51
            java.lang.String r2 = "Content-Type: "
            java.lang.String r5 = defpackage.AbstractC4809e90.a(r2, r5)
            r4.g = r5
            byte[] r5 = J.N.MugoAW_d(r6)
            org.chromium.content_public.common.ResourceRequestBody r5 = org.chromium.content_public.common.ResourceRequestBody.createFromEncodedNativeForm(r5)
            r4.b(r5)
        L51:
            uv3 r5 = r1.b(r8)
            if (r7 == 0) goto L59
            r6 = 5
            goto L5b
        L59:
            r6 = 12
        L5b:
            org.chromium.chrome.browser.tab.Tab r5 = r5.b(r6, r9, r4)
            if (r7 == 0) goto L64
            defpackage.C1998Pj3.c(r5)
        L64:
            int r6 = r4.d
            r7 = 2
            if (r6 != r7) goto L7d
            java.lang.String r6 = r4.a
            java.lang.String r7 = "chrome-native://recent-tabs/"
            boolean r6 = android.text.TextUtils.equals(r7, r6)
            if (r6 != 0) goto L99
            aL2 r4 = r4.e
            if (r4 != 0) goto L99
            java.lang.String r4 = "Suggestions.Tile.Tapped.StartSurface"
            defpackage.FI2.a(r4)
            goto L99
        L7d:
            if (r0 != 0) goto L85
            java.lang.String r4 = "MobileMenuNewTab.StartSurfaceFinale"
            defpackage.FI2.a(r4)
            goto L99
        L85:
            java.lang.String r6 = "MobileOmniboxUse.StartSurface"
            defpackage.FI2.a(r6)
            java.lang.String r6 = "MobileOmniboxUse"
            defpackage.FI2.a(r6)
            org.chromium.chrome.browser.locale.LocaleManager r6 = org.chromium.chrome.browser.locale.LocaleManager.getInstance()
            int r4 = r4.d
            r7 = 0
            r6.b(r0, r4, r7)
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5241fQ2.c(org.chromium.content_public.browser.LoadUrlParams, java.lang.String, byte[], boolean, java.lang.Boolean, org.chromium.chrome.browser.tab.Tab):org.chromium.chrome.browser.tab.Tab");
    }

    public static boolean k(Context context) {
        if (!d(context)) {
            return false;
        }
        C10218tu1 c10218tu1 = AbstractC6265iP.d;
        StringBuilder sb = new StringBuilder();
        sb.append("StartSurfaceAndroid");
        sb.append(":");
        sb.append("open_ntp_instead_of_start");
        return !CachedFeatureFlags.b(c10218tu1.b(sb.toString()), false);
    }

    public static boolean d(Context context) {
        String b2 = C10648v91.b();
        return StartSurfaceConfiguration.a() && C10648v91.d() && !((!TextUtils.isEmpty(b2) && !T34.f(b2)) || j(context) || DeviceFormFactor.a(context));
    }

    public static boolean j(Context context) {
        if (C10021tL.f().c()) {
            if (!CachedFeatureFlags.b(AbstractC6265iP.d.b("StartSurfaceAndroid:support_accessibility"), true) || !AbstractC5177fD3.d(context)) {
                return true;
            }
        }
        return false;
    }

    public static Tab b(LoadUrlParams loadUrlParams, boolean z, Boolean bool, Tab tab) {
        TraceEvent i = TraceEvent.i("StartSurface.LoadUrl", null);
        try {
            Tab c = c(loadUrlParams, null, null, z, bool, tab);
            if (i != null) {
                i.close();
            }
            return c;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public static String a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1962497151:
                if (str.equals("open_new_tab")) {
                    c = 0;
                    break;
                }
                break;
            case -1819851561:
                if (str.equals("model_open_new_tab")) {
                    c = 1;
                    break;
                }
                break;
            case -1343322683:
                if (str.equals("model_mv_tiles")) {
                    c = 2;
                    break;
                }
                break;
            case 97308309:
                if (str.equals("feeds")) {
                    c = 3;
                    break;
                }
                break;
            case 426167405:
                if (str.equals("open_recent_tabs")) {
                    c = 4;
                    break;
                }
                break;
            case 819227135:
                if (str.equals("model_feeds")) {
                    c = 5;
                    break;
                }
                break;
            case 1169150319:
                if (str.equals("mv_tiles")) {
                    c = 6;
                    break;
                }
                break;
            case 1387186883:
                if (str.equals("model_open_recent_tabs")) {
                    c = 7;
                    break;
                }
                break;
            case 1413859231:
                if (str.equals("open_history")) {
                    c = '\b';
                    break;
                }
                break;
            case 1556504821:
                if (str.equals("model_open_history")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return "Chrome.StartSurface.OpenNewTabPageCount";
            case 2:
            case 6:
                return "Chrome.StartSurface.TapMVTilesCount";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "Chrome.StartSurface.TapFeedCardsCount";
            case 4:
            case 7:
                return "Chrome.StartSurface.OpenRecentTabCount";
            case '\b':
            case '\t':
                return "Chrome.StartSurface.OpenHistoryCount";
            default:
                return null;
        }
    }

    public static void i(boolean z) {
        int c;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            c = StartSurfaceConfiguration.o.c();
        } else {
            c = StartSurfaceConfiguration.p.c();
        }
        long j = (c * 86400000) + currentTimeMillis;
        Q83 q83 = O83.a;
        q83.p("Chrome.StartSurface.ShownOnStartup", z);
        q83.s(j, "Chrome.StartSurface.ShownOnStartupDecisionMs");
    }

    public static boolean e(Context context) {
        return UN.M.a() && AbstractC5177fD3.b(context) && !d(context);
    }

    public static void h(String str) {
        FI2.a("StartSurface.ShownFromBackNavigation.".concat(str));
    }
}
