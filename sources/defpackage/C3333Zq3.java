package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zq3 */
/* loaded from: classes.dex */
public final class C3333Zq3 extends QX0 implements InterfaceC7327lV1 {
    public static final C3333Zq3 l;
    public static volatile KX0 m;
    public InterfaceC1377Kp1 j;
    public InterfaceC1377Kp1 k;

    public C3333Zq3() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.j = c8275oE2;
        this.k = c8275oE2;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"j", C3203Yq3.class, "k"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3333Zq3();
            case 4:
                return new C2943Wq3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C3333Zq3.class) {
                        kx0 = m;
                        if (kx0 == null) {
                            kx0 = new KX0(l);
                            m = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C3333Zq3 c3333Zq3 = new C3333Zq3();
        l = c3333Zq3;
        QX0.u(C3333Zq3.class, c3333Zq3);
    }
}
