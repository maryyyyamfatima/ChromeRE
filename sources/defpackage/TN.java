package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TN extends QX0 implements InterfaceC7327lV1 {
    public static final TN p;
    public static volatile KX0 q;
    public int j;
    public C2264Rl l;
    public C8665pO m;
    public C6946kO n;
    public byte o = 2;
    public String k = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new TN();
            case 4:
                return new SN(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (TN.class) {
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
        TN tn = new TN();
        p = tn;
        QX0.u(TN.class, tn);
    }
}
