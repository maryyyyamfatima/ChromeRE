package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h53 */
/* loaded from: classes2.dex */
public final class C5820h53 extends QX0 implements InterfaceC7327lV1 {
    public static final C5820h53 m;
    public static volatile KX0 n;
    public int j;
    public InterfaceC1377Kp1 k = C8275oE2.i;
    public int l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000", new Object[]{"j", "k", "l", C5476g53.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5820h53();
            case 4:
                return new JX0(m);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C5820h53.class) {
                        kx0 = n;
                        if (kx0 == null) {
                            kx0 = new KX0(m);
                            n = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C5820h53 c5820h53 = new C5820h53();
        m = c5820h53;
        QX0.u(C5820h53.class, c5820h53);
    }
}
