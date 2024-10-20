package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z20 extends QX0 implements InterfaceC7327lV1 {
    public static final Z20 r;
    public static volatile KX0 s;
    public int j;
    public String k = "";
    public AbstractC4147cE l = AbstractC4147cE.g;
    public String m = "";
    public InterfaceC1377Kp1 n;
    public InterfaceC1377Kp1 o;
    public boolean p;
    public long q;

    public Z20() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.n = c8275oE2;
        this.o = c8275oE2;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(r, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"j", "m", "k", "l", "n", C12100zP0.class, "o", "p", "q"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new Z20();
            case 4:
                return new Y20(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return r;
            case 6:
                KX0 kx0 = s;
                if (kx0 == null) {
                    synchronized (Z20.class) {
                        kx0 = s;
                        if (kx0 == null) {
                            kx0 = new KX0(r);
                            s = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Z20 z20 = new Z20();
        r = z20;
        QX0.u(Z20.class, z20);
    }
}
