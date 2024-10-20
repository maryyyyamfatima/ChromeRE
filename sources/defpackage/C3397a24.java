package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a24 */
/* loaded from: classes.dex */
public final class C3397a24 extends QX0 implements InterfaceC7327lV1 {
    public static final C3397a24 m;
    public static volatile KX0 n;
    public static final OX0 o;
    public int j;
    public String k = "";
    public AbstractC4147cE l = AbstractC4147cE.g;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3397a24();
            case 4:
                return new JX0(m);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C3397a24.class) {
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
        C3397a24 c3397a24 = new C3397a24();
        m = c3397a24;
        QX0.u(C3397a24.class, c3397a24);
        o = QX0.t(CommandOuterClass$Command.l, c3397a24, c3397a24, null, 170382760, EnumC10540uq4.k, C3397a24.class);
    }
}
