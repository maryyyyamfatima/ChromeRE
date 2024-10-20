package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775Fz extends QX0 implements InterfaceC7327lV1 {
    public static final C0775Fz p;
    public static volatile KX0 q;
    public int j;
    public long k;
    public boolean l;
    public String m = "";
    public String n = "";
    public long o;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"j", "k", "l", "m", "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0775Fz();
            case 4:
                return new JX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C0775Fz.class) {
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
        C0775Fz c0775Fz = new C0775Fz();
        p = c0775Fz;
        QX0.u(C0775Fz.class, c0775Fz);
    }
}
