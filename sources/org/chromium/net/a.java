package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.I22;
import defpackage.J22;
import defpackage.K22;
import defpackage.L22;
import defpackage.R22;
import defpackage.S22;
import defpackage.T22;
import defpackage.U22;
import defpackage.V60;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class a extends BroadcastReceiver {
    public final Looper a;
    public final Handler b;
    public final NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter c;
    public final T22 d;
    public final U22 e;
    public ConnectivityManager.NetworkCallback f;
    public final K22 g;
    public R22 h;
    public final NetworkRequest i;
    public boolean j;
    public S22 k;
    public boolean l;
    public final boolean m;
    public boolean n;

    public static int a(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        return i != 9 ? 0 : 1;
                    }
                    return 7;
                }
                return 5;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    public static Network[] c(K22 k22, Network network) {
        NetworkCapabilities c;
        Network[] allNetworks = k22.a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network) && (c = k22.c(network2)) != null && c.hasCapability(12)) {
                if (c.hasTransport(4)) {
                    if (K22.e(network2)) {
                        return new Network[]{network2};
                    }
                } else {
                    allNetworks[i] = network2;
                    i++;
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter] */
    public a(T22 t22, U22 u22) {
        Looper myLooper = Looper.myLooper();
        this.a = myLooper;
        this.b = new Handler(myLooper);
        this.d = t22;
        this.g = new K22(V60.a);
        int i = Build.VERSION.SDK_INT;
        this.h = new R22(this);
        this.i = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i >= 30) {
            this.f = new J22(this);
        } else {
            this.f = i >= 28 ? new L22(this) : null;
        }
        this.k = d();
        this.c = new IntentFilter() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter
            {
                addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        };
        this.l = false;
        this.m = false;
        this.e = u22;
        u22.b(this);
        this.m = true;
    }

    public final void e(final Runnable runnable) {
        if (this.a == Looper.myLooper()) {
            runnable.run();
        } else {
            this.b.post(new Runnable() { // from class: H22
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.j) {
                        runnable.run();
                    }
                }
            });
        }
    }

    public final void f() {
        if (this.j) {
            this.j = false;
            R22 r22 = this.h;
            K22 k22 = this.g;
            if (r22 != null) {
                k22.a.unregisterNetworkCallback(r22);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.f;
            if (networkCallback != null) {
                k22.a.unregisterNetworkCallback(networkCallback);
            } else {
                V60.a.unregisterReceiver(this);
            }
        }
    }

    public final S22 d() {
        K22 k22 = this.g;
        Network b = k22.b();
        NetworkInfo d = k22.d(b);
        if (d == null || (!d.isConnected() && (d.getDetailedState() != NetworkInfo.DetailedState.BLOCKED || ApplicationStatus.getStateForApplication() != 1))) {
            d = null;
        }
        if (d == null) {
            return new S22(false, -1, -1, false, null, false, "");
        }
        if (b != null) {
            NetworkCapabilities c = k22.c(b);
            boolean z = (c == null || c.hasCapability(11)) ? false : true;
            DnsStatus a = AndroidNetworkLibrary.a(b);
            if (a == null) {
                return new S22(true, d.getType(), d.getSubtype(), z, String.valueOf(b.getNetworkHandle()), false, "");
            }
            return new S22(true, d.getType(), d.getSubtype(), z, String.valueOf(b.getNetworkHandle()), a.getPrivateDnsActive(), a.getPrivateDnsServerName());
        }
        if (d.getType() == 1) {
            if (d.getExtraInfo() != null && !"".equals(d.getExtraInfo())) {
                return new S22(true, d.getType(), d.getSubtype(), false, d.getExtraInfo(), false, "");
            }
            d.getType();
            d.getSubtype();
            throw null;
        }
        return new S22(true, d.getType(), d.getSubtype(), false, null, false, "");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e(new I22(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:            if (r7.g.equals(r0.g) == false) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.S22 r7) {
        /*
            r6 = this;
            int r0 = r7.b()
            S22 r1 = r6.k
            int r1 = r1.b()
            T22 r2 = r6.d
            if (r0 != r1) goto L2c
            S22 r0 = r6.k
            java.lang.String r0 = r0.e
            java.lang.String r1 = r7.e
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            S22 r0 = r6.k
            boolean r1 = r0.f
            boolean r3 = r7.f
            if (r3 != r1) goto L2c
            java.lang.String r0 = r0.g
            java.lang.String r1 = r7.g
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L33
        L2c:
            int r0 = r7.b()
            r2.b(r0)
        L33:
            int r0 = r7.b()
            S22 r1 = r6.k
            int r1 = r1.b()
            if (r0 != r1) goto L4b
            int r0 = r7.a()
            S22 r1 = r6.k
            int r1 = r1.a()
            if (r0 == r1) goto L52
        L4b:
            int r0 = r7.a()
            r2.e(r0)
        L52:
            r0 = 2
            r1 = 1
            boolean r3 = r7.d
            if (r3 == 0) goto L5a
            r4 = r0
            goto L5b
        L5a:
            r4 = r1
        L5b:
            S22 r5 = r6.k
            boolean r5 = r5.d
            if (r5 == 0) goto L63
            r5 = r0
            goto L64
        L63:
            r5 = r1
        L64:
            if (r4 == r5) goto L6d
            if (r3 == 0) goto L69
            goto L6a
        L69:
            r0 = r1
        L6a:
            r2.a(r0)
        L6d:
            r6.k = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.a.b(S22):void");
    }
}
