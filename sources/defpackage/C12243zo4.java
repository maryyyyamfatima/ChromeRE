package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zo4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12243zo4 extends QX0 implements InterfaceC7327lV1 {
    public static final C12243zo4 n;
    public static volatile KX0 o;
    public int j;
    public String k = "";
    public C10871vo4 l;
    public int m;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"j", "k", "l", "m", C11900yo4.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C12243zo4();
            case 4:
                return new C11214wo4(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C12243zo4.class) {
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
        C12243zo4 c12243zo4 = new C12243zo4();
        n = c12243zo4;
        QX0.u(C12243zo4.class, c12243zo4);
    }
}