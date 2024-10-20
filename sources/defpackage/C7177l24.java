package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l24, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7177l24 extends QX0 implements InterfaceC7327lV1 {
    public static final C7177l24 p;
    public static volatile KX0 q;
    public int j;
    public long k;
    public String l = "";
    public int m = -1;
    public int n = -1;
    public boolean o;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"j", "k", "l", "m", C6833k24.a, "n", C6489j24.a, "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7177l24();
            case 4:
                return new C5803h24(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C7177l24.class) {
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
        C7177l24 c7177l24 = new C7177l24();
        p = c7177l24;
        QX0.u(C7177l24.class, c7177l24);
    }
}
