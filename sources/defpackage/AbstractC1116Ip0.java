package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ip0 */
/* loaded from: classes.dex */
public abstract class AbstractC1116Ip0 {
    public static final void a(AbstractC0986Hp0 abstractC0986Hp0, InterfaceC8927q80 interfaceC8927q80, boolean z) {
        Object h = abstractC0986Hp0.h();
        Throwable e = abstractC0986Hp0.e(h);
        Object a = e != null ? SP2.a(e) : abstractC0986Hp0.f(h);
        if (z) {
            C0726Fp0 c0726Fp0 = (C0726Fp0) interfaceC8927q80;
            InterfaceC8927q80 interfaceC8927q802 = c0726Fp0.j;
            E90 context = interfaceC8927q802.getContext();
            Object b = AbstractC9334rK3.b(context, c0726Fp0.l);
            if (b != AbstractC9334rK3.a) {
                I90.b(interfaceC8927q802, context);
            }
            try {
                c0726Fp0.j.d(a);
                return;
            } finally {
                AbstractC9334rK3.a(context, b);
            }
        }
        interfaceC8927q80.d(a);
    }
}
