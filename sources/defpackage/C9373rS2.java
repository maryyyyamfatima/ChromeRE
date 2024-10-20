package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rS2 */
/* loaded from: classes5.dex */
public final class C9373rS2 extends QX0 implements InterfaceC7327lV1 {
    public static final C9373rS2 p;
    public static volatile KX0 q;
    public int j;
    public Object l;
    public int o;
    public int k = 0;
    public boolean m = true;
    public boolean n = true;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0001\u0001\u0001\f\u0005\u0000\u0000\u0000\u0001ှ\u0000\u0002ဇ\u0002\u0005င\f\tြ\u0000\fဇ\u0005", new Object[]{"l", "k", "j", "m", "o", C11088wS2.class, "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9373rS2();
            case 4:
                return new C9031qS2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C9373rS2.class) {
                        kx0 = q;
                        if (kx0 == null) {
                            kx0 = new KX0(p);
                            q = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C9373rS2 c9373rS2 = new C9373rS2();
        p = c9373rS2;
        QX0.u(C9373rS2.class, c9373rS2);
    }
}
