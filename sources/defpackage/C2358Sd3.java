package defpackage;

import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2358Sd3 implements InterfaceC1838Od3 {
    public boolean a;
    public final InterfaceC5467g40 b;
    public final InterfaceC5444g01 c;
    public final C2228Rd3 d = new C2228Rd3(this);

    public C2358Sd3(C5100f01 c5100f01, C1708Nd3 c1708Nd3) {
        this.c = c5100f01;
        this.b = c1708Nd3;
    }

    @Override // defpackage.InterfaceC1838Od3
    public final boolean a() {
        InterfaceC5444g01 interfaceC5444g01 = this.c;
        this.a = ((ConnectivityManager) interfaceC5444g01.get()).getActiveNetwork() != null;
        try {
            AbstractC1968Pd3.a((ConnectivityManager) interfaceC5444g01.get(), this.d);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            return false;
        }
    }

    @Override // defpackage.InterfaceC1838Od3
    public final void b() {
        ((ConnectivityManager) this.c.get()).unregisterNetworkCallback(this.d);
    }
}
