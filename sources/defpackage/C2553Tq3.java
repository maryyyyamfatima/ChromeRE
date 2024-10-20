package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tq3 */
/* loaded from: classes.dex */
public final class C2553Tq3 extends QX0 implements InterfaceC7327lV1 {
    public static final C2553Tq3 p;
    public static volatile KX0 q;
    public C2163Qq3 j;
    public C9168qq3 k;
    public C10539uq3 l;
    public C2683Uq3 m;
    public InterfaceC1377Kp1 n = C8275oE2.i;
    public InterfaceC0857Gp1 o = C0072Ao1.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0007,", new Object[]{"j", "k", "l", "m", "n", C4363cr3.class, "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2553Tq3();
            case 4:
                return new JX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C2553Tq3.class) {
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
        C2553Tq3 c2553Tq3 = new C2553Tq3();
        p = c2553Tq3;
        QX0.u(C2553Tq3.class, c2553Tq3);
    }
}
