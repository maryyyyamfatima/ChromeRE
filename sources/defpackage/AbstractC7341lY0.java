package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Process;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7341lY0 {
    public static C6997kY0 a;

    public static long b(Location location) {
        long currentTimeMillis = System.currentTimeMillis() - location.getTime();
        if (currentTimeMillis >= 0) {
            return currentTimeMillis;
        }
        return Long.MAX_VALUE;
    }

    public static boolean c(Context context, String str) {
        return AbstractC9771sd.a(Process.myPid(), Process.myUid(), context, str) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:            if (r3.getTime() > r1.getTime()) goto L20;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.location.Location a(android.content.Context r8) {
        /*
            java.lang.String r0 = "GeolocationTracker.getLastKnownLocation"
            r1 = 0
            org.chromium.base.TraceEvent r0 = org.chromium.base.TraceEvent.i(r0, r1)
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = c(r8, r2)     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L15
            if (r0 == 0) goto L14
            r0.close()
        L14:
            return r1
        L15:
            java.lang.String r2 = "location"
            java.lang.Object r2 = r8.getSystemService(r2)     // Catch: java.lang.Throwable -> L4b
            android.location.LocationManager r2 = (android.location.LocationManager) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "network"
            android.location.Location r3 = r2.getLastKnownLocation(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r8 = c(r8, r4)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L31
            java.lang.String r8 = "gps"
            android.location.Location r1 = r2.getLastKnownLocation(r8)     // Catch: java.lang.Throwable -> L4b
        L31:
            if (r1 != 0) goto L34
            goto L45
        L34:
            if (r3 != 0) goto L37
            goto L44
        L37:
            long r4 = r3.getTime()     // Catch: java.lang.Throwable -> L4b
            long r6 = r1.getTime()     // Catch: java.lang.Throwable -> L4b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L44
            goto L45
        L44:
            r3 = r1
        L45:
            if (r0 == 0) goto L4a
            r0.close()
        L4a:
            return r3
        L4b:
            r8 = move-exception
            if (r0 == 0) goto L51
            r0.close()     // Catch: java.lang.Throwable -> L51
        L51:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7341lY0.a(android.content.Context):android.location.Location");
    }
}
