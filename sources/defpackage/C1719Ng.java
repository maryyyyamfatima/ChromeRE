package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ng */
/* loaded from: classes.dex */
public final class C1719Ng extends QX0 implements InterfaceC7327lV1 {
    public static final C1719Ng o;
    public static volatile KX0 p;
    public int j;
    public int k;
    public int l;
    public int m;
    public InterfaceC0857Gp1 n = C0072Ao1.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004'", new Object[]{"j", "k", "l", "m", C5859hC2.a, "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1719Ng();
            case 4:
                return new C1589Mg(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C1719Ng.class) {
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
        C1719Ng c1719Ng = new C1719Ng();
        o = c1719Ng;
        QX0.u(C1719Ng.class, c1719Ng);
    }
}
