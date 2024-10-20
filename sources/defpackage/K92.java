package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K92 extends AtomicReference implements InterfaceC6416iq0, Runnable {
    public final InterfaceC11128wa2 a;
    public long g;

    public K92(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != EnumC7791mq0.a) {
            long j = this.g;
            this.g = 1 + j;
            this.a.d(Long.valueOf(j));
        }
    }
}
