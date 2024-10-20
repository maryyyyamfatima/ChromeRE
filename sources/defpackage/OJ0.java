package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OJ0 implements InterfaceC10272u34 {
    public final InterfaceC7610mJ0 a;

    @Override // defpackage.InterfaceC10272u34
    public final void L(boolean z) {
    }

    public OJ0(C6922kJ0 c6922kJ0) {
        this.a = c6922kJ0;
    }

    @Override // defpackage.InterfaceC10272u34
    public final void d(boolean z) {
        if (z) {
            return;
        }
        InterfaceC7610mJ0 interfaceC7610mJ0 = this.a;
        if (interfaceC7610mJ0.g()) {
            interfaceC7610mJ0.j();
        }
    }

    public final void a(int i, boolean z) {
        InterfaceC7610mJ0 interfaceC7610mJ0 = this.a;
        if (interfaceC7610mJ0.g()) {
            if (z) {
                interfaceC7610mJ0.f(AbstractC5221fM2.a(i), SystemClock.elapsedRealtimeNanos());
            } else {
                interfaceC7610mJ0.c(AbstractC5221fM2.a(i), SystemClock.elapsedRealtimeNanos());
            }
        }
    }
}
