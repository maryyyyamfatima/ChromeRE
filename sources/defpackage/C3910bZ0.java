package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bZ0 */
/* loaded from: classes2.dex */
public final class C3910bZ0 extends QX0 implements InterfaceC7327lV1 {
    public static final C3910bZ0 l;
    public static volatile KX0 m;
    public int j;
    public int k;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"j", "k", U34.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3910bZ0();
            case 4:
                return new C3566aZ0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C3910bZ0.class) {
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
        C3910bZ0 c3910bZ0 = new C3910bZ0();
        l = c3910bZ0;
        QX0.u(C3910bZ0.class, c3910bZ0);
    }
}
