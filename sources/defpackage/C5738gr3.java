package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gr3 */
/* loaded from: classes.dex */
public final class C5738gr3 extends QX0 implements InterfaceC7327lV1 {
    public static final C5738gr3 k;
    public static volatile KX0 l;
    public InterfaceC1377Kp1 j = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"j", C5394fr3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5738gr3();
            case 4:
                return new JX0(k);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C5738gr3.class) {
                        kx0 = l;
                        if (kx0 == null) {
                            kx0 = new KX0(k);
                            l = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C5738gr3 c5738gr3 = new C5738gr3();
        k = c5738gr3;
        QX0.u(C5738gr3.class, c5738gr3);
    }
}
