package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cn3 */
/* loaded from: classes.dex */
public final class C4339cn3 extends QX0 implements InterfaceC7327lV1 {
    public static final C4339cn3 l;
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
                return QX0.s(l, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဳ\u0000\u0003ြ\u0000", new Object[]{"k", "j", C2923Wm3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4339cn3();
            case 4:
                return new C3996bn3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C4339cn3.class) {
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
        C4339cn3 c4339cn3 = new C4339cn3();
        l = c4339cn3;
        QX0.u(C4339cn3.class, c4339cn3);
    }
}