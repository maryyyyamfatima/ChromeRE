package defpackage;

import org.chromium.device.geolocation.LocationProviderAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zG1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC12056zG1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ LocationProviderAdapter g;

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a.a(this.a);
    }

    public RunnableC12056zG1(LocationProviderAdapter locationProviderAdapter, boolean z) {
        this.g = locationProviderAdapter;
        this.a = z;
    }
}
