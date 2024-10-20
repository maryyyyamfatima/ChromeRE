package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gL0 */
/* loaded from: classes2.dex */
public final class C5558gL0 extends QX0 implements InterfaceC7327lV1 {
    public static final C5558gL0 n;
    public static volatile KX0 o;
    public InterfaceC1377Kp1 j;
    public InterfaceC1377Kp1 k;
    public long l;
    public C4183cL0 m;

    public C5558gL0() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.j = c8275oE2;
        this.k = c8275oE2;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(n, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0002\u0004\t", new Object[]{"j", C5214fL0.class, "k", C4527dL0.class, "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5558gL0();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C5558gL0.class) {
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
        C5558gL0 c5558gL0 = new C5558gL0();
        n = c5558gL0;
        QX0.u(C5558gL0.class, c5558gL0);
    }
}
