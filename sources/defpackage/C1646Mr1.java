package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mr1 */
/* loaded from: classes.dex */
public final class C1646Mr1 extends QX0 implements InterfaceC7327lV1 {
    public static final C1646Mr1 l;
    public static volatile KX0 m;
    public static final OX0 n;
    public int j;
    public C2166Qr1 k;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"j", "k"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1646Mr1();
            case 4:
                return new JX0(l);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C1646Mr1.class) {
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
        C1646Mr1 c1646Mr1 = new C1646Mr1();
        l = c1646Mr1;
        QX0.u(C1646Mr1.class, c1646Mr1);
        n = QX0.t(CommandOuterClass$Command.l, c1646Mr1, c1646Mr1, null, 434524685, EnumC10540uq4.k, C1646Mr1.class);
    }
}
