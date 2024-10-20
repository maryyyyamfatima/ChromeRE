package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9297rD1 extends QX0 implements InterfaceC7327lV1 {
    public static final C9297rD1 k;
    public static volatile KX0 l;
    public InterfaceC1377Kp1 j = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"j", C2017Pn2.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9297rD1();
            case 4:
                return new C8955qD1(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C9297rD1.class) {
                        kx0 = l;
                        if (kx0 == null) {
                            kx0 = new KX0(k);
                            l = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C9297rD1 c9297rD1 = new C9297rD1();
        k = c9297rD1;
        QX0.u(C9297rD1.class, c9297rD1);
    }
}
