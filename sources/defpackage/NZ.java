package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NZ implements InterfaceC8927q80 {
    public static final NZ a = new NZ();

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // defpackage.InterfaceC8927q80
    public final E90 getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // defpackage.InterfaceC8927q80
    public final void d(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
