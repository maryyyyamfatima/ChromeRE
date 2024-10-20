package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a64 */
/* loaded from: classes.dex */
public final class C3421a64 extends QX0 implements InterfaceC7327lV1 {
    public static final C3421a64 o;
    public static volatile KX0 p;
    public int j;
    public int k;
    public InterfaceC0857Gp1 l = C0072Ao1.i;
    public int m;
    public int n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002,\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3421a64();
            case 4:
                return new W54(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C3421a64.class) {
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
        C3421a64 c3421a64 = new C3421a64();
        o = c3421a64;
        QX0.u(C3421a64.class, c3421a64);
    }
}
