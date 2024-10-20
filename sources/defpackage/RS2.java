package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class RS2 extends QX0 implements InterfaceC7327lV1 {
    public static final RS2 p;
    public static volatile KX0 q;
    public int j;
    public int k;
    public int l;
    public float m;
    public int n = 1;
    public float o = 1.0f;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ခ\u0002\u0005ခ\u0004\u0006ဌ\u0003", new Object[]{"j", "k", "l", "m", "o", "n", C2727Uz2.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new RS2();
            case 4:
                return new QS2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (RS2.class) {
                        kx0 = q;
                        if (kx0 == null) {
                            kx0 = new KX0(p);
                            q = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RS2 rs2 = new RS2();
        p = rs2;
        QX0.u(RS2.class, rs2);
    }
}
