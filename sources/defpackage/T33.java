package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T33 extends AtomicReference implements InterfaceC6416iq0 {
    public T33() {
    }

    public T33(T33 t33) {
        lazySet(t33);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    public final boolean a() {
        return EnumC7791mq0.b((InterfaceC6416iq0) get());
    }
}
