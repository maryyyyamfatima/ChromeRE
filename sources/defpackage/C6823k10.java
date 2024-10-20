package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k10 */
/* loaded from: classes.dex */
public final class C6823k10 extends QX0 implements InterfaceC7327lV1 {
    public static final C6823k10 m;
    public static volatile KX0 n;
    public static final OX0 o;
    public int j;
    public InterfaceC1377Kp1 k = C8275oE2.i;
    public int l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"j", "k", C7167l10.class, "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6823k10();
            case 4:
                return new JX0(m);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C6823k10.class) {
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
        C6823k10 c6823k10 = new C6823k10();
        m = c6823k10;
        QX0.u(C6823k10.class, c6823k10);
        o = QX0.t(C6137i10.l, c6823k10, c6823k10, null, 188490103, EnumC10540uq4.k, C6823k10.class);
    }
}
