package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2228Rd3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C2358Sd3 a;

    public C2228Rd3(C2358Sd3 c2358Sd3) {
        this.a = c2358Sd3;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC10296u74.h(new RunnableC2098Qd3(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC10296u74.h(new RunnableC2098Qd3(this, false));
    }
}
