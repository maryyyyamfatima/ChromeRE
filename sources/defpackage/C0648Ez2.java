package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ez2 */
/* loaded from: classes2.dex */
public final class C0648Ez2 extends QX0 implements InterfaceC7327lV1 {
    public static final C0648Ez2 p;
    public static volatile KX0 q;
    public int j;
    public C1038Hz2 m;
    public long n;
    public String k = "";
    public String l = "";
    public String o = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005စ\u0004\u0007ဈ\u0006", new Object[]{"j", "k", "l", "m", "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0648Ez2();
            case 4:
                return new JX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C0648Ez2.class) {
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
        C0648Ez2 c0648Ez2 = new C0648Ez2();
        p = c0648Ez2;
        QX0.u(C0648Ez2.class, c0648Ez2);
    }
}
