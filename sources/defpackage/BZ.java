package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BZ extends AtomicReference implements InterfaceC10434uZ, InterfaceC6416iq0, Runnable {
    public final InterfaceC10434uZ a;
    public final T33 g = new T33();
    public final AZ h;

    public BZ(InterfaceC10434uZ interfaceC10434uZ, AZ az) {
        this.a = interfaceC10434uZ;
        this.h = az;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.b(this);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
        T33 t33 = this.g;
        t33.getClass();
        EnumC7791mq0.a(t33);
    }
}
