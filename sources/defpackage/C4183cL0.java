package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cL0 */
/* loaded from: classes2.dex */
public final class C4183cL0 extends QX0 implements InterfaceC7327lV1 {
    public static final C4183cL0 o;
    public static volatile KX0 p;
    public boolean l;
    public boolean m;
    public String j = "";
    public String k = "";
    public AbstractC4147cE n = AbstractC4147cE.g;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(o, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\u0007\u0006\n", new Object[]{"j", "k", "l", "m", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4183cL0();
            case 4:
                return new C3840bL0(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C4183cL0.class) {
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
        C4183cL0 c4183cL0 = new C4183cL0();
        o = c4183cL0;
        QX0.u(C4183cL0.class, c4183cL0);
    }
}
