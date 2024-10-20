package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eJ3 */
/* loaded from: classes5.dex */
public final class C4863eJ3 extends QX0 implements InterfaceC7327lV1 {
    public static final C4863eJ3 o;
    public static volatile KX0 p;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4863eJ3();
            case 4:
                return new C4520dJ3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C4863eJ3.class) {
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
        C4863eJ3 c4863eJ3 = new C4863eJ3();
        o = c4863eJ3;
        QX0.u(C4863eJ3.class, c4863eJ3);
    }
}
