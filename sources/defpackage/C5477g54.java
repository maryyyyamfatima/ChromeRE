package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g54 */
/* loaded from: classes.dex */
public final class C5477g54 extends QX0 implements InterfaceC7327lV1 {
    public static final C5477g54 p;
    public static volatile KX0 q;
    public int k;
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"j", "k", "l", "m", "n", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5477g54();
            case 4:
                return new C4789e54(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C5477g54.class) {
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
        C5477g54 c5477g54 = new C5477g54();
        p = c5477g54;
        QX0.u(C5477g54.class, c5477g54);
    }
}
