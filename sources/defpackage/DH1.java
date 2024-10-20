package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DH1 extends QX0 implements InterfaceC7327lV1 {
    public static final DH1 q;
    public static volatile KX0 r;
    public int j;
    public C11064wN3 l;
    public int m;
    public GH1 p;
    public OL1 o = OL1.g;
    public String k = "";
    public String n = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u00052\u0006ဉ\u0004", new Object[]{"j", "k", "l", "m", EH1.a, "n", "o", BH1.a, "p"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new DH1();
            case 4:
                return new CH1(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (DH1.class) {
                        kx0 = r;
                        if (kx0 == null) {
                            kx0 = new KX0(q);
                            r = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        DH1 dh1 = new DH1();
        q = dh1;
        QX0.u(DH1.class, dh1);
    }
}
