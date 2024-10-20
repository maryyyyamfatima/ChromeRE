package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uq3 */
/* loaded from: classes.dex */
public final class C10539uq3 extends QX0 implements InterfaceC7327lV1 {
    public static final C9510rq3 m = new C9510rq3();
    public static final C10539uq3 n;
    public static volatile KX0 o;
    public C9853sq3 j;
    public int k;
    public InterfaceC0857Gp1 l = C0072Ao1.i;

    static {
        C10539uq3 c10539uq3 = new C10539uq3();
        n = c10539uq3;
        QX0.u(C10539uq3.class, c10539uq3);
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003\f\u0004,", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10539uq3();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C10539uq3.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
