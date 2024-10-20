package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bk2 */
/* loaded from: classes.dex */
public final class C3977bk2 extends QX0 implements InterfaceC7327lV1 {
    public static final C3977bk2 o;
    public static volatile KX0 p;
    public int j;
    public int k = 0;
    public Object l;
    public boolean m;
    public long n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"l", "k", "j", C3633ak2.class, C3167Yj2.class, "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3977bk2();
            case 4:
                return new C2777Vj2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C3977bk2.class) {
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
        C3977bk2 c3977bk2 = new C3977bk2();
        o = c3977bk2;
        QX0.u(C3977bk2.class, c3977bk2);
    }
}
