package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7621mL1 implements InterfaceC6639jV1 {
    public final InterfaceC6639jV1[] a;

    public C7621mL1(InterfaceC6639jV1... interfaceC6639jV1Arr) {
        this.a = interfaceC6639jV1Arr;
    }

    @Override // defpackage.InterfaceC6639jV1
    public final boolean b(Class cls) {
        for (InterfaceC6639jV1 interfaceC6639jV1 : this.a) {
            if (interfaceC6639jV1.b(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC6639jV1
    public final InterfaceC6297iV1 a(Class cls) {
        for (InterfaceC6639jV1 interfaceC6639jV1 : this.a) {
            if (interfaceC6639jV1.b(cls)) {
                return interfaceC6639jV1.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
