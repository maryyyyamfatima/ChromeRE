package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dX1 */
/* loaded from: classes.dex */
public final class C4588dX1 extends QX0 implements InterfaceC7327lV1 {
    public static final C4588dX1 P;
    public static volatile KX0 Q;
    public int I;
    public int L;
    public int M;
    public boolean N;
    public String O;
    public int j;
    public int k;
    public int r;
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String s = "";
    public String t = "";
    public String u = "";
    public String v = "";
    public int w = -1;
    public String x = "";
    public long y = -1;
    public String z = "";
    public int A = -1;
    public int B = -1;
    public String C = "";
    public long D = -1;
    public long E = -1;
    public int F = -1;
    public int G = -1;
    public String H = "";

    /* renamed from: J */
    public String f11505J = "";
    public String K = "";

    public C4588dX1() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        this.O = "";
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                D83 d83 = D83.g;
                B83 b83 = B83.g;
                return QX0.s(P, "\u0001\u001e\u0000\u0002\u0002*\u001e\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0006\u0006ဈ\u0007\u0007ဈ\t\bဈ\u000b\tဈ\f\nဈ\r\u000bင\u000e\rဈ\u0010\u000eဂ\u0012\u000fဈ\u0013\u0010င\u0014\u0011င\u0015\u0012ဈ\u0016\u0013ဂ\u0018\u0014ဂ\u0019\u0015င\u001a\u0016ဈ\u001c\u0017င\u001e\u0019ဌ\b\u001eင\u001b\u001fဈ  ဈ!!ဈ\u0004\"င\"#င#$ဇ$*ဈ(", new Object[]{"j", "k", "l", "m", "n", "p", "q", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "H", "I", "r", C83.a, "G", "J", "K", "o", "L", "M", "N", "O"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C4588dX1();
            case 4:
                return new C4244cX1(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return P;
            case 6:
                KX0 kx0 = Q;
                if (kx0 == null) {
                    synchronized (C4588dX1.class) {
                        kx0 = Q;
                        if (kx0 == null) {
                            kx0 = new KX0(P);
                            Q = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        C4588dX1 c4588dX1 = new C4588dX1();
        P = c4588dX1;
        QX0.u(C4588dX1.class, c4588dX1);
    }
}
