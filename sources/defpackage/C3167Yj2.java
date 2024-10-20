package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yj2 */
/* loaded from: classes.dex */
public final class C3167Yj2 extends QX0 implements InterfaceC7327lV1 {
    public static final C3167Yj2 s;
    public static volatile KX0 t;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(s, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"j", "k", C3037Xj2.a, "l", "m", "n", "o", "p", "q", "r"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3167Yj2();
            case 4:
                return new C2907Wj2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return s;
            case 6:
                KX0 kx0 = t;
                if (kx0 == null) {
                    synchronized (C3167Yj2.class) {
                        kx0 = t;
                        if (kx0 == null) {
                            kx0 = new KX0(s);
                            t = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C3167Yj2 c3167Yj2 = new C3167Yj2();
        s = c3167Yj2;
        QX0.u(C3167Yj2.class, c3167Yj2);
    }
}
