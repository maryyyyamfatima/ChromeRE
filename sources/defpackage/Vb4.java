package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Vb4 extends QX0 implements InterfaceC7327lV1 {
    public static final Vb4 u;
    public static volatile KX0 v;
    public int j;
    public Lb4 k;
    public Sb4 l;
    public Ib4 m;
    public int n;
    public int q;
    public Eb4 r;
    public boolean s;
    public String o = "";
    public String p = "";
    public String t = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(u, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဌ\u0006\u0006ဈ\u0007\u0007ဈ\b\nဉ\n\u000bဌ\t\fဇ\u000b\rဈ\f", new Object[]{"j", "k", "l", "m", "n", Ub4.a, "o", "p", "r", "q", TE2.a, "s", "t"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new Vb4();
            case 4:
                return new Tb4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return u;
            case 6:
                KX0 kx0 = v;
                if (kx0 == null) {
                    synchronized (Vb4.class) {
                        kx0 = v;
                        if (kx0 == null) {
                            kx0 = new KX0(u);
                            v = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Vb4 vb4 = new Vb4();
        u = vb4;
        QX0.u(Vb4.class, vb4);
    }
}
