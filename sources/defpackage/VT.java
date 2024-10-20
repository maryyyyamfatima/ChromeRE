package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VT extends QX0 implements InterfaceC7327lV1 {
    public static final VT v;
    public static volatile KX0 w;
    public int j;
    public Kf4 m;
    public int n;
    public int q;
    public TD0 s;
    public byte u = 2;
    public int k = -1;
    public int l = -1;
    public int o = -1;
    public int p = -1;
    public int r = -1;
    public int t = -1;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(v, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\u0005င\u0005\u0006င\u0006\u0007င\u0007\tင\b\u000bင\u0001\rᐉ\u000b\u000eင\f\u000fဉ\u0002", new Object[]{"j", "k", "n", "o", "p", "q", "r", "l", "s", "t", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new VT();
            case 4:
                return new UT(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return v;
            case 6:
                KX0 kx0 = w;
                if (kx0 == null) {
                    synchronized (VT.class) {
                        kx0 = w;
                        if (kx0 == null) {
                            kx0 = new KX0(v);
                            w = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        VT vt = new VT();
        v = vt;
        QX0.u(VT.class, vt);
    }
}
