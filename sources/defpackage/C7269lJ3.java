package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lJ3 */
/* loaded from: classes5.dex */
public final class C7269lJ3 extends QX0 implements InterfaceC7327lV1 {
    public static final C7269lJ3 q;
    public static volatile KX0 r;
    public int j;
    public C5207fJ3 l;
    public float m;
    public int o;
    public C4863eJ3 p;
    public String k = "";
    public int n = 255;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ခ\u0002\u0005ဋ\u0003\u0006ဌ\u0004\u0007ဉ\u0005", new Object[]{"j", "k", "l", "m", "n", "o", ZI3.a, "p"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7269lJ3();
            case 4:
                return new C6925kJ3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C7269lJ3.class) {
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
        C7269lJ3 c7269lJ3 = new C7269lJ3();
        q = c7269lJ3;
        QX0.u(C7269lJ3.class, c7269lJ3);
    }
}