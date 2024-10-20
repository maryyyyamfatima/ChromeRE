package defpackage;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.device.geolocation.LocationProviderAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BG1 implements LocationListener, InterfaceC11713yG1 {
    public LocationManager a;
    public boolean b;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @Override // defpackage.InterfaceC11713yG1
    public final void a(boolean z) {
        boolean z2;
        Object obj = ThreadUtils.a;
        b();
        if (this.a == null) {
            LocationManager locationManager = (LocationManager) V60.a.getSystemService("location");
            this.a = locationManager;
            if (locationManager == null) {
                AbstractC4851eH1.a("LocationProvider", "Could not get location manager.", new Object[0]);
            }
        }
        List<String> providers = this.a.getProviders(true);
        if (providers != null && providers.size() == 1 && providers.get(0).equals("passive")) {
            Location lastKnownLocation = this.a.getLastKnownLocation("passive");
            if (lastKnownLocation != null) {
                LocationProviderAdapter.b(lastKnownLocation);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        this.b = true;
        try {
            Criteria criteria = new Criteria();
            Context context = V60.a;
            if (z && context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                criteria.setAccuracy(1);
            }
            this.a.requestLocationUpdates(0L, 0.0f, criteria, this, ThreadUtils.c());
        } catch (IllegalArgumentException unused) {
            AbstractC4851eH1.a("LocationProvider", "Caught IllegalArgumentException registering for location updates.", new Object[0]);
            b();
        } catch (SecurityException unused2) {
            AbstractC4851eH1.a("LocationProvider", "Caught security exception while registering for location updates from the system. The application does not have sufficient geolocation permissions.", new Object[0]);
            b();
            LocationProviderAdapter.a("application does not have sufficient geolocation permissions.");
        }
    }

    @Override // defpackage.InterfaceC11713yG1
    public final void stop() {
        Object obj = ThreadUtils.a;
        b();
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (this.b) {
            LocationProviderAdapter.b(location);
        }
    }

    public final void b() {
        if (this.b) {
            this.b = false;
            this.a.removeUpdates(this);
        }
    }
}
