package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: so4 */
/* loaded from: classes2.dex */
public final class C9842so4 extends QX0 implements InterfaceC7327lV1 {
    public static final C9842so4 n;
    public static volatile KX0 o;
    public int j;
    public String k = "";
    public C10721vN3 l;
    public int m;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"j", "k", "l", "m", C9499ro4.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9842so4();
            case 4:
                return new C9157qo4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C9842so4.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C9842so4 c9842so4 = new C9842so4();
        n = c9842so4;
        QX0.u(C9842so4.class, c9842so4);
    }
}
