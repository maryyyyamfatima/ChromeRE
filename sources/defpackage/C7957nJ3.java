package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nJ3 */
/* loaded from: classes5.dex */
public final class C7957nJ3 extends QX0 implements InterfaceC7327lV1 {
    public static final C7957nJ3 o;
    public static volatile KX0 p;
    public int j;
    public Object l;
    public C7269lJ3 n;
    public int k = 0;
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"l", "k", "j", "m", "n", C3247Yz2.class, C6581jJ3.class, C3443aA2.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7957nJ3();
            case 4:
                return new C7613mJ3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C7957nJ3.class) {
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
        C7957nJ3 c7957nJ3 = new C7957nJ3();
        o = c7957nJ3;
        QX0.u(C7957nJ3.class, c7957nJ3);
    }
}
