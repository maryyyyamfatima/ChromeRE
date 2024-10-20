package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.TraceEvent;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class R22 extends ConnectivityManager.NetworkCallback {
    public Network a;
    public final /* synthetic */ a b;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        TraceEvent i2 = TraceEvent.i("NetworkChangeNotifierCallback::onLosing", null);
        try {
            if (a(network, null)) {
                if (i2 != null) {
                    i2.close();
                }
            } else {
                this.b.e(new O22(this, network.getNetworkHandle()));
                if (i2 != null) {
                    i2.close();
                }
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public R22(a aVar) {
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:            if (defpackage.K22.e(r5) == false) goto L19;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.net.Network r5, android.net.NetworkCapabilities r6) {
        /*
            r4 = this;
            android.net.Network r0 = r4.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L37
            org.chromium.net.a r0 = r4.b
            if (r6 != 0) goto L1b
            K22 r6 = r0.g
            android.net.NetworkCapabilities r6 = r6.c(r5)
        L1b:
            if (r6 == 0) goto L32
            r3 = 4
            boolean r6 = r6.hasTransport(r3)
            if (r6 == 0) goto L30
            K22 r6 = r0.g
            r6.getClass()
            boolean r5 = defpackage.K22.e(r5)
            if (r5 != 0) goto L30
            goto L32
        L30:
            r5 = r2
            goto L33
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L36
            goto L37
        L36:
            r1 = r2
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R22.a(android.net.Network, android.net.NetworkCapabilities):boolean");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        a aVar = this.b;
        TraceEvent i = TraceEvent.i("NetworkChangeNotifierCallback::onAvailable", null);
        try {
            NetworkCapabilities c = aVar.g.c(network);
            if (a(network, c)) {
                if (i != null) {
                    i.close();
                    return;
                }
                return;
            }
            boolean z = c.hasTransport(4) && ((network2 = this.a) == null || !network.equals(network2));
            if (z) {
                this.a = network;
            }
            aVar.e(new M22(this, network.getNetworkHandle(), aVar.g.a(network), z));
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        a aVar = this.b;
        TraceEvent i = TraceEvent.i("NetworkChangeNotifierCallback::onCapabilitiesChanged", null);
        try {
            if (a(network, networkCapabilities)) {
                if (i != null) {
                    i.close();
                }
            } else {
                aVar.e(new N22(this, network.getNetworkHandle(), aVar.g.a(network)));
                if (i != null) {
                    i.close();
                }
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a aVar = this.b;
        TraceEvent i = TraceEvent.i("NetworkChangeNotifierCallback::onLost", null);
        try {
            Network network2 = this.a;
            if ((network2 == null || network2.equals(network)) ? false : true) {
                if (i != null) {
                    i.close();
                    return;
                }
                return;
            }
            aVar.e(new P22(this, network));
            if (this.a != null) {
                this.a = null;
                for (Network network3 : a.c(aVar.g, network)) {
                    onAvailable(network3);
                }
                aVar.e(new Q22(this, aVar.d().b()));
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
