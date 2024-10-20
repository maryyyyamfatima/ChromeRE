package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4596dZ extends VY {
    public final InterfaceC11463xZ a;

    public C4596dZ(InterfaceC11463xZ interfaceC11463xZ) {
        this.a = interfaceC11463xZ;
    }

    @Override // defpackage.VY
    public final void d(InterfaceC10434uZ interfaceC10434uZ) {
        C4252cZ c4252cZ = new C4252cZ(interfaceC10434uZ);
        interfaceC10434uZ.c(c4252cZ);
        try {
            this.a.a(c4252cZ);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            c4252cZ.b(th);
        }
    }
}
