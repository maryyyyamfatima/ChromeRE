package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dg3 */
/* loaded from: classes.dex */
public final class C4641dg3 extends QX0 implements InterfaceC7327lV1 {
    public static final C4641dg3 q;
    public static volatile KX0 r;
    public int j;
    public long n;
    public long o;
    public String k = "";
    public AbstractC4147cE l = AbstractC4147cE.g;
    public String m = "";
    public InterfaceC1377Kp1 p = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"j", "k", "l", "m", "n", "p", C5328fg3.class, "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4641dg3();
            case 4:
                return new C4297cg3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C4641dg3.class) {
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
        C4641dg3 c4641dg3 = new C4641dg3();
        q = c4641dg3;
        QX0.u(C4641dg3.class, c4641dg3);
    }
}
