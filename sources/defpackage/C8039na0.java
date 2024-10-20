package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: na0 */
/* loaded from: classes.dex */
public final class C8039na0 extends QX0 implements InterfaceC7327lV1 {
    public static final C8039na0 o;
    public static volatile KX0 p;
    public int j;
    public Object l;
    public int k = 0;
    public String m = "";
    public InterfaceC1377Kp1 n = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001း\u0000\u0002ဈ\u0002\u0003\u001b\u0004ဵ\u0000", new Object[]{"l", "k", "j", "m", "n", C7351la0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8039na0();
            case 4:
                return new C7695ma0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C8039na0.class) {
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
        C8039na0 c8039na0 = new C8039na0();
        o = c8039na0;
        QX0.u(C8039na0.class, c8039na0);
    }
}
