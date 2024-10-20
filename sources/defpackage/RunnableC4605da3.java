package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: da3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4605da3 implements Runnable {
    public final /* synthetic */ BinderC5292fa3 a;

    public RunnableC4605da3(BinderC5292fa3 binderC5292fa3) {
        this.a = binderC5292fa3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l.b(new ConnectionResult(4));
    }
}
