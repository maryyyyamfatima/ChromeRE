package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DZ extends AtomicReference implements InterfaceC6416iq0, Runnable {
    public final InterfaceC10434uZ a;

    public DZ(InterfaceC10434uZ interfaceC10434uZ) {
        this.a = interfaceC10434uZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }
}
