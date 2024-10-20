package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t93 */
/* loaded from: classes.dex */
public final class C9964t93 extends QX0 implements InterfaceC7327lV1 {
    public static final C9964t93 r;
    public static volatile KX0 s;
    public int j;
    public long k;
    public long l;
    public long n;
    public long o;
    public String m = "";
    public String p = "";
    public String q = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(r, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"j", "k", "l", "m", "n", "o", "p", "q"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9964t93();
            case 4:
                return new C9621s93(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return r;
            case 6:
                KX0 kx0 = s;
                if (kx0 == null) {
                    synchronized (C9964t93.class) {
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
        C9964t93 c9964t93 = new C9964t93();
        r = c9964t93;
        QX0.u(C9964t93.class, c9964t93);
    }
}
