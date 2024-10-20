package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g82, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5493g82 extends MX0 {
    public static final C5493g82 n;
    public static volatile KX0 o;
    public int k;
    public int l;
    public byte m = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(n, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0002", new Object[]{"k", "l", C2808Vp3.a});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5493g82();
            case 4:
                return new C5149f82(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return n;
            case 6:
                KX0 kx0 = o;
                if (kx0 == null) {
                    synchronized (C5493g82.class) {
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
        C5493g82 c5493g82 = new C5493g82();
        n = c5493g82;
        QX0.u(C5493g82.class, c5493g82);
    }
}
