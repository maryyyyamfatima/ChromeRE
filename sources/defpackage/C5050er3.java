package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: er3 */
/* loaded from: classes.dex */
public final class C5050er3 extends QX0 implements InterfaceC7327lV1 {
    public static final C5050er3 p;
    public static volatile KX0 q;
    public int j;
    public int k;
    public InterfaceC0857Gp1 l = C0072Ao1.i;
    public String m = "";
    public String n = "";
    public InterfaceC1377Kp1 o = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(p, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"j", "k", "l", "m", "n", "o", C4706dr3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5050er3();
            case 4:
                return new JX0(p);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return p;
            case 6:
                KX0 kx0 = q;
                if (kx0 == null) {
                    synchronized (C5050er3.class) {
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
        C5050er3 c5050er3 = new C5050er3();
        p = c5050er3;
        QX0.u(C5050er3.class, c5050er3);
    }
}
