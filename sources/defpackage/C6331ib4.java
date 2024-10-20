package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ib4 */
/* loaded from: classes.dex */
public final class C6331ib4 extends QX0 implements InterfaceC7327lV1 {
    public static final C6331ib4 o;
    public static volatile KX0 p;
    public int j;
    public String k = "";
    public InterfaceC1377Kp1 l = C8275oE2.i;
    public String m = "";
    public int n;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဌ\u0002", new Object[]{"j", "k", "l", C3323Zo3.class, "m", "n", TE2.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C6331ib4();
            case 4:
                return new JX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C6331ib4.class) {
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
        C6331ib4 c6331ib4 = new C6331ib4();
        o = c6331ib4;
        QX0.u(C6331ib4.class, c6331ib4);
    }
}
