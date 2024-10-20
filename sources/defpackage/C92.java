package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C92 extends AtomicReference implements InterfaceC1314Kc3, InterfaceC6416iq0 {
    public final /* synthetic */ D92 a;

    @Override // defpackage.InterfaceC1314Kc3
    public final void onError(Throwable th) {
        D92 d92 = this.a;
        H10 h10 = d92.h;
        h10.c(this);
        if (d92.j.a(th)) {
            if (!d92.g) {
                d92.m.dispose();
                h10.dispose();
            }
            d92.i.decrementAndGet();
            d92.a();
            return;
        }
        MR2.b(th);
    }

    public C92(D92 d92) {
        this.a = d92;
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void a(Object obj) {
        C7402li3 c7402li3;
        boolean z;
        D92 d92 = this.a;
        d92.h.c(this);
        if (d92.get() == 0 && d92.compareAndSet(0, 1)) {
            d92.a.d(obj);
            boolean z2 = d92.i.decrementAndGet() == 0;
            C7402li3 c7402li32 = (C7402li3) d92.l.get();
            if (z2 && (c7402li32 == null || c7402li32.isEmpty())) {
                Throwable b = d92.j.b();
                if (b != null) {
                    d92.a.onError(b);
                    return;
                } else {
                    d92.a.b();
                    return;
                }
            }
            if (d92.decrementAndGet() == 0) {
                return;
            }
        } else {
            do {
                AtomicReference atomicReference = d92.l;
                c7402li3 = (C7402li3) atomicReference.get();
                if (c7402li3 != null) {
                    break;
                }
                c7402li3 = new C7402li3(BQ0.a);
                while (true) {
                    if (atomicReference.compareAndSet(null, c7402li3)) {
                        z = true;
                        break;
                    } else if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                }
            } while (!z);
            synchronized (c7402li3) {
                c7402li3.offer(obj);
            }
            d92.i.decrementAndGet();
            if (d92.getAndIncrement() != 0) {
                return;
            }
        }
        d92.e();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }
}
