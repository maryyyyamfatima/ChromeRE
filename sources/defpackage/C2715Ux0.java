package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ux0 */
/* loaded from: classes5.dex */
public final class C2715Ux0 extends QX0 implements InterfaceC7327lV1 {
    public static final C2715Ux0 n;
    public static volatile KX0 o;
    public int j;
    public String k = "";
    public int l = -1;
    public float m = 50.0f;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ခ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2715Ux0();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C2715Ux0.class) {
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
        C2715Ux0 c2715Ux0 = new C2715Ux0();
        n = c2715Ux0;
        QX0.u(C2715Ux0.class, c2715Ux0);
    }
}
