package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x24 */
/* loaded from: classes.dex */
public final class C11295x24 extends QX0 implements InterfaceC7327lV1 {
    public static final C11295x24 n;
    public static volatile KX0 o;
    public int j;
    public int k;
    public String l;
    public byte m = 2;

    public C11295x24() {
        DI1 di1 = DI1.i;
        this.l = "";
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0006ဈ\u0003", new Object[]{"j", "k", R4.a, "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C11295x24();
            case 4:
                return new JX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C11295x24.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C11295x24 c11295x24 = new C11295x24();
        n = c11295x24;
        QX0.u(C11295x24.class, c11295x24);
    }
}
