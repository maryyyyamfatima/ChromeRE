package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hy0 */
/* loaded from: classes.dex */
public final class C6120hy0 extends QX0 implements InterfaceC7327lV1 {
    public static final C6120hy0 o;
    public static volatile KX0 p;
    public int j;
    public C2975Wx0 l;
    public byte n = 2;
    public InterfaceC1377Kp1 k = C8275oE2.i;
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဈ\u0001", new Object[]{"j", "k", C5432fy0.class, "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6120hy0();
            case 4:
                return new C5776gy0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C6120hy0.class) {
                        kx0 = p;
                        if (kx0 == null) {
                            kx0 = new KX0(o);
                            p = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C6120hy0 c6120hy0 = new C6120hy0();
        o = c6120hy0;
        QX0.u(C6120hy0.class, c6120hy0);
    }
}
