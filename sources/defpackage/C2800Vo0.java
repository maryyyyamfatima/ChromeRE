package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vo0 */
/* loaded from: classes.dex */
public final class C2800Vo0 extends QX0 implements InterfaceC7327lV1 {
    public static final C2800Vo0 m;
    public static volatile KX0 n;
    public static final OX0 o;
    public int j;
    public int k;
    public int l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"j", "k", C2670Uo0.a, "l", C2540To0.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2800Vo0();
            case 4:
                return new C2410So0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C2800Vo0.class) {
                        kx0 = n;
                        if (kx0 == null) {
                            kx0 = new KX0(m);
                            n = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C2800Vo0 c2800Vo0 = new C2800Vo0();
        m = c2800Vo0;
        QX0.u(C2800Vo0.class, c2800Vo0);
        o = QX0.t(C1460Lg.l, c2800Vo0, c2800Vo0, null, 375975159, EnumC10540uq4.k, C2800Vo0.class);
    }
}
