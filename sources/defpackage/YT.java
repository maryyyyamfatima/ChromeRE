package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YT extends MX0 {
    public static final YT C;
    public static volatile KX0 D;
    public String A;
    public int k;
    public long l;
    public long m;
    public int o;
    public AbstractC4147cE q;
    public AbstractC4147cE r;
    public String s;
    public String t;
    public String u;
    public String v;
    public long w;
    public AbstractC4147cE x;
    public String y;
    public boolean z;
    public byte B = 2;
    public String n = "";
    public String p = "";

    public YT() {
        C8275oE2 c8275oE2 = C8275oE2.i;
        ZD zd = AbstractC4147cE.g;
        this.q = zd;
        this.r = zd;
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = 180000L;
        this.x = zd;
        this.y = "";
        C0072Ao1 c0072Ao1 = C0072Ao1.i;
        this.A = "";
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
                return QX0.s(C, "\u0001\u0010\u0000\u0001\u0001\u001d\u0010\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0003\u0004ည\b\u0006ည\n\bဈ\u000b\u000bင\u0004\rဈ\f\u000eဈ\u000f\u000fတ\u0010\u0011ဂ\u0001\u0012ည\u0012\u0018ဈ\u0013\u0019ဇ\u0017\u001aဈ\u0005\u001cဈ\u0018\u001dဈ\r", new Object[]{"k", "l", "n", "q", "r", "s", "o", "t", "v", "w", "m", "x", "y", "z", "p", "A", "u"});
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new YT();
            case 4:
                return new WT(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return C;
            case 6:
                KX0 kx0 = D;
                if (kx0 == null) {
                    synchronized (YT.class) {
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
        YT yt = new YT();
        C = yt;
        QX0.u(YT.class, yt);
    }
}
