package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MU extends QX0 implements InterfaceC7327lV1 {
    public static final MU s;
    public static volatile KX0 t;
    public int j;
    public TD0 k;
    public TD0 l;
    public String m;
    public TD0 n;
    public Ff4 o;
    public C10275u41 p;
    public C10304u90 q;
    public byte r = 2;

    public MU() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.m = "";
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(s, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0004\u0006ဈ\u0002\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"j", "k", "l", "o", "m", "p", "n", "q"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new MU();
            case 4:
                return new LU(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return s;
            case 6:
                KX0 kx0 = t;
                if (kx0 == null) {
                    synchronized (MU.class) {
                        kx0 = t;
                        if (kx0 == null) {
                            kx0 = new KX0(s);
                            t = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        MU mu = new MU();
        s = mu;
        QX0.u(MU.class, mu);
    }
}
