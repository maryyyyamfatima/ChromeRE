package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fJ3 */
/* loaded from: classes5.dex */
public final class C5207fJ3 extends QX0 implements InterfaceC7327lV1 {
    public static final C5207fJ3 l;
    public static volatile KX0 m;
    public int j = 0;
    public Object k;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ှ\u0000\u0005ြ\u0000", new Object[]{"k", "j", C6239iJ3.a, C5551gJ3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5207fJ3();
            case 4:
                return new JX0(l);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C5207fJ3.class) {
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
        C5207fJ3 c5207fJ3 = new C5207fJ3();
        l = c5207fJ3;
        QX0.u(C5207fJ3.class, c5207fJ3);
    }
}