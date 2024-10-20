package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zb4 */
/* loaded from: classes.dex */
public final class C12165zb4 extends QX0 implements InterfaceC7327lV1 {
    public static final C12165zb4 s;
    public static volatile KX0 t;
    public static final OX0 u;
    public int j;
    public float k;
    public C9156qo3 l;
    public boolean n;
    public C2317Rv2 o;
    public C10409uU p;
    public byte r = 2;
    public String m = "";
    public String q = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(s, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0001\u0002ခ\u0000\u0003ဉ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\u0007ဉ\u0004\bᐉ\u0005\tဈ\u0006", new Object[]{"j", "k", "l", "m", "n", "o", "p", "q"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C12165zb4();
            case 4:
                return new JX0(s);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return s;
            case 6:
                KX0 kx0 = t;
                if (kx0 == null) {
                    synchronized (C12165zb4.class) {
                        kx0 = t;
                        if (kx0 == null) {
                            kx0 = new KX0(s);
                            t = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C12165zb4 c12165zb4 = new C12165zb4();
        s = c12165zb4;
        QX0.u(C12165zb4.class, c12165zb4);
        u = QX0.t(C8381oZ3.l, c12165zb4, c12165zb4, null, 284091084, EnumC10540uq4.k, C12165zb4.class);
    }
}
