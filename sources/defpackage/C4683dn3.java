package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dn3 */
/* loaded from: classes.dex */
public final class C4683dn3 extends QX0 implements InterfaceC7327lV1 {
    public static final C4683dn3 m;
    public static volatile KX0 n;
    public int j;
    public InterfaceC1377Kp1 k = C8275oE2.i;
    public C4339cn3 l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"j", "k", C3652an3.class, "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4683dn3();
            case 4:
                return new C3183Ym3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C4683dn3.class) {
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
        C4683dn3 c4683dn3 = new C4683dn3();
        m = c4683dn3;
        QX0.u(C4683dn3.class, c4683dn3);
    }
}
