package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vg0 */
/* loaded from: classes.dex */
public final class C10819vg0 extends QX0 implements InterfaceC7327lV1 {
    public static final C10819vg0 o;
    public static volatile KX0 p;
    public int j;
    public int l;
    public C11162wg0 m;
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
                return QX0.s(o, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002", new Object[]{"j", "k", "l", C11505xg0.a, "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10819vg0();
            case 4:
                return new JX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C10819vg0.class) {
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
        C10819vg0 c10819vg0 = new C10819vg0();
        o = c10819vg0;
        QX0.u(C10819vg0.class, c10819vg0);
    }
}
