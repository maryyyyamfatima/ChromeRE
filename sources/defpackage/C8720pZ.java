package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pZ */
/* loaded from: classes.dex */
public final class C8720pZ extends AtomicReference implements InterfaceC10434uZ, InterfaceC6416iq0 {
    public final /* synthetic */ C9063qZ a;

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        C9063qZ c9063qZ = this.a;
        H10 h10 = c9063qZ.j;
        h10.c(this);
        boolean z = c9063qZ.h;
        InterfaceC10434uZ interfaceC10434uZ = c9063qZ.a;
        C0965Hl c0965Hl = c9063qZ.i;
        if (!z) {
            c9063qZ.k.cancel();
            h10.dispose();
            if (c0965Hl.a(th)) {
                if (c9063qZ.getAndSet(0) > 0) {
                    interfaceC10434uZ.onError(c0965Hl.b());
                    return;
                }
                return;
            }
            MR2.b(th);
            return;
        }
        if (c0965Hl.a(th)) {
            if (c9063qZ.decrementAndGet() == 0) {
                interfaceC10434uZ.onError(c0965Hl.b());
                return;
            } else {
                if (c9063qZ.g != Integer.MAX_VALUE) {
                    c9063qZ.k.a(1L);
                    return;
                }
                return;
            }
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        C9063qZ c9063qZ = this.a;
        c9063qZ.j.c(this);
        if (c9063qZ.decrementAndGet() == 0) {
            Throwable th = (Throwable) c9063qZ.i.get();
            InterfaceC10434uZ interfaceC10434uZ = c9063qZ.a;
            if (th != null) {
                interfaceC10434uZ.onError(th);
                return;
            } else {
                interfaceC10434uZ.b();
                return;
            }
        }
        if (c9063qZ.g != Integer.MAX_VALUE) {
            c9063qZ.k.a(1L);
        }
    }

    public C8720pZ(C9063qZ c9063qZ) {
        this.a = c9063qZ;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }
}
