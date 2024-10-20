package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6315iZ extends VY {
    public final Throwable a;

    public C6315iZ(RuntimeException runtimeException) {
        this.a = runtimeException;
    }

    @Override // defpackage.VY
    public final void d(InterfaceC10434uZ interfaceC10434uZ) {
        interfaceC10434uZ.c(EnumC7565mA0.INSTANCE);
        interfaceC10434uZ.onError(this.a);
    }
}
