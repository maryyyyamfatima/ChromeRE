package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rl */
/* loaded from: classes.dex */
public final class C2264Rl extends QX0 implements InterfaceC7327lV1 {
    public static final C2264Rl r;
    public static volatile KX0 s;
    public int j;
    public int k;
    public TD0 m;
    public int p;
    public byte q = 2;
    public String l = "";
    public String n = "";
    public InterfaceC1377Kp1 o = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(r, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0001\u0002\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004Л\u0005င\u0004\u0011ᐉ\u0002", new Object[]{"j", "k", "l", "n", "o", C2134Ql.class, "p", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2264Rl();
            case 4:
                return new C1355Kl(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return r;
            case 6:
                KX0 kx0 = s;
                if (kx0 == null) {
                    synchronized (C2264Rl.class) {
                        kx0 = s;
                        if (kx0 == null) {
                            kx0 = new KX0(r);
                            s = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C2264Rl c2264Rl = new C2264Rl();
        r = c2264Rl;
        QX0.u(C2264Rl.class, c2264Rl);
    }
}
