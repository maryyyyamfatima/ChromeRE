package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jg */
/* loaded from: classes.dex */
public final class C1200Jg extends QX0 implements InterfaceC7327lV1 {
    public static final C1200Jg o;
    public static volatile KX0 p;
    public int j;
    public C2109Qg k;
    public C10668vD0 l;
    public C1460Lg m;
    public byte n = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1200Jg();
            case 4:
                return new C1070Ig(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C1200Jg.class) {
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
        C1200Jg c1200Jg = new C1200Jg();
        o = c1200Jg;
        QX0.u(C1200Jg.class, c1200Jg);
    }
}
