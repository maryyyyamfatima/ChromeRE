package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3446aB0 {
    public static void a(AtomicReference atomicReference, InterfaceC6416iq0 interfaceC6416iq0, Class cls) {
        boolean z;
        if (interfaceC6416iq0 == null) {
            throw new NullPointerException("next is null");
        }
        while (true) {
            if (atomicReference.compareAndSet(null, interfaceC6416iq0)) {
                z = true;
                break;
            } else if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        interfaceC6416iq0.dispose();
        if (atomicReference.get() != EnumC7791mq0.a) {
            String name = cls.getName();
            MR2.b(new C9303rE2(KR0.a("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
        }
    }
}
