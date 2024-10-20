package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: an2 */
/* loaded from: classes.dex */
public final class C3651an2 extends QX0 implements InterfaceC7327lV1 {
    public static final C3651an2 u;
    public static volatile KX0 v;
    public int j;
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(u, "\u0001\n\u0000\u0001\u0002\u0011\n\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010", new Object[]{"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3651an2();
            case 4:
                return new JX0(u);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return u;
            case 6:
                KX0 kx0 = v;
                if (kx0 == null) {
                    synchronized (C3651an2.class) {
                        kx0 = v;
                        if (kx0 == null) {
                            kx0 = new KX0(u);
                            v = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C3651an2 c3651an2 = new C3651an2();
        u = c3651an2;
        QX0.u(C3651an2.class, c3651an2);
    }
}
