package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eL0 */
/* loaded from: classes2.dex */
public final class C4870eL0 extends QX0 implements InterfaceC7327lV1 {
    public static final C4870eL0 m;
    public static volatile KX0 n;
    public Object k;
    public int j = 0;
    public String l = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȉ\u0003<\u0000\u0004<\u0000", new Object[]{"k", "j", C5902hL0.class, "l", C6246iL0.class, C3496aL0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4870eL0();
            case 4:
                return new JX0(m);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C4870eL0.class) {
                        kx0 = n;
                        if (kx0 == null) {
                            kx0 = new KX0(m);
                            n = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C4870eL0 c4870eL0 = new C4870eL0();
        m = c4870eL0;
        QX0.u(C4870eL0.class, c4870eL0);
    }
}
