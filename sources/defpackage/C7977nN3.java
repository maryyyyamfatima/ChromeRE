package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nN3 */
/* loaded from: classes.dex */
public final class C7977nN3 extends QX0 implements InterfaceC7327lV1 {
    public static final C7977nN3 p;
    public static volatile KX0 q;
    public int j;
    public Object l;
    public C11064wN3 m;
    public int k = 0;
    public byte o = 2;
    public String n = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(p, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0002\u0001ဉ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ဈ\b\bြ\u0000\tြ\u0000", new Object[]{"l", "k", "j", "m", C7289lN3.class, C6601jN3.class, C3509aN3.class, YM3.class, C5227fN3.class, "n", C5915hN3.class, C4196cN3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7977nN3();
            case 4:
                return new C7633mN3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C7977nN3.class) {
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
        C7977nN3 c7977nN3 = new C7977nN3();
        p = c7977nN3;
        QX0.u(C7977nN3.class, c7977nN3);
    }
}
