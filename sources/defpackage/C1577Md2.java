package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Md2 */
/* loaded from: classes.dex */
public final class C1577Md2 extends QX0 implements InterfaceC7327lV1 {
    public static final C1577Md2 o;
    public static volatile KX0 p;
    public int j;
    public Object l;
    public C10409uU m;
    public int k = 0;
    public byte n = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ᐼ\u0000", new Object[]{"l", "k", "j", C1161Iy0.class, "m", C3110Xy0.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C1577Md2();
            case 4:
                return new JX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C1577Md2.class) {
                        kx0 = p;
                        if (kx0 == null) {
                            kx0 = new KX0(o);
                            p = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C1577Md2 c1577Md2 = new C1577Md2();
        o = c1577Md2;
        QX0.u(C1577Md2.class, c1577Md2);
    }
}
