package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A43 implements Runnable {
    public final /* synthetic */ ServiceWorkerPaymentAppBridge.GetServiceWorkerPaymentAppsInfoCallback a;

    public A43(C0780Ga c0780Ga) {
        this.a = c0780Ga;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(new HashMap());
    }
}
