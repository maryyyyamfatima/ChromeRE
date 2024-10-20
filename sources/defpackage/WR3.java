package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class WR3 extends QX0 implements InterfaceC7327lV1 {
    public static final WR3 p;
    public static volatile KX0 q;
    public int j;
    public int k = 0;
    public Object l;
    public int m;
    public int n;
    public ZR3 o;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\t\u0001\u0001\u0001\u0015\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004ြ\u0000\u0005ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\u0015ြ\u0000", new Object[]{"l", "k", "j", "m", UR3.a, "n", "o", MR3.class, KR3.class, SR3.class, PR3.class, LR3.class, QR3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new WR3();
            case 4:
                return new TR3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (WR3.class) {
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
        WR3 wr3 = new WR3();
        p = wr3;
        QX0.u(WR3.class, wr3);
    }
}
