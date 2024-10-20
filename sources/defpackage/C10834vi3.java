package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vi3 */
/* loaded from: classes.dex */
public final class C10834vi3 extends QX0 implements InterfaceC7327lV1 {
    public static final C10834vi3 p;
    public static volatile KX0 q;
    public int j;
    public long k;
    public C8777pi3 l;
    public boolean n;
    public byte o = 2;
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001\u0004ဈ\u0003\u0006ဇ\u0005", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10834vi3();
            case 4:
                return new C10491ui3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C10834vi3.class) {
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
        C10834vi3 c10834vi3 = new C10834vi3();
        p = c10834vi3;
        QX0.u(C10834vi3.class, c10834vi3);
    }
}
