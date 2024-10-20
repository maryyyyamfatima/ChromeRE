package defpackage;

import J.N;
import android.app.Activity;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VO3 extends BA0 {
    public final /* synthetic */ WO3 a;

    public final void V0(Tab tab) {
        final WO3 wo3 = this.a;
        wo3.b(tab, "IPH_DownloadPage");
        boolean z = false;
        Q44 q44 = wo3.o;
        View view = wo3.l;
        Activity activity = wo3.g;
        if (tab != null && AbstractC3903bX3.a(tab, false) && N.M8WoKfWJ(tab.b())) {
            C12180ze1 c12180ze1 = new C12180ze1(activity.getResources(), "IPH_TranslateMenuButton", R.string.0_resource_name_obfuscated_res_0x7f140570, R.string.0_resource_name_obfuscated_res_0x7f14056f);
            c12180ze1.i = new Runnable() { // from class: RO3
                @Override // java.lang.Runnable
                public final void run() {
                    WO3.this.d(Integer.valueOf(R.id.translate_id));
                }
            };
            c12180ze1.k = new NO3(wo3);
            c12180ze1.h = view;
            q44.a(c12180ze1.a());
        }
        if (V83.a()) {
            if (tab != null && AbstractC2717Ux2.c(tab) != null) {
                z = true;
            }
            if (z) {
                C12180ze1 c12180ze12 = new C12180ze1(activity.getResources(), "IPH_ShoppingListMenuItem", R.string.0_resource_name_obfuscated_res_0x7f140562, R.string.0_resource_name_obfuscated_res_0x7f140563);
                c12180ze12.h = view;
                c12180ze12.i = new Runnable() { // from class: QO3
                    @Override // java.lang.Runnable
                    public final void run() {
                        WO3.this.d(Integer.valueOf(R.id.enable_price_tracking_menu_id));
                    }
                };
                c12180ze12.k = new NO3(wo3);
                q44.a(c12180ze12.a());
            }
        }
    }

    public VO3(WO3 wo3) {
        this.a = wo3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:            r6.close();     */
    @Override // defpackage.BA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(org.chromium.chrome.browser.tab.Tab r5, org.chromium.url.GURL r6) {
        /*
            r4 = this;
            r6 = 0
            java.lang.String r0 = "ToolbarButtonInProductHelpController::onPageLoadFinished"
            org.chromium.base.TraceEvent r6 = org.chromium.base.TraceEvent.i(r0, r6)
            boolean r0 = r5.n()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L4a
            WO3 r0 = r4.a     // Catch: java.lang.Throwable -> L53
            org.chromium.ui.base.WindowAndroid r0 = r0.h     // Catch: java.lang.Throwable -> L53
            boolean r0 = org.chromium.ui.base.DeviceFormFactor.b(r0)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L18
            goto L44
        L18:
            org.chromium.content_public.browser.WebContents r0 = r5.b()     // Catch: java.lang.Throwable -> L53
            org.chromium.chrome.browser.profiles.Profile r0 = org.chromium.chrome.browser.profiles.Profile.b(r0)     // Catch: java.lang.Throwable -> L53
            org.chromium.chrome.browser.offlinepages.OfflinePageBridge r0 = org.chromium.chrome.browser.offlinepages.OfflinePageBridge.a(r0)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L44
            org.chromium.content_public.browser.WebContents r1 = r5.b()     // Catch: java.lang.Throwable -> L53
            long r2 = r0.a     // Catch: java.lang.Throwable -> L53
            boolean r0 = J.N.Mvkx0jqI(r2, r0, r1)     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L33
            goto L44
        L33:
            org.chromium.content_public.browser.WebContents r5 = r5.b()     // Catch: java.lang.Throwable -> L53
            org.chromium.chrome.browser.profiles.Profile r5 = org.chromium.chrome.browser.profiles.Profile.b(r5)     // Catch: java.lang.Throwable -> L53
            KU3 r5 = defpackage.LU3.a(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "user_has_seen_dino"
            r5.notifyEvent(r0)     // Catch: java.lang.Throwable -> L53
        L44:
            if (r6 == 0) goto L49
            r6.close()
        L49:
            return
        L4a:
            r4.V0(r5)     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L52
            r6.close()
        L52:
            return
        L53:
            r5 = move-exception
            if (r6 == 0) goto L59
            r6.close()     // Catch: java.lang.Throwable -> L59
        L59:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VO3.J0(org.chromium.chrome.browser.tab.Tab, org.chromium.url.GURL):void");
    }
}
