package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pO */
/* loaded from: classes.dex */
public final class C8665pO extends QX0 implements InterfaceC7327lV1 {
    public static final C8665pO n;
    public static volatile KX0 o;
    public int j;
    public String k = "";
    public int l;
    public int m;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"j", "k", "l", C7634mO.a, "m", C8322oO.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8665pO();
            case 4:
                return new C7290lO(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C8665pO.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C8665pO c8665pO = new C8665pO();
        n = c8665pO;
        QX0.u(C8665pO.class, c8665pO);
    }
}
