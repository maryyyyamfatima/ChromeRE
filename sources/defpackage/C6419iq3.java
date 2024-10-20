package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iq3 */
/* loaded from: classes.dex */
public final class C6419iq3 extends QX0 implements InterfaceC7327lV1 {
    public static final C6419iq3 r;
    public static volatile KX0 s;
    public int l;
    public String j = "";
    public String k = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(r, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"j", "k", "l", "m", "n", "o", "p", "q"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6419iq3();
            case 4:
                return new C5732gq3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return r;
            case 6:
                KX0 kx0 = s;
                if (kx0 == null) {
                    synchronized (C6419iq3.class) {
                        kx0 = s;
                        if (kx0 == null) {
                            kx0 = new KX0(r);
                            s = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C6419iq3 c6419iq3 = new C6419iq3();
        r = c6419iq3;
        QX0.u(C6419iq3.class, c6419iq3);
    }
}
