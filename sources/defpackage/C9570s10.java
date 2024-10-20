package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9570s10 extends QX0 implements InterfaceC7327lV1 {
    public static final C9570s10 k;
    public static volatile KX0 l;
    public static final OX0 m;
    public OL1 j = OL1.g;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(k, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"j", AbstractC9227r10.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9570s10();
            case 4:
                return new C8885q10(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (C9570s10.class) {
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
        C9570s10 c9570s10 = new C9570s10();
        k = c9570s10;
        QX0.u(C9570s10.class, c9570s10);
        m = QX0.t(C8199o10.l, c9570s10, c9570s10, null, 188495463, EnumC10540uq4.k, C9570s10.class);
    }
}
