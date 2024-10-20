package defpackage;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KA1 {
    public EnumC11683yA1 a;
    public final CA1 b;

    public KA1(IA1 ia1, EnumC11683yA1 enumC11683yA1) {
        CA1 c4529dL2;
        HashMap hashMap = MA1.a;
        boolean z = ia1 instanceof CA1;
        boolean z2 = ia1 instanceof InterfaceC3295Zj0;
        if (z && z2) {
            c4529dL2 = new JU0((InterfaceC3295Zj0) ia1, (CA1) ia1);
        } else if (z2) {
            c4529dL2 = new JU0((InterfaceC3295Zj0) ia1, null);
        } else if (z) {
            c4529dL2 = (CA1) ia1;
        } else {
            Class<?> cls = ia1.getClass();
            if (MA1.c(cls) == 2) {
                List list = (List) MA1.b.get(cls);
                if (list.size() == 1) {
                    MA1.a((Constructor) list.get(0), ia1);
                    c4529dL2 = new C0794Gc3();
                } else {
                    FX0[] fx0Arr = new FX0[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        MA1.a((Constructor) list.get(i), ia1);
                        fx0Arr[i] = null;
                    }
                    c4529dL2 = new N10(fx0Arr);
                }
            } else {
                c4529dL2 = new C4529dL2(ia1);
            }
        }
        this.b = c4529dL2;
        this.a = enumC11683yA1;
    }

    public final void a(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        EnumC11683yA1 a = enumC11340xA1.a();
        EnumC11683yA1 enumC11683yA1 = this.a;
        if (a.compareTo(enumC11683yA1) < 0) {
            enumC11683yA1 = a;
        }
        this.a = enumC11683yA1;
        this.b.c(ja1, enumC11340xA1);
        this.a = a;
    }
}
