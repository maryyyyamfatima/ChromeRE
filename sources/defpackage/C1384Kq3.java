package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kq3 */
/* loaded from: classes.dex */
public final class C1384Kq3 extends QX0 implements InterfaceC7327lV1 {
    public static final C1384Kq3 m;
    public static volatile KX0 n;
    public int j = 0;
    public Object k;
    public int l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"k", "j", "l", C1254Jq3.class, C0084Aq3.class, C0604Eq3.class, C0344Cq3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1384Kq3();
            case 4:
                return new C11911yq3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C1384Kq3.class) {
                        kx0 = n;
                        if (kx0 == null) {
                            kx0 = new KX0(m);
                            n = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C1384Kq3 c1384Kq3 = new C1384Kq3();
        m = c1384Kq3;
        QX0.u(C1384Kq3.class, c1384Kq3);
    }
}
