package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: md2 */
/* loaded from: classes2.dex */
public final class C7715md2 extends QX0 implements InterfaceC7327lV1 {
    public static final C7715md2 j;
    public static volatile KX0 k;

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
                return new C7715md2();
            case 4:
                return new JX0(j);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return j;
            case 6:
                KX0 kx0 = k;
                if (kx0 == null) {
                    synchronized (C7715md2.class) {
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
        C7715md2 c7715md2 = new C7715md2();
        j = c7715md2;
        QX0.u(C7715md2.class, c7715md2);
    }
}
