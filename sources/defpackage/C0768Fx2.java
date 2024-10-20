package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fx2 */
/* loaded from: classes2.dex */
public final class C0768Fx2 extends QX0 implements InterfaceC7327lV1 {
    public static final C0768Fx2 o;
    public static volatile KX0 p;
    public int j;
    public int k = 0;
    public Object l;
    public C0638Ex2 m;
    public int n;

    public C0768Fx2() {
        C8275oE2 c8275oE2 = C8275oE2.i;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0001\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဌ\u0001\u0005ြ\u0000", new Object[]{"l", "k", "j", "m", "n", C1547Lx2.a, C10993w93.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0768Fx2();
            case 4:
                return new C0508Dx2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C0768Fx2.class) {
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
        C0768Fx2 c0768Fx2 = new C0768Fx2();
        o = c0768Fx2;
        QX0.u(C0768Fx2.class, c0768Fx2);
    }
}
