package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sa2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9756sa2 extends AtomicReference implements InterfaceC6416iq0, Runnable {
    public final InterfaceC11128wa2 a;

    public RunnableC9756sa2(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    public final boolean a() {
        return get() == EnumC7791mq0.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (a()) {
            return;
        }
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        interfaceC11128wa2.d(0L);
        lazySet(EnumC7565mA0.INSTANCE);
        interfaceC11128wa2.b();
    }
}
