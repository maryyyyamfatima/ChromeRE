package org.chromium.net;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import defpackage.AbstractC5395fr4;
import defpackage.AbstractC9771sd;
import defpackage.FK3;
import defpackage.M9;
import defpackage.V60;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AndroidNetworkLibrary {
    public static Boolean a;
    public static Boolean b;

    public static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    public static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) V60.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    public static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) V60.a.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    public static int getWifiSignalLevel(int i) {
        int intExtra;
        int calculateSignalLevel;
        Context context = V60.a;
        if (context == null || context.getContentResolver() == null) {
            return -1;
        }
        if (c()) {
            WifiInfo b2 = b();
            if (b2 == null) {
                return -1;
            }
            intExtra = b2.getRssi();
        } else {
            try {
                Intent registerReceiver = V60.a.registerReceiver(null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (registerReceiver == null) {
                    return -1;
                }
                intExtra = registerReceiver.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i)) >= 0 && calculateSignalLevel < i) {
            return calculateSignalLevel;
        }
        return -1;
    }

    public static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    public static void setWifiEnabled(boolean z) {
        ((WifiManager) V60.a.getSystemService("wifi")).setWifiEnabled(z);
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: " + e);
            return false;
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return AbstractC5395fr4.g(bArr, str, str2);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        Object obj = AbstractC5395fr4.j;
        synchronized (obj) {
            AbstractC5395fr4.d();
        }
        X509Certificate b2 = AbstractC5395fr4.b(bArr);
        synchronized (obj) {
            AbstractC5395fr4.e.setCertificateEntry("root_cert_" + Integer.toString(AbstractC5395fr4.e.size()), b2);
            AbstractC5395fr4.d = AbstractC5395fr4.c(AbstractC5395fr4.e);
        }
    }

    public static void clearTestRootCertificates() {
        Object obj = AbstractC5395fr4.j;
        synchronized (obj) {
            AbstractC5395fr4.d();
        }
        synchronized (obj) {
            try {
                AbstractC5395fr4.e.load(null);
                AbstractC5395fr4.d = AbstractC5395fr4.c(AbstractC5395fr4.e);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:            r5 = r5.getTransportInfo();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.wifi.WifiInfo b() {
        /*
            boolean r0 = c()
            r1 = 0
            if (r0 == 0) goto L4e
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L3f
            android.content.Context r0 = defpackage.V60.a
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.Network[] r2 = r0.getAllNetworks()
            int r3 = r2.length
            r4 = 0
        L1d:
            if (r4 >= r3) goto L3e
            r5 = r2[r4]
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)
            if (r5 == 0) goto L3b
            r6 = 1
            boolean r6 = r5.hasTransport(r6)
            if (r6 == 0) goto L3b
            android.net.TransportInfo r5 = defpackage.AbstractC6686je.a(r5)
            if (r5 == 0) goto L3b
            boolean r6 = r5 instanceof android.net.wifi.WifiInfo
            if (r6 == 0) goto L3b
            android.net.wifi.WifiInfo r5 = (android.net.wifi.WifiInfo) r5
            return r5
        L3b:
            int r4 = r4 + 1
            goto L1d
        L3e:
            return r1
        L3f:
            android.content.Context r0 = defpackage.V60.a
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            return r0
        L4e:
            android.content.Context r0 = defpackage.V60.a
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.net.wifi.STATE_CHANGE"
            r2.<init>(r3)
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            if (r0 == 0) goto L66
            java.lang.String r1 = "wifiInfo"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.AndroidNetworkLibrary.b():android.net.wifi.WifiInfo");
    }

    public static String getWifiSSID() {
        String ssid;
        WifiInfo b2 = b();
        return (b2 == null || (ssid = b2.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    public static boolean isCleartextPermitted(String str) {
        boolean isCleartextTrafficPermitted;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
                return isCleartextTrafficPermitted;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    public static DnsStatus a(Network network) {
        ConnectivityManager connectivityManager;
        boolean isPrivateDnsActive;
        String privateDnsServerName;
        if (a == null) {
            a = Boolean.valueOf(AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!a.booleanValue() || (connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            String domains = linkProperties.getDomains();
            if (Build.VERSION.SDK_INT >= 28) {
                isPrivateDnsActive = linkProperties.isPrivateDnsActive();
                privateDnsServerName = linkProperties.getPrivateDnsServerName();
                return new DnsStatus(dnsServers, isPrivateDnsActive, privateDnsServerName, domains);
            }
            return new DnsStatus(dnsServers, false, "", domains);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static boolean c() {
        if (b == null) {
            b = Boolean.valueOf(AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_WIFI_STATE") == 0);
        }
        return b.booleanValue();
    }

    public static DnsStatus getDnsStatusForNetwork(long j) {
        Network fromNetworkHandle;
        try {
            fromNetworkHandle = Network.fromNetworkHandle(j);
            return a(fromNetworkHandle);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static DnsStatus getCurrentDnsStatus() {
        return a(null);
    }

    public static void tagSocket(int i, int i2, int i3) {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            try {
                FK3.a.invoke(null, Integer.valueOf(i2));
            } catch (IllegalAccessException e) {
                throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
            }
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(i);
        M9 m9 = new M9(adoptFd.getFileDescriptor());
        TrafficStats.tagSocket(m9);
        m9.close();
        adoptFd.detachFd();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            try {
                FK3.b.invoke(null, new Object[0]);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e4);
            }
        }
    }
}
