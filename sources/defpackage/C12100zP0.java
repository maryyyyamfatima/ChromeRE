package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zP0 */
/* loaded from: classes.dex */
public final class C12100zP0 extends QX0 implements InterfaceC7327lV1 {
    public static final C12100zP0 n;
    public static volatile KX0 o;
    public int j;
    public Object l;
    public int k = 0;
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001း\u0000\u0002်\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0005ွ\u0000\nဈ\u0000", new Object[]{"l", "k", "j", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C12100zP0();
            case 4:
                return new C11757yP0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C12100zP0.class) {
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
        C12100zP0 c12100zP0 = new C12100zP0();
        n = c12100zP0;
        QX0.u(C12100zP0.class, c12100zP0);
    }
}
