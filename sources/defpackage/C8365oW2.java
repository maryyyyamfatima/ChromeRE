package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oW2 */
/* loaded from: classes2.dex */
public final class C8365oW2 extends QX0 implements InterfaceC7327lV1 {
    public static final C8365oW2 o;
    public static volatile KX0 p;
    public int j;
    public long k;
    public InterfaceC1377Kp1 l = C8275oE2.i;
    public int m;
    public boolean n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u0002\u0003\u001b\u0004\f\u0005\u0007", new Object[]{"j", "k", "l", C7333lW2.class, "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C8365oW2();
            case 4:
                return new C5615gW2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C8365oW2.class) {
                        kx0 = p;
                        if (kx0 == null) {
                            kx0 = new KX0(o);
                            p = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C8365oW2 c8365oW2 = new C8365oW2();
        o = c8365oW2;
        QX0.u(C8365oW2.class, c8365oW2);
    }
}
