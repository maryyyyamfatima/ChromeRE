package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b82 */
/* loaded from: classes.dex */
public final class C3775b82 extends QX0 implements InterfaceC7327lV1 {
    public static final C3775b82 n;
    public static volatile KX0 o;
    public int j;
    public Z72 k;
    public int l;
    public AbstractC4147cE m = AbstractC4147cE.g;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ည\u0002", new Object[]{"j", "k", "l", C3431a82.a, "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3775b82();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C3775b82.class) {
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
        C3775b82 c3775b82 = new C3775b82();
        n = c3775b82;
        QX0.u(C3775b82.class, c3775b82);
    }
}