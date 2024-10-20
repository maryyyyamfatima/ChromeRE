package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ap0 */
/* loaded from: classes.dex */
public final class C3661ap0 extends MX0 {
    public static final C3661ap0 p;
    public static volatile KX0 q;
    public static final OX0 r;
    public int k;
    public boolean l;
    public C8908q5 m;
    public byte o = 2;
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
                return QX0.s(p, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0003ᐉ\u0001\u0005ဈ\u0002", new Object[]{"k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3661ap0();
            case 4:
                return new LX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C3661ap0.class) {
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
        C3661ap0 c3661ap0 = new C3661ap0();
        p = c3661ap0;
        QX0.u(C3661ap0.class, c3661ap0);
        r = QX0.t(C9984tD2.l, c3661ap0, c3661ap0, null, 276276193, EnumC10540uq4.k, C3661ap0.class);
    }
}
