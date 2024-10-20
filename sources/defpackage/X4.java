package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X4 implements Runnable {
    public final C3410a5 a;
    public final /* synthetic */ C4097c5 g;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12116zS1 interfaceC12116zS1;
        C4097c5 c4097c5 = this.g;
        BS1 bs1 = c4097c5.h;
        if (bs1 != null && (interfaceC12116zS1 = bs1.e) != null) {
            interfaceC12116zS1.b(bs1);
        }
        View view = (View) c4097c5.m;
        if (view != null && view.getWindowToken() != null) {
            C3410a5 c3410a5 = this.a;
            boolean z = true;
            if (!c3410a5.b()) {
                if (c3410a5.f == null) {
                    z = false;
                } else {
                    c3410a5.d(0, 0, false, false);
                }
            }
            if (z) {
                c4097c5.x = c3410a5;
            }
        }
        c4097c5.z = null;
    }

    public X4(C4097c5 c4097c5, C3410a5 c3410a5) {
        this.g = c4097c5;
        this.a = c3410a5;
    }
}
