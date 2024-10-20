package defpackage;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Bf4 {
    public static C12189zf4 a = null;
    public static long b = Long.MAX_VALUE;
    public static boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [rv2] */
    /* JADX WARN: Type inference failed for: r15v3, types: [Af4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v9, types: [qv2] */
    public static void b(Context context) {
        final ?? hashSet;
        Callback callback;
        TelephonyManager telephonyManager;
        Object obj = ThreadUtils.a;
        if (a() || c) {
            return;
        }
        c = true;
        Callback callback2 = new Callback() { // from class: Af4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Object obj3 = ThreadUtils.a;
                Bf4.c = false;
                Bf4.a = (C12189zf4) obj2;
                Bf4.b = SystemClock.elapsedRealtime();
            }
        };
        TelephonyManager telephonyManager2 = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        final C11846yf4 c2 = AbstractC10225tv2.c(context);
        final C11503xf4 b2 = AbstractC10225tv2.b(context, telephonyManager2);
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        int i = 0;
        if (!(AbstractC10225tv2.e(context) && AbstractC10225tv2.f(context, "android.permission.ACCESS_WIFI_STATE"))) {
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet();
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long currentTimeMillis = System.currentTimeMillis();
                while (i < scanResults.size()) {
                    ScanResult scanResult = scanResults.get(i);
                    String str = scanResult.BSSID;
                    if (str == null) {
                        callback = callback2;
                        telephonyManager = telephonyManager2;
                    } else {
                        callback = callback2;
                        telephonyManager = telephonyManager2;
                        hashSet.add(new C11846yf4(scanResult.SSID, str, Integer.valueOf(scanResult.level), Long.valueOf(currentTimeMillis - (elapsedRealtime - TimeUnit.MICROSECONDS.toMillis(scanResult.timestamp)))));
                    }
                    i++;
                    callback2 = callback;
                    telephonyManager2 = telephonyManager;
                }
            }
        }
        final ?? r15 = callback2;
        TelephonyManager telephonyManager3 = telephonyManager2;
        final ?? r2 = new Callback() { // from class: qv2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                r15.onResult(new C12189zf4(c2, b2, hashSet, (Set) obj2));
            }
        };
        if (!AbstractC10225tv2.e(context) || telephonyManager3 == null) {
            r2.onResult(Collections.emptySet());
            return;
        }
        ?? r0 = new Callback() { // from class: rv2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                final List list = (List) obj2;
                QF3 qf3 = AbstractC5103f04.a;
                final Callback callback3 = r2;
                PostTask.c(qf3, new Runnable() { // from class: sv2
                    @Override // java.lang.Runnable
                    public final void run() {
                        HashSet hashSet2 = new HashSet();
                        List list2 = list;
                        if (list2 != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            for (int i2 = 0; i2 < list2.size(); i2++) {
                                C11503xf4 d = AbstractC10225tv2.d((CellInfo) list2.get(i2), elapsedRealtime2, currentTimeMillis2);
                                if (d.a != 0) {
                                    hashSet2.add(d);
                                }
                            }
                        }
                        callback3.onResult(hashSet2);
                    }
                });
            }
        };
        if (Build.VERSION.SDK_INT >= 29) {
            ExecutorC11534xl executorC11534xl = AbstractC0185Bl.e;
            telephonyManager3.requestCellInfoUpdate(AbstractC0185Bl.e, new C8406oe(r0));
        } else {
            r0.onResult(telephonyManager3.getAllCellInfo());
        }
    }

    public static boolean a() {
        C12189zf4 c12189zf4 = a;
        return (c12189zf4 == null || b == Long.MAX_VALUE || c12189zf4.a() || SystemClock.elapsedRealtime() - b >= 300000) ? false : true;
    }
}
