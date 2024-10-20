package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pi3 */
/* loaded from: classes.dex */
public final class C8777pi3 extends QX0 implements InterfaceC7327lV1 {
    public static final C8777pi3 p;
    public static volatile KX0 q;
    public int j;
    public C8090ni3 k;
    public C9462ri3 l;
    public C10148ti3 n;
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
                return QX0.s(p, "\u0001\u0004\u0000\u0001\u0006\r\u0004\u0000\u0000\u0000\u0006ဉ\u0002\tဉ\u0003\nဈ\u0004\rဉ\u0005", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8777pi3();
            case 4:
                return new C8434oi3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C8777pi3.class) {
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
        C8777pi3 c8777pi3 = new C8777pi3();
        p = c8777pi3;
        QX0.u(C8777pi3.class, c8777pi3);
    }
}
