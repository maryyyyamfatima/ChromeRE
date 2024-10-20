package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cx0 */
/* loaded from: classes.dex */
public final class C4396cx0 extends QX0 implements InterfaceC7327lV1 {
    public static final C4396cx0 l;
    public static volatile KX0 m;
    public static final OX0 n;
    public int j;
    public AbstractC4147cE k = AbstractC4147cE.g;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"j", "k"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4396cx0();
            case 4:
                return new C4053bx0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C4396cx0.class) {
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
        C4396cx0 c4396cx0 = new C4396cx0();
        l = c4396cx0;
        QX0.u(C4396cx0.class, c4396cx0);
        n = QX0.t(C9657sG3.l, c4396cx0, c4396cx0, null, 169768054, EnumC10540uq4.k, C4396cx0.class);
    }
}
