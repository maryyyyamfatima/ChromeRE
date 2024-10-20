package defpackage;

import android.content.Context;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g14 */
/* loaded from: classes.dex */
public final class C5453g14 implements DG3 {
    public static final XF0 f;
    public static final C10256u10 g;
    public static final C10256u10 h;
    public final InterfaceC9989tE2 a;
    public final Context b;
    public final boolean c;
    public final InterfaceC9989tE2 d;
    public final InterfaceC9989tE2 e;

    public static ByteBuffer a(Context context, C7188l43 c7188l43) {
        try {
            if (!c7188l43.b) {
                return c7188l43.a.duplicate();
            }
            ByteBuffer c = c7188l43.c();
            XF0 c2 = XF0.c();
            C9570s10 c9570s10 = C9570s10.k;
            DV h2 = DV.h(c, false);
            C9570s10 c9570s102 = C9570s10.k;
            C9570s10 c9570s103 = new C9570s10();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c9570s103.getClass());
                    EV ev = h2.d;
                    if (ev == null) {
                        ev = new EV(h2);
                    }
                    b.e(c9570s103, ev, c2);
                    b.b(c9570s103);
                    QX0.i(c9570s103);
                    QX0.i(c9570s103);
                    C8885q10 c8885q10 = (C8885q10) c9570s102.k(c9570s103);
                    c8885q10.o("/system/orientation", context.getResources().getConfiguration().orientation == 2 ? g : h);
                    C7855n10 c7855n10 = (C7855n10) C8199o10.l.j();
                    c7855n10.p(C9570s10.m, (C9570s10) c8885q10.j());
                    return ByteBuffer.wrap(((C8199o10) c7855n10.j()).toByteArray());
                } catch (IOException e) {
                    if (e.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e.getCause());
                    }
                    throw new C1127Ir1(e);
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw e2;
                }
            } catch (C1127Ir1 e3) {
                if (e3.g) {
                    throw new C1127Ir1(e3);
                }
                throw e3;
            } catch (C6827k14 e4) {
                throw e4.a();
            }
        } catch (C1127Ir1 e5) {
            throw new C10239ty0("Failed to deserialize Model", e5);
        }
    }

    public C5453g14(Context context, C0806Gf0 c0806Gf0, C0806Gf0 c0806Gf02, C0806Gf0 c0806Gf03) {
        this.b = context;
        Boolean bool = Boolean.FALSE;
        this.c = bool.booleanValue();
        this.a = c0806Gf0;
        this.d = c0806Gf02;
        this.e = c0806Gf03;
        if (bool.booleanValue() || bool.booleanValue()) {
            c0806Gf0.get();
        }
    }

    static {
        XF0 xf0 = new XF0();
        xf0.a(S24.n);
        f = xf0;
        C10256u10 c10256u10 = C10256u10.l;
        C9913t10 c9913t10 = (C9913t10) c10256u10.j();
        if (c9913t10.h) {
            c9913t10.l();
            c9913t10.h = false;
        }
        C10256u10 c10256u102 = (C10256u10) c9913t10.g;
        c10256u102.j = 8;
        c10256u102.k = 0;
        g = (C10256u10) c9913t10.j();
        C9913t10 c9913t102 = (C9913t10) c10256u10.j();
        if (c9913t102.h) {
            c9913t102.l();
            c9913t102.h = false;
        }
        C10256u10 c10256u103 = (C10256u10) c9913t102.g;
        c10256u103.j = 8;
        c10256u103.k = 1;
        h = (C10256u10) c9913t102.j();
    }

    public static String b(byte[] bArr) {
        Object a;
        try {
            XF0 xf0 = f;
            int length = bArr.length;
            C9657sG3 c9657sG3 = C9657sG3.l;
            C9657sG3 c9657sG32 = new C9657sG3();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c9657sG32.getClass());
                    b.f(c9657sG32, bArr, 0, length + 0, new C2254Rj(xf0));
                    b.b(c9657sG32);
                    if (c9657sG32.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c9657sG32);
                    OX0 ox0 = S24.n;
                    ox0.getClass();
                    c9657sG32.v(ox0);
                    C5563gM0 c5563gM0 = c9657sG32.j;
                    NX0 nx0 = ox0.d;
                    Object c = c5563gM0.c(nx0);
                    if (c == null) {
                        a = ox0.b;
                    } else {
                        nx0.getClass();
                        a = ox0.a(c);
                    }
                    return ((S24) a).k;
                } catch (IOException e) {
                    if (e.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e.getCause());
                    }
                    throw new C1127Ir1(e);
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (C1127Ir1 e2) {
                if (e2.g) {
                    throw new C1127Ir1(e2);
                }
                throw e2;
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 unused2) {
            return "Unknown template";
        }
    }
}
