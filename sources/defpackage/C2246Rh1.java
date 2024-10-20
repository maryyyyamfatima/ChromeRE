package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rh1 */
/* loaded from: classes.dex */
public final class C2246Rh1 extends QX0 implements InterfaceC7327lV1 {
    public static final C2246Rh1 o;
    public static volatile KX0 p;
    public int j;
    public int k = 0;
    public Object l;
    public int m;
    public int n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ွ\u0000\u0003ြ\u0000\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"l", "k", "j", C1726Nh1.class, "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2246Rh1();
            case 4:
                return new C2116Qh1(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C2246Rh1.class) {
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
        C2246Rh1 c2246Rh1 = new C2246Rh1();
        o = c2246Rh1;
        QX0.u(C2246Rh1.class, c2246Rh1);
    }
}
