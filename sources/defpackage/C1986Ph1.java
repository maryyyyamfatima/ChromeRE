package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ph1 */
/* loaded from: classes.dex */
public final class C1986Ph1 extends QX0 implements InterfaceC7327lV1 {
    public static final C1986Ph1 l;
    public static volatile KX0 m;
    public byte k = 2;
    public InterfaceC1377Kp1 j = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"j", C2246Rh1.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1986Ph1();
            case 4:
                return new C1856Oh1(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C1986Ph1.class) {
                        kx0 = m;
                        if (kx0 == null) {
                            kx0 = new KX0(l);
                            m = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C1986Ph1 c1986Ph1 = new C1986Ph1();
        l = c1986Ph1;
        QX0.u(C1986Ph1.class, c1986Ph1);
    }
}
