package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g64 */
/* loaded from: classes.dex */
public final class C5483g64 extends QX0 implements InterfaceC7327lV1 {
    public static final C5483g64 k;
    public static volatile KX0 l;
    public C3415a54 j;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"j"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5483g64();
            case 4:
                return new C5139f64(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C5483g64.class) {
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
        C5483g64 c5483g64 = new C5483g64();
        k = c5483g64;
        QX0.u(C5483g64.class, c5483g64);
    }
}
