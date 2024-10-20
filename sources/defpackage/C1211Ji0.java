package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ji0 */
/* loaded from: classes.dex */
public final class C1211Ji0 {
    public final Class a;
    public final List b;
    public final InterfaceC11073wP2 c;
    public final InterfaceC9208qx2 d;
    public final String e;

    public C1211Ji0(Class cls, Class cls2, Class cls3, List list, InterfaceC11073wP2 interfaceC11073wP2, C8974qH0 c8974qH0) {
        this.a = cls;
        this.b = list;
        this.c = interfaceC11073wP2;
        this.d = c8974qH0;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        this.e = Y5.a(AbstractC10975w63.a("Failed DecodePath{", simpleName, "->", simpleName2, "->"), cls3.getSimpleName(), "}");
    }

    public final JO2 a(int i, int i2, C0543Ee2 c0543Ee2, InterfaceC8075ng0 interfaceC8075ng0, C0431Di0 c0431Di0) {
        JO2 jo2;
        InterfaceC9389rV3 interfaceC9389rV3;
        GA0 ga0;
        boolean z;
        InterfaceC6098hu1 c1715Nf0;
        InterfaceC9208qx2 interfaceC9208qx2 = this.d;
        List list = (List) interfaceC9208qx2.b();
        AbstractC6464iy2.b(list);
        try {
            JO2 b = b(interfaceC8075ng0, i, i2, c0543Ee2, list);
            interfaceC9208qx2.a(list);
            RunnableC1081Ii0 runnableC1081Ii0 = c0431Di0.b;
            runnableC1081Ii0.getClass();
            Class<?> cls = b.get().getClass();
            EnumC9447rg0 enumC9447rg0 = EnumC9447rg0.RESOURCE_DISK_CACHE;
            EnumC9447rg0 enumC9447rg02 = c0431Di0.a;
            C0171Bi0 c0171Bi0 = runnableC1081Ii0.a;
            VO2 vo2 = null;
            if (enumC9447rg02 != enumC9447rg0) {
                InterfaceC9389rV3 f = c0171Bi0.f(cls);
                jo2 = f.b(runnableC1081Ii0.m, b, runnableC1081Ii0.q, runnableC1081Ii0.r);
                interfaceC9389rV3 = f;
            } else {
                jo2 = b;
                interfaceC9389rV3 = null;
            }
            if (!b.equals(jo2)) {
                b.b();
            }
            if (c0171Bi0.c.a().d.a(jo2.e()) != null) {
                LL2 a = c0171Bi0.c.a();
                a.getClass();
                vo2 = a.d.a(jo2.e());
                if (vo2 == null) {
                    throw new JL2(jo2.e());
                }
                ga0 = vo2.b(runnableC1081Ii0.t);
            } else {
                ga0 = GA0.NONE;
            }
            InterfaceC6098hu1 interfaceC6098hu1 = runnableC1081Ii0.B;
            ArrayList b2 = c0171Bi0.b();
            int size = b2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((C7686mY1) b2.get(i3)).a.equals(interfaceC6098hu1)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (runnableC1081Ii0.s.d(!z, enumC9447rg02, ga0)) {
                if (vo2 == null) {
                    throw new JL2(jo2.get().getClass());
                }
                int ordinal = ga0.ordinal();
                if (ordinal == 0) {
                    c1715Nf0 = new C1715Nf0(runnableC1081Ii0.B, runnableC1081Ii0.n);
                } else if (ordinal == 1) {
                    c1715Nf0 = new PO2(c0171Bi0.c.a, runnableC1081Ii0.B, runnableC1081Ii0.n, runnableC1081Ii0.q, runnableC1081Ii0.r, interfaceC9389rV3, cls, runnableC1081Ii0.t);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: ".concat(String.valueOf(ga0)));
                }
                C4164cH1 c4164cH1 = (C4164cH1) C4164cH1.j.b();
                AbstractC6464iy2.b(c4164cH1);
                c4164cH1.i = false;
                c4164cH1.h = true;
                c4164cH1.g = jo2;
                C0561Ei0 c0561Ei0 = runnableC1081Ii0.k;
                c0561Ei0.a = c1715Nf0;
                c0561Ei0.b = vo2;
                c0561Ei0.c = c4164cH1;
                jo2 = c4164cH1;
            }
            return this.c.a(jo2, c0543Ee2);
        } catch (Throwable th) {
            interfaceC9208qx2.a(list);
            throw th;
        }
    }

    public final JO2 b(InterfaceC8075ng0 interfaceC8075ng0, int i, int i2, C0543Ee2 c0543Ee2, List list) {
        List list2 = this.b;
        int size = list2.size();
        JO2 jo2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            RO2 ro2 = (RO2) list2.get(i3);
            try {
                if (ro2.a(interfaceC8075ng0.a(), c0543Ee2)) {
                    jo2 = ro2.b(interfaceC8075ng0.a(), i, i2, c0543Ee2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    String.valueOf(ro2);
                }
                list.add(e);
            }
            if (jo2 != null) {
                break;
            }
        }
        if (jo2 != null) {
            return jo2;
        }
        throw new EZ0(this.e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return Y5.a(AbstractC10975w63.a("DecodePath{ dataClass=", valueOf, ", decoders=", valueOf2, ", transcoder="), String.valueOf(this.c), "}");
    }
}
