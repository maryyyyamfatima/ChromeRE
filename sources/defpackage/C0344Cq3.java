package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cq3 */
/* loaded from: classes.dex */
public final class C0344Cq3 extends QX0 implements InterfaceC7327lV1 {
    public static final C0344Cq3 k;
    public static volatile KX0 l;
    public String j = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"j"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0344Cq3();
            case 4:
                return new C0214Bq3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C0344Cq3.class) {
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
        C0344Cq3 c0344Cq3 = new C0344Cq3();
        k = c0344Cq3;
        QX0.u(C0344Cq3.class, c0344Cq3);
    }
}
