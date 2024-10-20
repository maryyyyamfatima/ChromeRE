package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t92 */
/* loaded from: classes.dex */
public final class C9963t92 extends AtomicReference implements InterfaceC11128wa2 {
    public final long a;
    public final C10306u92 g;
    public volatile boolean h;
    public volatile InterfaceC3586ac3 i;
    public int j;

    public C9963t92(C10306u92 c10306u92, long j) {
        this.a = j;
        this.g = c10306u92;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.f(this, interfaceC6416iq0) && (interfaceC6416iq0 instanceof AG2)) {
            AG2 ag2 = (AG2) interfaceC6416iq0;
            int e = ag2.e(7);
            if (e == 1) {
                this.j = e;
                this.i = ag2;
                this.h = true;
                this.g.f();
                return;
            }
            if (e == 2) {
                this.j = e;
                this.i = ag2;
            }
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.j == 0) {
            C10306u92 c10306u92 = this.g;
            if (c10306u92.get() == 0 && c10306u92.compareAndSet(0, 1)) {
                c10306u92.a.d(obj);
                if (c10306u92.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC3586ac3 interfaceC3586ac3 = this.i;
                if (interfaceC3586ac3 == null) {
                    interfaceC3586ac3 = new C7402li3(c10306u92.j);
                    this.i = interfaceC3586ac3;
                }
                interfaceC3586ac3.offer(obj);
                if (c10306u92.getAndIncrement() != 0) {
                    return;
                }
            }
            c10306u92.g();
            return;
        }
        this.g.f();
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.g.m.a(th)) {
            C10306u92 c10306u92 = this.g;
            if (!c10306u92.h) {
                c10306u92.e();
            }
            this.h = true;
            this.g.f();
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        this.h = true;
        this.g.f();
    }
}
