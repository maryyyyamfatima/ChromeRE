package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o84 */
/* loaded from: classes.dex */
public final class C8245o84 extends MX0 {
    public static final C8245o84 q;
    public static volatile KX0 r;
    public static final OX0 s;
    public int k;
    public OL1 o = OL1.g;
    public byte p = 2;
    public int l = -1;
    public String m = "";
    public int n = -1;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0001\u0000\u0000\u0001င\u0000\u0005ဈ\u0005\u0006င\u0006\u000b2", new Object[]{"k", "l", "m", "n", "o", AbstractC7213l84.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8245o84();
            case 4:
                return new LX0(q);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C8245o84.class) {
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
        C8245o84 c8245o84 = new C8245o84();
        q = c8245o84;
        QX0.u(C8245o84.class, c8245o84);
        s = QX0.t(C7950nI1.n, c8245o84, c8245o84, null, 270923820, EnumC10540uq4.k, C8245o84.class);
    }
}
