package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XY extends AtomicReference implements InterfaceC10434uZ, InterfaceC6416iq0 {
    public final InterfaceC10434uZ a;
    public final AZ g;

    public XY(InterfaceC10434uZ interfaceC10434uZ, AZ az) {
        this.a = interfaceC10434uZ;
        this.g = az;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.f(this, interfaceC6416iq0)) {
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.g.b(new WY(this, this.a));
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }
}
