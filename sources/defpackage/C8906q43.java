package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q43 */
/* loaded from: classes.dex */
public final class C8906q43 extends QX0 implements InterfaceC7327lV1 {
    public static final C8906q43 j;
    public static volatile KX0 k;

    public C8906q43() {
        C8275oE2 c8275oE2 = C8275oE2.i;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(j, "\u0000\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8906q43();
            case 4:
                return new JX0(j);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return j;
            case 6:
                KX0 kx0 = k;
                if (kx0 == null) {
                    synchronized (C8906q43.class) {
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
        C8906q43 c8906q43 = new C8906q43();
        j = c8906q43;
        QX0.u(C8906q43.class, c8906q43);
    }
}