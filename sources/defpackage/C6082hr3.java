package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hr3 */
/* loaded from: classes.dex */
public final class C6082hr3 extends QX0 implements InterfaceC7327lV1 {
    public static final C6082hr3 o;
    public static volatile KX0 p;
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6082hr3();
            case 4:
                return new JX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C6082hr3.class) {
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
        C6082hr3 c6082hr3 = new C6082hr3();
        o = c6082hr3;
        QX0.u(C6082hr3.class, c6082hr3);
    }
}
