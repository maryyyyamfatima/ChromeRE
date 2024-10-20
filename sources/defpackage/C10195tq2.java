package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tq2 */
/* loaded from: classes2.dex */
public final class C10195tq2 extends AbstractC7442lp1 {
    public C10195tq2(InterfaceC7559m90 interfaceC7559m90, InterfaceC8818pp2 interfaceC8818pp2) {
        super(interfaceC7559m90, interfaceC8818pp2);
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        C10620v43 a;
        C5953hV1 c5953hV1;
        int i;
        C1730Ni0 c1730Ni0;
        try {
            a = c8697pU1.a();
            c5953hV1 = a.d;
            i = 4;
            if (!c5953hV1.a(4)) {
                i = 0;
            }
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
        if (!c5953hV1.b(i)) {
            return false;
        }
        int i2 = c5953hV1.b;
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        switch (i2) {
            case -2:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(CR2.b);
                    BR2 b = BR2.b(c1730Ni0);
                    c1730Ni0.a();
                    return b.a == 0 && b.b.b <= 0;
                } finally {
                }
            case -1:
            default:
                return false;
            case 0:
                C8137nq2 d = C8137nq2.d(a.b());
                ((InterfaceC8818pp2) interfaceC7786mp1).F0(d.b, d.c, d.d, d.e);
                return true;
            case 1:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(C9167qq2.c);
                    boolean d2 = c1730Ni0.d(8, 0);
                    c1730Ni0.a();
                    ((InterfaceC8818pp2) interfaceC7786mp1).l(d2);
                    return true;
                } finally {
                }
            case 2:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(C9509rq2.c);
                    C10869vo2 d3 = C10869vo2.d(c1730Ni0.s(8, false));
                    c1730Ni0.a();
                    ((InterfaceC8818pp2) interfaceC7786mp1).E(d3);
                    return true;
                } finally {
                }
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(C8481oq2.b);
                    c1730Ni0.a();
                    ((InterfaceC8818pp2) interfaceC7786mp1).D();
                    return true;
                } finally {
                }
            case 4:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(C6761jq2.b);
                    c1730Ni0.a();
                    ((InterfaceC8818pp2) interfaceC7786mp1).S();
                    return true;
                } finally {
                }
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                ((InterfaceC8818pp2) interfaceC7786mp1).Y0(C7449lq2.d(a.b()).b);
                return true;
            case 6:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(C8824pq2.c);
                    C1772Nq2 d4 = C1772Nq2.d(c1730Ni0.s(8, false));
                    c1730Ni0.a();
                    ((InterfaceC8818pp2) interfaceC7786mp1).t0(d4);
                    return true;
                } finally {
                }
            case 7:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(C7105kq2.b);
                    c1730Ni0.a();
                    ((InterfaceC8818pp2) interfaceC7786mp1).B();
                    return true;
                } finally {
                }
            case 8:
                c1730Ni0 = new C1730Ni0(a.b());
                c1730Ni0.b();
                try {
                    c1730Ni0.c(C7793mq2.b);
                    c1730Ni0.a();
                    ((InterfaceC8818pp2) interfaceC7786mp1).p0();
                    return true;
                } finally {
                }
        }
        System.err.println(e.toString());
        return false;
    }

    @Override // defpackage.EV1
    public final boolean Y(C8697pU1 c8697pU1, DV1 dv1) {
        try {
            C10620v43 a = c8697pU1.a();
            C5953hV1 c5953hV1 = a.d;
            if (c5953hV1.b(c5953hV1.a(4) ? 5 : 1) && c5953hV1.b == -1) {
                return AbstractC8130np1.a(this.a, AbstractC10538uq2.a, a, dv1);
            }
            return false;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
