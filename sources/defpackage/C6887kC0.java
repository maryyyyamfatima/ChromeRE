package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kC0 */
/* loaded from: classes.dex */
public final class C6887kC0 extends QX0 implements InterfaceC7327lV1 {
    public static final C6887kC0 s;
    public static volatile KX0 t;
    public int j;
    public float k;
    public float l;
    public C2135Ql0 m;
    public C10810ve3 n;
    public int o;
    public int p;
    public boolean q;
    public C1366Kn0 r;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(s, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဉ\u0007", new Object[]{"j", "k", "l", "m", "n", "o", C7575mC0.a, "p", C7231lC0.a, "q", "r"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6887kC0();
            case 4:
                return new C6543jC0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return s;
            case 6:
                KX0 kx0 = t;
                if (kx0 == null) {
                    synchronized (C6887kC0.class) {
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
        C6887kC0 c6887kC0 = new C6887kC0();
        s = c6887kC0;
        QX0.u(C6887kC0.class, c6887kC0);
    }
}
