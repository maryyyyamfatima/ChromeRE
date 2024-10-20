package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fh */
/* loaded from: classes.dex */
public final class C5330fh extends QX0 implements InterfaceC7327lV1 {
    public static final C5330fh u;
    public static volatile KX0 v;
    public int j;
    public int k;
    public int m;
    public int n;
    public C1200Jg o;
    public C1200Jg p;
    public C3350Zu0 q;
    public C4986eh r;
    public int s;
    public byte t = 2;
    public InterfaceC1377Kp1 l = C8275oE2.i;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(u, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0003\u0001ဌ\u0000\u0002Л\u0003င\u0001\u0004င\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဉ\u0005\bဉ\u0006\tင\u0007", new Object[]{"j", "k", C3612ah.a, "l", C1200Jg.class, "m", "n", "o", "p", "q", "r", "s"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C5330fh();
            case 4:
                return new C4299ch(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return u;
            case 6:
                KX0 kx0 = v;
                if (kx0 == null) {
                    synchronized (C5330fh.class) {
                        kx0 = v;
                        if (kx0 == null) {
                            kx0 = new KX0(u);
                            v = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C5330fh c5330fh = new C5330fh();
        u = c5330fh;
        QX0.u(C5330fh.class, c5330fh);
    }
}
