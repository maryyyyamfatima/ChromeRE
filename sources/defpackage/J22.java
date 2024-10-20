package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J22 extends ConnectivityManager.NetworkCallback {
    public LinkProperties a;
    public NetworkCapabilities b;
    public final /* synthetic */ a c;

    public J22(a aVar) {
        this.c = aVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a = null;
        this.b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a = null;
        this.b = null;
        a aVar = this.c;
        if (aVar.j) {
            aVar.b(new S22(false, -1, -1, false, null, false, ""));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a = linkProperties;
        a aVar = this.c;
        if (!aVar.j || linkProperties == null || this.b == null) {
            return;
        }
        aVar.b(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.b = networkCapabilities;
        a aVar = this.c;
        if (!aVar.j || this.a == null || networkCapabilities == null) {
            return;
        }
        aVar.b(a(network));
    }

    public final S22 a(Network network) {
        int i;
        int i2;
        int i3;
        boolean isPrivateDnsActive;
        String privateDnsServerName;
        NetworkInfo networkInfo;
        if (!this.b.hasTransport(1) && !this.b.hasTransport(5)) {
            boolean hasTransport = this.b.hasTransport(0);
            a aVar = this.c;
            if (hasTransport) {
                ConnectivityManager connectivityManager = aVar.g.a;
                try {
                    try {
                        networkInfo = connectivityManager.getNetworkInfo(network);
                    } catch (NullPointerException unused) {
                        networkInfo = connectivityManager.getNetworkInfo(network);
                    }
                } catch (NullPointerException unused2) {
                    networkInfo = null;
                }
                i3 = networkInfo != null ? networkInfo.getSubtype() : -1;
                i2 = 0;
            } else if (this.b.hasTransport(3)) {
                i = 9;
            } else if (this.b.hasTransport(2)) {
                i = 7;
            } else if (this.b.hasTransport(4)) {
                NetworkInfo d = aVar.g.d(network);
                i = d != null ? d.getType() : 17;
            } else {
                i2 = -1;
                i3 = -1;
            }
            boolean z = !this.b.hasCapability(11);
            String valueOf = String.valueOf(network.getNetworkHandle());
            isPrivateDnsActive = this.a.isPrivateDnsActive();
            privateDnsServerName = this.a.getPrivateDnsServerName();
            return new S22(true, i2, i3, z, valueOf, isPrivateDnsActive, privateDnsServerName);
        }
        i = 1;
        i2 = i;
        i3 = -1;
        boolean z2 = !this.b.hasCapability(11);
        String valueOf2 = String.valueOf(network.getNetworkHandle());
        isPrivateDnsActive = this.a.isPrivateDnsActive();
        privateDnsServerName = this.a.getPrivateDnsServerName();
        return new S22(true, i2, i3, z2, valueOf2, isPrivateDnsActive, privateDnsServerName);
    }
}
