package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m64 */
/* loaded from: classes.dex */
public final class C7545m64 extends QX0 implements InterfaceC7327lV1 {
    public static final C7545m64 l;
    public static volatile KX0 m;
    public boolean j;
    public boolean k;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"j", "k"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7545m64();
            case 4:
                return new C7201l64(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C7545m64.class) {
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
        C7545m64 c7545m64 = new C7545m64();
        l = c7545m64;
        QX0.u(C7545m64.class, c7545m64);
    }
}
