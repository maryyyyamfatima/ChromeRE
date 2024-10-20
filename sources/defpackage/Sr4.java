package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Sr4 extends QX0 implements InterfaceC7327lV1 {
    public static final Sr4 p;
    public static volatile KX0 q;
    public int j;
    public int k;
    public int l;
    public int m;
    public String n = "";
    public int o;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"j", "k", C11095wU.a, "l", C6089hs4.a, "m", "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new Sr4();
            case 4:
                return new Rr4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (Sr4.class) {
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
        Sr4 sr4 = new Sr4();
        p = sr4;
        QX0.u(Sr4.class, sr4);
    }
}
