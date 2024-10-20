package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gE0 */
/* loaded from: classes.dex */
public final class C5523gE0 extends MX0 {
    public static final C5523gE0 p;
    public static volatile KX0 q;
    public static final OX0 r;
    public int k;
    public byte o = 2;
    public String l = "";
    public String m = "";
    public String n = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002", new Object[]{"k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5523gE0();
            case 4:
                return new LX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C5523gE0.class) {
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
        C5523gE0 c5523gE0 = new C5523gE0();
        p = c5523gE0;
        QX0.u(C5523gE0.class, c5523gE0);
        r = QX0.t(CommandOuterClass$Command.l, c5523gE0, c5523gE0, null, 342268478, EnumC10540uq4.k, C5523gE0.class);
    }
}
