package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WY implements InterfaceC10434uZ {
    public final AtomicReference a;
    public final InterfaceC10434uZ g;

    public WY(AtomicReference atomicReference, InterfaceC10434uZ interfaceC10434uZ) {
        this.a = atomicReference;
        this.g = interfaceC10434uZ;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.c(this.a, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.g.b();
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        this.g.onError(th);
    }
}
