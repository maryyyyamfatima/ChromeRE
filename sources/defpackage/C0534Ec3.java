package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ec3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534Ec3 extends AtomicReference implements InterfaceC1314Kc3, InterfaceC10434uZ, InterfaceC6416iq0 {
    public final InterfaceC10434uZ a;
    public final DV0 g;

    public C0534Ec3(InterfaceC10434uZ interfaceC10434uZ, DV0 dv0) {
        this.a = interfaceC10434uZ;
        this.g = dv0;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    public final boolean d() {
        return EnumC7791mq0.b((InterfaceC6416iq0) get());
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.c(this, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void a(Object obj) {
        try {
            AZ az = (AZ) this.g.apply(obj);
            Q82.a(az, "The mapper returned a null CompletableSource");
            if (d()) {
                return;
            }
            az.b(this);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC1314Kc3
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.a.b();
    }
}
