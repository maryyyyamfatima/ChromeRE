package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ae2 */
/* loaded from: classes.dex */
public final class C3597ae2 extends MX0 {
    public static final C3597ae2 p;
    public static volatile KX0 q;
    public int k;
    public C3941be2 n;
    public byte o = 2;
    public String l = "";
    public int m = 1;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဌ\u0003\u0006ဉ\u0004", new Object[]{"k", "l", "m", C3267Zd2.a, "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3597ae2();
            case 4:
                return new LX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C3597ae2.class) {
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
        C3597ae2 c3597ae2 = new C3597ae2();
        p = c3597ae2;
        QX0.u(C3597ae2.class, c3597ae2);
    }
}
