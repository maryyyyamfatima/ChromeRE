package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ni3 */
/* loaded from: classes.dex */
public final class C8090ni3 extends QX0 implements InterfaceC7327lV1 {
    public static final C8090ni3 m;
    public static volatile KX0 n;
    public int j;
    public String k = "";
    public String l = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0002", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8090ni3();
            case 4:
                return new C7746mi3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C8090ni3.class) {
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
        C8090ni3 c8090ni3 = new C8090ni3();
        m = c8090ni3;
        QX0.u(C8090ni3.class, c8090ni3);
    }
}
