package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class ZR3 extends QX0 implements InterfaceC7327lV1 {
    public static final ZR3 m;
    public static volatile KX0 n;
    public int j;
    public float k;
    public int l = 1;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0007\b\u0002\u0000\u0000\u0000\u0007ခ\u0000\bဌ\u0001", new Object[]{"j", "k", "l", YR3.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new ZR3();
            case 4:
                return new XR3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (ZR3.class) {
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
        ZR3 zr3 = new ZR3();
        m = zr3;
        QX0.u(ZR3.class, zr3);
    }
}
