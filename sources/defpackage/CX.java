package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CX {
    public final AbstractC9896sy0 a;
    public final U80 b;

    public CX(AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
        this.b = U80.a;
    }

    public CX(AbstractC9896sy0 abstractC9896sy0, U80 u80) {
        this.a = abstractC9896sy0;
        this.b = u80;
    }

    public final AZ a(VY vy) {
        InterfaceC11303x40 interfaceC11303x40 = new InterfaceC11303x40() { // from class: BX
            @Override // defpackage.InterfaceC11303x40
            public final void accept(Object obj) {
                EnumC11438xU enumC11438xU = EnumC11438xU.D;
                CX cx = CX.this;
                cx.a.d(enumC11438xU, "Command error", cx.b, (Throwable) obj);
            }
        };
        vy.getClass();
        return new C11120wZ(new C12149zZ(vy, TV0.d, interfaceC11303x40, TV0.c));
    }
}
