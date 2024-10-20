package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w93 */
/* loaded from: classes2.dex */
public final class C10993w93 extends QX0 implements InterfaceC7327lV1 {
    public static final C10993w93 r;
    public static volatile KX0 s;
    public int j;
    public C6889kC2 m;
    public long n;
    public boolean o;
    public long p;
    public String k = "";
    public String l = "";
    public String q = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(r, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဃ\u0003\u0005ဇ\u0004\u0006စ\u0005\u0007ဈ\u0006", new Object[]{"j", "k", "l", "m", "n", "o", "p", "q"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10993w93();
            case 4:
                return new C10650v93(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return r;
            case 6:
                KX0 kx0 = s;
                if (kx0 == null) {
                    synchronized (C10993w93.class) {
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
        C10993w93 c10993w93 = new C10993w93();
        r = c10993w93;
        QX0.u(C10993w93.class, c10993w93);
    }
}
