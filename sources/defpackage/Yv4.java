package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Yv4 implements InterfaceC6793jv4 {
    public final InterfaceC6793jv4 a;
    public final InterfaceC6793jv4 b;
    public final InterfaceC6793jv4 c;

    public Yv4(InterfaceC6793jv4 interfaceC6793jv4, InterfaceC6793jv4 interfaceC6793jv42, InterfaceC6793jv4 interfaceC6793jv43) {
        this.a = interfaceC6793jv4;
        this.b = interfaceC6793jv42;
        this.c = interfaceC6793jv43;
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        InterfaceC6107hv4 c6449iv4;
        InterfaceC6107hv4 c6449iv42;
        InterfaceC6107hv4 c6449iv43;
        Object obj = C6449iv4.c;
        InterfaceC6793jv4 interfaceC6793jv4 = this.a;
        if (interfaceC6793jv4 instanceof InterfaceC6107hv4) {
            c6449iv4 = (InterfaceC6107hv4) interfaceC6793jv4;
        } else {
            interfaceC6793jv4.getClass();
            c6449iv4 = new C6449iv4(interfaceC6793jv4);
        }
        InterfaceC6793jv4 interfaceC6793jv42 = this.b;
        if (interfaceC6793jv42 instanceof InterfaceC6107hv4) {
            c6449iv42 = (InterfaceC6107hv4) interfaceC6793jv42;
        } else {
            interfaceC6793jv42.getClass();
            c6449iv42 = new C6449iv4(interfaceC6793jv42);
        }
        InterfaceC6793jv4 interfaceC6793jv43 = this.c;
        if (interfaceC6793jv43 instanceof InterfaceC6107hv4) {
            c6449iv43 = (InterfaceC6107hv4) interfaceC6793jv43;
        } else {
            interfaceC6793jv43.getClass();
            c6449iv43 = new C6449iv4(interfaceC6793jv43);
        }
        return new Tv4(c6449iv4, c6449iv42, c6449iv43);
    }
}
