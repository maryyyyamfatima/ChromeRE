package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nS2 */
/* loaded from: classes5.dex */
public final class C8001nS2 extends QX0 implements InterfaceC7327lV1 {
    public static final C8001nS2 l;
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
                return QX0.s(l, "\u0001\u0002\u0001\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0004ျ\u0000", new Object[]{"k", "j", C2597Tz2.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8001nS2();
            case 4:
                return new C7657mS2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C8001nS2.class) {
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
        C8001nS2 c8001nS2 = new C8001nS2();
        l = c8001nS2;
        QX0.u(C8001nS2.class, c8001nS2);
    }
}
