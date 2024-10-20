package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2134Ql extends MX0 {
    public static final C2134Ql C;
    public static volatile KX0 D;
    public boolean A;
    public int k;
    public Object m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int x;
    public int l = 0;
    public byte B = 2;
    public int w = 1;
    public String y = "";
    public String z = "";

    public static void w(C2134Ql c2134Ql, VT vt) {
        c2134Ql.getClass();
        vt.getClass();
        c2134Ql.m = vt;
        c2134Ql.l = 19;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                this.B = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return QX0.s(C, "\u0001\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007င\u0006\bင\u0007\tဃ\b\n့\u0000\u000bဌ\f\fဋ\r\u000eဈ\u000f\u000fဈ\u0010\u0010ြ\u0000\u0011ဇ\u0011\u0013ᐼ\u0000", new Object[]{"m", "l", "k", "n", "o", C1744Nl.a, "p", "q", "r", "s", "t", "u", "v", "w", C2004Pl.a, "x", "y", "z", Kf4.class, "A", VT.class});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2134Ql();
            case 4:
                return new C1485Ll(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return C;
            case 6:
                KX0 kx0 = D;
                if (kx0 == null) {
                    synchronized (C2134Ql.class) {
                        kx0 = D;
                        if (kx0 == null) {
                            kx0 = new KX0(C);
                            D = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C2134Ql c2134Ql = new C2134Ql();
        C = c2134Ql;
        QX0.u(C2134Ql.class, c2134Ql);
    }
}
