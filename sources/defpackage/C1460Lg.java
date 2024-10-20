package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460Lg extends MX0 {
    public static final C1460Lg l;
    public static volatile KX0 m;
    public byte k = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1460Lg();
            case 4:
                return new C1330Kg(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (C1460Lg.class) {
                        kx0 = m;
                        if (kx0 == null) {
                            kx0 = new KX0(l);
                            m = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C1460Lg c1460Lg = new C1460Lg();
        l = c1460Lg;
        QX0.u(C1460Lg.class, c1460Lg);
    }
}
