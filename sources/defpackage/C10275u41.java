package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u41 */
/* loaded from: classes.dex */
public final class C10275u41 extends QX0 implements InterfaceC7327lV1 {
    public static final C10275u41 l;
    public static volatile KX0 m;
    public byte k = 2;
    public InterfaceC1377Kp1 j = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"j", C9589s41.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10275u41();
            case 4:
                return new C9932t41(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C10275u41.class) {
                        kx0 = m;
                        if (kx0 == null) {
                            kx0 = new KX0(l);
                            m = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C10275u41 c10275u41 = new C10275u41();
        l = c10275u41;
        QX0.u(C10275u41.class, c10275u41);
    }
}
