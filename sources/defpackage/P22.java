package defpackage;

import android.net.Network;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P22 implements Runnable {
    public final /* synthetic */ Network a;
    public final /* synthetic */ R22 g;

    public P22(R22 r22, Network network) {
        this.g = r22;
        this.a = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.b.d.g(this.a.getNetworkHandle());
    }
}
