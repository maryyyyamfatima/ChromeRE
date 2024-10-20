package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dr1 */
/* loaded from: classes.dex */
public abstract class AbstractC0477Dr1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC8927q80 a(Object obj, InterfaceC8927q80 interfaceC8927q80, AV0 av0) {
        AbstractC0087Ar1.e(interfaceC8927q80, "completion");
        if (av0 instanceof AbstractC11245wu) {
            return ((AbstractC11245wu) av0).e(obj, interfaceC8927q80);
        }
        E90 context = interfaceC8927q80.getContext();
        if (context == C7221lA0.a) {
            return new C0217Br1(obj, interfaceC8927q80, av0);
        }
        return new C0347Cr1(interfaceC8927q80, context, av0, obj);
    }

    public static final InterfaceC8927q80 b(InterfaceC8927q80 interfaceC8927q80) {
        AbstractC0087Ar1.e(interfaceC8927q80, "<this>");
        AbstractC9612s80 abstractC9612s80 = interfaceC8927q80 instanceof AbstractC9612s80 ? (AbstractC9612s80) interfaceC8927q80 : null;
        if (abstractC9612s80 != null && (interfaceC8927q80 = abstractC9612s80.h) == null) {
            E90 e90 = abstractC9612s80.g;
            AbstractC0087Ar1.b(e90);
            InterfaceC10298u80 interfaceC10298u80 = (InterfaceC10298u80) e90.b(C9955t80.a);
            interfaceC8927q80 = interfaceC10298u80 != null ? new C0726Fp0((L90) interfaceC10298u80, abstractC9612s80) : abstractC9612s80;
            abstractC9612s80.h = interfaceC8927q80;
        }
        return interfaceC8927q80;
    }
}
