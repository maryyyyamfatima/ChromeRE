package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KU extends MX0 {
    public static final KU l;
    public static volatile KX0 m;
    public byte k = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new KU();
            case 4:
                return new LX0(l);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (KU.class) {
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
        KU ku = new KU();
        l = ku;
        QX0.u(KU.class, ku);
    }
}
