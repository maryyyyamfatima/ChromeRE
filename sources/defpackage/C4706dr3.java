package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dr3 */
/* loaded from: classes.dex */
public final class C4706dr3 extends QX0 implements InterfaceC7327lV1 {
    public static final C4706dr3 l;
    public static volatile KX0 m;
    public InterfaceC0857Gp1 j = C0072Ao1.i;
    public C4014bq3 k;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(l, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002\t", new Object[]{"j", "k"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4706dr3();
            case 4:
                return new JX0(l);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C4706dr3.class) {
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
        C4706dr3 c4706dr3 = new C4706dr3();
        l = c4706dr3;
        QX0.u(C4706dr3.class, c4706dr3);
    }
}
