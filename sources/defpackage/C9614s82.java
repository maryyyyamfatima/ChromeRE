package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s82 */
/* loaded from: classes.dex */
public final class C9614s82 extends QX0 implements InterfaceC7327lV1 {
    public static final C9614s82 j;
    public static volatile KX0 k;
    public static final OX0 l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(j, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9614s82();
            case 4:
                return new JX0(j);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return j;
            case 6:
                KX0 kx0 = k;
                if (kx0 == null) {
                    synchronized (C9614s82.class) {
                        kx0 = k;
                        if (kx0 == null) {
                            kx0 = new KX0(j);
                            k = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C9614s82 c9614s82 = new C9614s82();
        j = c9614s82;
        QX0.u(C9614s82.class, c9614s82);
        Ff4 ff4 = Ff4.y;
        C5493g82 c5493g82 = C5493g82.n;
        l = QX0.t(ff4, c5493g82, c5493g82, null, 4368298, EnumC10540uq4.k, C5493g82.class);
    }
}
