package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kF2 */
/* loaded from: classes2.dex */
public final class C6904kF2 extends QX0 implements InterfaceC7327lV1 {
    public static final C6904kF2 o;
    public static volatile KX0 p;
    public int j;
    public int k;
    public int l;
    public String m = "";
    public DY n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"j", "k", Q71.a, "l", P71.a, "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6904kF2();
            case 4:
                return new C6560jF2(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C6904kF2.class) {
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
        C6904kF2 c6904kF2 = new C6904kF2();
        o = c6904kF2;
        QX0.u(C6904kF2.class, c6904kF2);
    }
}
