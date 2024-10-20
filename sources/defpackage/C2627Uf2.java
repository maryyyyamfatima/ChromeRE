package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2627Uf2 {
    public static final Object f = new Object();
    public static volatile TL2 g;
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public C2627Uf2(Context context, C3277Zf2 c3277Zf2) {
        String str;
        if (c3277Zf2.l) {
            str = AbstractC5405ft2.b(context, c3277Zf2.k);
        } else {
            str = c3277Zf2.k;
        }
        this.a = str;
        int a = X8.a(c3277Zf2.m);
        this.b = a == 0 ? 1 : a;
        this.c = c3277Zf2.p;
        this.d = c3277Zf2.n;
        this.e = c3277Zf2.o;
    }

    public static Map a(Context context) {
        TL2 tl2 = g;
        if (tl2 == null) {
            synchronized (f) {
                tl2 = g;
                if (tl2 == null) {
                    C0822Gi1 a = AbstractC0952Hi1.a();
                    try {
                        for (String str : context.getAssets().list("phenotype")) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream open = context.getAssets().open("phenotype/" + str);
                                    try {
                                        XF0 d = XF0.d();
                                        C3277Zf2 c3277Zf2 = C3277Zf2.q;
                                        DV g2 = DV.g(open);
                                        C3277Zf2 c3277Zf22 = new C3277Zf2();
                                        try {
                                            try {
                                                try {
                                                    QW2 a2 = C7931nE2.c.a(c3277Zf22);
                                                    EV ev = g2.d;
                                                    if (ev == null) {
                                                        ev = new EV(g2);
                                                    }
                                                    a2.e(c3277Zf22, ev, d);
                                                    a2.b(c3277Zf22);
                                                    QX0.i(c3277Zf22);
                                                    C2627Uf2 c2627Uf2 = new C2627Uf2(context, c3277Zf22);
                                                    a.b(c2627Uf2.a, c2627Uf2);
                                                    if (open != null) {
                                                        open.close();
                                                    }
                                                } catch (C1127Ir1 e) {
                                                    if (e.g) {
                                                        throw new C1127Ir1(e);
                                                    }
                                                    throw e;
                                                } catch (C6827k14 e2) {
                                                    throw e2.a();
                                                }
                                            } catch (IOException e3) {
                                                if (e3.getCause() instanceof C1127Ir1) {
                                                    throw ((C1127Ir1) e3.getCause());
                                                }
                                                throw new C1127Ir1(e3);
                                            }
                                        } catch (RuntimeException e4) {
                                            if (e4.getCause() instanceof C1127Ir1) {
                                                throw ((C1127Ir1) e4.getCause());
                                            }
                                            throw e4;
                                        }
                                    } catch (Throwable th) {
                                        if (open != null) {
                                            try {
                                                open.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        throw th;
                                        break;
                                    }
                                } catch (C1127Ir1 e5) {
                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata for " + str, e5);
                                }
                            }
                        }
                    } catch (IOException e6) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e6);
                    }
                    TL2 a3 = a.a(true);
                    g = a3;
                    tl2 = a3;
                }
            }
        }
        return tl2;
    }
}
