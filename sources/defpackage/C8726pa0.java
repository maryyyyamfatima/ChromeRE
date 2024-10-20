package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pa0 */
/* loaded from: classes.dex */
public final class C8726pa0 extends QX0 implements InterfaceC7327lV1 {
    public static final C8726pa0 p;
    public static volatile KX0 q;
    public int j;
    public long k;
    public InterfaceC1377Kp1 l = C8275oE2.i;
    public AbstractC4147cE m = AbstractC4147cE.g;
    public String n = "";
    public String o = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"j", "k", "l", C8039na0.class, "m", "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8726pa0();
            case 4:
                return new C8383oa0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C8726pa0.class) {
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
        C8726pa0 c8726pa0 = new C8726pa0();
        p = c8726pa0;
        QX0.u(C8726pa0.class, c8726pa0);
    }
}
