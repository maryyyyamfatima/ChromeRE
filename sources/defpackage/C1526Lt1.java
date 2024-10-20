package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lt1 */
/* loaded from: classes2.dex */
public final class C1526Lt1 extends QX0 implements InterfaceC7327lV1 {
    public static final C1526Lt1 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int j;
    public String k = "";
    public String l = "";
    public InterfaceC1377Kp1 m = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"j", "k", "l", "m", C1656Mt1.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1526Lt1();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C1526Lt1.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C1526Lt1 c1526Lt1 = new C1526Lt1();
        n = c1526Lt1;
        QX0.u(C1526Lt1.class, c1526Lt1);
        p = QX0.t(LV1.l, c1526Lt1, c1526Lt1, null, 425929539, EnumC10540uq4.k, C1526Lt1.class);
    }
}
