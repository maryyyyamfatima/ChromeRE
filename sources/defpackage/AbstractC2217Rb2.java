package defpackage;

import J.N;
import java.io.File;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.chrome.browser.offlinepages.OfflinePageItem;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2217Rb2 {
    public static C1438Lb2 a;
    public static final HashMap b = new HashMap();

    public static void h(Callback callback, OfflinePageItem offlinePageItem, WindowAndroid windowAndroid) {
        if (offlinePageItem == null) {
            return;
        }
        String str = offlinePageItem.a;
        String str2 = offlinePageItem.d;
        File file = new File(offlinePageItem.e);
        String str3 = offlinePageItem.e;
        FI2.a("OfflinePages.Sharing.SharePageFromOverflowMenu");
        new C1048Ib2(file, str3, str, str2, callback, windowAndroid).c(AbstractC0185Bl.e);
    }

    public static C1438Lb2 a() {
        if (a == null) {
            a = new C1438Lb2();
        }
        return a;
    }

    public static boolean d() {
        a().getClass();
        return NetworkChangeNotifier.b();
    }

    public static void b(long j, int i, final Callback callback, Profile profile) {
        a().getClass();
        OfflinePageBridge a2 = OfflinePageBridge.a(profile);
        if (a2 == null) {
            callback.onResult(null);
        } else {
            N.MBaVkYrR(a2.a, a2, j, i, new Callback() { // from class: Db2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Callback.this.onResult((LoadUrlParams) obj);
                }
            });
        }
    }

    public static boolean e(Tab tab) {
        WebContents b2;
        a().getClass();
        if (tab == null || (b2 = tab.b()) == null) {
            return false;
        }
        C1438Lb2 a2 = a();
        Profile b3 = Profile.b(tab.b());
        a2.getClass();
        OfflinePageBridge a3 = OfflinePageBridge.a(b3);
        if (a3 == null) {
            return false;
        }
        return N.Mmgl0zEx(a3.a, a3, b2);
    }

    public static OfflinePageItem c(WebContents webContents) {
        if (webContents == null) {
            return null;
        }
        C1438Lb2 a2 = a();
        Profile b2 = Profile.b(webContents);
        a2.getClass();
        OfflinePageBridge a3 = OfflinePageBridge.a(b2);
        if (a3 == null) {
            return null;
        }
        return (OfflinePageItem) N.MzjNdQag(a3.a, a3, webContents);
    }

    public static boolean f(WebContents webContents) {
        OfflinePageBridge a2;
        a().getClass();
        if (webContents == null || (a2 = OfflinePageBridge.a(Profile.b(webContents))) == null) {
            return false;
        }
        return N.MD0P9_ar(a2.a, a2, webContents);
    }

    public static void g(WebContents webContents, InterfaceC1308Kb2 interfaceC1308Kb2) {
        OfflinePageItem c = c(webContents);
        if (f(webContents) || c == null) {
            LoadUrlParams loadUrlParams = new LoadUrlParams(AbstractC2290Rq0.a(webContents.u()).i(), 33554440);
            C1438Lb2 a2 = a();
            Profile b2 = Profile.b(webContents);
            a2.getClass();
            OfflinePageBridge a3 = OfflinePageBridge.a(b2);
            loadUrlParams.g = a3 == null ? "" : N.MRMfaXXV(a3.a, a3, webContents);
            interfaceC1308Kb2.d(loadUrlParams);
            return;
        }
        interfaceC1308Kb2.d(new LoadUrlParams(c.a, 33554440));
    }
}
