package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ox0 */
/* loaded from: classes5.dex */
public final class C1935Ox0 extends QX0 implements InterfaceC7327lV1 {
    public static final C1935Ox0 m;
    public static volatile KX0 n;
    public int j;
    public String k = "";
    public C3247Yz2 l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1935Ox0();
            case 4:
                return new C1805Nx0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C1935Ox0.class) {
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
        C1935Ox0 c1935Ox0 = new C1935Ox0();
        m = c1935Ox0;
        QX0.u(C1935Ox0.class, c1935Ox0);
    }
}