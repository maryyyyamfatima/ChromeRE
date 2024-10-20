package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xp0 */
/* loaded from: classes.dex */
public final class C11559xp0 extends MX0 {
    public static final C11559xp0 m;
    public static volatile KX0 n;
    public byte l = 2;
    public InterfaceC1377Kp1 k = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(m, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"k", C5325fg0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C11559xp0();
            case 4:
                return new LX0(m);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C11559xp0.class) {
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
        C11559xp0 c11559xp0 = new C11559xp0();
        m = c11559xp0;
        QX0.u(C11559xp0.class, c11559xp0);
    }
}
