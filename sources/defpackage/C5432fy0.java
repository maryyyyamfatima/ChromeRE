package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fy0 */
/* loaded from: classes.dex */
public final class C5432fy0 extends QX0 implements InterfaceC7327lV1 {
    public static final C5432fy0 o;
    public static volatile KX0 p;
    public int j;
    public InterfaceC1377Kp1 k;
    public String l;
    public InterfaceC1377Kp1 m;
    public byte n = 2;

    public C5432fy0() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.k = c8275oE2;
        this.l = "";
        this.m = c8275oE2;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001Л\u0002ဈ\u0000\u0003\u001b", new Object[]{"j", "k", C3235Yx0.class, "l", "m", C4744dy0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5432fy0();
            case 4:
                return new C5088ey0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C5432fy0.class) {
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
        C5432fy0 c5432fy0 = new C5432fy0();
        o = c5432fy0;
        QX0.u(C5432fy0.class, c5432fy0);
    }
}
