package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V92 extends AtomicBoolean implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final W92 g;
    public final U92 h;
    public InterfaceC6416iq0 i;

    public V92(InterfaceC11128wa2 interfaceC11128wa2, W92 w92, U92 u92) {
        this.a = interfaceC11128wa2;
        this.g = w92;
        this.h = u92;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.g.j(this.h);
            this.a.onError(th);
        } else {
            MR2.b(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (compareAndSet(false, true)) {
            this.g.j(this.h);
            this.a.b();
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.i.dispose();
        if (compareAndSet(false, true)) {
            W92 w92 = this.g;
            U92 u92 = this.h;
            synchronized (w92) {
                U92 u922 = w92.h;
                if (u922 != null && u922 == u92) {
                    long j = u92.g - 1;
                    u92.g = j;
                    if (j == 0 && u92.h) {
                        w92.k(u92);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.i, interfaceC6416iq0)) {
            this.i = interfaceC6416iq0;
            this.a.c(this);
        }
    }
}
