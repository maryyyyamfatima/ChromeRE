package defpackage;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tv2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10225tv2 {
    public static C11846yf4 a(WifiInfo wifiInfo) {
        if (wifiInfo == null) {
            return C11846yf4.e;
        }
        String ssid = wifiInfo.getSSID();
        if (ssid == null || "<unknown ssid>".equals(ssid)) {
            ssid = null;
        } else if (ssid.startsWith("\"") && ssid.endsWith("\"") && ssid.length() > 2) {
            ssid = ssid.substring(1, ssid.length() - 1);
        }
        return new C11846yf4(ssid, wifiInfo.getBSSID(), null, Long.valueOf(System.currentTimeMillis()));
    }

    public static C11503xf4 b(Context context, TelephonyManager telephonyManager) {
        CellInfo cellInfo;
        C11503xf4 d;
        int i;
        if (!e(context)) {
            d = C11503xf4.k;
        } else {
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int i2 = 0;
                cellInfo = null;
                for (int i3 = 0; i3 < allCellInfo.size(); i3++) {
                    CellInfo cellInfo2 = allCellInfo.get(i3);
                    if (cellInfo2.isRegistered()) {
                        i2++;
                        if (i2 <= 1) {
                            cellInfo = cellInfo2;
                        }
                    }
                }
                d = d(cellInfo, SystemClock.elapsedRealtime(), System.currentTimeMillis());
            }
            cellInfo = null;
            d = d(cellInfo, SystemClock.elapsedRealtime(), System.currentTimeMillis());
        }
        if (d == null || !((i = d.a) == 0 || i == 1)) {
            return d;
        }
        return null;
    }

    public static C11503xf4 d(CellInfo cellInfo, long j, long j2) {
        if (cellInfo == null) {
            return C11503xf4.j;
        }
        long millis = j2 - (j - TimeUnit.NANOSECONDS.toMillis(cellInfo.getTimeStamp()));
        if (cellInfo instanceof CellInfoCdma) {
            CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
            C11160wf4 a = C11503xf4.a(2);
            a.b = Integer.valueOf(cellIdentity.getBasestationId());
            a.c = Integer.valueOf(cellIdentity.getNetworkId());
            a.e = Integer.valueOf(cellIdentity.getSystemId());
            a.i = Long.valueOf(millis);
            return a.a();
        }
        if (cellInfo instanceof CellInfoGsm) {
            CellIdentityGsm cellIdentity2 = ((CellInfoGsm) cellInfo).getCellIdentity();
            C11160wf4 a2 = C11503xf4.a(3);
            a2.b = Integer.valueOf(cellIdentity2.getCid());
            a2.c = Integer.valueOf(cellIdentity2.getLac());
            a2.d = Integer.valueOf(cellIdentity2.getMcc());
            a2.e = Integer.valueOf(cellIdentity2.getMnc());
            a2.i = Long.valueOf(millis);
            return a2.a();
        }
        if (cellInfo instanceof CellInfoLte) {
            CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
            C11160wf4 a3 = C11503xf4.a(4);
            a3.b = Integer.valueOf(cellIdentity3.getCi());
            a3.d = Integer.valueOf(cellIdentity3.getMcc());
            a3.e = Integer.valueOf(cellIdentity3.getMnc());
            a3.g = Integer.valueOf(cellIdentity3.getPci());
            a3.h = Integer.valueOf(cellIdentity3.getTac());
            a3.i = Long.valueOf(millis);
            return a3.a();
        }
        if (!(cellInfo instanceof CellInfoWcdma)) {
            return C11503xf4.j;
        }
        CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
        C11160wf4 a4 = C11503xf4.a(5);
        a4.b = Integer.valueOf(cellIdentity4.getCid());
        a4.c = Integer.valueOf(cellIdentity4.getLac());
        a4.d = Integer.valueOf(cellIdentity4.getMcc());
        a4.e = Integer.valueOf(cellIdentity4.getMnc());
        a4.f = Integer.valueOf(cellIdentity4.getPsc());
        a4.i = Long.valueOf(millis);
        return a4.a();
    }

    public static boolean f(Context context, String str) {
        return AbstractC9771sd.a(Process.myPid(), Process.myUid(), context, str) == 0;
    }

    public static boolean e(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f(context, "android.permission.ACCESS_FINE_LOCATION");
        }
        return f(context, "android.permission.ACCESS_COARSE_LOCATION") || f(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:            r5 = r5.getTransportInfo();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C11846yf4 c(android.content.Context r7) {
        /*
            boolean r0 = e(r7)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            boolean r0 = f(r7, r0)
            if (r0 == 0) goto L12
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            r3 = 0
            if (r0 == 0) goto L64
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r0 < r4) goto L4f
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7
            android.net.Network[] r0 = r7.getAllNetworks()
            int r4 = r0.length
        L2d:
            if (r1 >= r4) goto L4d
            r5 = r0[r1]
            android.net.NetworkCapabilities r5 = r7.getNetworkCapabilities(r5)
            if (r5 == 0) goto L4a
            boolean r6 = r5.hasTransport(r2)
            if (r6 == 0) goto L4a
            android.net.TransportInfo r5 = defpackage.AbstractC6686je.a(r5)
            if (r5 == 0) goto L4a
            boolean r6 = r5 instanceof android.net.wifi.WifiInfo
            if (r6 == 0) goto L4a
            android.net.wifi.WifiInfo r5 = (android.net.wifi.WifiInfo) r5
            goto L5f
        L4a:
            int r1 = r1 + 1
            goto L2d
        L4d:
            r5 = r3
            goto L5f
        L4f:
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.net.wifi.WifiManager r7 = (android.net.wifi.WifiManager) r7
            android.net.wifi.WifiInfo r5 = r7.getConnectionInfo()
        L5f:
            yf4 r7 = a(r5)
            goto L8b
        L64:
            boolean r0 = e(r7)
            yf4 r1 = defpackage.C11846yf4.e
            if (r0 == 0) goto L8a
            android.content.Context r7 = r7.getApplicationContext()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.net.wifi.STATE_CHANGE"
            r0.<init>(r2)
            android.content.Intent r7 = r7.registerReceiver(r3, r0)
            if (r7 == 0) goto L8a
            java.lang.String r0 = "wifiInfo"
            android.os.Parcelable r7 = r7.getParcelableExtra(r0)
            android.net.wifi.WifiInfo r7 = (android.net.wifi.WifiInfo) r7
            yf4 r7 = a(r7)
            goto L8b
        L8a:
            r7 = r1
        L8b:
            java.lang.String r0 = r7.b
            if (r0 != 0) goto L90
            return r3
        L90:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10225tv2.c(android.content.Context):yf4");
    }
}
