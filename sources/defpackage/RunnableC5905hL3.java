package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5905hL3 implements Runnable {
    public final /* synthetic */ RunnableC6249iL3 a;

    public RunnableC5905hL3(RunnableC6249iL3 runnableC6249iL3) {
        this.a = runnableC6249iL3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC6249iL3 runnableC6249iL3 = this.a;
        C7623mL3 c7623mL3 = runnableC6249iL3.g;
        C6935kL3 c6935kL3 = c7623mL3.d;
        View view = runnableC6249iL3.a;
        Handler handler = view.getHandler();
        if (handler == null) {
            return;
        }
        handler.post(new RunnableC6591jL3(c7623mL3, view, c6935kL3, 1));
    }
}
