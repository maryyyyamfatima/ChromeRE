package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D90 extends AbstractC4734dw1 implements AV0 {
    public static final D90 g = new D90();

    public D90() {
        super(2);
    }

    @Override // defpackage.AV0
    public final Object c(Object obj, Object obj2) {
        C5617gX c5617gX;
        E90 e90 = (E90) obj;
        B90 b90 = (B90) obj2;
        AbstractC0087Ar1.e(e90, "acc");
        AbstractC0087Ar1.e(b90, "element");
        E90 k = e90.k(b90.getKey());
        C7221lA0 c7221lA0 = C7221lA0.a;
        if (k == c7221lA0) {
            return b90;
        }
        int i = InterfaceC10298u80.c;
        C9955t80 c9955t80 = C9955t80.a;
        InterfaceC10298u80 interfaceC10298u80 = (InterfaceC10298u80) k.b(c9955t80);
        if (interfaceC10298u80 == null) {
            c5617gX = new C5617gX(b90, k);
        } else {
            E90 k2 = k.k(c9955t80);
            if (k2 == c7221lA0) {
                return new C5617gX(interfaceC10298u80, b90);
            }
            c5617gX = new C5617gX(interfaceC10298u80, new C5617gX(b90, k2));
        }
        return c5617gX;
    }
}
