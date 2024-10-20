package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sj2 */
/* loaded from: classes.dex */
public final class C2387Sj2 extends QX0 implements InterfaceC7327lV1 {
    public static final C2387Sj2 q;
    public static volatile KX0 r;
    public int j;
    public int k;
    public int l;
    public long m;
    public C2127Qj2 n;
    public float o;
    public InterfaceC1377Kp1 p = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0006\u0000\u0001\u0001\u0017\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0005ဉ\u0003\u0007ခ\u0004\u0017\u001b", new Object[]{"j", "k", C2647Uj2.a, "l", C2517Tj2.a, "m", "n", "o", "p", C3977bk2.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2387Sj2();
            case 4:
                return new C2257Rj2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C2387Sj2.class) {
                        kx0 = r;
                        if (kx0 == null) {
                            kx0 = new KX0(q);
                            r = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C2387Sj2 c2387Sj2 = new C2387Sj2();
        q = c2387Sj2;
        QX0.u(C2387Sj2.class, c2387Sj2);
    }
}
