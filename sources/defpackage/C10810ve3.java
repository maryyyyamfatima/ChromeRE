package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ve3 */
/* loaded from: classes.dex */
public final class C10810ve3 extends QX0 implements InterfaceC7327lV1 {
    public static final C10810ve3 m;
    public static volatile KX0 n;
    public int j;
    public float k;
    public float l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"j", "k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10810ve3();
            case 4:
                return new C10467ue3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C10810ve3.class) {
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
        C10810ve3 c10810ve3 = new C10810ve3();
        m = c10810ve3;
        QX0.u(C10810ve3.class, c10810ve3);
    }
}