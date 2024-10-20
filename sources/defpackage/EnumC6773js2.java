package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: js2 */
/* loaded from: classes.dex */
public final class EnumC6773js2 extends Enum {
    public static final HashMap h;
    public static final HashMap i;
    public static SM0 j;
    public static UA0 k;
    public static TX1 l;
    public static C5503gA0 m;
    public static final /* synthetic */ EnumC6773js2[] n;
    public final String a;
    public InterfaceC8149ns2 g;
    EnumC6773js2 EF0;
    EnumC6773js2 EF1;
    EnumC6773js2 EF3;
    EnumC6773js2 EF5;
    EnumC6773js2 EF7;
    EnumC6773js2 EF9;
    EnumC6773js2 EF11;
    EnumC6773js2 EF13;
    EnumC6773js2 EF12;

    public static EnumC6773js2[] values() {
        return (EnumC6773js2[]) n.clone();
    }

    static {
        EnumC6773js2 enumC6773js2 = new EnumC6773js2("CPTDFB");
        EnumC6773js2 enumC6773js22 = new EnumC6773js2("ECPTDFB");
        EnumC6773js2 enumC6773js23 = new EnumC6773js2("MPTD");
        EnumC6773js2 enumC6773js24 = new EnumC6773js2("EMPTD");
        EnumC6773js2 enumC6773js25 = new EnumC6773js2("COPTD");
        EnumC6773js2 enumC6773js26 = new EnumC6773js2("SPTD");
        EnumC6773js2 enumC6773js27 = new EnumC6773js2("STPTD");
        EnumC6773js2 enumC6773js28 = new EnumC6773js2("EBBTC");
        EnumC6773js2 enumC6773js29 = new EnumC6773js2("TC");
        n = new EnumC6773js2[]{enumC6773js2, enumC6773js22, enumC6773js23, enumC6773js24, enumC6773js25, enumC6773js26, enumC6773js27, enumC6773js28, enumC6773js29};
        HashMap hashMap = new HashMap();
        h = hashMap;
        HashMap hashMap2 = new HashMap();
        i = hashMap2;
        hashMap.put(C0391Da0.class, enumC6773js25);
        hashMap2.put(C0391Da0.class, enumC6773js25);
        hashMap.put(C1695Nb0.class, enumC6773js2);
        hashMap2.put(C1695Nb0.class, enumC6773js22);
        hashMap.put(RX1.class, enumC6773js23);
        hashMap2.put(RX1.class, enumC6773js24);
        hashMap.put(C10307u93.class, enumC6773js26);
        hashMap2.put(C10307u93.class, enumC6773js26);
        hashMap.put(C1364Km3.class, enumC6773js27);
        hashMap2.put(C1364Km3.class, enumC6773js27);
        enumC6773js25.g = new C8597pA1();
        enumC6773js2.g = new InterfaceC8149ns2() { // from class: ds2
            @Override // defpackage.InterfaceC8149ns2
            public final InterfaceC7805ms2 a() {
                if (EnumC6773js2.j == null) {
                    EnumC6773js2.j = new SM0();
                }
                return EnumC6773js2.j;
            }
        };
        enumC6773js22.g = new InterfaceC8149ns2() { // from class: es2
            @Override // defpackage.InterfaceC8149ns2
            public final InterfaceC7805ms2 a() {
                if (EnumC6773js2.k == null) {
                    EnumC6773js2.k = new UA0();
                }
                return EnumC6773js2.k;
            }
        };
        enumC6773js23.g = new InterfaceC8149ns2() { // from class: fs2
            @Override // defpackage.InterfaceC8149ns2
            public final InterfaceC7805ms2 a() {
                if (EnumC6773js2.j == null) {
                    EnumC6773js2.j = new SM0();
                }
                return EnumC6773js2.j;
            }
        };
        enumC6773js24.g = new InterfaceC8149ns2() { // from class: gs2
            @Override // defpackage.InterfaceC8149ns2
            public final InterfaceC7805ms2 a() {
                if (EnumC6773js2.k == null) {
                    EnumC6773js2.k = new UA0();
                }
                return EnumC6773js2.k;
            }
        };
        enumC6773js26.g = new C8597pA1();
        enumC6773js27.g = new C8597pA1();
        enumC6773js29.g = new InterfaceC8149ns2() { // from class: hs2
            @Override // defpackage.InterfaceC8149ns2
            public final InterfaceC7805ms2 a() {
                if (EnumC6773js2.l == null) {
                    EnumC6773js2.l = new TX1();
                }
                return EnumC6773js2.l;
            }
        };
        enumC6773js28.g = new InterfaceC8149ns2() { // from class: is2
            @Override // defpackage.InterfaceC8149ns2
            public final InterfaceC7805ms2 a() {
                if (EnumC6773js2.m == null) {
                    EnumC6773js2.m = new C5503gA0();
                }
                return EnumC6773js2.m;
            }
        };
    }

    public EnumC6773js2(int i2, String str, String str2) {
        super(str, i2);
        this.a = str2;
    }

    public final InterfaceC7805ms2 b() {
        return this.g.a();
    }

    public static EnumC6773js2 a(Class cls, boolean z) {
        if (z) {
            return (EnumC6773js2) i.get(cls);
        }
        return (EnumC6773js2) h.get(cls);
    }
}
