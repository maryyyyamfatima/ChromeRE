package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class I90 {
    public static final E90 a(P90 p90, E90 e90) {
        E90 r;
        E90 a = p90.a();
        Boolean bool = Boolean.FALSE;
        H90 h90 = H90.g;
        boolean booleanValue = ((Boolean) a.j(bool, h90)).booleanValue();
        boolean booleanValue2 = ((Boolean) e90.j(bool, h90)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            r = a.r(e90);
        } else {
            ZK2 zk2 = new ZK2();
            zk2.a = e90;
            C7221lA0 c7221lA0 = C7221lA0.a;
            E90 e902 = (E90) a.j(c7221lA0, new G90(zk2));
            if (booleanValue2) {
                zk2.a = ((E90) zk2.a).j(c7221lA0, F90.g);
            }
            r = e902.r((E90) zk2.a);
        }
        C8443ok0 c8443ok0 = AbstractC1246Jp0.a;
        return (r == c8443ok0 || r.b(C9955t80.a) != null) ? r : r.r(c8443ok0);
    }

    public static final void b(InterfaceC8927q80 interfaceC8927q80, E90 e90) {
        if (interfaceC8927q80 instanceof R90) {
            if (e90.b(G04.a) != null) {
                R90 r90 = (R90) interfaceC8927q80;
                do {
                    r90 = r90.b();
                } while (r90 != null);
            }
        }
    }
}
