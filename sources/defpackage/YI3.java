package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class YI3 extends QX0 implements InterfaceC7327lV1 {
    public static final YI3 o;
    public static volatile KX0 p;
    public int j;
    public Object l;
    public C7269lJ3 m;
    public int k = 0;
    public String n = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"l", "k", "j", "m", "n", C3247Yz2.class, C3443aA2.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new YI3();
            case 4:
                return new XI3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (YI3.class) {
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
        YI3 yi3 = new YI3();
        o = yi3;
        QX0.u(YI3.class, yi3);
    }
}
