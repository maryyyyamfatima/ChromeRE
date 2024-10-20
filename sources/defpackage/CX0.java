package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CX0 extends QX0 implements InterfaceC7327lV1 {
    public static final CX0 k;
    public static volatile KX0 l;
    public InterfaceC1377Kp1 j = C8275oE2.i;

    public final void v() {
        InterfaceC1377Kp1 interfaceC1377Kp1 = this.j;
        if (((AbstractC7504m0) interfaceC1377Kp1).a) {
            return;
        }
        this.j = QX0.r(interfaceC1377Kp1);
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"j", EX0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new CX0();
            case 4:
                return new BX0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (CX0.class) {
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
        CX0 cx0 = new CX0();
        k = cx0;
        QX0.u(CX0.class, cx0);
    }
}
