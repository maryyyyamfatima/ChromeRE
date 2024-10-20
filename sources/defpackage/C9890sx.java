package defpackage;

import java.util.HashSet;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sx */
/* loaded from: classes2.dex */
public final class C9890sx implements InterfaceC8862px {
    public final C9547rx a;
    public C11605xx g;
    public C0245Bx h;
    public boolean i = false;
    public boolean j = true;

    public C9890sx(C9547rx c9547rx) {
        this.a = c9547rx;
    }

    public final void c() {
        if (this.j) {
            C9547rx c9547rx = this.a;
            c9547rx.getClass();
            Object obj = ThreadUtils.a;
            HashSet hashSet = c9547rx.b;
            hashSet.remove(this);
            if (hashSet.isEmpty()) {
                C0765Fx c0765Fx = c9547rx.a;
                if (c0765Fx.e) {
                    V60.a.unregisterReceiver(c0765Fx.c);
                    c0765Fx.e = false;
                }
                c9547rx.c = false;
            }
            this.j = false;
        }
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        c();
    }

    @Override // defpackage.InterfaceC8862px
    public final void q1(C11605xx c11605xx) {
        if (this.g != null) {
            AbstractC4851eH1.a("BatteryMonitorImpl", "Overlapped call to queryNextStatus!", new Object[0]);
            c();
            return;
        }
        this.g = c11605xx;
        if (this.i) {
            c11605xx.a(this.h);
            this.g = null;
            this.i = false;
        }
    }
}
