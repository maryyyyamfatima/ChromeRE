package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10256u10 extends QX0 implements InterfaceC7327lV1 {
    public static final C10256u10 l;
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
                return QX0.s(l, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဴ\u0000\u0003ျ\u0000\u0004်\u0000\u0005ွ\u0000\u0006ြ\u0000\u0007ြ\u0000\b့\u0000\tှ\u0000", new Object[]{"k", "j", C8542p10.a, C9570s10.class, C6479j10.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10256u10();
            case 4:
                return new C9913t10(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C10256u10.class) {
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
        C10256u10 c10256u10 = new C10256u10();
        l = c10256u10;
        QX0.u(C10256u10.class, c10256u10);
    }
}
