package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vO2 */
/* loaded from: classes.dex */
public final class C10725vO2 extends QX0 implements InterfaceC7327lV1 {
    public static final C10725vO2 k;
    public static volatile KX0 l;
    public static final OX0 m;
    public InterfaceC1377Kp1 j = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"j", C10382uO2.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10725vO2();
            case 4:
                return new JX0(k);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C10725vO2.class) {
                        kx0 = l;
                        if (kx0 == null) {
                            kx0 = new KX0(k);
                            l = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C10725vO2 c10725vO2 = new C10725vO2();
        k = c10725vO2;
        QX0.u(C10725vO2.class, c10725vO2);
        m = QX0.t(C11162wg0.n, c10725vO2, c10725vO2, null, 6, EnumC10540uq4.k, C10725vO2.class);
    }
}
