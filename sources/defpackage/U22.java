package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class U22 {
    public a a;

    public abstract void a();

    public abstract void b(a aVar);

    public final void c() {
        NetworkCapabilities c;
        a aVar = this.a;
        if (!aVar.j) {
            boolean z = aVar.m;
            if (z) {
                aVar.b(aVar.d());
            }
            ConnectivityManager.NetworkCallback networkCallback = aVar.f;
            Handler handler = aVar.b;
            K22 k22 = aVar.g;
            if (networkCallback != null) {
                try {
                    k22.a.registerDefaultNetworkCallback(networkCallback, handler);
                } catch (RuntimeException unused) {
                    aVar.f = null;
                }
            }
            if (aVar.f == null) {
                aVar.l = V60.a.registerReceiver(aVar, aVar.c) != null;
            }
            aVar.j = true;
            R22 r22 = aVar.h;
            if (r22 != null) {
                a aVar2 = r22.b;
                Network[] c2 = a.c(aVar2.g, null);
                r22.a = null;
                if (c2.length == 1 && (c = aVar2.g.c(c2[0])) != null && c.hasTransport(4)) {
                    r22.a = c2[0];
                }
                try {
                    NetworkRequest networkRequest = aVar.i;
                    R22 r222 = aVar.h;
                    int i = Build.VERSION.SDK_INT;
                    ConnectivityManager connectivityManager = k22.a;
                    if (i >= 26) {
                        connectivityManager.registerNetworkCallback(networkRequest, r222, handler);
                    } else {
                        connectivityManager.registerNetworkCallback(networkRequest, r222);
                    }
                } catch (RuntimeException unused2) {
                    aVar.n = true;
                    aVar.h = null;
                }
                if (aVar.n || !z) {
                    return;
                }
                Network[] c3 = a.c(k22, null);
                long[] jArr = new long[c3.length];
                for (int i2 = 0; i2 < c3.length; i2++) {
                    jArr[i2] = c3[i2].getNetworkHandle();
                }
                aVar.d.f(jArr);
                return;
            }
            return;
        }
        aVar.b(aVar.d());
    }
}
