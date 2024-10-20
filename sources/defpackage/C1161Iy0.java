package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iy0 */
/* loaded from: classes.dex */
public final class C1161Iy0 extends MX0 {
    public static final C1161Iy0 p;
    public static volatile KX0 q;
    public int k;
    public C2479Tc l;
    public C3240Yy0 m;
    public C10133tg0 n;
    public byte o = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002", new Object[]{"k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1161Iy0();
            case 4:
                return new LX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C1161Iy0.class) {
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
        C1161Iy0 c1161Iy0 = new C1161Iy0();
        p = c1161Iy0;
        QX0.u(C1161Iy0.class, c1161Iy0);
    }
}
