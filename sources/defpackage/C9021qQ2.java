package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qQ2 */
/* loaded from: classes.dex */
public final class C9021qQ2 extends QX0 implements InterfaceC7327lV1 {
    public static final C9021qQ2 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int j;
    public int k;
    public int l;
    public boolean m = true;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9021qQ2();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C9021qQ2.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C9021qQ2 c9021qQ2 = new C9021qQ2();
        n = c9021qQ2;
        QX0.u(C9021qQ2.class, c9021qQ2);
        p = QX0.t(C9498ro3.l, c9021qQ2, c9021qQ2, null, 188911708, EnumC10540uq4.k, C9021qQ2.class);
    }
}
