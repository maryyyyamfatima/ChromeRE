package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ff4 extends MX0 {
    public static final Ff4 y;
    public static volatile KX0 z;
    public int k;
    public VT l;
    public int p;
    public byte x = 2;
    public String m = "";
    public int n = -1;
    public int o = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";

    public Ff4() {
        C8275oE2 c8275oE2 = C8275oE2.i;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(y, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0000\u0001\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0006င\u0007\u0007င\b\bင\t\tဈ\n\nဈ\u000b\u000bဈ\u0001\fဈ\f\rဈ\r\u0010ᐉ\u0000", new Object[]{"k", "n", "o", "p", "q", "r", "s", "t", "u", "m", "v", "w", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new Ff4();
            case 4:
                return new Ef4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return y;
            case 6:
                KX0 kx0 = z;
                if (kx0 == null) {
                    synchronized (Ff4.class) {
                        kx0 = z;
                        if (kx0 == null) {
                            kx0 = new KX0(y);
                            z = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Ff4 ff4 = new Ff4();
        y = ff4;
        QX0.u(Ff4.class, ff4);
    }
}
