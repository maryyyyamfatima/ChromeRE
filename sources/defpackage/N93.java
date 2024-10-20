package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N93 extends QX0 implements InterfaceC7327lV1 {
    public static final N93 q;
    public static volatile KX0 r;
    public static final OX0 s;
    public int j;
    public int m;
    public CommandOuterClass$Command n;
    public CommandOuterClass$Command o;
    public byte p = 2;
    public String k = "";
    public String l = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"j", "k", "l", "m", L93.a, "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new N93();
            case 4:
                return new JX0(q);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (N93.class) {
                        kx0 = r;
                        if (kx0 == null) {
                            kx0 = new KX0(q);
                            r = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        N93 n93 = new N93();
        q = n93;
        QX0.u(N93.class, n93);
        s = QX0.t(CommandOuterClass$Command.l, n93, n93, null, 232159216, EnumC10540uq4.k, N93.class);
    }
}
