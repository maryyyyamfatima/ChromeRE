package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a21 */
/* loaded from: classes.dex */
public final class RunnableC3394a21 implements Runnable {
    public final /* synthetic */ ConnectionResult a;
    public final /* synthetic */ C4425d21 g;

    public RunnableC3394a21(C4425d21 c4425d21, ConnectionResult connectionResult) {
        this.g = c4425d21;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.m(this.a, null);
    }
}
