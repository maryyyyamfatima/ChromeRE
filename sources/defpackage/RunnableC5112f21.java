package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f21 */
/* loaded from: classes.dex */
public final class RunnableC5112f21 implements Runnable {
    public final /* synthetic */ ConnectionResult a;
    public final /* synthetic */ C5456g21 g;

    public RunnableC5112f21(C5456g21 c5456g21, ConnectionResult connectionResult) {
        this.g = c5456g21;
        this.a = connectionResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7008ka1 interfaceC7008ka1;
        C5456g21 c5456g21 = this.g;
        C4425d21 c4425d21 = (C4425d21) c5456g21.f.o.get(c5456g21.b);
        if (c4425d21 == null) {
            return;
        }
        ConnectionResult connectionResult = this.a;
        if (!connectionResult.t1()) {
            c4425d21.m(connectionResult, null);
            return;
        }
        c5456g21.e = true;
        InterfaceC3129Yc interfaceC3129Yc = c5456g21.a;
        if (!interfaceC3129Yc.requiresSignIn()) {
            try {
                AbstractC11280x01 abstractC11280x01 = (AbstractC11280x01) interfaceC3129Yc;
                ((BaseGmsClient) interfaceC3129Yc).j(null, abstractC11280x01.requiresSignIn() ? abstractC11280x01.D : Collections.emptySet());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                interfaceC3129Yc.a("Failed to get service from broker.");
                c4425d21.m(new ConnectionResult(10), null);
                return;
            }
        }
        if (!c5456g21.e || (interfaceC7008ka1 = c5456g21.c) == null) {
            return;
        }
        ((BaseGmsClient) interfaceC3129Yc).j(interfaceC7008ka1, c5456g21.d);
    }
}
