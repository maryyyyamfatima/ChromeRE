package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qr3 */
/* loaded from: classes.dex */
public final class C9174qr3 extends QX0 implements InterfaceC7327lV1 {
    public static final C9174qr3 o;
    public static volatile KX0 p;
    public int j;
    public boolean m;
    public String k = "";
    public InterfaceC1377Kp1 l = C8275oE2.i;
    public String n = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007\u0004ለ\u0000", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9174qr3();
            case 4:
                return new C8831pr3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C9174qr3.class) {
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
        C9174qr3 c9174qr3 = new C9174qr3();
        o = c9174qr3;
        QX0.u(C9174qr3.class, c9174qr3);
    }
}
