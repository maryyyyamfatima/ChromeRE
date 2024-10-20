package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Go3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0854Go3 implements InterfaceC0724Fo3 {
    public static final EnumC0854Go3 a;
    public static final /* synthetic */ EnumC0854Go3[] g;

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
    }

    public static EnumC0854Go3[] values() {
        return (EnumC0854Go3[]) g.clone();
    }

    static {
        EnumC0854Go3 enumC0854Go3 = new EnumC0854Go3();
        a = enumC0854Go3;
        g = new EnumC0854Go3[]{enumC0854Go3};
    }

    public static boolean e(InterfaceC0724Fo3 interfaceC0724Fo3, InterfaceC0724Fo3 interfaceC0724Fo32) {
        if (interfaceC0724Fo32 == null) {
            MR2.b(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC0724Fo3 == null) {
            return true;
        }
        interfaceC0724Fo32.cancel();
        MR2.b(new C9303rE2("Subscription already set!"));
        return false;
    }

    public static boolean d(long j) {
        if (j > 0) {
            return true;
        }
        MR2.b(new IllegalArgumentException(Pd4.a("n > 0 required but it was ", j)));
        return false;
    }

    public static boolean c(AtomicReference atomicReference, InterfaceC0724Fo3 interfaceC0724Fo3) {
        boolean z;
        if (interfaceC0724Fo3 == null) {
            throw new NullPointerException("s is null");
        }
        while (true) {
            if (atomicReference.compareAndSet(null, interfaceC0724Fo3)) {
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
        interfaceC0724Fo3.cancel();
        if (atomicReference.get() != a) {
            MR2.b(new C9303rE2("Subscription already set!"));
        }
        return false;
    }

    public static boolean b(AtomicReference atomicReference) {
        InterfaceC0724Fo3 interfaceC0724Fo3;
        InterfaceC0724Fo3 interfaceC0724Fo32 = (InterfaceC0724Fo3) atomicReference.get();
        EnumC0854Go3 enumC0854Go3 = a;
        if (interfaceC0724Fo32 == enumC0854Go3 || (interfaceC0724Fo3 = (InterfaceC0724Fo3) atomicReference.getAndSet(enumC0854Go3)) == enumC0854Go3) {
            return false;
        }
        if (interfaceC0724Fo3 == null) {
            return true;
        }
        interfaceC0724Fo3.cancel();
        return true;
    }
}
