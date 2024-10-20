package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vU */
/* loaded from: classes.dex */
public final class C10752vU extends QX0 implements InterfaceC7327lV1 {
    public static final C10752vU j;
    public static volatile KX0 k;
    public static final OX0 l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(j, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10752vU();
            case 4:
                return new JX0(j);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return j;
            case 6:
                KX0 kx0 = k;
                if (kx0 == null) {
                    synchronized (C10752vU.class) {
                        kx0 = k;
                        if (kx0 == null) {
                            kx0 = new KX0(j);
                            k = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C10752vU c10752vU = new C10752vU();
        j = c10752vU;
        QX0.u(C10752vU.class, c10752vU);
        C7950nI1 c7950nI1 = C7950nI1.n;
        C10409uU c10409uU = C10409uU.v;
        l = QX0.t(c7950nI1, c10409uU, c10409uU, null, 336074812, EnumC10540uq4.k, C10409uU.class);
    }
}
