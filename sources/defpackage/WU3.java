package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WU3 extends QX0 implements InterfaceC7327lV1 {
    public static final WU3 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int j;
    public C4739dx0 l;
    public InterfaceC1377Kp1 k = C8275oE2.i;
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001", new Object[]{"j", "k", C9047qV3.class, "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new WU3();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (WU3.class) {
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
        WU3 wu3 = new WU3();
        n = wu3;
        QX0.u(WU3.class, wu3);
        p = QX0.t(CommandOuterClass$Command.l, wu3, wu3, null, 292553553, EnumC10540uq4.k, WU3.class);
    }
}
