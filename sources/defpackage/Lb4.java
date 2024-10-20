package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Lb4 extends QX0 implements InterfaceC7327lV1 {
    public static final Lb4 s;
    public static volatile KX0 t;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(s, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0004\u0005ဃ\u0005\u0006ဃ\u0006\u0007ဃ\u0007\bဃ\u0003", new Object[]{"j", "k", "l", "m", "o", "p", "q", "r", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new Lb4();
            case 4:
                return new Kb4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return s;
            case 6:
                KX0 kx0 = t;
                if (kx0 == null) {
                    synchronized (Lb4.class) {
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
        Lb4 lb4 = new Lb4();
        s = lb4;
        QX0.u(Lb4.class, lb4);
    }
}
