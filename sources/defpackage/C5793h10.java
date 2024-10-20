package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h10 */
/* loaded from: classes.dex */
public final class C5793h10 extends QX0 implements InterfaceC7327lV1 {
    public static final C5793h10 q;
    public static volatile KX0 r;
    public static final OX0 s;
    public int j;
    public C9657sG3 l;
    public C8199o10 m;
    public C6137i10 n;
    public byte p = 2;
    public String k = "";
    public String o = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0003\u0001ဈ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဈ\u0005", new Object[]{"j", "k", "l", "m", "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5793h10();
            case 4:
                return new C5449g10(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C5793h10.class) {
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
        C5793h10 c5793h10 = new C5793h10();
        q = c5793h10;
        QX0.u(C5793h10.class, c5793h10);
        s = QX0.t(C8381oZ3.l, c5793h10, c5793h10, null, 168777401, EnumC10540uq4.k, C5793h10.class);
    }
}
