package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2479Tc extends QX0 implements InterfaceC7327lV1 {
    public static final C2479Tc k;
    public static volatile KX0 l;
    public AbstractC4147cE j = AbstractC4147cE.g;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"j"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2479Tc();
            case 4:
                return new JX0(k);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C2479Tc.class) {
                        kx0 = l;
                        if (kx0 == null) {
                            kx0 = new KX0(k);
                            l = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C2479Tc c2479Tc = new C2479Tc();
        k = c2479Tc;
        QX0.u(C2479Tc.class, c2479Tc);
    }
}
