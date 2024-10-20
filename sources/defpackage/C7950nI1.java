package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nI1 */
/* loaded from: classes.dex */
public final class C7950nI1 extends MX0 {
    public static final C7950nI1 n;
    public static volatile KX0 o;
    public static final OX0 p;
    public int k;
    public byte m = 2;
    public String l = "";

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"k", "l"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C7950nI1();
            case 4:
                return new LX0(n);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C7950nI1.class) {
                        kx0 = o;
                        if (kx0 == null) {
                            kx0 = new KX0(n);
                            o = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C7950nI1 c7950nI1 = new C7950nI1();
        n = c7950nI1;
        QX0.u(C7950nI1.class, c7950nI1);
        p = QX0.t(C9984tD2.l, c7950nI1, c7950nI1, null, 255496645, EnumC10540uq4.k, C7950nI1.class);
    }
}
