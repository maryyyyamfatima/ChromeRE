package defpackage;

import org.chromium.device.geolocation.LocationProviderAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class AG1 implements Runnable {
    public final /* synthetic */ LocationProviderAdapter a;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.stop();
    }

    public AG1(LocationProviderAdapter locationProviderAdapter) {
        this.a = locationProviderAdapter;
    }
}
