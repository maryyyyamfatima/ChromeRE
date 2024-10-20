package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Qb4 extends QX0 implements InterfaceC7327lV1 {
    public static final Qb4 o;
    public static volatile KX0 p;
    public int j;
    public int k;
    public long l;
    public long m;
    public long n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"j", "k", Ob4.a, "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new Qb4();
            case 4:
                return new Nb4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (Qb4.class) {
                        kx0 = p;
                        if (kx0 == null) {
                            kx0 = new KX0(o);
                            p = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Qb4 qb4 = new Qb4();
        o = qb4;
        QX0.u(Qb4.class, qb4);
    }
}
