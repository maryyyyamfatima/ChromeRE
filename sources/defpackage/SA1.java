package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SA1 extends QX0 implements InterfaceC7327lV1 {
    public static final SA1 t;
    public static volatile KX0 u;
    public int j;
    public C7017kb4 k;
    public C10409uU r;
    public byte s = 2;
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";

    public SA1() {
        C8275oE2 c8275oE2 = C8275oE2.i;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(t, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဈ\u0006\bᐉ\b\tဈ\u0005\nဈ\u0007", new Object[]{"j", "k", "l", "m", "n", "p", "r", "o", "q"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new SA1();
            case 4:
                return new RA1(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return t;
            case 6:
                KX0 kx0 = u;
                if (kx0 == null) {
                    synchronized (SA1.class) {
                        kx0 = u;
                        if (kx0 == null) {
                            kx0 = new KX0(t);
                            u = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SA1 sa1 = new SA1();
        t = sa1;
        QX0.u(SA1.class, sa1);
    }
}
