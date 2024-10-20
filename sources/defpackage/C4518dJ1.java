package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4518dJ1 extends QX0 implements InterfaceC7327lV1 {
    public static final C4518dJ1 o;
    public static volatile KX0 p;
    public static final OX0 q;
    public int j;
    public float l;
    public CommandOuterClass$Command m;
    public byte n = 2;
    public String k = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ခ\u0001\u0003ᐉ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4518dJ1();
            case 4:
                return new JX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C4518dJ1.class) {
                        kx0 = p;
                        if (kx0 == null) {
                            kx0 = new KX0(o);
                            p = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C4518dJ1 c4518dJ1 = new C4518dJ1();
        o = c4518dJ1;
        QX0.u(C4518dJ1.class, c4518dJ1);
        q = QX0.t(CommandOuterClass$Command.l, c4518dJ1, c4518dJ1, null, 315252720, EnumC10540uq4.k, C4518dJ1.class);
    }
}
