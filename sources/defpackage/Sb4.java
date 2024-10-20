package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Sb4 extends QX0 implements InterfaceC7327lV1 {
    public static final Sb4 m;
    public static volatile KX0 n;
    public int j;
    public int k;
    public InterfaceC1377Kp1 l = C8275oE2.i;

    public final void v() {
        InterfaceC1377Kp1 interfaceC1377Kp1 = this.l;
        if (((AbstractC7504m0) interfaceC1377Kp1).a) {
            return;
        }
        this.l = QX0.r(interfaceC1377Kp1);
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဌ\u0000\u0003\u001b", new Object[]{"j", "k", Rb4.a, "l", Qb4.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new Sb4();
            case 4:
                return new Mb4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (Sb4.class) {
                        kx0 = n;
                        if (kx0 == null) {
                            kx0 = new KX0(m);
                            n = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Sb4 sb4 = new Sb4();
        m = sb4;
        QX0.u(Sb4.class, sb4);
    }
}
