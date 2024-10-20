package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mr2 */
/* loaded from: classes.dex */
public abstract class AbstractC7799mr2 {
    public static final C6081hr2 a = new C6081hr2();

    public static AF3 a(AbstractC8508ov abstractC8508ov, InterfaceC7455lr2 interfaceC7455lr2) {
        C6905kF3 c6905kF3 = new C6905kF3();
        C6424ir2 c6424ir2 = new C6424ir2(abstractC8508ov, c6905kF3, interfaceC7455lr2);
        synchronized (abstractC8508ov.a) {
            if (abstractC8508ov.h()) {
                c6424ir2.a(abstractC8508ov.i);
            } else {
                abstractC8508ov.e.add(c6424ir2);
            }
        }
        return c6905kF3.a;
    }

    public static AF3 b(AbstractC8508ov abstractC8508ov) {
        return a(abstractC8508ov, new C7111kr2());
    }
}
