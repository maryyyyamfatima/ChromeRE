package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC7565mA0 implements AG2 {
    INSTANCE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER;

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
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

    public static void a(Throwable th, InterfaceC11128wa2 interfaceC11128wa2) {
        interfaceC11128wa2.c(INSTANCE);
        interfaceC11128wa2.onError(th);
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
