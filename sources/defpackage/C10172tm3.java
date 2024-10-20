package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tm3 */
/* loaded from: classes.dex */
public final class C10172tm3 extends QX0 implements InterfaceC7327lV1 {
    public static final C10172tm3 o;
    public static volatile KX0 p;
    public int j;
    public InterfaceC1377Kp1 k = C8275oE2.i;
    public String l = "";
    public boolean m;
    public C11064wN3 n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"j", "k", C9486rm3.class, "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C10172tm3();
            case 4:
                return new C9829sm3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C10172tm3.class) {
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
        C10172tm3 c10172tm3 = new C10172tm3();
        o = c10172tm3;
        QX0.u(C10172tm3.class, c10172tm3);
    }
}
