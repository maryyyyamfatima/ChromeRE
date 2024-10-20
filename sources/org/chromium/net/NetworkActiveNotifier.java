package org.chromium.net;

import J.N;
import android.net.ConnectivityManager;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    public final ConnectivityManager a = (ConnectivityManager) V60.a.getSystemService("connectivity");
    public final long b;
    public boolean c;

    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }

    public void enableNotifications() {
        this.c = true;
        this.a.addDefaultNetworkActiveListener(this);
    }

    public void disableNotifications() {
        this.c = false;
        this.a.removeDefaultNetworkActiveListener(this);
    }

    public boolean isDefaultNetworkActive() {
        return this.a.isDefaultNetworkActive();
    }

    public void fakeDefaultNetworkActive() {
        if (this.c) {
            onNetworkActive();
        }
    }

    public NetworkActiveNotifier(long j) {
        this.b = j;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        N.MSZPA7qE(this.b);
    }
}
