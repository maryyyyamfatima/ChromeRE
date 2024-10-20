package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zf2 */
/* loaded from: classes.dex */
public final class C3277Zf2 extends QX0 implements InterfaceC7327lV1 {
    public static final C3277Zf2 q;
    public static volatile KX0 r;
    public int j;
    public String k = "";
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;

    public C3277Zf2() {
        C8275oE2 c8275oE2 = C8275oE2.i;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"j", "k", "l", "m", W8.a, "n", "p", "o"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C3277Zf2();
            case 4:
                return new JX0(q);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C3277Zf2.class) {
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
        C3277Zf2 c3277Zf2 = new C3277Zf2();
        q = c3277Zf2;
        QX0.u(C3277Zf2.class, c3277Zf2);
    }
}
