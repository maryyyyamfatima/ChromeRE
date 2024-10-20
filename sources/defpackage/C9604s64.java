package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s64 */
/* loaded from: classes.dex */
public final class C9604s64 extends QX0 implements InterfaceC7327lV1 {
    public static final C9604s64 r;
    public static volatile KX0 s;
    public Object k;
    public int l;
    public int p;
    public boolean q;
    public int j = 0;
    public String m = "";
    public String n = "";
    public InterfaceC1377Kp1 o = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return QX0.s(r, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"k", "j", "l", "m", "p", K64.class, C5483g64.class, C10290u64.class, C6171i64.class, "q", "n", "o", W64.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C9604s64();
            case 4:
                return new C9261r64(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return r;
            case 6:
                KX0 kx0 = s;
                if (kx0 == null) {
                    synchronized (C9604s64.class) {
                        kx0 = s;
                        if (kx0 == null) {
                            kx0 = new KX0(r);
                            s = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C9604s64 c9604s64 = new C9604s64();
        r = c9604s64;
        QX0.u(C9604s64.class, c9604s64);
    }
}
