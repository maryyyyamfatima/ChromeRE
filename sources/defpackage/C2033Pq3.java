package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pq3 */
/* loaded from: classes.dex */
public final class C2033Pq3 extends QX0 implements InterfaceC7327lV1 {
    public static final C2033Pq3 m;
    public static volatile KX0 n;
    public int j = 0;
    public Object k;
    public C3350Zu0 l;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(m, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"k", "j", "l", C1903Oq3.class, C1643Mq3.class, C11568xq3.class, C1384Kq3.class, C1773Nq3.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2033Pq3();
            case 4:
                return new C10882vq3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m;
            case 6:
                KX0 kx0 = n;
                if (kx0 == null) {
                    synchronized (C2033Pq3.class) {
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
        C2033Pq3 c2033Pq3 = new C2033Pq3();
        m = c2033Pq3;
        QX0.u(C2033Pq3.class, c2033Pq3);
    }
}
