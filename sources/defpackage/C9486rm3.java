package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rm3 */
/* loaded from: classes.dex */
public final class C9486rm3 extends QX0 implements InterfaceC7327lV1 {
    public static final C9486rm3 n;
    public static volatile KX0 o;
    public int j;
    public String k = "";
    public AbstractC4147cE l = AbstractC4147cE.g;
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9486rm3();
            case 4:
                return new C9144qm3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C9486rm3.class) {
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

    static {
        C9486rm3 c9486rm3 = new C9486rm3();
        n = c9486rm3;
        QX0.u(C9486rm3.class, c9486rm3);
    }
}
