package org.chromium.chrome.browser.payments;

import J.N;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ServiceWorkerPaymentAppBridge {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface GetServiceWorkerPaymentAppsInfoCallback {
        void a(Map map);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface HasServiceWorkerPaymentAppsCallback {
        void a(boolean z);
    }

    public static void a(WebContents webContents, int i) {
        if (webContents == null || webContents.isDestroyed()) {
            return;
        }
        N.MAan0VNK(webContents, i);
    }

    public static void onHasServiceWorkerPaymentApps(HasServiceWorkerPaymentAppsCallback hasServiceWorkerPaymentAppsCallback, boolean z) {
        Object obj = ThreadUtils.a;
        hasServiceWorkerPaymentAppsCallback.a(z);
    }

    public static Object createPaymentAppsInfo() {
        return new HashMap();
    }

    public static void addPaymentAppInfo(Object obj, String str, String str2, Bitmap bitmap) {
        ((Map) obj).put(str, new Pair(str2, bitmap));
    }

    public static void onGetServiceWorkerPaymentAppsInfo(GetServiceWorkerPaymentAppsInfoCallback getServiceWorkerPaymentAppsInfoCallback, Object obj) {
        Object obj2 = ThreadUtils.a;
        getServiceWorkerPaymentAppsInfoCallback.a((Map) obj);
    }
}
