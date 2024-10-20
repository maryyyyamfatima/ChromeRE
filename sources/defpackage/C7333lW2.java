package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lW2 */
/* loaded from: classes2.dex */
public final class C7333lW2 extends QX0 implements InterfaceC7327lV1 {
    public static final C7333lW2 m;
    public static volatile KX0 n;
    public int k;
    public String j = "";
    public InterfaceC1377Kp1 l = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b", new Object[]{"j", "k", "l", C6645jW2.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7333lW2();
            case 4:
                return new C5959hW2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C7333lW2.class) {
                        kx0 = n;
                        if (kx0 == null) {
                            kx0 = new KX0(m);
                            n = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C7333lW2 c7333lW2 = new C7333lW2();
        m = c7333lW2;
        QX0.u(C7333lW2.class, c7333lW2);
    }
}
