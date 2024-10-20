package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10673vE0 extends AtomicReference implements Runnable, InterfaceC6416iq0 {
    public final T33 a;
    public final T33 g;

    public RunnableC10673vE0(Runnable runnable) {
        super(runnable);
        this.a = new T33();
        this.g = new T33();
    }

    @Override // java.lang.Runnable
    public final void run() {
        T33 t33 = this.g;
        T33 t332 = this.a;
        EnumC7791mq0 enumC7791mq0 = EnumC7791mq0.a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                t332.lazySet(enumC7791mq0);
                t33.lazySet(enumC7791mq0);
            }
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (getAndSet(null) != null) {
            T33 t33 = this.a;
            t33.getClass();
            EnumC7791mq0.a(t33);
            T33 t332 = this.g;
            t332.getClass();
            EnumC7791mq0.a(t332);
        }
    }
}
