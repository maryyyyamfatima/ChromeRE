package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bp0 */
/* loaded from: classes.dex */
public final class C0206Bp0 extends QX0 implements InterfaceC7327lV1 {
    public static final C0206Bp0 l;
    public static volatile KX0 m;
    public static final OX0 n;
    public int j;
    public int k;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"j", "k"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0206Bp0();
            case 4:
                return new C0076Ap0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C0206Bp0.class) {
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
        C0206Bp0 c0206Bp0 = new C0206Bp0();
        l = c0206Bp0;
        QX0.u(C0206Bp0.class, c0206Bp0);
        n = QX0.t(SenderStateOuterClass$SenderState.l, c0206Bp0, c0206Bp0, null, 314605390, EnumC10540uq4.k, C0206Bp0.class);
    }
}
