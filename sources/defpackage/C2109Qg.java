package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qg */
/* loaded from: classes.dex */
public final class C2109Qg extends QX0 implements InterfaceC7327lV1 {
    public static final C2109Qg p;
    public static volatile KX0 q;
    public int j;
    public Object l;
    public int m;
    public C1719Ng n;
    public int k = 0;
    public String o = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0001\u0001\u0001d\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0004\u0004ဵ\u0000\u0005ျ\u0000dဈ\u0005", new Object[]{"l", "k", "j", "m", C1979Pg.a, "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2109Qg();
            case 4:
                return new C1849Og(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C2109Qg.class) {
                        kx0 = q;
                        if (kx0 == null) {
                            kx0 = new KX0(p);
                            q = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C2109Qg c2109Qg = new C2109Qg();
        p = c2109Qg;
        QX0.u(C2109Qg.class, c2109Qg);
    }
}
