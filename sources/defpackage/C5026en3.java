package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: en3 */
/* loaded from: classes.dex */
public final class C5026en3 extends QX0 implements InterfaceC7327lV1 {
    public static final C5026en3 o;
    public static volatile KX0 p;
    public int j;
    public String k = "";
    public long l;
    public InterfaceC1247Jp1 m;
    public InterfaceC1377Kp1 n;

    public C5026en3() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.m = DI1.i;
        this.n = C8275oE2.i;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"j", "k", "n", C4683dn3.class, "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5026en3();
            case 4:
                return new C3053Xm3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C5026en3.class) {
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
        C5026en3 c5026en3 = new C5026en3();
        o = c5026en3;
        QX0.u(C5026en3.class, c5026en3);
    }
}
