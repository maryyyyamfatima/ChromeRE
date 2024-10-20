package org.chromium.chrome.browser.flags;

import J.N;
import defpackage.AbstractC0952Hi1;
import defpackage.AbstractC6265iP;
import defpackage.C0822Gi1;
import defpackage.C7928nE;
import defpackage.C8615pE;
import defpackage.O83;
import defpackage.P74;
import defpackage.Q74;
import defpackage.Q83;
import defpackage.TL2;
import defpackage.UN;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CachedFeatureFlags {
    public static final TL2 a;
    public static final Q74 b;
    public static final P74 c;
    public static final C8615pE d;
    public static String e;

    static {
        C0822Gi1 a2 = AbstractC0952Hi1.a();
        Boolean bool = Boolean.TRUE;
        a2.b("AnonymousUpdateChecks", bool);
        Boolean bool2 = Boolean.FALSE;
        a2.b("AppMenuMobileSiteOption", bool2);
        a2.b("BackGestureRefactorAndroid", bool2);
        a2.b("CCTIncognito", bool);
        a2.b("CCTIncognitoAvailableToThirdParty", bool2);
        a2.b("CCTRemoveRemoteViewIds", bool);
        a2.b("CCTResizable90MaximumHeight", bool2);
        a2.b("CCTResizableAllowResizeByUserGesture", bool2);
        a2.b("CCTResizableForFirstParties", bool);
        a2.b("CommerceCoupons", bool2);
        a2.b("CCTResizableForThirdParties", bool2);
        a2.b("CCTToolbarCustomizations", bool);
        a2.b("CloseTabSuggestions", bool2);
        a2.b("CommandLineOnNonRooted", bool2);
        a2.b("ConditionalTabStripAndroid", bool2);
        a2.b("CreateSafebrowsingOnStartup", bool2);
        a2.b("CriticalPersistedTabData", bool2);
        a2.b("DownloadsAutoResumptionNative", bool);
        a2.b("DynamicColorAndroid", bool);
        a2.b("DynamicColorButtonsAndroid", bool);
        a2.b("EarlyLibraryLoad", bool);
        a2.b("ElasticOverscroll", bool);
        a2.b("ElidePrioritizationOfPreNativeBootstrapTasks", bool);
        a2.b("ExperimentsForAgsa", bool);
        a2.b("FeedLoadingPlaceholder", bool2);
        a2.b("GridTabSwitcherForTablets", bool2);
        a2.b("ImmersiveUiMode", bool2);
        a2.b("IncognitoReauthenticationForAndroid", bool2);
        a2.b("InstanceSwitcher", bool);
        a2.b("InstantStart", bool2);
        a2.b("InterestFeedV2", bool);
        a2.b("LensCameraAssistedSearch", bool2);
        a2.b("NewWindowAppMenu", bool);
        a2.b("AndroidAuxiliarySearch", bool2);
        a2.b("OptimizationGuidePushNotifications", bool2);
        a2.b("PaintPreviewDemo", bool2);
        a2.b("PaintPreviewShowOnStartup", bool2);
        a2.b("PrefetchNotificationSchedulingIntegration", bool2);
        a2.b("ReadLater", bool2);
        a2.b("StartSurfaceAndroid", bool2);
        a2.b("StartSurfaceRefactor", bool2);
        a2.b("StoreHoursAndroid", bool2);
        a2.b("SwapPixelFormatToFixConvertFromTranslucent", bool);
        a2.b("TabGridLayoutAndroid", bool);
        a2.b("TabGroupsAndroid", bool);
        a2.b("TabGroupsContinuationAndroid", bool2);
        a2.b("TabGroupsForTablets", bool2);
        a2.b("TabStripImprovements", bool2);
        a2.b("TabToGTSAnimation", bool);
        a2.b("TestDefaultDisabled", bool2);
        a2.b("TestDefaultEnabled", bool);
        a2.b("ToolbarUseHardwareBitmapDraw", bool2);
        a2.b("UseChimeAndroidSdk", bool2);
        a2.b("WebApkTrampolineOnInitialIntent", bool);
        a2.a(true);
        C0822Gi1 a3 = AbstractC0952Hi1.a();
        a3.b("CommandLineOnNonRooted", "command_line_on_non_rooted_enabled");
        a3.b("DownloadsAutoResumptionNative", "download_auto_resumption_in_native");
        a3.b("ImmersiveUiMode", "immersive_ui_mode_enabled");
        a3.b("SwapPixelFormatToFixConvertFromTranslucent", "swap_pixel_format_to_fix_convert_from_translucent");
        a3.b("StartSurfaceAndroid", "start_surface_enabled");
        a3.b("TabGridLayoutAndroid", "grid_tab_switcher_enabled");
        a3.b("TabGroupsAndroid", "tab_group_android_enabled");
        a = a3.a(true);
        b = new Q74();
        c = new P74();
        d = new C8615pE();
    }

    public static boolean isEnabled(String str, boolean z) {
        Boolean valueOf;
        C8615pE c8615pE = d;
        c8615pE.c();
        String str2 = (String) a.get(str);
        if (str2 == null) {
            str2 = AbstractC6265iP.c.b(str);
        }
        Q74 q74 = b;
        synchronized (q74.a) {
            Boolean bool = (Boolean) q74.a.get(str2);
            if (bool != null) {
                return bool.booleanValue();
            }
            c8615pE.b();
            Q83 q83 = O83.a;
            if (q83.c(str2)) {
                valueOf = Boolean.valueOf(q83.e(str2, false));
            } else {
                valueOf = Boolean.valueOf(z);
            }
            q74.a.put(str2, valueOf);
            return valueOf.booleanValue();
        }
    }

    public static void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C7928nE) it.next()).a;
            String str2 = (String) a.get(str);
            if (str2 == null) {
                str2 = AbstractC6265iP.c.b(str);
            }
            C7928nE c7928nE = UN.a;
            O83.a.p(str2, N.M09VlOh_(str));
        }
    }

    public static String getReachedCodeProfilerTrialGroup() {
        if (e == null) {
            e = O83.a.i("reached_code_profiler_group", "");
        }
        return e;
    }

    public static boolean b(String str, boolean z) {
        C8615pE c8615pE = d;
        c8615pE.c();
        c.getClass();
        Q74 q74 = b;
        synchronized (q74.a) {
            Boolean bool = (Boolean) q74.a.get(str);
            if (bool == null) {
                c8615pE.b();
                Boolean valueOf = Boolean.valueOf(O83.a.e(str, z));
                q74.a.put(str, valueOf);
                return valueOf.booleanValue();
            }
            return bool.booleanValue();
        }
    }

    public static String c(String str, String str2) {
        C8615pE c8615pE = d;
        c8615pE.c();
        c.getClass();
        Q74 q74 = b;
        synchronized (q74.b) {
            String str3 = (String) q74.b.get(str);
            if (str3 != null) {
                return str3;
            }
            c8615pE.b();
            String i = O83.a.i(str, str2);
            q74.b.put(str, i);
            return i;
        }
    }
}
