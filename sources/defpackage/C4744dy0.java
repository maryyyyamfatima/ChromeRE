package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dy0 */
/* loaded from: classes.dex */
public final class C4744dy0 extends QX0 implements InterfaceC7327lV1 {
    public static final C4744dy0 p;
    public static volatile KX0 q;
    public int j;
    public String k = "";
    public C2975Wx0 l;
    public C4057by0 m;
    public C4057by0 n;
    public C4057by0 o;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"j", "k", "l", "m", "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4744dy0();
            case 4:
                return new C4401cy0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C4744dy0.class) {
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
        C4744dy0 c4744dy0 = new C4744dy0();
        p = c4744dy0;
        QX0.u(C4744dy0.class, c4744dy0);
    }
}
