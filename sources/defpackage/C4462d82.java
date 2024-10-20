package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d82 */
/* loaded from: classes.dex */
public final class C4462d82 extends QX0 implements InterfaceC7327lV1 {
    public static final C4462d82 q;
    public static volatile KX0 r;
    public int j;
    public long l;
    public C1038Hz2 n;
    public C1038Hz2 o;
    public long p;
    public String k = "";
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဃ\u0005", new Object[]{"j", "k", "l", "m", "n", "o", "p"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4462d82();
            case 4:
                return new JX0(q);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C4462d82.class) {
                        kx0 = r;
                        if (kx0 == null) {
                            kx0 = new KX0(q);
                            r = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C4462d82 c4462d82 = new C4462d82();
        q = c4462d82;
        QX0.u(C4462d82.class, c4462d82);
    }
}
