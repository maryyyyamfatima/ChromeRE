package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wi0 */
/* loaded from: classes.dex */
public final class C11174wi0 extends QX0 implements InterfaceC7327lV1 {
    public static final C11174wi0 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int j;
    public String k = "";
    public String l = "";
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C11174wi0();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C11174wi0.class) {
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
        C11174wi0 c11174wi0 = new C11174wi0();
        n = c11174wi0;
        QX0.u(C11174wi0.class, c11174wi0);
        p = QX0.t(C9984tD2.l, c11174wi0, c11174wi0, null, 284051629, EnumC10540uq4.k, C11174wi0.class);
    }
}
