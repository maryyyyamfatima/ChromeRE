package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qk3 */
/* loaded from: classes.dex */
public final class C2133Qk3 extends QX0 implements InterfaceC7327lV1 {
    public static final C2133Qk3 q;
    public static volatile KX0 r;
    public int j;
    public int k;
    public int n;
    public LV1 o;
    public byte p = 2;
    public String l = "";
    public String m = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(q, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006င\u0003", new Object[]{"j", "k", "l", "m", "o", "n"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2133Qk3();
            case 4:
                return new C2003Pk3(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return q;
            case 6:
                KX0 kx0 = r;
                if (kx0 == null) {
                    synchronized (C2133Qk3.class) {
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
        C2133Qk3 c2133Qk3 = new C2133Qk3();
        q = c2133Qk3;
        QX0.u(C2133Qk3.class, c2133Qk3);
    }
}
