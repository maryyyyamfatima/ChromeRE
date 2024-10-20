package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationRequest;
import org.chromium.base.ThreadUtils;
import org.chromium.device.geolocation.LocationProviderAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class EG1 implements InterfaceC11713yG1 {
    public final Context a;
    public final ZV0 b;
    public DG1 c;

    public EG1(Context context) {
        AbstractC4851eH1.d("LocationProvider", "Google Play Services", new Object[0]);
        this.a = context;
        this.b = new ZV0(context);
    }

    @Override // defpackage.InterfaceC11713yG1
    public final void a(boolean z) {
        Object obj = ThreadUtils.a;
        LocationRequest locationRequest = new LocationRequest();
        if (this.a.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            z = false;
        }
        if (z) {
            locationRequest.a = 100;
            long j = locationRequest.h;
            long j2 = locationRequest.g;
            if (j == j2 / 6) {
                locationRequest.h = 83L;
            }
            if (locationRequest.n == j2) {
                locationRequest.n = 500L;
            }
            locationRequest.g = 500L;
        } else {
            locationRequest.a = 102;
            long j3 = locationRequest.h;
            long j4 = locationRequest.g;
            if (j3 == j4 / 6) {
                locationRequest.h = 166L;
            }
            if (locationRequest.n == j4) {
                locationRequest.n = 1000L;
            }
            locationRequest.g = 1000L;
        }
        DG1 dg1 = this.c;
        ZV0 zv0 = this.b;
        if (dg1 != null) {
            zv0.f(dg1);
        }
        DG1 dg12 = new DG1();
        this.c = dg12;
        try {
            zv0.g(locationRequest, dg12, ThreadUtils.c()).c(new InterfaceC2872Wc2() { // from class: CG1
                @Override // defpackage.InterfaceC2872Wc2
                public final void c(Exception exc) {
                    AbstractC4851eH1.a("LocationProvider", "mClient.requestLocationUpdates() " + exc, new Object[0]);
                    LocationProviderAdapter.a("Failed to request location updates: " + exc.toString());
                }
            });
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("LocationProvider", "mClient.requestLocationUpdates() " + e, new Object[0]);
            LocationProviderAdapter.a("Failed to request location updates: " + e.toString());
        } catch (SecurityException e2) {
            AbstractC4851eH1.a("LocationProvider", "mClient.requestLocationUpdates() missing permissions " + e2, new Object[0]);
            LocationProviderAdapter.a("Failed to request location updates due to permissions: " + e2.toString());
        }
    }

    @Override // defpackage.InterfaceC11713yG1
    public final void stop() {
        Object obj = ThreadUtils.a;
        this.b.f(this.c);
        this.c = null;
    }
}
