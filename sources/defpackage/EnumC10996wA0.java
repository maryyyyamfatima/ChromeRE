package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10996wA0 implements CG2 {
    public static final EnumC10996wA0 a;
    public static final /* synthetic */ EnumC10996wA0[] g;

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        return i & 2;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    public static EnumC10996wA0[] values() {
        return (EnumC10996wA0[]) g.clone();
    }

    static {
        EnumC10996wA0 enumC10996wA0 = new EnumC10996wA0();
        a = enumC10996wA0;
        g = new EnumC10996wA0[]{enumC10996wA0};
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        EnumC0854Go3.d(j);
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
