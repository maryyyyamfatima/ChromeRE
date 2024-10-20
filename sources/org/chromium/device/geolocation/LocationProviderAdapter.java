package org.chromium.device.geolocation;

import J.N;
import android.location.Location;
import defpackage.AG1;
import defpackage.AbstractC4851eH1;
import defpackage.BG1;
import defpackage.EG1;
import defpackage.InterfaceC11713yG1;
import defpackage.RunnableC12056zG1;
import defpackage.V60;
import defpackage.VR;
import java.util.concurrent.FutureTask;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LocationProviderAdapter {
    public final InterfaceC11713yG1 a;

    public LocationProviderAdapter() {
        InterfaceC11713yG1 interfaceC11713yG1 = LocationProviderFactory.a;
        if (interfaceC11713yG1 == null) {
            if (LocationProviderFactory.b && VR.a(V60.a)) {
                LocationProviderFactory.a = new EG1(V60.a);
            } else {
                LocationProviderFactory.a = new BG1();
            }
            interfaceC11713yG1 = LocationProviderFactory.a;
        }
        this.a = interfaceC11713yG1;
    }

    public static LocationProviderAdapter create() {
        return new LocationProviderAdapter();
    }

    public void start(boolean z) {
        FutureTask futureTask = new FutureTask(new RunnableC12056zG1(this, z), null);
        if (ThreadUtils.h()) {
            futureTask.run();
        } else {
            ThreadUtils.b().post(futureTask);
        }
    }

    public void stop() {
        FutureTask futureTask = new FutureTask(new AG1(this), null);
        if (ThreadUtils.h()) {
            futureTask.run();
        } else {
            ThreadUtils.b().post(futureTask);
        }
    }

    public static void b(Location location) {
        N.MvJnRjJi(location.getLatitude(), location.getLongitude(), location.getTime() / 1000.0d, location.hasAltitude(), location.getAltitude(), location.hasAccuracy(), location.getAccuracy(), location.hasBearing(), location.getBearing(), location.hasSpeed(), location.getSpeed());
    }

    public static void a(String str) {
        AbstractC4851eH1.a("LocationProvider", "newErrorAvailable %s", str);
        N.M8Iz7Ptw(str);
    }
}
