package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qZ */
/* loaded from: classes.dex */
public final class C9063qZ extends AtomicInteger implements QQ0, InterfaceC6416iq0 {
    public final InterfaceC10434uZ a;
    public final int g;
    public final boolean h;
    public InterfaceC0724Fo3 k;
    public final H10 j = new H10();
    public final C0965Hl i = new C0965Hl();

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        getAndIncrement();
        C8720pZ c8720pZ = new C8720pZ(this);
        this.j.a(c8720pZ);
        ((AZ) obj).b(c8720pZ);
    }

    public C9063qZ(InterfaceC10434uZ interfaceC10434uZ, int i, boolean z) {
        this.a = interfaceC10434uZ;
        this.g = i;
        this.h = z;
        lazySet(1);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.k.cancel();
        this.j.dispose();
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.k, interfaceC0724Fo3)) {
            this.k = interfaceC0724Fo3;
            this.a.c(this);
            int i = this.g;
            if (i == Integer.MAX_VALUE) {
                interfaceC0724Fo3.a(Long.MAX_VALUE);
            } else {
                interfaceC0724Fo3.a(i);
            }
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        boolean z = this.h;
        InterfaceC10434uZ interfaceC10434uZ = this.a;
        C0965Hl c0965Hl = this.i;
        if (!z) {
            this.j.dispose();
            if (c0965Hl.a(th)) {
                if (getAndSet(0) > 0) {
                    interfaceC10434uZ.onError(c0965Hl.b());
                    return;
                }
                return;
            }
            MR2.b(th);
            return;
        }
        if (c0965Hl.a(th)) {
            if (decrementAndGet() == 0) {
                interfaceC10434uZ.onError(c0965Hl.b());
                return;
            }
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        if (decrementAndGet() == 0) {
            C0965Hl c0965Hl = this.i;
            Throwable th = (Throwable) c0965Hl.get();
            InterfaceC10434uZ interfaceC10434uZ = this.a;
            if (th != null) {
                interfaceC10434uZ.onError(c0965Hl.b());
            } else {
                interfaceC10434uZ.b();
            }
        }
    }
}
