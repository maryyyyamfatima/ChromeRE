package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gx0 */
/* loaded from: classes.dex */
public final class C0896Gx0 extends QX0 implements InterfaceC7327lV1 {
    public static final C0896Gx0 o;
    public static volatile KX0 p;
    public int j;
    public C8381oZ3 k;
    public C9984tD2 l;
    public String m;
    public byte n = 2;

    public C0896Gx0() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.m = "";
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(o, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဈ\u0002", new Object[]{"j", "k", "l", "m"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0896Gx0();
            case 4:
                return new JX0(o);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return o;
            case 6:
                KX0 kx0 = p;
                if (kx0 == null) {
                    synchronized (C0896Gx0.class) {
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
        C0896Gx0 c0896Gx0 = new C0896Gx0();
        o = c0896Gx0;
        QX0.u(C0896Gx0.class, c0896Gx0);
    }
}
