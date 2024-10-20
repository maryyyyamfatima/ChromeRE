package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8963qF {
    public final AbstractC5593gS0 a;
    public final Handler b;

    public C8963qF(C9752sZ3 c9752sZ3, Handler handler) {
        this.a = c9752sZ3;
        this.b = handler;
    }

    public C8963qF(R21 r21) {
        Handler handler;
        this.a = r21;
        if (Looper.myLooper() == null) {
            handler = new Handler(Looper.getMainLooper());
        } else {
            handler = new Handler();
        }
        this.b = handler;
    }

    public final void a(XR0 xr0) {
        int i = xr0.b;
        boolean z = i == 0;
        Handler handler = this.b;
        AbstractC5593gS0 abstractC5593gS0 = this.a;
        if (z) {
            handler.post(new RunnableC8277oF(abstractC5593gS0, xr0.a));
        } else {
            handler.post(new RunnableC8620pF(abstractC5593gS0, i));
        }
    }
}
