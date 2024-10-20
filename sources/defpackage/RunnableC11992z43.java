package defpackage;

import org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z43, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11992z43 implements Runnable {
    public final /* synthetic */ ServiceWorkerPaymentAppBridge.HasServiceWorkerPaymentAppsCallback a;

    public RunnableC11992z43(C4702dr c4702dr) {
        this.a = c4702dr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(false);
    }
}
