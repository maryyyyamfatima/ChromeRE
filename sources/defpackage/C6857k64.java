package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k64 */
/* loaded from: classes.dex */
public final class C6857k64 extends QX0 implements InterfaceC7327lV1 {
    public static final C6857k64 p;
    public static volatile KX0 q;
    public R54 j;
    public C8570p54 k;
    public C9941t54 l;
    public C7545m64 m;
    public InterfaceC1377Kp1 n = C8275oE2.i;
    public InterfaceC0857Gp1 o = C0072Ao1.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0007,", new Object[]{"j", "k", "l", "m", "n", C9604s64.class, "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6857k64();
            case 4:
                return new C6513j64(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C6857k64.class) {
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
        C6857k64 c6857k64 = new C6857k64();
        p = c6857k64;
        QX0.u(C6857k64.class, c6857k64);
    }
}
