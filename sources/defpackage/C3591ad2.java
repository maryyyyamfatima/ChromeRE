package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ad2 */
/* loaded from: classes2.dex */
public final class C3591ad2 extends QX0 implements InterfaceC7327lV1 {
    public static final C3591ad2 o;
    public static volatile KX0 p;
    public int j;
    public int k = 0;
    public Object l;
    public C10721vN3 m;
    public C10721vN3 n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"l", "k", "j", "m", "n", C3262Zc2.class, C2465Sz0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3591ad2();
            case 4:
                return new C3002Xc2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C3591ad2.class) {
                        kx0 = p;
                        if (kx0 == null) {
                            kx0 = new KX0(o);
                            p = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C3591ad2 c3591ad2 = new C3591ad2();
        o = c3591ad2;
        QX0.u(C3591ad2.class, c3591ad2);
    }
}
