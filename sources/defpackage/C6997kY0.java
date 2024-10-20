package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6997kY0 implements LocationListener {
    public final LocationManager a;
    public final Handler b;
    public final RunnableC6653jY0 c;
    public boolean d;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C6997kY0(LocationManager locationManager) {
        this.a = locationManager;
        Handler handler = new Handler();
        this.b = handler;
        RunnableC6653jY0 runnableC6653jY0 = new RunnableC6653jY0(this);
        this.c = runnableC6653jY0;
        handler.postDelayed(runnableC6653jY0, 60000L);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.b.removeCallbacks(this.c);
        AbstractC7341lY0.a = null;
    }
}
