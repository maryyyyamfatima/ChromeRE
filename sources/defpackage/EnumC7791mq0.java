package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7791mq0 implements InterfaceC6416iq0 {
    public static final EnumC7791mq0 a;
    public static final /* synthetic */ EnumC7791mq0[] g;

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
    }

    public static EnumC7791mq0[] values() {
        return (EnumC7791mq0[]) g.clone();
    }

    static {
        EnumC7791mq0 enumC7791mq0 = new EnumC7791mq0();
        a = enumC7791mq0;
        g = new EnumC7791mq0[]{enumC7791mq0};
    }

    public static boolean b(InterfaceC6416iq0 interfaceC6416iq0) {
        return interfaceC6416iq0 == a;
    }

    public static void e(AtomicReference atomicReference, OF of) {
        InterfaceC6416iq0 interfaceC6416iq0;
        boolean z;
        do {
            interfaceC6416iq0 = (InterfaceC6416iq0) atomicReference.get();
            if (interfaceC6416iq0 == a) {
                of.dispose();
                return;
            }
            while (true) {
                if (atomicReference.compareAndSet(interfaceC6416iq0, of)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != interfaceC6416iq0) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (interfaceC6416iq0 != null) {
            interfaceC6416iq0.dispose();
        }
    }

    public static boolean f(AtomicReference atomicReference, InterfaceC6416iq0 interfaceC6416iq0) {
        boolean z;
        if (interfaceC6416iq0 == null) {
            throw new NullPointerException("d is null");
        }
        while (true) {
            if (atomicReference.compareAndSet(null, interfaceC6416iq0)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        interfaceC6416iq0.dispose();
        if (atomicReference.get() != a) {
            d();
        }
        return false;
    }

    public static boolean c(AtomicReference atomicReference, InterfaceC6416iq0 interfaceC6416iq0) {
        boolean z;
        do {
            InterfaceC6416iq0 interfaceC6416iq02 = (InterfaceC6416iq0) atomicReference.get();
            z = false;
            if (interfaceC6416iq02 == a) {
                if (interfaceC6416iq0 != null) {
                    interfaceC6416iq0.dispose();
                }
                return false;
            }
            while (true) {
                if (atomicReference.compareAndSet(interfaceC6416iq02, interfaceC6416iq0)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != interfaceC6416iq02) {
                    break;
                }
            }
        } while (!z);
        return true;
    }

    public static void a(AtomicReference atomicReference) {
        InterfaceC6416iq0 interfaceC6416iq0;
        InterfaceC6416iq0 interfaceC6416iq02 = (InterfaceC6416iq0) atomicReference.get();
        EnumC7791mq0 enumC7791mq0 = a;
        if (interfaceC6416iq02 == enumC7791mq0 || (interfaceC6416iq0 = (InterfaceC6416iq0) atomicReference.getAndSet(enumC7791mq0)) == enumC7791mq0 || interfaceC6416iq0 == null) {
            return;
        }
        interfaceC6416iq0.dispose();
    }

    public static boolean g(InterfaceC6416iq0 interfaceC6416iq0, InterfaceC6416iq0 interfaceC6416iq02) {
        if (interfaceC6416iq02 == null) {
            MR2.b(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC6416iq0 == null) {
            return true;
        }
        interfaceC6416iq02.dispose();
        d();
        return false;
    }

    public static void d() {
        MR2.b(new C9303rE2("Disposable already set!"));
    }
}
